import copy
import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.policy_converter import PolicyConfigConverter
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.converter_constants as final
import random
LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
vs_list_with_snat_deactivated = []


class VsConfigConv(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict):
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
        self.supported_attr_httppolicyset = nsxt_profile_attributes["HttpPolicySetRules_Supported_Attributes"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.certkey_count = 0
        self.pki_count = 0

    def convert(self, alb_config, nsx_lb_config, cloud_name, prefix, tenant, vs_state, controller_version,
                vrf=None, segroup=None):
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
                name = lb_vs.get('display_name')
                if prefix:
                    name = prefix + '-' + name
                alb_vs = dict(
                    name=name,
                    enabled=lb_vs.get('enabled'),
                    cloud_ref=conv_utils.get_object_ref(cloud_name, 'cloud'),
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
                        cloud_ref=conv_utils.get_object_ref(cloud_name, 'cloud'),
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
                        segroup, 'serviceenginegroup', "admin",
                        cloud_name=cloud_name)
                    alb_vs['se_group_ref'] = segroup_ref
                client_pki = False
                server_pki = False

                if lb_vs.get("client_ssl_profile_binding"):
                    if lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"):
                        pki_client_profile = dict()
                        error = False
                        ca = self.get_ca_cert(lb_vs["client_ssl_profile_binding"].get("client_auth_ca_paths"))
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
                        ca = self.get_ca_cert(lb_vs["server_ssl_profile_binding"].get("server_auth_ca_paths"))
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
                    profile_name = profile_path.split('/')[-1]
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
                                                                  self.merge_object_mapping, profile_type)
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
                                             pki_client_profile_name)
                if lb_vs.get('max_concurrent_connections'):
                    alb_vs['performance_limits'] = dict(
                        max_concurrent_connections=lb_vs.get('max_concurrent_connections')
                    )
                if lb_vs.get('client_ssl_profile_binding'):
                    client_ssl = lb_vs.get('client_ssl_profile_binding')
                    ssl_key_cert_refs = []
                    if client_ssl.get('ssl_profile_path'):
                        ssl_ref = client_ssl['ssl_profile_path'].split('/')[-1]
                        if prefix:
                            ssl_ref = prefix + '-' + ssl_ref
                        alb_vs['ssl_profile_ref'] = '/api/sslprofile/?tenant=admin&name=' + ssl_ref
                    if client_ssl.get('default_certificate_path', None):
                        alb_vs['services'][0]["enable_ssl"] = True
                        cert_name = name + "-"+str(random.randint(0, 20))
                        ca_cert_obj = self.update_ca_cert_obj(cert_name, alb_config, [], "admin", prefix)
                        ssl_key_cert_refs.append(
                            "/api/sslkeyandcertificate/?tenant=admin&name=" + ca_cert_obj.get("name"))
                        converted_alb_ssl_certs.append(ca_cert_obj)
                    if client_ssl.get('sni_certificate_paths', None):
                        #TODO need to revisit to fix some issues
                        alb_vs['services'][0]["enable_ssl"] = True
                        sni_cert_list = client_ssl.get('sni_certificate_paths', None)
                        for cert in sni_cert_list:
                            cert_name = name + "-" + str(random.randint(0, 20))
                            ca_cert_obj = self.update_ca_cert_obj(cert_name, alb_config, [], "admin", prefix)
                            ssl_key_cert_refs.append(
                                "/api/sslkeyandcertificate/?tenant=admin&name=" + ca_cert_obj.get("name"))
                            converted_alb_ssl_certs.append(ca_cert_obj)
                        alb_vs["vh_type"] = "VS_TYPE_VH_SNI"
                        alb_vs["type"] = "VS_TYPE_VH_PARENT"
                    if client_ssl.get("client_auth"):
                        for profile in alb_config["ApplicationProfile"]:
                            if merge_profile_name == profile["name"]:
                                profile["ssl_client_certificate_mode"] = client_ssl["client_auth"]
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

                if lb_vs.get('pool_path'):
                    pool_ref = lb_vs.get('pool_path')
                    pool_name = pool_ref.split('/')[-1]
                    if prefix:
                        pool_name = prefix + '-' + pool_name

                    alb_vs['pool_ref'] = conv_utils.get_object_ref(
                        pool_name, 'pool', tenant="admin", cloud_name=cloud_name)
                    # alb_vs['pool_ref'] = '/api/pool/?tenant=admin&name=' + pool_name
                    if lb_vs.get('server_ssl_profile_binding'):
                        # if lb_vs["server_ssl_profile_binding"]
                        server_ssl = lb_vs.get('server_ssl_profile_binding')
                        self.update_pool_with_ssl(alb_config, lb_vs, pool_name, self.object_merge_check,
                                                  self.merge_object_mapping, prefix, converted_alb_ssl_certs)
                        skipped_server_ssl = [val for val in server_ssl.keys()
                                              if val not in self.server_ssl_attr]
                        indirect_server_attr = self.VS_server_ssl_indirect_attr

                        indirect_server_ssl = [val for val in skipped_server_ssl if
                                               val in indirect_server_attr]
                        skipped_server_ssl = [attr for attr in skipped_server_ssl if attr not in indirect_server_ssl]
                        if skipped_server_ssl:
                            skipped.append({"server_ssl ": skipped_server_ssl})
                if server_pki:
                    pki_server_profile_name = pki_server_profile["name"]
                    self.update_pool_with_pki(alb_config["Pool"], pool_name, pki_server_profile_name)
                if lb_vs.get('lb_persistence_profile_path'):
                    self.update_pool_with_persistence(alb_config['Pool'], lb_vs,
                                                      pool_name, self.object_merge_check, self.merge_object_mapping,
                                                      prefix)

                for pool in alb_config['Pool']:
                    if pool.get('name') == pool_name:
                        if lb_vs.get('default_pool_member_ports'):
                            pool['default_port'] = int(lb_vs['default_pool_member_ports'][0])
                        pool['tier1_lr'] = tier1_lr

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


                for nsx_pool in nsx_lb_config["LbPools"]:
                    nsx_pool_name = nsx_pool["display_name"]
                    if prefix:
                        nsx_pool_name = prefix + "-" + nsx_pool_name
                    if nsx_pool_name == pool_name:
                        if nsx_pool.get("snat_translation"):
                            if nsx_pool["snat_translation"].get("type") == "LBSnatDisabled":
                                vs_app_name = self.update_app_with_snat(profile_name, profile_type,
                                                                        alb_config["ApplicationProfile"],
                                                                        self.object_merge_check,
                                                                        self.merge_object_mapping)
                                if vs_app_name != profile_name:
                                    alb_vs['application_profile_ref'] = '/api/applicationprofile/?tenant=admin&' \
                                                                        'name=' + vs_app_name
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
                self.update_pool_with_app_attr(merge_profile_name, pool_name, alb_config)

                indirect = []
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
                conv_utils.add_status_row('virtual', None, lb_vs['display_name'],
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




    def update_pool_with_ssl(self, alb_config, lb_vs, pool_name, object_merge_check, merge_object_mapping, prefix,
                             converted_alb_ssl_certs):
        for pool in alb_config['Pool']:
            if pool.get('name') == pool_name:
                server_ssl = lb_vs['server_ssl_profile_binding']
                if server_ssl.get('ssl_profile_path'):
                    ssl_ref = server_ssl['ssl_profile_path'].split('/')[-1]
                    if prefix:
                        ssl_ref = prefix + '-' + ssl_ref
                    if object_merge_check:
                        ssl_name = merge_object_mapping['ssl_profile'].get(ssl_ref)
                        if ssl_name:
                            ssl_ref = ssl_name
                    pool['ssl_profile_ref'] = '/api/sslprofile/?tenant=admin&name=' + ssl_ref
                if server_ssl.get('client_certificate_path', None):
                    ca_cert_obj = self.update_ca_cert_obj(pool_name, alb_config, [], "admin", prefix)
                    pool[
                        "ssl_key_and_certificate_ref"] = "/api/sslkeyandcertificate/?tenant=admin&name=" + ca_cert_obj.get(
                        "name")
                    converted_alb_ssl_certs.append(ca_cert_obj)

    def update_pool_with_persistence(self, alb_pool_config, lb_vs, pool_name, object_merge_check, merge_object_mapping,
                                     prefix):
        for pool in alb_pool_config:
            if pool.get('name') == pool_name and lb_vs.get('lb_persistence_profile_path', None):
                if prefix:
                    persistence_name = prefix + '-' + lb_vs.get('lb_persistence_profile_path').split('/')[-1]
                else:
                    persistence_name = lb_vs.get('lb_persistence_profile_path').split('/')[-1]
                pool[
                    'persistence_profile_ref'] = '/api/applicationpersistenceprofile/?tenant=admin&name=' + persistence_name

    def get_vs_app_profile_ref(self, alb_profile_config, profile_name, object_merge_check,
                               merge_object_mapping, profile_type):
        if object_merge_check:
            app_profile_merge_name = merge_object_mapping['app_profile'].get(profile_name)
            if app_profile_merge_name:
                profile_name = app_profile_merge_name
                return '/api/applicationprofile/?tenant=admin&name=' + profile_name
            np_prodile_merge_name = merge_object_mapping['network_profile'].get(profile_name)
            if np_prodile_merge_name:
                profile_name = np_prodile_merge_name
                return '/api/networkprofile/?tenant=admin&name=' + profile_name
        if profile_type == "network":
            return '/api/networkprofile/?tenant=admin&name=' + profile_name
        return '/api/applicationprofile/?tenant=admin&name=' + profile_name

    def update_ca_cert_obj(self, name, avi_config, converted_objs, tenant, prefix, cert_type='SSL_CERTIFICATE_TYPE_CA',
                           ca_cert=None):
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
            key, ca_cert = conv_utils.create_self_signed_cert()
            name = '%s-%s' % (name, final.PLACE_HOLDER_STR)
            LOG.warning('Create self cerificate and key for : %s' % name)

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
        return app_name

    def get_ca_cert(self, ca_url):
        ca_id = """-----BEGIN CERTIFICATE-----
MIIDXzCCAkegAwIBAgIQILuJ/vBaBpdK5/W07NmI5DANBgkqhkiG9w0BAQsFADBC
MRMwEQYKCZImiZPyLGQBGRYDbGFiMRUwEwYKCZImiZPyLGQBGRYFcmVwcm8xFDAS
BgNVBAMTC3JlcHJvLUFELUNBMB4XDTIwMDQyOTEzMTgwMVoXDTI1MDQyOTEzMjgw
MVowQjETMBEGCgmSJomT8ixkARkWA2xhYjEVMBMGCgmSJomT8ixkARkWBXJlcHJv
MRQwEgYDVQQDEwtyZXByby1BRC1DQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCC
AQoCggEBALj3ChNORETzK1qOIgcF6QMx2KUv/pXx7NQYin0mJgEaPcVD/lH4RR5z
ToswIetCbz3NeajJShfoNV17H/ovvH5iUnvrdajVl7kXM0QmAaLmosKU4BLHgrDd
LKKBDMKGw2MQWjjfBHJaH92Yg8+tdtoYCzouQn6ZDHp+7sXqtpngoRIQVHFYQNH2
8gmkdDQQwp4fveeM7at6NktAB7uMTec6i63yigWrbvhqS0b/d6Y4aTVWH8qWwyCV
nd+7CsEwQk2Y1iopb0Cli5M1bppoJ6a17eONqCaYMb8qShZQZWKygDkfAYD9B9c4
x0UpRsSUDiVv7Bdc6MrlEPu9dI01BmkCAwEAAaNRME8wCwYDVR0PBAQDAgGGMA8G
A1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFGrxPxqDTdksMOqnt19O1VH0jpznMBAG
CSsGAQQBgjcVAQQDAgEAMA0GCSqGSIb3DQEBCwUAA4IBAQBU6HnUmwCShJtNEiL5
IJFgMh55tp4Vi9E1+q3XI5RwOB700UwmfWUXmOKeeD3871gg4lhqfjDKSxNrRJ3m
CKuE4nwCSgK74BSCgWu3pTpSPjUgRED2IK/03jQCK2TuZgsTe20BUROnr+uRpORI
pVbIDevBvuggxDHfn7JYQE/SXrUaCplaZUjZz6WVHTkLEDfoPeTp5gUPA7x/V4MI
tHTkjIH8nND2pAJRCzLExl5Bf5PKqWjPOqaqyg+hDg2BXm70QOWIMqvxRt9TJAq4
n6DBZ2ZDOhyFCejCDCSIbku76WGNeT8+0xXjCPaTNBL0AawR77uqa2KZpaCU7e84
jhiq
-----END CERTIFICATE----- """

        return ca_id

    def get_crl_cert(self, crl_url):
        crl_id = crl_url[0].split("/")[-1] + "-CRL-Certificates"
        return crl_id

    def update_app_with_pki(self, profile_name, app_config, pki_name):
        for profile in app_config:
            if profile_name == profile["name"]:
                profile["pki_profile_ref"] = '/api/pkiprofile/?tenant=admin&name=' + pki_name

    def update_pool_with_pki(self, pool_config, pool_name, pki_name):
        for pool in pool_config:
            if pool_name == pool["name"]:
                pool["pki_profile_ref"] = '/api/pkiprofile/?tenant=admin&name=' + pki_name

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
