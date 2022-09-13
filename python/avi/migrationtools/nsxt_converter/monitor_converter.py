# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import time, logging

import com.vmware.nsx_policy.model_client as model_client

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil, csv_writer_dict_list
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import MigrationUtil
import avi.migrationtools.nsxt_converter.converter_constants as final

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
monitor_list = {}


class MonitorConfigConv(object):
    def __init__(self, nsxt_monitor_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

       :param nsxt_monitor_attributes: NsxT monitor attributes from yaml file.
       :param prefix: prefix for objects
       :param object_merge_check: flag for merge objects
        """
        self.supported_types = nsxt_monitor_attributes['Monitor_Supported_Types']
        self.tup = "time until up"
        self.supported_attributes = \
            nsxt_monitor_attributes['Monitor_Supported_Attributes']
        self.dest_key = "dest"
        self.http_attr = nsxt_monitor_attributes['Monitor_http_attr']
        self.https_attr = nsxt_monitor_attributes['Monitor_https_attr']
        self.tcp_attr = nsxt_monitor_attributes['Monitor_tcp_attr']
        self.udp_attr = nsxt_monitor_attributes['Monitor_udp_attr']
        self.ping_attr = nsxt_monitor_attributes['Monitor_ping_attr']
        self.common_na_attr = nsxt_monitor_attributes['Common_Na_List']
        self.icmp_ignore_attr = nsxt_monitor_attributes["Monitor_icmp_ignore"]
        self.passive_indirect_attr = nsxt_monitor_attributes["Monitor_passive_indirect"]
        self.server_ssl_indirect_attr = nsxt_monitor_attributes["Monitor_server_ssl_indirect_attributes"]
        self.server_ssl_supported_attr = nsxt_monitor_attributes["Monitor_server_ssl_supported_attributes"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.monitor_count = 0
        self.certkey_count = 0
        self.pki_count = 0

    def get_alb_response_codes(self, response_codes):
        if not response_codes:
            return None
        HttpResponseCode = model_client.ALBHealthMonitorHttp
        codes = list()
        for code in response_codes:
            if code < 200:
                if HttpResponseCode.HTTP_RESPONSE_CODE_1XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_1XX)
            elif code > 199 and code < 300:
                if HttpResponseCode.HTTP_RESPONSE_CODE_2XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_2XX)
            elif code > 299 and code < 400:
                if HttpResponseCode.HTTP_RESPONSE_CODE_3XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_3XX)
            elif code > 399 and code < 500:
                if HttpResponseCode.HTTP_RESPONSE_CODE_4XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_4XX)
            elif code > 499 and code < 600:
                if HttpResponseCode.HTTP_RESPONSE_CODE_5XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_5XX)
        return codes

    def update_alb_type(self, lb_hm, alb_hm, skipped):
        if lb_hm['resource_type'] == 'LBHttpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_HTTP'

            alb_hm['http_monitor'] = dict(
                http_request=lb_hm['request_url'],
                http_request_body=lb_hm.get('request_body'),
                http_response=lb_hm.get('response_body'),
                http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
            )
            skipped = [key for key in skipped if key not in self.http_attr]
        elif lb_hm['resource_type'] == 'LBHttpsMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_HTTPS'
            alb_hm['https_monitor'] = dict(
                http_request=lb_hm['request_url'],
                http_request_body=lb_hm.get('request_body'),
                http_response=lb_hm.get('response_body'),
                http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),

            )

            skipped = [key for key in skipped if key not in self.https_attr]

        elif lb_hm['resource_type'] == 'LBIcmpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_PING'
        elif lb_hm['resource_type'] == 'LBTcpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_TCP'
        elif lb_hm['resource_type'] == 'LBUdpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_UDP'
        return skipped

    def convert(self, alb_config, nsx_lb_config, prefix, tenant, custom_mapping):
        converted_alb_ssl_certs = list()
        converted_pki_profile = list()
        alb_config['HealthMonitor'] = list()
        converted_objs = []
        indirect = []
        u_ignore = []
        progressbar_count = 0
        custom_config = custom_mapping.get(
            conv_const.HM_CUSTOM_KEY, dict()
        ) if custom_mapping else dict()
        skipped_list = []
        server_ssl_indirect_list = []
        converted_alb_monitor = []
        tenant_name, name = conv_utils.get_tenant_ref(tenant)
        if not tenant:
            tenant = tenant_name
        total_size = len(nsx_lb_config['LbMonitorProfiles'])
        print("Converting Monitors...")
        LOG.info('[MONITOR] Converting Monitors...')
        for lb_hm in nsx_lb_config['LbMonitorProfiles']:
            try:
                LOG.info('[MONITOR] Migration started for HM {}'.format(lb_hm['display_name']))
                progressbar_count += 1
                monitor_type, name = self.get_name_type(lb_hm)
                if '/' in monitor_type:
                    monitor_type = monitor_type.split('/')[-1]
                m_tenant, m_name = conv_utils.get_tenant_ref(name)
                # Check if custom cofig present for this HM
                r_hm = [obj for obj in custom_config if
                        obj['monitor_name'] == m_name]
                if r_hm:
                    LOG.debug(
                        "Found custom config for %s replacing with custom config"
                        % m_name)
                    r_hm = r_hm[0]
                    avi_monitor = r_hm['avi_config']
                    # Added prefix for objects
                    if prefix:
                        avi_monitor['name'] = prefix + '-' + m_name
                    else:
                        avi_monitor['name'] = m_name
                    if tenant:
                        m_tenant = tenant
                    avi_monitor['tenant_ref'] = conv_utils.get_object_ref(
                        m_tenant, 'tenant')
                    alb_config["HealthMonitor"].append(avi_monitor)
                    conv_utils.add_conv_status(
                        'monitor', monitor_type, m_name, {
                            'status': conv_const.STATUS_SUCCESSFUL
                        }, [{'health_monitor': avi_monitor}])
                    continue
                if lb_hm['resource_type'] == 'LBPassiveMonitorProfile':
                    indirect = self.passive_indirect_attr
                    conv_status = dict()
                    conv_status['status'] = conv_const.STATUS_SUCCESSFUL
                    conv_status['indirect'] = indirect
                    conv_utils.add_conv_status('monitor', lb_hm['resource_type'], lb_hm['display_name'], conv_status)
                    continue

                monitor_type, name = self.get_name_type(lb_hm)
                skipped = [val for val in lb_hm.keys()
                           if val not in self.supported_attributes]
                na_list = [val for val in lb_hm.keys()
                           if val in self.common_na_attr]
                if prefix:
                    name = '%s-%s' % (prefix, name)
                if self.object_merge_check:
                    if name in self.merge_object_mapping.keys():
                        name = '%s-%s' % (name, lb_hm["id"])
                else:
                    monitor_temp = list(filter(lambda hm: hm["name"] == name, alb_config['HealthMonitor']))
                    if monitor_temp:
                        name = name + "-" + lb_hm["id"]
                alb_hm = dict(
                    name=name,
                    failed_checks=lb_hm['fall_count'],
                    receive_timeout=lb_hm['timeout'],
                    send_interval=lb_hm['interval'],
                    successful_checks=lb_hm.get('rise_count', None)
                )
                monitor_list[lb_hm['id']] = name
                if lb_hm.get('monitor_port', None):
                    alb_hm['monitor_port'] = lb_hm.get('monitor_port', None)

                alb_hm['tenant_ref'] = conv_utils.get_object_ref(tenant, 'tenant')
                server_ssl_indirect = []
                if monitor_type == "LBHttpMonitorProfile":
                    skipped = self.convert_http(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBHttpsMonitorProfile":
                    skipped, server_ssl_indirect = self.convert_https(lb_hm, alb_hm, skipped, alb_config, prefix,
                                                                      tenant, converted_objs,
                                                                      converted_alb_ssl_certs, converted_pki_profile)
                elif monitor_type == "LBIcmpMonitorProfile":
                    u_ignore = self.icmp_ignore_attr
                    skipped = self.convert_icmp(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBTcpMonitorProfile":
                    skipped = self.convert_tcp(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBUdpMonitorProfile":
                    skipped = self.convert_udp(lb_hm, alb_hm, skipped)

                ignore_for_defaults = {}
                skipped_list.append(skipped)
                server_ssl_indirect_list.append(server_ssl_indirect)
                if self.object_merge_check:
                    common_avi_util.update_skip_duplicates(alb_hm,
                                                           alb_config['HealthMonitor'], 'health_monitor',
                                                           converted_objs, name, None, self.merge_object_mapping,
                                                           monitor_type, prefix,
                                                           self.sys_dict['HealthMonitor'])
                    self.monitor_count += 1
                else:
                    alb_config['HealthMonitor'].append(alb_hm)
                val = dict(
                    id=lb_hm["id"],
                    name=name,
                    resource_type=lb_hm['resource_type'],
                    alb_hm=alb_hm

                )
                converted_alb_monitor.append(val)
                msg = "Monitor conversion started..."
                conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                              prefix='Progress', suffix='')
                # time.sleep(1)

                LOG.info('[MONITOR] Migration completed for HM {}'.format(lb_hm['display_name']))
            except:
                update_count('error')
                LOG.error("[MONITOR] Failed to convert Monitor: %s" % lb_hm['display_name'],
                          exc_info=True)
                conv_utils.add_status_row('monitor', None, lb_hm['display_name'],
                                          conv_const.STATUS_ERROR)

        for index, skipped in enumerate(skipped_list):
            conv_status = conv_utils.get_conv_status(
                skipped_list[index], indirect, ignore_for_defaults, nsx_lb_config['LbMonitorProfiles'],
                u_ignore, na_list)
            na_list_hm = [val for val in na_list if val not in self.common_na_attr]
            conv_status["na_list"] = na_list_hm
            if server_ssl_indirect_list[index]:
                conv_status["indirect"].append({"server_ssl": server_ssl_indirect_list[index]})
            name = converted_alb_monitor[index]['name']
            hm_id = converted_alb_monitor[index]['id']
            alb_mig_hm = converted_alb_monitor[index]['alb_hm']
            resource_type = converted_alb_monitor[index]['resource_type']
            if self.object_merge_check:
                alb_mig_hm = [hm for hm in alb_config['HealthMonitor'] if
                              hm.get('name') == self.merge_object_mapping['health_monitor'].get(name)]
                conv_utils.add_conv_status('monitor', resource_type, name, conv_status,
                                           [{'health_monitor': alb_mig_hm[0]}])
            else:
                conv_utils.add_conv_status('monitor', resource_type, name, conv_status,
                                           [{'health_monitor': alb_mig_hm}])
            if len(conv_status['skipped']) > 0:
                LOG.debug('[Monitor] Skipped Attribute {}:{}'.format(name, conv_status['skipped']))

        for cert in converted_alb_ssl_certs:
            indirect = []
            u_ignore = []
            ignore_for_defaults = {}
            conv_status = conv_utils.get_conv_status(
                [], indirect, ignore_for_defaults, [],
                u_ignore, [])
            conv_utils.add_conv_status('ssl_key_and_certificate', None, cert['name'], conv_status,
                                       [{"ssl_cert_key": cert}])
        for pki_profile in converted_pki_profile:
            indirect = []
            u_ignore = []
            ignore_for_defaults = {}
            conv_status = conv_utils.get_conv_status(
                [], indirect, ignore_for_defaults, [],
                u_ignore, [])
            conv_utils.add_conv_status('pki_profile', None, pki_profile['name'], conv_status,
                                       [{"pki_profile": pki_profile}])

    def get_name_type(self, lb_hm):
        """

        """
        return lb_hm['resource_type'], lb_hm['display_name']

    def convert_http(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_HTTP'
        http_request = self.update_http_request_for_avi(lb_hm)
        alb_hm['http_monitor'] = dict(
            http_request=http_request,
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
        )

        skipped = [key for key in skipped if key not in self.http_attr]
        return skipped

    def convert_https(self, lb_hm, alb_hm, skipped, alb_config, prefix, tenant, converted_objs,
                      converted_alb_ssl_certs=None, converted_pki_profile=None):
        if converted_alb_ssl_certs is None:
            converted_alb_ssl_certs = []
        if converted_pki_profile is None:
            converted_pki_profile = []
        indirect = []
        alb_hm['type'] = 'HEALTH_MONITOR_HTTPS'
        https_request = self.update_http_request_for_avi(lb_hm)
        alb_hm['https_monitor'] = dict(
            http_request=https_request,
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
        )
        if lb_hm.get('server_ssl_profile_binding', None):
            server_ssl_profile_binding = lb_hm.get('server_ssl_profile_binding', None)
            ssl_profile_path = server_ssl_profile_binding["ssl_profile_path"]
            ssl_profile_name = ssl_profile_path.split('/')[-1]
            if prefix:
                ssl_profile_name = prefix + '-' + ssl_profile_name
            ssl_attributes = {
                "ssl_profile_ref": conv_utils.get_object_ref(
                    ssl_profile_name, 'sslprofile', tenant=tenant)
            }

            if server_ssl_profile_binding.get("client_certificate_path", None):
                ca_cert_obj = self.update_ca_cert_obj(lb_hm['display_name'], alb_config, [], tenant, prefix,
                                                      cert_type='SSL_CERTIFICATE_TYPE_VIRTUALSERVICE')
                ssl_attributes[
                    "ssl_key_and_certificate_ref"] = "/api/sslkeyandcertificate/?tenant=%s&name=%s" % (
                tenant, ca_cert_obj.get(
                    "name"))
                converted_alb_ssl_certs.append(ca_cert_obj)

            alb_hm["https_monitor"]['ssl_attributes'] = ssl_attributes
            pki_profile = self.create_pki_profile(lb_hm, alb_hm["name"], tenant, alb_hm, converted_pki_profile)
            if pki_profile:
                pki_id = lb_hm["id"] + "-" + "pki"
                pki_profile_name = pki_profile["name"]
                if self.object_merge_check:
                    conv_utils.update_skip_duplicates(pki_profile,
                                                      alb_config['PKIProfile'], 'pki_profile',
                                                      converted_objs, pki_profile_name, None,
                                                      self.merge_object_mapping, None, prefix,
                                                      self.sys_dict['PKIProfile'])
                    self.pki_count += 1
                    pki_profile_name = self.merge_object_mapping["pki_profile"].get(pki_profile_name)
                else:
                    converted_objs.append({'pki_profile': pki_profile})
                    alb_config['PKIProfile'].append(pki_profile)
                alb_hm["pki_profile_ref"] = '/api/pkiprofile/?tenant=%s&name=%s' % (tenant, pki_profile_name)
            server_ssl_skipped = [key for key in server_ssl_profile_binding.keys()
                                  if key not in self.server_ssl_supported_attr]
            server_ssl_indirect_list = self.server_ssl_indirect_attr
            indirect = [val for val in server_ssl_skipped if val in server_ssl_indirect_list]
            server_ssl_skipped = [val for val in server_ssl_skipped if val not in server_ssl_indirect_list]
            if server_ssl_skipped:
                skipped.append({"server_ssl": server_ssl_skipped})

        skipped = [key for key in skipped if key not in self.https_attr]
        return skipped, indirect

    def convert_icmp(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_PING'
        if self.ping_attr:
            skipped = [key for key in skipped if key not in self.ping_attr]

        return skipped

    def convert_tcp(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_TCP'
        alb_hm["tcp_monitor"] = dict()
        request = lb_hm.get("send", None)
        # request = self.update_request_for_avi(request, False)
        response = lb_hm.get("receive", None)
        if response == 'none':
            response = None
        tcp_monitor = {"tcp_request": request, "tcp_response": response}
        alb_hm["tcp_monitor"] = tcp_monitor

        # [skipped.append(key) for key in lb_hm.keys() if key not in self.tcp_attr]
        skipped = [key for key in skipped if key not in self.tcp_attr]

        return skipped

    def convert_udp(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_UDP'
        request = lb_hm.get("send", None)
        # request = self.update_request_for_avi(request, False)
        response = lb_hm.get("receive", None)
        if response == 'none':
            response = None
        udp_monitor = {"udp_request": request, "udp_response": response}
        alb_hm["udp_monitor"] = udp_monitor
        # [skipped.append(key) for key in lb_hm.keys() if key not in self.udp_attr]
        skipped = [key for key in skipped if key not in self.tcp_attr]

        return skipped

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

    def update_http_request_for_avi(self, lb_hm):
        if lb_hm["request_version"] == "HTTP_VERSION_1_0":
            version = "HTTP/1.0"
        else:
            version = "HTTP/1.1"
        http_request = lb_hm["request_method"] + " " + lb_hm["request_url"] + " " + version
        if lb_hm.get("request_headers"):
            for header in lb_hm["request_headers"]:
                header_set = header["header_name"] + ":" + header["header_value"]
                http_request = http_request + "\r\n" + header_set
        if lb_hm.get("exact_request"):
            if lb_hm.get("request_body"):
                http_request += "\r\n" + lb_hm["request_body"]
        return http_request

    def create_pki_profile(self, lb_hm, name, tenant, alb_hm, converted_pki_profile):
        if lb_hm["server_ssl_profile_binding"].get("server_auth_ca_paths"):
            pki_server_profile = dict()
            error = False
            ca = self.get_ca_cert(lb_hm["server_ssl_profile_binding"].get("server_auth_ca_paths"))
            if ca:
                pki_server_profile["ca_certs"] = [{'certificate': ca}]
            else:
                error = True
            if lb_hm["server_ssl_profile_binding"].get("server_auth_crl_paths"):
                crl = self.get_crl_cert(lb_hm["server_ssl_profile_binding"].get("server_auth_crl_paths"))
                if crl:
                    pki_server_profile["crls"] = [{'body': crl}]
                else:
                    error = True
            else:
                pki_server_profile['crl_check'] = False
            if not error:
                pki_server_profile["name"] = name + "-server-pki"
                pki_server_profile["tenant_ref"] = conv_utils.get_object_ref(tenant, "tenant")
                converted_pki_profile.append(pki_server_profile)
                return pki_server_profile
        return False

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
        crl_id = """-----BEGIN CERTIFICATE-----
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

        return crl_id
