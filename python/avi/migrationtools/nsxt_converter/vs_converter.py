# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import copy
import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.nsxt_converter.nsxt_util import is_vlan_configured_with_bgp, \
    is_segment_configured_with_subnet, get_vs_cloud_type, get_lb_skip_reason, get_vs_details
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.nsxt_util import get_vs_cloud_name, get_object_segments, get_certificate_data
from avi.migrationtools.nsxt_converter.persistant_converter import persistence_profile_list
from avi.migrationtools.nsxt_converter.policy_converter import PolicyConfigConverter
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.converter_constants as final
import random

from avi.migrationtools.nsxt_converter.pools_converter import skipped_pools_list, vs_pool_segment_list, \
    vs_sorry_pool_segment_list, pool_name_dict
from avi.migrationtools.nsxt_converter.profile_converter import application_profile_list, network_profile_list
from avi.migrationtools.nsxt_converter.ssl_profile_converter import ssl_profile_list

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
vs_list_with_snat_deactivated = []
pool_attached_with_poolgroup = []
pool_attached_with_vs_poolref = []
vs_with_no_cloud_configured = []
vs_with_no_lb_configured = []
vs_with_lb_skipped = []
is_pool_group_used = {}
http_pool_group_list = {}
http_pool_list = {}
vs_with_no_snat_no_floating_ip = list()
vips_not_configured = list()
vs_with_custom_se_group = list()


