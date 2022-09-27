# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import time, logging

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import MigrationUtil

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
application_profile_list = {}
network_profile_list = {}


class ProfileConfigConv(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

        """
        self.ap_http_supported_attributes = nsxt_profile_attributes['Application_Http_Profile_supported_attr']
        self.common_na_attr = nsxt_profile_attributes['Common_Na_List']
        self.http_na_attr = nsxt_profile_attributes["http_na_list"]
        self.tcp_na_attr = nsxt_profile_attributes["tcp_na_list"]
        self.np_supported_attributes = nsxt_profile_attributes['Network_Profile_supported_attr']
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.app_pr_count = 0
        self.np_pr_count = 0

    def convert(self, alb_config, nsx_lb_config, prefix, tenant):
        alb_config['ApplicationProfile'] = list()
        alb_config['NetworkProfile'] = list()
        skipped_ap = []
        skipped_np = []
        na_ap = []
        na_np = []
        attr_ap = []
        attr_np = []
        progressbar_count = 0
        converted_objs = []
        total_size = len(nsx_lb_config['LbAppProfiles'])
        print("\nConverting Profiles ...")
        LOG.info('[APPLICATION-PROFILE] Converting Profiles...')
        for lb_pr in nsx_lb_config['LbAppProfiles']:
            try:
                LOG.info('[APPLICATION-PROFILE] Migration started for AP {}'.format(lb_pr['display_name']))
                progressbar_count += 1
                name = lb_pr.get('display_name')
                if prefix:
                    name = '%s-%s' % (prefix, name)
                tenant_name, t_name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name

                alb_pr = dict(
                    name=name,
                    tenant_ref=conv_utils.get_object_ref(tenant, 'tenant'),
                )

                if lb_pr['resource_type'] == 'LBHttpProfile':
                    na_list = [val for val in lb_pr.keys()
                               if val in self.common_na_attr or val in self.http_na_attr]
                    self.convert_http(alb_pr, lb_pr)
                if lb_pr['resource_type'] == 'LBFastUdpProfile':
                    self.convert_udp(alb_pr, lb_pr)
                    na_list = [val for val in lb_pr.keys()
                               if val in self.common_na_attr]
                if lb_pr['resource_type'] == 'LBFastTcpProfile':
                    na_list = [val for val in lb_pr.keys()
                               if val in self.common_na_attr or val in self.tcp_na_attr]
                    self.convert_tcp(alb_pr, lb_pr)

                indirect = []
                u_ignore = []
                ignore_for_defaults = {}

                if lb_pr['resource_type'] == 'LBHttpProfile':
                    if self.object_merge_check:
                        if name in self.merge_object_mapping['app_profile'].keys():
                            name = '%s-%s' % (name, lb_pr["id"])
                    else:
                        profile_temp = list(filter(lambda pr: pr["name"] == name, alb_config['ApplicationProfile']))
                        if profile_temp:
                            name = '%s-%s' % (name, lb_pr["id"])
                    alb_pr["name"] = name
                    skipped = [val for val in lb_pr.keys()
                               if val not in self.ap_http_supported_attributes]
                    if lb_pr.get("description"):
                        alb_pr["description"] = lb_pr['description']

                    if self.object_merge_check:
                        common_avi_util.update_skip_duplicates(alb_pr,
                                                               alb_config['ApplicationProfile'], 'app_profile',
                                                               converted_objs, name, None,
                                                               self.merge_object_mapping,
                                                               lb_pr['resource_type'], prefix,
                                                               self.sys_dict['ApplicationProfile'])
                        self.app_pr_count += 1
                    else:
                        alb_config['ApplicationProfile'].append(alb_pr)
                    skipped_ap.append(skipped)
                    val = dict(
                        id=lb_pr["id"],
                        name=alb_pr['name'],
                        resource_type=lb_pr['resource_type'],
                        alb_pr=alb_pr)
                    attr_ap.append(val)
                    na_ap.append(na_list)

                else:
                    if self.object_merge_check:
                        if name in self.merge_object_mapping['network_profile'].keys():
                            name = '%s-%s' % (name, lb_pr["id"])
                    else:
                        profile_temp = list(filter(lambda pr: pr["name"] == name, alb_config['NetworkProfile']))
                        if profile_temp:
                            name = '%s-%s' % (name, lb_pr["id"])
                    alb_pr["name"] = name
                    skipped = [val for val in lb_pr.keys()
                               if val not in self.np_supported_attributes]

                    if self.object_merge_check:
                        common_avi_util.update_skip_duplicates(alb_pr,
                                                               alb_config['NetworkProfile'], 'network_profile',
                                                               converted_objs, name, None,
                                                               self.merge_object_mapping,
                                                               lb_pr['resource_type'], prefix,
                                                               self.sys_dict['NetworkProfile'])
                        self.np_pr_count += 1
                    else:
                        alb_config['NetworkProfile'].append(alb_pr)
                    skipped_np.append(skipped)
                    val = dict(
                        id=lb_pr["id"],
                        name=alb_pr['name'],
                        resource_type=lb_pr['resource_type'],
                        alb_pr=alb_pr)
                    attr_np.append(val)
                    na_np.append(na_list)

                msg = "Profile conversion started..."
                conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                              prefix='Progress', suffix='')
                # time.sleep(1)

                LOG.info('[APPLICATION-PROFILE] Migration completed for AP {}'.format(lb_pr['display_name']))
            except:
                update_count('error')
                LOG.error("[APPLICATION-PROFILE] Failed to convert ApplicationProfile: %s" % lb_pr['display_name'],
                          exc_info=True)
                conv_utils.add_status_row('applicationprofile', None, lb_pr['display_name'],
                                          conv_const.STATUS_ERROR)

        if len(skipped_ap):
            for index, skipped in enumerate(skipped_ap):
                conv_status = conv_utils.get_conv_status(
                    skipped, indirect, ignore_for_defaults, nsx_lb_config['LbAppProfiles'],
                    u_ignore, na_ap[index])
                na_list = [val for val in na_ap[index] if val not in self.common_na_attr]
                conv_status["na_list"] = na_list
                name = attr_ap[index]['name']
                profile_id = attr_ap[index]['id']
                alb_mig_app_pr = attr_ap[index]['alb_pr']
                if self.object_merge_check:
                    alb_mig_app_pr = [app_pr for app_pr in alb_config['ApplicationProfile'] if
                                      app_pr.get('name') == self.merge_object_mapping['app_profile'].get(name)]
                    conv_utils.add_conv_status('applicationprofile', attr_ap[index]['resource_type'],
                                               attr_ap[index]['name'], conv_status,
                                               [{'application_http_profile': alb_mig_app_pr[0]}])
                    application_profile_list[profile_id] = attr_ap[index]['name']
                else:
                    conv_utils.add_conv_status('applicationprofile', attr_ap[index]['resource_type'],
                                               attr_ap[index]['name'], conv_status,
                                               [{'application_http_profile': alb_mig_app_pr}])
                    application_profile_list[profile_id] = attr_ap[index]['name']

                if len(conv_status['skipped']) > 0:
                    LOG.debug('[APPLICATION-PROFILE] Skipped Attribute {}:{}'.format(attr_ap[index]['name'],
                                                                                     conv_status['skipped']))

        if len(skipped_np):
            for index, skipped in enumerate(skipped_np):
                conv_status = conv_utils.get_conv_status(
                    skipped, indirect, ignore_for_defaults, nsx_lb_config['LbAppProfiles'],
                    u_ignore, na_np[index])
                na_list = [val for val in na_np[index] if val not in self.common_na_attr]
                conv_status["na_list"] = na_list
                name = attr_np[index]['name']
                profile_id = attr_np[index]['id']
                alb_mig_np_pr = attr_np[index]['alb_pr']
                if self.object_merge_check:
                    alb_mig_np_pr = [np_pr for np_pr in alb_config['NetworkProfile'] if
                                     np_pr.get('name') == self.merge_object_mapping['network_profile'].get(
                                         name)]
                    conv_utils.add_conv_status('applicationprofile', attr_np[index]['resource_type'],
                                               attr_np[index]['name'], conv_status,
                                               [{'network_profile': alb_mig_np_pr[0]}])
                    network_profile_list[profile_id] = attr_np[index]['name']
                else:
                    conv_utils.add_conv_status('applicationprofile', attr_np[index]['resource_type'],
                                               attr_np[index]['name'], conv_status,
                                               [{'network_profile': alb_mig_np_pr}])
                    network_profile_list[profile_id] = attr_np[index]['name']
                if len(conv_status['skipped']) > 0:
                    LOG.debug('[APPLICATION-PROFILE] Skipped Attribute {}:{}'.format(attr_np[index]['name'],
                                                                                     conv_status['skipped']))

    def convert_http(self, alb_pr, lb_pr):
        alb_pr['type'] = 'APPLICATION_PROFILE_TYPE_HTTP'
        alb_pr['http_profile'] = dict(
            xff_enabled=lb_pr.get('xForwardedFor', False),
            http_to_https=lb_pr.get('httpRedirectToHttps', False),
            keepalive_timeout=lb_pr.get('idle_timeout'),
            client_max_header_size=lb_pr.get('request_header_size'),
            keepalive_header=lb_pr.get('server_keep_alive'),
            max_response_headers_size=lb_pr.get("response_header_size"),
            detect_ntlm_app=lb_pr.get("ntlm")
        )
        if lb_pr.get('request_body_size', None):
            alb_pr['http_profile']['client_max_body_size'] = lb_pr.get('request_body_size', None)
        alb_pr["preserve_client_ip"] = False
        if lb_pr.get("http_redirect_to"):
            # TODO
            print("http_redirect_to")

    def convert_udp(self, alb_pr, lb_pr):
        alb_pr['profile'] = dict(
            type='PROTOCOL_TYPE_UDP_FAST_PATH',
            udp_fast_path_profile=self.fast_profile_path(lb_pr)
        )
        alb_pr["connection_mirror"] = lb_pr.get("flow_mirroring_enabled")

    def convert_tcp(self, alb_pr, lb_pr):
        alb_pr['profile'] = dict(
            type='PROTOCOL_TYPE_TCP_FAST_PATH',
            tcp_fast_path_profile=self.fast_profile_path(lb_pr)
        )
        alb_pr["connection_mirror"] = lb_pr.get("ha_flow_mirroring_enabled")

    def fast_profile_path(self, lb_pr):
        path = dict(
            session_idle_timeout=lb_pr.get('idle_timeout')
        )
        return path
