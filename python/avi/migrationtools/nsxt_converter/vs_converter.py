import copy
import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.nsxt_converter.nsxt_util import is_vlan_configured_with_bgp, \
    is_segment_configured_with_subnet, get_vs_cloud_type, get_lb_skip_reason
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.nsxt_util import get_vs_cloud_name, get_object_segments, get_certificate_data
from avi.migrationtools.nsxt_converter.policy_converter import PolicyConfigConverter
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.converter_constants as final
import random

from avi.migrationtools.nsxt_converter.pools_converter import skipped_pools_list, vs_pool_segment_list, \
    vs_sorry_pool_segment_list

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
vs_list_with_snat_deactivated = []
vs_data_path_not_work = []
pool_attached_with_poolgroup = []
pool_attached_with_vs_poolref = []
vs_with_no_cloud_configured=[]
vs_with_lb_skipped=[]


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
                cloud_tenant, migration_input_config=None, vrf=None, segroup=None):
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
        alb_config["PoolGroup"] = list()
        converted_objs = []
        progressbar_count = 0
        total_size = len(nsx_lb_config['LbVirtualServers'])
        print("\nConverting Virtual Services ...")
        LOG.info('[Virtual Service ] Converting Services...')
        policy_converter = PolicyConfigConverter(self.nsxt_profile_attributes, self.object_merge_check,
                                                 self.merge_object_mapping, self.sys_dict)

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
                    conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                              conv_const.STATUS_SKIPPED, cloud_name)
                    LOG.warning("cloud is not configured for %s" % lb_vs["display_name"])
                    vs_with_no_cloud_configured.append(lb_vs["display_name"])
                    conv_utils.print_progress_bar(progressbar_count, total_size, '',
                                                  prefix='Progress', suffix='')
                    continue
                tenant_name, name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name
                if not cloud_tenant:
                    cloud_tenant = "admin"
                name = lb_vs.get('display_name')
                if prefix:
                    name = prefix + '-' + name
                vs_temp = list(filter(lambda vs: vs["name"] == name, alb_config['VirtualService']))
                if vs_temp:
                    name = name + "-" + lb_vs["id"]
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
                tier1_lr = ''
                for ref in nsx_lb_config['LBServices']:
                    if lb_vs['lb_service_path'] == ref['path']:
                        tier1_lr = ref.get('connectivity_path', None)

                if lb_vs.get('ip_address'):
                    vip = dict(
                        name=name + '-vsvip',
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
                            self.add_placement_network_to_vip(vip['vip'],vip_segment,tenant,cloud_name)
                        else:
                            conv_utils.add_status_row('virtualservice', None, lb_vs["display_name"],
                                                      conv_const.STATUS_SKIPPED)
                            LOG.warning("vip segment is not found for %s" % lb_vs["display_name"])
                            continue
                    alb_config['VsVip'].append(vip)
                    vsvip_ref = '/api/vsvip/?name=%s&cloud=%s' % (name + '-vsvip', cloud_name)
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
                        segroup, 'serviceenginegroup', tenant,
                        cloud_name=cloud_name)
                    alb_vs['se_group_ref'] = segroup_ref
                client_pki = False
                server_pki = False

                if lb_vs.get("client_ssl_profile_binding"):
                    if lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"):
                        pki_client_profile = dict()
                        error = False
                        ca = self.get_ca_cert(lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"),
                                              self.nsxt_ip, self.nsxt_password)
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
                                              self.nsxt_ip, self.nsxt_password)
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
                    profile_name = profile_config[0]["display_name"]
                    if prefix:
                        profile_name = prefix + "-" + profile_name
                    profile_type = "network"
                    merge_profile_name = profile_name
                    if self.object_merge_check:
                        merge_profile_name = self.merge_object_mapping["app_profile"].get(profile_name)
                    for profile in alb_config["ApplicationProfile"]:
                        if profile["name"] == profile_name or profile["name"] == merge_profile_name:
                            profile_type = profile["type"]

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
                        alb_vs['network_profile_ref'] = conv_utils.get_object_ref("System-TCP-Proxy", 'networkprofile',
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
                        client_ssl_config = list(
                            filter(lambda c_ssl: c_ssl["id"] == ssl_ref_id, nsx_lb_config["LbClientSslProfiles"]))
                        if client_ssl_config:
                            ssl_name = client_ssl_config[0]["display_name"]
                            if prefix:
                                ssl_name = prefix + '-' + ssl_name
                            if self.object_merge_check:
                                ssl_name = self.merge_object_mapping['ssl_profile'].get(ssl_name)
                            alb_vs['ssl_profile_ref'] = conv_utils.get_object_ref(ssl_name, 'sslprofile', tenant=tenant)
                    if client_ssl.get('default_certificate_path', None):
                        alb_vs['services'][0]["enable_ssl"] = True
                        cert_name = name + "-" + str(random.randint(0, 20))
                        ca_cert_obj = self.update_ca_cert_obj(cert_name, alb_config, [], tenant, prefix,
                                                              ssl_type='client_ssl', ssl_data=client_ssl,
                                                              nsxt_ip=self.nsxt_ip, nsxt_password=self.nsxt_password)

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
                                                                  nsxt_ip=self.nsxt_ip, nsxt_password=self.nsxt_password)

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

                pg_obj = dict(
                    cloud_ref=conv_utils.get_object_ref(cloud_name, 'cloud', cloud_tenant=cloud_tenant),
                    tenant_ref=conv_utils.get_object_ref(tenant, 'tenant')
                )
                pg_obj["members"] = []
                pg_name = ''
                lb_pl_config = nsx_lb_config['LbPools']
                sry_pool_present = False
                if lb_vs.get("sorry_pool_path"):
                    sry_pool_present = True
                    sry_pl_id = lb_vs.get("sorry_pool_path").split("/")[-1]
                    sry_pl_config = list(filter(lambda pr: pr["id"] == sry_pl_id, nsx_lb_config["LbPools"]))
                    sry_pl = sry_pl_config[0]["display_name"]
                    if lb_vs["id"] in vs_sorry_pool_segment_list.keys():
                        pool_name = vs_sorry_pool_segment_list[lb_vs["id"]].get("pool_name")
                        pool_segment = vs_sorry_pool_segment_list[lb_vs["id"]].get("pool_segment")
                        pl_name = sry_pl
                        if prefix:
                            pl_name = prefix + '-' + sry_pl
                        self.update_pool_with_subnets(pool_name, pool_segment, alb_config["Pool"], pl_name,
                                                      cloud_name,cloud_type, tenant)
                        for pool in alb_config['Pool']:
                            if pool.get('name') == pool_name:
                                if lb_vs.get('default_pool_member_ports'):
                                    pool['default_port'] = int(lb_vs['default_pool_member_ports'][0])
                                pool['tier1_lr'] = tier1_lr
                                pool['cloud_ref'] = conv_utils.get_object_ref(cloud_name, 'cloud',
                                                                              cloud_tenant=cloud_tenant)
                        pg_name = sry_pl + "-"
                        lb_pool = [lb_pl for lb_pl in lb_pl_config if lb_pl["display_name"] == sry_pl]
                        if prefix:
                            sry_pl = prefix + "-" + sry_pl
                        self.create_pool_group(cloud_name, pg_obj, alb_config, lb_pool[0],lb_vs["display_name"],
                                               sorry_pool=pool_name,
                                               sry_pool_present=True, tenant=tenant)

                if lb_vs.get('pool_path'):
                    pool_ref = lb_vs.get('pool_path')
                    pl_id = pool_ref.split('/')[-1]
                    pl_config = list(filter(lambda pr: pr["id"] == pl_id, nsx_lb_config["LbPools"]))
                    pl_name = pl_config[0]["display_name"]
                    if lb_vs["id"] in vs_pool_segment_list.keys():
                        pool_name = vs_pool_segment_list[lb_vs["id"]].get("pool_name")
                        pool_segment = vs_pool_segment_list[lb_vs["id"]].get("pool_segment")
                        if prefix:
                            pl_name = prefix + '-' + pl_name
                        self.update_pool_with_subnets \
                            (pool_name, pool_segment, alb_config["Pool"], pl_name, cloud_name,cloud_type, tenant)
                        new_pool_config = []
                        for pool in alb_config['Pool']:
                            if pool.get('name') == pool_name:
                                if lb_vs.get('default_pool_member_ports'):
                                    pool['default_port'] = int(lb_vs['default_pool_member_ports'][0])
                                pool['tier1_lr'] = tier1_lr
                                pool['cloud_ref'] = conv_utils.get_object_ref(cloud_name, 'cloud',
                                                                              cloud_tenant=cloud_tenant)
                                if pool_name in pool_attached_with_poolgroup:
                                    new_pool_config = copy.deepcopy(pool)
                                    new_pool_config["name"] = pool_name+"-"+name
                                    alb_config["Pool"].append(new_pool_config)
                                    pool_name = new_pool_config['name']

                        alb_vs['pool_ref'] = conv_utils.get_object_ref(
                            pool_name, 'pool', tenant=tenant, cloud_name=cloud_name)
                        if lb_vs.get('server_ssl_profile_binding'):
                            # if lb_vs["server_ssl_profile_binding"]
                            server_ssl = lb_vs.get('server_ssl_profile_binding')
                            self.update_pool_with_ssl(alb_config, nsx_lb_config, lb_vs, pool_name,
                                                      self.object_merge_check,
                                                      self.merge_object_mapping, prefix, tenant,
                                                      converted_alb_ssl_certs)
                            skipped_server_ssl = [val for val in server_ssl.keys()
                                                  if val not in self.server_ssl_attr]
                            indirect_server_attr = self.VS_server_ssl_indirect_attr

                            indirect_server_ssl = [val for val in skipped_server_ssl if
                                                   val in indirect_server_attr]
                            skipped_server_ssl = [attr for attr in skipped_server_ssl if
                                                  attr not in indirect_server_ssl]
                            if skipped_server_ssl:
                                skipped.append({"server_ssl ": skipped_server_ssl})
                        if server_pki:
                            pki_server_profile_name = pki_server_profile["name"]
                            self.update_pool_with_pki(alb_config["Pool"], pool_name, pki_server_profile_name, tenant)
                        if lb_vs.get('lb_persistence_profile_path'):
                            self.update_pool_with_persistence(alb_config['Pool'], nsx_lb_config, lb_vs,
                                                              pool_name, self.object_merge_check,
                                                              self.merge_object_mapping,
                                                              prefix, tenant)

                        for nsx_pool in nsx_lb_config["LbPools"]:
                            nsx_pool_name = nsx_pool["display_name"]
                            if prefix:
                                nsx_pool_name = prefix + "-" + nsx_pool_name
                            if nsx_pool_name == pl_name:
                                if nsx_pool.get("snat_translation"):
                                    if nsx_pool["snat_translation"].get("type") == "LBSnatDisabled":
                                        vs_app_name = self.update_app_with_snat(profile_name, profile_type,
                                                                                alb_config["ApplicationProfile"],
                                                                                self.object_merge_check,
                                                                                self.merge_object_mapping)
                                        if vs_app_name != profile_name:
                                            alb_vs['application_profile_ref'] = conv_utils.get_object_ref \
                                                (vs_app_name, 'applicationprofile', tenant=tenant)

                                        vs_list_with_snat_deactivated.append(alb_vs["name"])

                                    if nsx_pool["snat_translation"].get("type") == "LBSnatIpPool":
                                        alb_vs["snat_ip"] = []
                                        snat_ip_pool = nsx_pool["snat_translation"]["ip_addresses"]
                                        for ip_pool in snat_ip_pool:
                                            snat_ip = dict(
                                                addr=ip_pool["ip_address"],
                                                type="V4"
                                            )
                                            alb_vs["snat_ip"].append(snat_ip)
                                pg_flag = [member for member in nsx_pool.get("members") if member.get("backup_member")]
                                if pg_flag:
                                    self.create_pool_group(cloud_name, pg_obj, alb_config, nsx_pool,
                                                           lb_vs["display_name"],
                                                           backup_pool=pool_name,
                                                           sry_pool_present=sry_pool_present, tenant=tenant)
                                    pg_name = pool_name + pg_name
                                else:
                                    if new_pool_config:
                                        conv_status = conv_utils.get_conv_status_by_obj_name(new_pool_config["name"])
                                        conv_utils.add_conv_status(
                                        'pool', None, new_pool_config['name'], conv_status,
                                        {'pools': [new_pool_config]})
                                    pool_attached_with_vs_poolref.append(pool_name)
                        self.update_pool_with_app_attr(merge_profile_name, pool_name, alb_config)

                if pg_obj.get("members"):
                    if prefix:
                        if not pg_name.__contains__(prefix + "-"):
                            pg_name = prefix + "-" + pg_name
                    pg_obj["name"] = pg_name + "-poolgroup"
                    alb_config["PoolGroup"].append(pg_obj)
                    if alb_vs.get("pool_ref"):
                        del alb_vs["pool_ref"]

                    alb_vs["pool_group_ref"] = conv_utils.get_object_ref(
                        pg_obj["name"], 'poolgroup', tenant=tenant, cloud_name=cloud_name)
                    indirect = []
                    u_ignore = []
                    ignore_for_defaults = {}
                    conv_status = conv_utils.get_conv_status(
                        [], indirect, ignore_for_defaults, [],
                        u_ignore, [])
                    conv_utils.add_conv_status('poolgroup', None, pg_obj["name"], conv_status,
                                               {'poolgroup': [pg_obj]})
                if lb_vs.get("pool_ref"):
                    pool_attached_with_vs_poolref.append(lb_vs['pool_ref'].split('/')[-1])
                if lb_vs.get('rules'):

                    policy, skipped_rules = policy_converter.convert(lb_vs, alb_config, cloud_name, prefix, tenant)
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
                    (lb_vs["id"], cloud_name)
                if network_type == "Vlan":
                    if is_vlan_configured:
                        LOG.info("%s is configured with subnet" % lb_vs["display_name"])
                        is_bgp_configured = is_vlan_configured_with_bgp \
                            (cloud_name=cloud_name, tenant=tenant, vlan_segment=vlan_segment)
                        if is_bgp_configured:
                            if migration_input_config and migration_input_config.get('bgp_peer_configured_for_vlan'):
                                alb_vs['enable_rhi'] = True
                                LOG.info("ALB Plugin : vlan_configured_with_bgp : {}".format(vlan_segment))
                        else:
                            LOG.warning("%s vlan is not configured with bgp" % lb_vs["display_name"])
                    else:
                        LOG.warning("%s data path won't work as %s" % (lb_vs["display_name"], return_mesg))
                        vs_data_path_not_work.append(name)


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
                                          conv_const.STATUS_ERROR)
        for cert in converted_alb_ssl_certs:
            indirect = []
            u_ignore = []
            ignore_for_defaults = {}
            conv_status = conv_utils.get_conv_status(
                [], indirect, ignore_for_defaults, [],
                u_ignore, [])
            conv_utils.add_conv_status('ssl_key_and_certificate', None, cert['name'], conv_status,
                                       [{"ssl_cert_key": cert}])

    def update_pool_with_ssl(self, alb_config, nsx_lb_config, lb_vs, pool_name, object_merge_check,
                             merge_object_mapping,
                             prefix, tenant,
                             converted_alb_ssl_certs):
        for pool in alb_config['Pool']:
            if pool.get('name') == pool_name:
                server_ssl = lb_vs['server_ssl_profile_binding']
                if server_ssl.get('ssl_profile_path'):
                    ssl_ref_id = server_ssl['ssl_profile_path'].split('/')[-1]
                    ssl_config = list(
                        filter(lambda ssl: ssl["id"] == ssl_ref_id, nsx_lb_config["LbServerSslProfiles"]))
                    ssl_name = ssl_config[0]["display_name"]
                    if prefix:
                        ssl_name = prefix + '-' + ssl_name
                    if object_merge_check:
                        ssl_merge_name = merge_object_mapping['ssl_profile'].get(ssl_name)
                        if ssl_merge_name:
                            ssl_name = ssl_merge_name
                    pool['ssl_profile_ref'] = conv_utils.get_object_ref(ssl_name, "sslprofile", tenant=tenant)
                if server_ssl.get('client_certificate_path', None):
                    ca_cert_obj = self.update_ca_cert_obj(pool_name, alb_config, [], tenant, prefix,
                                                          ssl_type='server_ssl', ssl_data=server_ssl,
                                                          nsxt_ip=self.nsxt_ip,  nsxt_password=self.nsxt_password)

                    pool[
                        "ssl_key_and_certificate_ref"] = conv_utils.get_object_ref \
                        (ca_cert_obj.get("name"), "sslkeyandcertificate", tenant=tenant)

                    converted_alb_ssl_certs.append(ca_cert_obj)

    def update_pool_with_persistence(self, alb_pool_config, nsx_lb_config, lb_vs, pool_name, object_merge_check,
                                     merge_object_mapping, prefix, tenant):
        persis_id = lb_vs.get('lb_persistence_profile_path').split('/')[-1]
        persis_config = list(
            filter(lambda pp: pp["id"] == persis_id, nsx_lb_config["LbPersistenceProfiles"]))
        if persis_config:
            persis_name = persis_config[0]["display_name"]
            if prefix:
                persis_name = prefix + "-" + persis_name
            if self.object_merge_check:
                persis_name = self.merge_object_mapping['app_per_profile'].get(persis_name)
            for pool in alb_pool_config:
                if pool.get('name') == pool_name:
                    pool['application_persistence_profile_ref'] = conv_utils.get_object_ref \
                        (persis_name, 'applicationpersistenceprofile', tenant=tenant)

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
                           ssl_type=None, ssl_data=None, nsxt_ip=None, nsxt_password=None):
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

            key, ca_cert = get_certificate_data(certificate_ref, nsxt_ip, nsxt_password)
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
        app_prof_obj = [obj for obj in alb_app_config if obj['name'] == profile_name]
        if object_merge_check:
            app_profile_merge_name = merge_object_mapping['app_profile'].get(profile_name)
            app_prof_obj = [obj for obj in alb_app_config if obj['name'] == app_profile_merge_name]
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
                conv_status = conv_utils.get_conv_status_by_obj_name(profile_name)
                conv_utils.add_conv_status('applicationprofile', "LBHttpProfile",
                                           app_prof_cmd['name'], conv_status,
                                           [{'application_http_profile': app_prof_cmd}])
        return app_name

    def get_ca_cert(self, ca_url, nsxt_ip, nsxt_password):
        if ca_url:
            certificate_ref = ca_url[0].split('/')[-1]

            key, ca_cert = get_certificate_data(certificate_ref, nsxt_ip, nsxt_password)
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

    def update_pool_with_subnets(self, pool_name, pool_segment, alb_pl, old_pool_name, cloud_name,cloud_type, tenant):

        pool_present = False
        for pool in alb_pl:
            if pool["name"] == pool_name:
                pool_obj = pool
                pool_present = True
            elif pool["name"] == old_pool_name:
                pool_obj = copy.deepcopy(pool)
                pool_obj["name"] = pool_name
            else:
                continue
            if cloud_type == "Vlan":
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
            if not pool_present:
                alb_pl.append(pool_obj)
                conv_status = conv_utils.get_conv_status_by_obj_name(old_pool_name)
                conv_utils.add_conv_status(
                    'pool', None, pool_obj["name"], conv_status,
                    {'pools': [pool_obj]})
            break

    def create_pool_group(self, cloud_name, pg_obj, alb_config, lb_pool,vs_name, backup_pool=None, sorry_pool=None,
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
                new_pool_config["name"] = new_pool_config["name"]+"-"+vs_name
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
                new_pool_config["name"] = new_pool_config["name"]+"-"+vs_name
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

    def add_placement_network_to_vip(self , vip_config, vip_segments, tenant, cloud_name):
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