class VsConfigConv(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict,
                 nsxt_ip, nsxt_password):
        """

        """
        self.nsxt_profile_attributes = nsxt_profile_attributes
        self.supported_attr = nsxt_profile_attributes['VS_supported_attr']
        self.server_ssl_attr = nsxt_profile_attributes['VS_server_ssl_supported_attr']
        self.client_ssl_attr = nsxt_profile_attributes['VS_client_ssl_supported_attr']
        self.common_na_attr = nsxt_profile_attributes['Common_Na_List']
        self.VS_na_attr = nsxt_profile_attributes["VS_na_list"]
        self.rule_match_na = nsxt_profile_attributes["HttpPolicySetRules_Skiped_List_MatchingCondition"]
        self.rules_actions_na = nsxt_profile_attributes["HttpPolicySetRules_Skiped_List_Actions"]
        self.VS_client_ssl_indirect_attr = nsxt_profile_attributes["VS_client_ssl_indirect_attr"]
        self.VS_server_ssl_indirect_attr = nsxt_profile_attributes["VS_server_ssl_indirect_attr"]
        self.vs_indirect_attr = nsxt_profile_attributes["VS_indirect_aatr"]
        self.supported_attr_httppolicyset = nsxt_profile_attributes["HttpPolicySetRules_Supported_Attributes"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.certkey_count = 0
        self.pki_count = 0
        self.nsxt_ip = nsxt_ip
        self.nsxt_password = nsxt_password

    def convert(self, alb_config, nsx_lb_config, prefix, tenant, vs_state, controller_version, traffic_enabled,
                cloud_tenant, ssh_root_password, nsxt_util, migration_input_config=None, vrf=None, segroup=None):
        '''
        LBVirtualServer to Avi Config vs converter
        '''
        converted_alb_ssl_certs = list()
        converted_http_policy_sets = list()
        converted_http_policy_na_list = list()
        converted_http_policy_skipped = list()
        indirect_client_ssl = []
        indirect_server_ssl = []
        alb_config['VirtualService'] = list()
        alb_config['VsVip'] = list()
        alb_config["HTTPPolicySet"] = list()
        alb_config["ServiceEngineGroup"] = list()
        alb_config["NetworkService"] = list()
        converted_objs = []
        progressbar_count = 0
        total_size = len(nsx_lb_config['LbVirtualServers'])
        print("\nConverting Virtual Services ...")
        LOG.info('[Virtual Service ] Converting Services...')
        policy_converter = PolicyConfigConverter(self.nsxt_profile_attributes, self.object_merge_check,
                                                 self.merge_object_mapping, self.sys_dict)
        app_profile_pci_created = False
        is_pci_se_group_created = False
        # Dict for checking network service is created or not as it is
        # combination of segroup and vrf
        is_network_service_created = dict()

        for lb_vs in nsx_lb_config['LbVirtualServers']:
            try:
                progressbar_count += 1
                LOG.info('[Virtual Service] Migration started for VS {}'.format(lb_vs['display_name']))
                # vs_name = lb_vs['name']
                cloud_name = get_vs_cloud_name(lb_vs["id"])
                cloud_type = get_vs_cloud_type(lb_vs["id"])
                if get_lb_skip_reason(lb_vs["id"]):
                    skip_reason = get_lb_skip_reason(lb_vs["id"])
                    conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                              conv_const.STATUS_SKIPPED, skip_reason)
                    LOG.warning("VS {} not migrated. Reason: {}".format(lb_vs["display_name"],
                                                                        skip_reason))
                    vs_with_lb_skipped.append(lb_vs["display_name"])
                    conv_utils.print_progress_bar(progressbar_count, total_size, '',
                                                  prefix='Progress', suffix='')
                    continue
                elif cloud_name == 'Cloud Not Found' or not cloud_name:
                    conv_utils.print_progress_bar(progressbar_count, total_size, '',
                                                  prefix='Progress', suffix='')
                    if lb_vs.get("lb_service_path"):
                        conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                                  conv_const.STATUS_SKIPPED, "Cloud not configured")
                        LOG.warning("cloud is not configured for %s" % lb_vs["display_name"])
                        vs_with_no_cloud_configured.append(lb_vs["display_name"])
                        continue
                    else:
                        conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                                  conv_const.STATUS_SKIPPED, "Load Balancer not configured")
                        LOG.warning("Load balancer not configured for %s" % lb_vs["display_name"])
                        vs_with_no_lb_configured.append(lb_vs["display_name"])
                        continue

                tier1_lr = ''
                for ref in nsx_lb_config['LBServices']:
                    vs_details = get_vs_details(lb_vs['id'])
                    if vs_details.get("lb_tier1_lr"):
                        tier1_lr = vs_details.get('lb_tier1_lr')
                    elif lb_vs['lb_service_path'] == ref['path']:
                        tier1_lr = ref.get('connectivity_path', None)
                if lb_vs.get('pool_path'):
                    tier_name = tier1_lr.split("/")[-1]
                    pool_ref = lb_vs.get('pool_path')
                    pl_id = pool_ref.split('/')[-1]
                    pl_config = list(filter(lambda pr: pr["id"] == pl_id, nsx_lb_config["LbPools"]))
                    if (pl_config[0]["snat_translation"].get("type") == "LBSnatDisabled" and
                        migration_input_config and migration_input_config.get('network_service')):
                        if not migration_input_config.get('network_service').get("{}-{}".format(tier_name, "floating-ip")):
                            vs_with_no_snat_no_floating_ip.append(lb_vs["display_name"])
                            conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                                      conv_const.STATUS_SKIPPED, "Configure Network Service with "
                                                                                 "floating IP to migrate")
                            LOG.warning("Network service with floating ip address "
                                        "is not configured for %s" % lb_vs["display_name"])
                            vs_with_no_snat_no_floating_ip.append(lb_vs["display_name"])
                            continue

                tenant_name, name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name
                if not cloud_tenant:
                    cloud_tenant = "admin"
                if not ssh_root_password:
                    ssh_root_password = self.nsxt_password
                name = lb_vs.get('display_name')
                if prefix:
                    name = '%s-%s' % (prefix, name)
                vs_temp = list(filter(lambda vs: vs["name"] == name, alb_config['VirtualService']))
                if vs_temp:
                    name = '%s-%s' % (name, lb_vs["id"])
                enabled = lb_vs.get('enabled')
                if enabled and vs_state:
                    enabled = (vs_state == 'enable')
                alb_vs = dict(
                    name=name,
                    traffic_enabled=(enabled and traffic_enabled),
                    enabled=enabled,
                    cloud_ref=conv_utils.get_object_ref(cloud_name, 'cloud', cloud_tenant=cloud_tenant),
                    tenant_ref=conv_utils.get_object_ref(tenant, 'tenant')
                )

                if lb_vs.get('ip_address'):
                    vip = dict(
                        name='%s-vsvip' % name,
                        tier1_lr=tier1_lr,
                        cloud_ref=conv_utils.get_object_ref(cloud_name, 'cloud', cloud_tenant=cloud_tenant),
                        tenant_ref=conv_utils.get_object_ref(tenant, 'tenant'),
                        vip=[
                            dict(
                                vip_id="1",
                                ip_address=dict(
                                    addr=lb_vs.get('ip_address'),
                                    type='V4'
                                )
                            )
                        ]
                    )

                    if cloud_type == "Vlan":
                        vip_segment = get_object_segments(lb_vs["id"], lb_vs['ip_address'])
                        if vip_segment:
                            self.add_placement_network_to_vip(vip['vip'], vip_segment, cloud_tenant, cloud_name)
                        else:
                            conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                                      conv_const.STATUS_SKIPPED, "VS skipped as VIP segment not "
                                                                                 "configured in cloud networks")
                            vips_not_configured.append(lb_vs["display_name"])
                            LOG.warning("VS skipped as VIP segment is not found for %s" % lb_vs["display_name"])
                            continue
                    alb_config['VsVip'].append(vip)
                    vsvip_ref = conv_utils.get_object_ref(
                        name + '-vsvip', 'vsvip', tenant=tenant, cloud_name=cloud_name)
                    alb_vs['vsvip_ref'] = vsvip_ref
                alb_vs['services'] = [
                    dict(
                        port=int(lb_vs.get('ports')[0]),
                        enable_ssl=False
                    )]
                skipped = [val for val in lb_vs.keys()
                           if val not in self.supported_attr]
                na_list = [val for val in lb_vs.keys()
                           if val in self.common_na_attr or val in self.VS_na_attr]
                if segroup:
                    segroup_ref = conv_utils.get_object_ref(
                        segroup, 'serviceenginegroup', cloud_tenant,
                        cloud_name=cloud_name)
                    alb_vs['se_group_ref'] = segroup_ref
                client_pki = False
                server_pki = False

                if lb_vs.get("client_ssl_profile_binding"):
                    if lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"):
                        pki_client_profile = dict()
                        error = False
                        ca = self.get_ca_cert(lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"),
                                              self.nsxt_ip, ssh_root_password)
                        if ca:
                            pki_client_profile["ca_certs"] = [{'certificate': ca}]
                        else:
                            error = True
                        if lb_vs["client_ssl_profile_binding"].get("client_auth_crl_paths"):
                            crl = self.get_crl_cert(lb_vs["client_ssl_profile_binding"].get("client_auth_crl_paths"))
                            if crl:
                                pki_client_profile["crls"] = [{'body': crl}]
                            else:
                                error = True
                        else:
                            pki_client_profile['crl_check'] = False
                        if not error:
                            pki_client_profile["name"] = name + "-client-pki"
                            pki_client_profile["tenant_ref"] = conv_utils.get_object_ref(tenant, "tenant")
                            client_pki = True
                            if self.object_merge_check:
                                conv_utils.update_skip_duplicates(pki_client_profile,
                                                                  alb_config['PKIProfile'], 'pki_profile',
                                                                  converted_objs, pki_client_profile["name"], None,
                                                                  self.merge_object_mapping, None, prefix,
                                                                  self.sys_dict['PKIProfile'])
                                self.pki_count += 1
                            else:
                                converted_objs.append({'pki_profile': pki_client_profile})
                                alb_config['PKIProfile'].append(pki_client_profile)
                            indirect = []
                            u_ignore = []
                            ignore_for_defaults = {}
                            conv_status = conv_utils.get_conv_status(
                                [], indirect, ignore_for_defaults, [],
                                u_ignore, [])
                            conv_utils.add_conv_status('pki_profile', None, pki_client_profile["name"], conv_status,
                                                       [{"pki_profile": pki_client_profile}])
                if lb_vs.get("server_ssl_profile_binding"):
                    if lb_vs["server_ssl_profile_binding"].get("server_auth_ca_paths"):
                        pki_server_profile = dict()
                        error = False
                        ca = self.get_ca_cert(lb_vs["server_ssl_profile_binding"].get("server_auth_ca_paths"),
                                              self.nsxt_ip, ssh_root_password)
                        if ca:
                            pki_server_profile["ca_certs"] = [{'certificate': ca}]
                        else:
                            error = True
                        if lb_vs["server_ssl_profile_binding"].get("server_auth_crl_paths"):
                            crl = self.get_crl_cert(lb_vs["server_ssl_profile_binding"].get("server_auth_crl_paths"))
                            if crl:
                                pki_server_profile["crls"] = [{'body': crl}]
                            else:
                                error = True
                        else:
                            pki_server_profile['crl_check'] = False
                        if not error:
                            pki_server_profile["name"] = name + "-server-pki"
                            pki_server_profile["tenant_ref"] = conv_utils.get_object_ref(tenant, "tenant")
                            server_pki = True
                            if self.object_merge_check:
                                conv_utils.update_skip_duplicates(pki_server_profile,
                                                                  alb_config['PKIProfile'], 'pki_profile',
                                                                  converted_objs, pki_server_profile["name"], None,
                                                                  self.merge_object_mapping, None, prefix,
                                                                  self.sys_dict['PKIProfile'])
                                self.pki_count += 1
                            else:
                                converted_objs.append({'pki_profile': pki_server_profile})
                                alb_config['PKIProfile'].append(pki_server_profile)
                            indirect = []
                            u_ignore = []
                            ignore_for_defaults = {}
                            conv_status = conv_utils.get_conv_status(
                                [], indirect, ignore_for_defaults, [],
                                u_ignore, [])
                            conv_utils.add_conv_status('pki_profile', None, pki_server_profile["name"], conv_status,
                                                       [{"pki_profile": pki_server_profile}])

                if lb_vs.get('application_profile_path'):
                    profile_path = lb_vs.get('application_profile_path')
                    profile_id = profile_path.split('/')[-1]
                    profile_config = list(filter(lambda pr: pr["id"] == profile_id, nsx_lb_config["LbAppProfiles"]))
                    profile_type = "APPLICATION_PROFILE_TYPE_HTTP"
                    profile_name = profile_config[0]["display_name"]
                    if profile_id in application_profile_list.keys():
                        profile_name = application_profile_list[profile_id]
                        profile_type = "APPLICATION_PROFILE_TYPE_HTTP"
                    elif profile_id in network_profile_list.keys():
                        profile_name = network_profile_list[profile_id]
                        profile_type = "network"

                    merge_profile_name = profile_name
                    if self.object_merge_check:
                        merge_profile_name = self.merge_object_mapping["app_profile"].get(profile_name)

                    app_profile_ref = self.get_vs_app_profile_ref(alb_config['ApplicationProfile'],
                                                                  profile_name, self.object_merge_check,
                                                                  self.merge_object_mapping, profile_type, tenant)
                    if app_profile_ref.__contains__("networkprofile"):
                        alb_vs['network_profile_ref'] = app_profile_ref
                        alb_vs['application_profile_ref'] = conv_utils.get_object_ref("System-L4-Application",
                                                                                      'applicationprofile',
                                                                                      tenant="admin")
                    else:
                        alb_vs['application_profile_ref'] = app_profile_ref
                        alb_vs['network_profile_ref'] = conv_utils.get_object_ref("System-TCP-Proxy",
                                                                                  'networkprofile',
                                                                                  tenant="admin")

                if client_pki:
                    pki_client_profile_name = pki_client_profile["name"]
                    self.update_app_with_pki(merge_profile_name, alb_config["ApplicationProfile"],
                                             pki_client_profile_name, tenant)
                if lb_vs.get('max_concurrent_connections'):
                    alb_vs['performance_limits'] = dict(
                        max_concurrent_connections=lb_vs.get('max_concurrent_connections')
                    )
                if lb_vs.get('client_ssl_profile_binding'):
                    client_ssl = lb_vs.get('client_ssl_profile_binding')
                    ssl_key_cert_refs = []
                    if client_ssl.get('ssl_profile_path'):
                        ssl_ref_id = client_ssl['ssl_profile_path'].split('/')[-1]
                        ssl_name = None
                        if ssl_ref_id in ssl_profile_list.keys():
                            ssl_name = ssl_profile_list[ssl_ref_id]
                        if ssl_name:
                            if self.object_merge_check:
                                ssl_name = self.merge_object_mapping['ssl_profile'].get(ssl_name)
                            alb_vs['ssl_profile_ref'] = conv_utils.get_object_ref(ssl_name, 'sslprofile', tenant=tenant)
                    if client_ssl.get('default_certificate_path', None):
                        alb_vs['services'][0]["enable_ssl"] = True
                        cert_name = name + "-" + str(random.randint(0, 20))
                        ca_cert_obj = self.update_ca_cert_obj(cert_name, alb_config, [], tenant, prefix,
                                                              ssl_type='client_ssl', ssl_data=client_ssl,
                                                              nsxt_ip=self.nsxt_ip, ssh_root_password=ssh_root_password)

                        ssl_key_cert_refs.append(
                            "/api/sslkeyandcertificate/?tenant=%s&name=%s" % (tenant, ca_cert_obj.get("name")))
                        converted_alb_ssl_certs.append(ca_cert_obj)
                    if client_ssl.get('sni_certificate_paths', None):
                        # TODO need to revisit to fix some issues
                        alb_vs['services'][0]["enable_ssl"] = True
                        sni_cert_list = client_ssl.get('sni_certificate_paths', None)
                        for cert in sni_cert_list:
                            cert_name = name + "-" + str(random.randint(0, 20))
                            ca_cert_obj = self.update_ca_cert_obj(cert_name, alb_config, [], tenant, prefix,
                                                                  ssl_type='client_ssl', ssl_data=client_ssl,
                                                                  nsxt_ip=self.nsxt_ip,
                                                                  ssh_root_password=ssh_root_password)

                            ssl_key_cert_refs.append(
                                "/api/sslkeyandcertificate/?tenant=%s&name=%s" % (tenant, ca_cert_obj.get("name")))
                            converted_alb_ssl_certs.append(ca_cert_obj)
                        alb_vs["vh_type"] = "VS_TYPE_VH_SNI"
                        alb_vs["type"] = "VS_TYPE_VH_PARENT"
                    if client_ssl.get("client_auth"):
                        for profile in alb_config["ApplicationProfile"]:
                            if merge_profile_name == profile["name"]:
                                if client_ssl["client_auth"] == 'IGNORE':
                                    profile["ssl_client_certificate_mode"] = 'SSL_CLIENT_CERTIFICATE_NONE'
                    if ssl_key_cert_refs:
                        alb_vs["ssl_key_and_certificate_refs"] = list(set(ssl_key_cert_refs))
                    skipped_client_ssl = [val for val in client_ssl.keys()
                                          if val not in self.client_ssl_attr]
                    indirect_client_attr = self.VS_client_ssl_indirect_attr

                    indirect_client_ssl = [val for val in skipped_client_ssl if
                                           val in indirect_client_attr]
                    skipped_client_ssl = [attr for attr in skipped_client_ssl if attr not in indirect_client_ssl]
                    if skipped_client_ssl:
                        skipped.append({"client_ssl ": skipped_client_ssl})

                lb_pl_config = nsx_lb_config['LbPools']
                sry_pool_present = False
                sorry_pool_ref = None
                if lb_vs.get("sorry_pool_path"):
                    pool_ref = lb_vs.get("sorry_pool_path")
                    sry_pl_id = lb_vs.get("sorry_pool_path").split("/")[-1]
                    sry_pl_config = list(filter(lambda pr: pr["id"] == sry_pl_id, nsx_lb_config["LbPools"]))

                    if lb_vs["id"] in vs_sorry_pool_segment_list.keys():
                        sry_pl = pool_name_dict.get(sry_pl_id)
                        sorry_pool_name = sry_pl
                        pool_segment = vs_sorry_pool_segment_list[lb_vs["id"]].get("pool_segment")
                        pl_name = sry_pl
                        is_sry_pool_group = False
                        if pool_ref:
                            p_tenant, pool_ref = conv_utils.get_tenant_ref(pool_ref)
                            if tenant:
                                p_tenant = tenant
                            pool_ref = pl_name
                            persist_ref = self.get_persist_ref(lb_vs)
                            avi_persistence = alb_config['ApplicationPersistenceProfile']
                            persist_type = None
                            persist_ref = persistence_profile_list.get(persist_ref,None)
                            if persist_ref:
                                # Called tenant ref to get object name
                                persist_ref = conv_utils.get_tenant_ref(persist_ref)[1]
                                persist_profile_objs = (
                                        [ob for ob in avi_persistence if ob['name'] ==
                                         self.merge_object_mapping['app_per_profile'].get(
                                             persist_ref)] or
                                        [obj for obj in avi_persistence if
                                         (obj["name"] == persist_ref or persist_ref in obj.get(
                                             "dup_of", []))])
                                persist_type = (persist_profile_objs[0]['persistence_type'] if
                                                persist_profile_objs else None)
                            # Pool cloned if controller version <: 17.1.6 or VS has non http
                            # cookie persistence or app profile type is different and poolgroup
                            # cloned
                            pool_ref, is_sry_pool_group = conv_utils.clone_pool_if_shared(
                                pool_ref, alb_config, name, tenant, p_tenant, persist_type,
                                controller_version, alb_vs['application_profile_ref'], is_pool_group_used,
                                http_pool_group_list, http_pool_list,
                                cloud_name=cloud_name, prefix=prefix)
                            sry_pool_present = is_sry_pool_group
                            sorry_pool_ref = pool_ref
                            is_pool_group_used[pool_ref] = alb_vs['name']
                            if cloud_type == 'Vlan':
                                if is_sry_pool_group:
                                    self.add_placement_network_to_pool_group(pool_ref, pool_segment,
                                                                             alb_config, cloud_name, cloud_tenant)

                                else:
                                    self.add_placement_network_to_pool(alb_config['Pool'],
                                                                       pool_ref, pool_segment, cloud_name, cloud_tenant)

                is_pg_created = False
                main_pool_ref = None
                pool_present = False
                if lb_vs.get('pool_path'):
                    pool_ref = lb_vs.get('pool_path')
                    pl_id = pool_ref.split('/')[-1]
                    pl_config = list(filter(lambda pr: pr["id"] == pl_id, nsx_lb_config["LbPools"]))

                    if lb_vs["id"] in vs_pool_segment_list.keys():
                        pl_name = pool_name_dict.get(pl_id)
                        pool_name = pl_name
                        pool_segment = vs_pool_segment_list[lb_vs["id"]].get("pool_segment")
                        vs_app_name = profile_name
                        if pl_config[0].get("snat_translation"):
                            if pl_config[0]["snat_translation"].get("type") == "LBSnatDisabled":
                                if not alb_vs['application_profile_ref'].__contains__('System-L4-Application'):
                                    vs_app_name = self.update_app_with_snat(profile_name, profile_type,
                                                                            alb_config["ApplicationProfile"],
                                                                            self.object_merge_check,
                                                                            self.merge_object_mapping)
                                    if vs_app_name != profile_name:
                                        alb_vs['application_profile_ref'] = conv_utils.get_object_ref \
                                            (vs_app_name, 'applicationprofile', tenant=tenant)
                                elif alb_vs['application_profile_ref'].__contains__('System-L4-Application'):
                                    alb_vs['application_profile_ref'] = conv_utils. \
                                        get_object_ref('System-L4-Application-pci', 'applicationprofile',
                                                       tenant=tenant)
                                    if not app_profile_pci_created:
                                        new_pci_app_profile = {
                                            "name": "System-L4-Application-pci",
                                            "type": "APPLICATION_PROFILE_TYPE_L4",
                                            "preserve_client_ip": True,
                                            "tenant_ref": conv_utils.get_object_ref(tenant, 'tenant')
                                        }
                                        alb_config["ApplicationProfile"].append(new_pci_app_profile)
                                        app_profile_pci_created = True

                                pci_se_group_name = prefix if prefix else self.nsxt_ip
                                pci_se_group_name = "{}-{}".format(pci_se_group_name, "PreserveClientIP")
                                if not is_pci_se_group_created:
                                    new_pci_se_group = {
                                        "name": pci_se_group_name,
                                        "ha_mode": "HA_MODE_LEGACY_ACTIVE_STANDBY",
                                        "cloud_ref": conv_utils.get_object_ref(cloud_name, 'cloud',
                                                                               cloud_tenant=cloud_tenant),
                                        "tenant_ref": conv_utils.get_object_ref(cloud_tenant, 'tenant')
                                    }
                                    alb_config["ServiceEngineGroup"].append(new_pci_se_group)
                                    is_pci_se_group_created = True

                                vs_with_custom_se_group.append(lb_vs['display_name'])

                                alb_vs["se_group_ref"] = conv_utils.get_object_ref(pci_se_group_name,
                                                                                   'serviceenginegroup',
                                                                                   cloud_name=cloud_name,
                                                                                   cloud_tenant=cloud_tenant,
                                                                                   tenant=cloud_tenant)

                                nsxt_util.create_and_update_nsgroup(pool_name, alb_config,
                                                                    pl_config[0].get("members"))

                                # Create NetworkService for the created SEGroup
                                if not is_network_service_created.get("{}-{}".format(pci_se_group_name, tier1_lr)):
                                    ns_name = "{}-{}".format(pci_se_group_name, "ns")
                                    tier_name = tier1_lr.split("/")[-1]
                                    floating_ip = "0.0.0.0"
                                    if migration_input_config and migration_input_config.get('network_service'):
                                        floating_ip = migration_input_config.get('network_service'). \
                                            get("{}-{}".format(tier_name, "floating-ip"))
                                    ns_cloud_ref = conv_utils.get_object_ref(cloud_name, 'cloud',
                                                                             cloud_tenant=cloud_tenant)
                                    ns_vrf_ref = conv_utils.get_object_ref(tier_name, 'vrfcontext',
                                                                           cloud_name=cloud_name,
                                                                           cloud_tenant=cloud_tenant,
                                                                           tenant=tenant)
                                    tenant_ref = conv_utils.get_object_ref(cloud_tenant, 'tenant')
                                    new_network_service = nsxt_util.create_network_service_obj(ns_name,
                                                                                               alb_vs["se_group_ref"],
                                                                                               ns_cloud_ref, ns_vrf_ref,
                                                                                               floating_ip, tenant_ref)
                                    alb_config["NetworkService"].append(new_network_service)
                                    is_network_service_created["{}-{}".format(pci_se_group_name, tier1_lr)] = True

                                vs_list_with_snat_deactivated.append(alb_vs["name"])

                            if pl_config[0]["snat_translation"].get("type") == "LBSnatIpPool":
                                alb_vs["snat_ip"] = []
                                snat_ip_pool = pl_config[0]["snat_translation"]["ip_addresses"]
                                for ip_pool in snat_ip_pool:
                                    snat_ip = dict(
                                        addr=ip_pool["ip_address"],
                                        type="V4"
                                    )
                                    alb_vs["snat_ip"].append(snat_ip)
                                    alb_vs["se_group_ref"] = conv_utils.get_object_ref("Default-Group",
                                                                                       'serviceenginegroup',
                                                                                       cloud_name=cloud_name,
                                                                                       cloud_tenant=cloud_tenant,
                                                                                       tenant=cloud_tenant)

                            if pl_config[0]["snat_translation"].get("type") == "LBSnatAutoMap":
                                alb_vs["se_group_ref"] = conv_utils.get_object_ref("Default-Group",
                                                                                   'serviceenginegroup',
                                                                                   cloud_name=cloud_name,
                                                                                   cloud_tenant=cloud_tenant,
                                                                                   tenant=cloud_tenant)

                        is_pool_group = False
                        if pool_ref:
                            p_tenant, pool_ref = conv_utils.get_tenant_ref(pool_ref)
                            if tenant:
                                p_tenant = tenant
                            pool_ref = pl_name
                            persist_ref = self.get_persist_ref(lb_vs)
                            avi_persistence = alb_config['ApplicationPersistenceProfile']
                            persist_type = None
                            persist_ref = persistence_profile_list.get(persist_ref,None)
                            if persist_ref:
                                # Called tenant ref to get object name
                                persist_ref = conv_utils.get_tenant_ref(persist_ref)[1]
                                persist_profile_objs = (
                                        [ob for ob in avi_persistence if ob['name'] ==
                                         self.merge_object_mapping['app_per_profile'].get(
                                             persist_ref)] or
                                        [obj for obj in avi_persistence if
                                         (obj["name"] == persist_ref or persist_ref in obj.get(
                                             "dup_of", []))])
                                persist_type = (persist_profile_objs[0]['persistence_type'] if
                                                persist_profile_objs else None)
                            # cookie persistence or app profile type is different and poolgroup
                            # cloned
                            pool_ref, is_pool_group = conv_utils.clone_pool_if_shared(
                                pool_ref, alb_config, name, tenant, p_tenant, persist_type,
                                controller_version, alb_vs['application_profile_ref'], is_pool_group_used,
                                http_pool_group_list, http_pool_list,
                                cloud_name=cloud_name, prefix=prefix)
                            is_pg_created = is_pool_group
                            main_pool_ref = pool_ref
                            if is_pool_group:
                                is_pool_group_used[pool_ref] = alb_vs['name']
                            else:
                                pool_present = True
                            if cloud_type == 'Vlan':
                                if is_pool_group:
                                    self.add_placement_network_to_pool_group(pool_ref, pool_segment,
                                                                             alb_config, cloud_name, cloud_tenant)
                                else:
                                    self.add_placement_network_to_pool(alb_config['Pool'],
                                                                       pool_ref, pool_segment, cloud_name, cloud_tenant)

                            if persist_ref:
                                if is_pool_group:
                                    self.add_poolgroup_with_persistence(alb_config, nsx_lb_config, lb_vs,
                                                                        pool_ref, prefix, cloud_name, tenant)
                                else:
                                    self.add_pool_with_persistence(alb_config, nsx_lb_config, lb_vs,
                                                                   pool_ref, prefix, cloud_name, tenant)

                            if server_pki:
                                pki_server_profile_name = pki_server_profile["name"]
                                if is_pool_group:
                                    self.add_pki_to_pool_group(alb_config, pool_ref, pki_server_profile_name,
                                                               tenant)
                                else:
                                    self.add_pki_to_pool(alb_config, pool_ref, pki_server_profile_name,
                                                         tenant)
                            if is_pool_group:
                                if lb_vs.get('default_pool_member_ports'):
                                    self.add_port_to_pool_group(pool_ref, alb_config, lb_vs)

                            else:
                                if lb_vs.get('default_pool_member_ports'):
                                    self.add_port_to_pool(pool_ref, alb_config, lb_vs)

                        persist_type = None
                if sry_pool_present:
                    if is_pg_created:
                        self.add_sorry_pool_member_to_poolgroup(alb_config, main_pool_ref, sorry_pool_ref)
                    else:
                        self.attach_pool_to_sry_pool_group(alb_config, main_pool_ref,
                                                           sorry_pool_ref, tenant, cloud_name)
                        main_pool_ref = sorry_pool_ref
                        is_pg_created = True

                if is_pg_created:
                    self.add_teir_to_poolgroup(main_pool_ref, alb_config, tier1_lr)
                    self.update_poolgroup_with_cloud(main_pool_ref, alb_config, cloud_name, tenant, cloud_tenant)
                    alb_vs['pool_group_ref'] = conv_utils.get_object_ref(
                        main_pool_ref, 'poolgroup', tenant=tenant, cloud_name=cloud_name)
                elif pool_present:
                    self.add_tier_to_pool(main_pool_ref, alb_config, tier1_lr)
                    self.update_pool_with_cloud(main_pool_ref, alb_config, cloud_name, tenant, cloud_tenant)
                    alb_vs['pool_ref'] = conv_utils.get_object_ref(
                        main_pool_ref, 'pool', tenant=tenant, cloud_name=cloud_name)

                if lb_vs.get('server_ssl_profile_binding'):
                    # if lb_vs["server_ssl_profile_binding"]
                    server_ssl = lb_vs.get('server_ssl_profile_binding')
                    if is_pg_created:
                        self.update_poolgroup_with_ssl(alb_config, nsx_lb_config, lb_vs, main_pool_ref,
                                                       prefix, tenant, converted_alb_ssl_certs, ssh_root_password)
                    else:
                        self.add_ssl_to_pool(alb_config, nsx_lb_config, lb_vs, main_pool_ref,
                                             prefix, tenant, converted_alb_ssl_certs, ssh_root_password)

                    skipped_server_ssl = [val for val in server_ssl.keys()
                                          if val not in self.server_ssl_attr]
                    indirect_server_attr = self.VS_server_ssl_indirect_attr

                    indirect_server_ssl = [val for val in skipped_server_ssl if
                                           val in indirect_server_attr]
                    skipped_server_ssl = [attr for attr in skipped_server_ssl if
                                          attr not in indirect_server_ssl]
                    if skipped_server_ssl:
                        skipped.append({"server_ssl ": skipped_server_ssl})

                if lb_vs.get('rules'):

                    policy, skipped_rules = policy_converter.convert \
                        (lb_vs, alb_vs, alb_config, nsx_lb_config,
                        is_pool_group_used, http_pool_group_list, http_pool_list,
                        cloud_type, cloud_name, prefix, controller_version,
                        cloud_tenant, tier1_lr, tenant)
                    converted_http_policy_sets.append(skipped_rules)
                    if policy:
                        updated_http_policy_ref = conv_utils.get_object_ref(
                            policy['name'], conv_const.OBJECT_TYPE_HTTP_POLICY_SET,
                            tenant)
                        http_policies = {
                            'index': 11,
                            'http_policy_set_ref': updated_http_policy_ref
                        }
                        alb_vs['http_policies'] = []
                        alb_vs['http_policies'].append(http_policies)
                        alb_config['HTTPPolicySet'].append(policy)

                # If vlan VS then check if VLAN network is configured as a BGP peer,
                # if yes, then advertise bgp otherwise don't advertise
                is_vlan_configured, vlan_segment, network_type, return_mesg = is_segment_configured_with_subnet \
                    (lb_vs["id"], cloud_name, cloud_tenant)
                if network_type == "Vlan":
                    if is_vlan_configured:
                        LOG.info("%s is configured with subnet" % lb_vs["display_name"])
                        is_bgp_configured = is_vlan_configured_with_bgp(cloud_name=cloud_name, tenant=tenant,
                                                                        vlan_segment=vlan_segment,
                                                                        cloud_tenant=cloud_tenant)
                        if is_bgp_configured:
                            if migration_input_config and migration_input_config.get('bgp_peer_configured_for_vlan'):
                                alb_vs['enable_rhi'] = True
                                LOG.info("ALB Plugin : vlan_configured_with_bgp : {}".format(vlan_segment))
                        else:
                            LOG.warning("%s vlan is not configured with bgp" % lb_vs["display_name"])
                    else:
                        LOG.warning("%s data path won't work as %s" % (lb_vs["display_name"], return_mesg))

                indirect = self.vs_indirect_attr
                u_ignore = []
                ignore_for_defaults = {}
                conv_status = conv_utils.get_conv_status(
                    skipped, indirect, ignore_for_defaults, nsx_lb_config['LbVirtualServers'],
                    u_ignore, na_list)
                if indirect_client_ssl:
                    conv_status["indirect"].append({"client_ssl": indirect_client_ssl})
                if indirect_server_ssl:
                    conv_status["indirect"].append({"server_ssl": indirect_server_ssl})
                na_list = [val for val in na_list if val not in self.common_na_attr]
                conv_status["na_list"] = na_list
                conv_utils.add_conv_status('virtualservice', None, alb_vs['name'], conv_status,
                                           alb_vs)
                alb_config['VirtualService'].append(alb_vs)

                msg = "Server conversion started..."
                conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                              prefix='Progress', suffix='')
                if len(conv_status['skipped']) > 0:
                    LOG.debug('[VirtualService] Skipped Attribute {}:{}'.format(lb_vs['display_name'],
                                                                                conv_status['skipped']))

                LOG.info('[VirtualService] Migration completed for HM {}'.format(lb_vs['display_name']))
            except Exception as e:
                LOG.error("[VirtualService] Failed to convert VirtualService: {}".format(e))
                update_count('error')
                LOG.error("[VirtualServer] Failed to convert Monitor: %s" % lb_vs['display_name'],
                          exc_info=True)
                conv_utils.add_status_row('virtualservice', None, lb_vs['display_name'],
                                          conv_const.STATUS_ERROR, "Conversion failure")
        for cert in converted_alb_ssl_certs:
            indirect = []
            u_ignore = []
            ignore_for_defaults = {}
            conv_status = conv_utils.get_conv_status(
                [], indirect, ignore_for_defaults, [],
                u_ignore, [])
            conv_utils.add_conv_status('ssl_key_and_certificate', None, cert['name'], conv_status,
                                       [{"ssl_cert_key": cert}])
        if self.object_merge_check:
            self.update_ssl_key_refernce(alb_config)
            self.update_pki_refernce(alb_config)

    def get_vs_app_profile_ref(self, alb_profile_config, profile_name, object_merge_check,
                               merge_object_mapping, profile_type, tenant):
        if object_merge_check:
            app_profile_merge_name = merge_object_mapping['app_profile'].get(profile_name)
            if app_profile_merge_name:
                profile_name = app_profile_merge_name
                return '/api/applicationprofile/?tenant=%s&name=%s' % (tenant, profile_name)
            np_prodile_merge_name = merge_object_mapping['network_profile'].get(profile_name)
            if np_prodile_merge_name:
                profile_name = np_prodile_merge_name
                return '/api/networkprofile/?tenant=%s&name=%s' % (tenant, profile_name)
        if profile_type == "network":
            return '/api/networkprofile/?tenant=%s&name=%s' % (tenant, profile_name)
        return '/api/applicationprofile/?tenant=%s&name=%s' % (tenant, profile_name)

    def update_ca_cert_obj(self, name, avi_config, converted_objs, tenant, prefix,
                           cert_type='SSL_CERTIFICATE_TYPE_CA', ca_cert=None,
                           ssl_type=None, ssl_data=None, nsxt_ip=None, ssh_root_password=None):
        """
        This method create the certs if certificate not present at location
        it create placeholder certificate.
        :return:
        """

        cert_name = [cert['name'] for cert in avi_config.get("SSLKeyAndCertificate", [])
                     if cert['name'].__contains__(name) and cert['type'] == cert_type]

        if cert_name:
            LOG.warning(
                'SSL ca cert is already exist')

            for cert in avi_config.get("SSLKeyAndCertificate", []):
                if cert['name'].__contains__(name) and cert['type'] == cert_type:
                    return cert
            return None

        if not ca_cert:
            if ssl_type == 'client_ssl':
                certificate_ref = ssl_data.get("default_certificate_path", None)
            elif ssl_type == 'server_ssl':
                certificate_ref = ssl_data.get("client_certificate_path", None)
            if certificate_ref:
                certificate_ref = certificate_ref.split('/')[-1]

            key, ca_cert = get_certificate_data(certificate_ref, nsxt_ip, ssh_root_password)

            LOG.debug("Fetched data for certificate_ref {}".format(certificate_ref))
            if not ca_cert:
                key, ca_cert = conv_utils.create_self_signed_cert()
                name = '%s-%s' % (name, final.PLACE_HOLDER_STR)
                LOG.warning('Create self certificate and key for : %s' % name)

        ssl_kc_obj = None

        if ca_cert:
            cert = {"certificate": ca_cert if type(ca_cert) == str else ca_cert.decode()}
            ssl_kc_obj = {
                'name': name,
                'tenant_ref': conv_utils.get_object_ref(tenant, 'tenant'),
                'key': key if type(key) == str else key.decode(),
                'certificate': cert,
                'type': 'SSL_CERTIFICATE_TYPE_VIRTUALSERVICE'
            }
            LOG.info('Added new ca certificate for %s' % name)
        if ssl_kc_obj and self.object_merge_check:
            if final.PLACE_HOLDER_STR not in ssl_kc_obj['name']:
                conv_utils.update_skip_duplicates(
                    ssl_kc_obj, avi_config['SSLKeyAndCertificate'],
                    'ssl_cert_key', converted_objs, name, None,
                    self.merge_object_mapping, None, prefix,
                    self.sys_dict['SSLKeyAndCertificate'])
            else:
                converted_objs.append({'ssl_cert_key': ssl_kc_obj})
                avi_config['SSLKeyAndCertificate'].append(ssl_kc_obj)
            self.certkey_count += 1
        else:
            converted_objs.append({'ssl_cert_key': ssl_kc_obj})
            avi_config['SSLKeyAndCertificate'].append(ssl_kc_obj)
        return ssl_kc_obj

    def update_app_with_snat(self, profile_name, profile_type, alb_app_config, object_merge_check,
                             merge_object_mapping):
        app_profile_name = profile_name
        app_prof_obj = [obj for obj in alb_app_config if obj['name'] == profile_name]
        if object_merge_check:
            app_profile_merge_name = merge_object_mapping['app_profile'].get(profile_name)
            app_prof_obj = [obj for obj in alb_app_config if obj['name'] == app_profile_merge_name]
            profile_name = app_profile_merge_name
        cme = True
        if profile_type == 'APPLICATION_PROFILE_TYPE_HTTP':
            cme = app_prof_obj[0]['http_profile'].get(
                'connection_multiplexing_enabled', False)
        app_name = profile_name
        if app_prof_obj and not cme:
            # Check if already cloned profile present
            app_prof_cmd = [obj for obj in alb_app_config if
                            obj['name'] == '%s-cmd' % profile_name]
            if app_prof_cmd:
                app_name = app_prof_cmd[0]['name']
                app_obj_ref = conv_utils.get_object_ref(
                    app_name, 'applicationprofile',
                    tenant=conv_utils.get_name(app_prof_cmd[0]['tenant_ref']))
            else:
                app_prof_cmd = copy.deepcopy(app_prof_obj[0])
                app_prof_cmd['name'] = '%s-cmd' % app_prof_cmd['name']
                if 'http_profile' in app_prof_cmd:
                    app_prof_cmd['http_profile'][
                        'connection_multiplexing_enabled'] = False
                    app_prof_cmd["preserve_client_ip"] = True
                alb_app_config.append(app_prof_cmd)
                app_name = app_prof_cmd['name']
                app_obj_ref = conv_utils.get_object_ref(
                    app_name, 'applicationprofile',
                    tenant=conv_utils.get_name(app_prof_cmd['tenant_ref']))
                conv_status = conv_utils.get_conv_status_by_obj_name(app_profile_name)
                conv_utils.add_conv_status('applicationprofile', "LBHttpProfile",
                                           app_prof_cmd['name'], conv_status,
                                           [{'application_http_profile': app_prof_cmd}])
        return app_name

    def get_ca_cert(self, ca_url, nsxt_ip, ssh_root_password):
        if ca_url:
            certificate_ref = ca_url[0].split('/')[-1]

            key, ca_cert = get_certificate_data(certificate_ref, nsxt_ip, ssh_root_password)
            LOG.debug("Fetched ca cert data for certificate_ref".format(certificate_ref))
            if not ca_cert:
                key, ca_cert = conv_utils.create_self_signed_cert()

        return ca_cert

    def get_crl_cert(self, crl_url):
        crl_id = crl_url[0].split("/")[-1] + "-CRL-Certificates"
        return crl_id

    def update_app_with_pki(self, profile_name, app_config, pki_name, tenant):
        for profile in app_config:
            if profile_name == profile["name"]:
                profile["pki_profile_ref"] = '/api/pkiprofile/?tenant=%s&name=%s' % (tenant, pki_name)

    def update_pool_with_pki(self, pool_config, pool_name, pki_name, tenant):
        for pool in pool_config:
            if pool_name == pool["name"]:
                pool["pki_profile_ref"] = '/api/pkiprofile/?tenant=%s&name=%s' % (tenant, pki_name)

    def update_pool_with_app_attr(self, profile_name, pool_name, alb_config):
        profile = [profile for profile in alb_config["ApplicationProfile"]
                   if profile["name"] == profile_name]
        if profile:
            for pool in alb_config["Pool"]:
                if pool["name"] == pool_name:
                    pool["server_timeout"] = profile[0].get("response_timeout", 0)
                    if profile[0].get("http_redirect_to"):
                        pool["fail_action"] = dict(
                            type="FAIL_ACTION_HTTP_REDIRECT",
                            redirect=dict(
                                host=profile[0]["http_redirect_to"]
                            )
                        )
                    break

    def create_pool_group(self, cloud_name, pg_obj, alb_config, lb_pool, vs_name, backup_pool=None, sorry_pool=None,
                          sry_pool_present=False, tenant="admin"):

        if backup_pool:
            alb_pool_config = [pl for pl in alb_config["Pool"] if pl["name"] == backup_pool]
            suffix = "backup_pool"
        elif sorry_pool:
            alb_pool_config = [pl for pl in alb_config["Pool"] if pl["name"] == sorry_pool]
            suffix = "sorry_pool"
        new_pool_config = []
        if alb_pool_config[0]["name"] in pool_attached_with_vs_poolref:
            new_pool_config = copy.deepcopy(alb_pool_config[0])
        pool_bmd = []
        pool_bme = []
        for member in alb_pool_config[0].get("servers"):
            if member.get("backup_member"):
                pool_bme.append(member)
            else:
                pool_bmd.append(member)
        if pool_bme and pool_bmd:
            new_bme_pool = copy.deepcopy(alb_pool_config[0])
            new_bme_pool["name"] = new_bme_pool["name"] + "-" + suffix
            new_bme_pool["servers"] = pool_bme
            conv_status = conv_utils.get_conv_status_by_obj_name(alb_pool_config[0]["name"])
            conv_utils.add_conv_status(
                'pool', None, new_bme_pool['name'], conv_status,
                {'pools': [new_bme_pool]})
            alb_config["Pool"].append(new_bme_pool)
            pool_attached_with_poolgroup.append(new_bme_pool['name'])
            if suffix == "backup_pool":
                bmd_priority = "3"
                bme_priority = "2"
            else:
                bmd_priority = "1"
                bme_priority = "0"
            pg_obj["members"].append(dict(
                ratio="1",
                priority_label=bme_priority,
                pool_ref=conv_utils.get_object_ref(
                    new_bme_pool["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
            ))
            if new_pool_config:
                new_pool_config["name"] = new_pool_config["name"] + "-" + vs_name
                new_pool_config["servers"] = pool_bmd
                conv_utils.add_conv_status(
                    'pool', None, new_pool_config['name'], conv_status,
                    {'pools': [new_pool_config]})
                alb_config["Pool"].append(new_pool_config)
                pg_obj["members"].append(dict(
                    ratio="1",
                    priority_label=bmd_priority,
                    pool_ref=conv_utils.get_object_ref(
                        new_pool_config["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                )
                )
                pool_attached_with_poolgroup.append(new_pool_config["name"])
            else:
                alb_pool_config[0]["servers"] = pool_bmd
                pg_obj["members"].append(dict(
                    ratio="1",
                    priority_label=bmd_priority,
                    pool_ref=conv_utils.get_object_ref(
                        alb_pool_config[0]["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                )
                )
                pool_attached_with_poolgroup.append(alb_pool_config[0]["name"])

        elif pool_bme:
            if suffix == "backup_pool":
                priority = "2"
            else:
                priority = "0"
            if new_pool_config:
                new_pool_config["name"] = new_pool_config["name"] + "-" + vs_name
                new_pool_config["servers"] = pool_bme
                conv_status = conv_utils.get_conv_status_by_obj_name(alb_pool_config[0]["name"])
                conv_utils.add_conv_status(
                    'pool', None, new_pool_config['name'], conv_status,
                    {'pools': [new_pool_config]})
                alb_config["Pool"].append(new_pool_config)
                pg_obj["members"].append(dict(
                    ratio="1",
                    priority_label=priority,
                    pool_ref=conv_utils.get_object_ref(
                        new_pool_config["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                ))
                pool_attached_with_poolgroup.append(new_pool_config["name"])
            else:
                alb_pool_config[0]["servers"] = pool_bme
                pg_obj["members"].append(dict(
                    ratio="1",
                    priority_label=priority,
                    pool_ref=conv_utils.get_object_ref(
                        alb_pool_config[0]["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                ))
                pool_attached_with_poolgroup.append(alb_pool_config[0]["name"])
        else:
            if sry_pool_present:
                if suffix == "backup_pool":
                    priority = "3"
                else:
                    priority = "1"
                if new_pool_config:
                    new_pool_config["name"] = new_pool_config["name"] + "-" + vs_name
                    new_pool_config["servers"] = pool_bmd
                    conv_status = conv_utils.get_conv_status_by_obj_name(alb_pool_config[0]["name"])
                    conv_utils.add_conv_status(
                        'pool', None, new_pool_config['name'], conv_status,
                        {'pools': [new_pool_config]})
                    alb_config["Pool"].append(new_pool_config)
                    pg_obj["members"].append(dict(
                        ratio="1",
                        priority_label=priority,
                        pool_ref=conv_utils.get_object_ref(
                            new_pool_config["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                    ))
                    pool_attached_with_poolgroup.append(new_pool_config["name"])
                else:
                    alb_pool_config[0]["servers"] = pool_bmd
                    pg_obj["members"].append(dict(
                        ratio="1",
                        priority_label=priority,
                        pool_ref=conv_utils.get_object_ref(
                            alb_pool_config[0]["name"], 'pool', tenant=tenant, cloud_name=cloud_name)
                    ))
                    pool_attached_with_poolgroup.append(alb_pool_config[0]["name"])

    def add_placement_network_to_vip(self, vip_config, vip_segments, tenant, cloud_name):
        vip_config[0]['placement_networks'] = list()
        for sub in vip_segments:
            ip_addreses = dict(
                addr=sub["subnets"]["network_range"].split("/")[0],
                type="V4"
            )
            subnets = dict(
                subnet={
                    "ip_addr": ip_addreses,
                    "mask": sub["subnets"]["network_range"].split("/")[-1]
                },
                network_ref=conv_utils.get_object_ref(
                    sub["seg_name"], 'network', tenant=tenant, cloud_name=cloud_name)
            )
            vip_config[0]['placement_networks'].append(subnets)

    def get_persist_ref(self, nsx_vs):
        """

        :param nsx_vs:  parsed nsx vs dict
        :return:
        """
        persist_ref = nsx_vs.get("lb_persistence_profile_path", None)
        if persist_ref:
            persist_ref = nsx_vs['lb_persistence_profile_path'].split('/')[-1]
        return persist_ref

    def add_placement_network_to_pool_group(self, pool_group_ref, pool_segment, alb_config, cloud_name, tenant):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pool_group_ref]
        if pool_group:
            pool_group = pool_group[0]
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_placement_network_to_pool(
                    alb_config['Pool'], pool_name, pool_segment, cloud_name, tenant)

    def add_placement_network_to_pool(self, avi_pool_list, pool_ref, pool_segment, cloud_name,
                                      tenant='admin'):
        """
        :param avi_pool_list: List of pools to search pool object
        :param pool_ref: name of the pool
        """
        for pool_obj in avi_pool_list:
            if pool_ref == pool_obj["name"]:
                pool_obj["placement_networks"] = list()
                for sub in pool_segment:
                    ip_addreses = dict(
                        addr=sub["subnets"]["network_range"].split("/")[0],
                        type="V4"
                    )
                    subnets = dict(
                        subnet={
                            "ip_addr": ip_addreses,
                            "mask": sub["subnets"]["network_range"].split("/")[-1]
                        },
                        network_ref=conv_utils.get_object_ref(
                            sub["seg_name"], 'network', tenant=tenant, cloud_name=cloud_name)
                    )
                    pool_obj["placement_networks"].append(subnets)
                break

    def get_name(self, url):

        return url.split('/')[-1]

    def add_poolgroup_with_persistence(self, alb_config, nsx_lb_config, lb_vs, pool_group_ref, prefix, cloud_name,
                                       tenant):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pool_group_ref]
        if pool_group:
            pool_group = pool_group[0]
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_pool_with_persistence(alb_config, nsx_lb_config, lb_vs, pool_name, prefix, cloud_name, tenant)

    def add_pool_with_persistence(self, alb_config, nsx_lb_config, lb_vs, pool_name, prefix, cloud_name, tenant):
        persis_id = lb_vs.get('lb_persistence_profile_path').split('/')[-1]
        persis_name = persistence_profile_list.get(persis_id)
        if persis_name:
            if self.object_merge_check:
                persis_name = self.merge_object_mapping['app_per_profile'].get(persis_name)
            for pool in alb_config['Pool']:
                if pool.get('name') == pool_name:
                    pool['application_persistence_profile_ref'] = conv_utils.get_object_ref \
                        (persis_name, 'applicationpersistenceprofile', tenant=tenant)
                    break

    def add_pki_to_pool_group(self, alb_config, pool_group_name, pki_name, tenant):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pool_group_name]
        if pool_group:
            pool_group = pool_group[0]
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_pki_to_pool(alb_config, pool_name, pki_name, tenant)

    def add_pki_to_pool(self, alb_config, pool_name, pki_name, tenant):
        for pool in alb_config['Pool']:
            if pool_name == pool["name"]:
                pool["pki_profile_ref"] = '/api/pkiprofile/?tenant=%s&name=%s' % (tenant, pki_name)
                break

    def add_port_to_pool_group(self, pg_ref, alb_config, lb_vs):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pg_ref]
        if pool_group:
            pool_group = pool_group[0]
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_port_to_pool(pool_name, alb_config, lb_vs)

    def add_port_to_pool(self, pool_name, alb_config, lb_vs):
        for pool in alb_config['Pool']:
            if pool_name == pool["name"]:
                pool['default_port'] = int(lb_vs.get['default_pool_member_ports'][0])
                break

    def add_teir_to_poolgroup(self, pg_ref, alb_config, tier1_lr):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pg_ref]
        if pool_group:
            pool_group = pool_group[0]
            pool_group['tier1_lr'] = tier1_lr
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_tier_to_pool(pool_name, alb_config, tier1_lr)

    def add_tier_to_pool(self, pool_name, alb_config, tier1_lr):
        for pool in alb_config['Pool']:
            if pool_name == pool["name"]:
                pool['tier1_lr'] = tier1_lr
                break

    def update_poolgroup_with_cloud(self, pg_ref, alb_config, cloud_name, tenant, cloud_tenant):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pg_ref]
        if pool_group:
            pool_group = pool_group[0]
            pool_group['cloud_ref'] = '/api/cloud/?name=%s' % (cloud_name)
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                member['pool_ref'] = conv_utils.get_object_ref(pool_name, 'pool', tenant=tenant, cloud_name=cloud_name)
                self.update_pool_with_cloud(pool_name, alb_config, cloud_name, tenant, cloud_tenant)

    def update_pool_with_cloud(self, pool_name, alb_config, cloud_name, tenant, cloud_tenant):
        for pool in alb_config['Pool']:
            if pool_name == pool["name"]:
                pool['cloud_ref'] = conv_utils.get_object_ref(cloud_name, 'cloud', cloud_tenant=cloud_tenant)
                break

    def add_sorry_pool_member_to_poolgroup(self, alb_config, main_pg_ref, sry_pg_ref):
        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == main_pg_ref]
        pool_group = pool_group[0]
        sry_pool_group = [obj for obj in alb_config['PoolGroup']
                          if obj['name'] == sry_pg_ref]
        sry_pool_group = sry_pool_group[0]
        for sry_member in sry_pool_group['members']:
            pool_group['members'].append(sry_member)

    def attach_pool_to_sry_pool_group(self, alb_config, main_pool_ref, sorry_pg_ref, tenant, cloud_name):
        sry_pool_group = [obj for obj in alb_config['PoolGroup']
                          if obj['name'] == sorry_pg_ref]
        sry_pool_group = sry_pool_group[0]
        pool_obj = [obj for obj in alb_config['Pool']
                    if obj['name'] == main_pool_ref]
        pool_obj = pool_obj[0]

        pool_member = dict(
            ratio="1",
            priority_label='3',
            pool_ref=conv_utils.get_object_ref(main_pool_ref, 'pool', tenant=tenant, cloud_name=cloud_name)
        )
        sry_pool_group['members'].append(pool_member)

    def update_poolgroup_with_ssl(self, alb_config, nsx_lb_config, lb_vs, pg_name,
                                  prefix, tenant,
                                  converted_alb_ssl_certs, ssh_root_password):

        pool_group = [obj for obj in alb_config['PoolGroup']
                      if obj['name'] == pg_name]
        if pool_group:
            pool_group = pool_group[0]
            for member in pool_group['members']:
                pool_name = conv_utils.get_name(member['pool_ref'])
                self.add_ssl_to_pool(alb_config, nsx_lb_config, lb_vs, pool_name,
                                     prefix, tenant, converted_alb_ssl_certs, ssh_root_password)

    def add_ssl_to_pool(self, alb_config, nsx_lb_config, lb_vs, pool_name,
                        prefix, tenant, converted_alb_ssl_certs, ssh_root_password):
        for pool in alb_config['Pool']:
            if pool.get('name') == pool_name:
                server_ssl = lb_vs['server_ssl_profile_binding']
                if server_ssl.get('ssl_profile_path'):
                    ssl_ref_id = server_ssl['ssl_profile_path'].split('/')[-1]
                    ssl_name = None
                    if ssl_ref_id in ssl_profile_list.keys():
                        ssl_name = ssl_profile_list[ssl_ref_id]
                    if ssl_name:
                        if self.object_merge_check:
                            ssl_merge_name = self.merge_object_mapping['ssl_profile'].get(ssl_name)
                            if ssl_merge_name:
                                ssl_name = ssl_merge_name
                        pool['ssl_profile_ref'] = conv_utils.get_object_ref(ssl_name, "sslprofile", tenant=tenant)
                if server_ssl.get('client_certificate_path', None):
                    ca_cert_obj = self.update_ca_cert_obj(pool_name, alb_config, [], tenant, prefix,
                                                          ssl_type='server_ssl', ssl_data=server_ssl,
                                                          nsxt_ip=self.nsxt_ip, ssh_root_password=ssh_root_password)

                    pool[
                        "ssl_key_and_certificate_ref"] = conv_utils.get_object_ref \
                        (ca_cert_obj.get("name"), "sslkeyandcertificate", tenant=tenant)

                    converted_alb_ssl_certs.append(ca_cert_obj)

                break

    def update_ssl_key_refernce(self, alb_config):
        for pool in alb_config['Pool']:
            if pool.get('ssl_key_and_certificate_ref'):
                ssl_key_name = pool['ssl_key_and_certificate_ref'].split('name=')[-1]
                ssl_key_ref = pool['ssl_key_and_certificate_ref'].split(ssl_key_name)[0]
                ssl_key_name = self.merge_object_mapping['ssl_cert_key'].get(ssl_key_name)
                pool['ssl_key_and_certificate_ref'] = ssl_key_ref + ssl_key_name

        for vs in alb_config['VirtualService']:
            if vs.get('ssl_key_and_certificate_refs'):
                vs_ssl_list = vs.get('ssl_key_and_certificate_refs')
                for index, vs_ssl in enumerate(vs_ssl_list):
                    ssl_key_name = vs_ssl.split('name=')[-1]
                    ssl_key_ref = vs_ssl.split(ssl_key_name)[0]
                    ssl_key_name = self.merge_object_mapping['ssl_cert_key'].get(ssl_key_name)
                    vs_ssl_list[index] = ssl_key_ref + ssl_key_name

    def update_pki_refernce(self, alb_config):
        for pool in alb_config['Pool']:
            if pool.get('pki_profile_ref'):
                pki_name = pool['pki_profile_ref'].split('name=')[-1]
                pki_profile_ref = pool['pki_profile_ref'].split(pki_name)[0]
                pki_name = self.merge_object_mapping['pki_profile'].get(pki_name)
                pool['pki_profile_ref'] = pki_profile_ref + pki_name

        for app in alb_config['ApplicationProfile']:
            if app.get('pki_profile_ref'):
                pki_name = app['pki_profile_ref'].split('name=')[-1]
                pki_profile_ref = app['pki_profile_ref'].split(pki_name)[0]
                pki_name = self.merge_object_mapping['pki_profile'].get(pki_name)
                app['pki_profile_ref'] = pki_profile_ref + pki_name

        for app in alb_config['NetworkProfile']:
            if app.get('pki_profile_ref'):
                pki_name = app['pki_profile_ref'].split('name=')[-1]
                pki_profile_ref = app['pki_profile_ref'].split(pki_name)[0]
                pki_name = self.merge_object_mapping['pki_profile'].get(pki_name)
                app['pki_profile_ref'] = pki_profile_ref + pki_name
