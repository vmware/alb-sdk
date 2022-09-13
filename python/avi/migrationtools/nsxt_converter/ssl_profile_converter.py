# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import logging
import os

from avi.migrationtools.avi_migration_utils import update_count, MigrationUtil
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as final
import avi.migrationtools.nsxt_converter.converter_constants as conv_const

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
ssl_profile_list = {}


class SslProfileConfigConv(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

        """
        self.supported_client_ssl_attributes = nsxt_profile_attributes['SSLProfile_Client_Supported_Attributes']
        self.supported_server_ssl_attributes = nsxt_profile_attributes['SSLProfile_Server_Supported_Attributes']
        self.common_na_attr = nsxt_profile_attributes['Common_Na_List']
        self.indirect_client_ssl_attr = nsxt_profile_attributes["SSLProfile_Client_Indirect_Attributes"]
        self.indirect_server_ssl_attr = nsxt_profile_attributes["SSLProfile_Server_Indirect_Attributes"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.ssl_profile_count = 0

    def convert(self, alb_config, nsx_lb_config, prefix, tenant):
        alb_config["SSLProfile"] = []
        tenant_name, name = conv_utils.get_tenant_ref(tenant)
        if not tenant:
            tenant = tenant_name
        if nsx_lb_config.get('LbClientSslProfiles'):
            converted_objs = []
            skipped_list = []
            converted_alb_ssl = []
            na_list = []
            progressbar_count = 0
            total_size = len(nsx_lb_config['LbClientSslProfiles'])
            print("\nConverting Client SSL Profile ...")
            LOG.info('[SSL-PROFILE] Converting Profiles...')

            for lb_ssl in nsx_lb_config["LbClientSslProfiles"]:
                try:
                    LOG.info('[SSL-PROFILE] Migration started for AP {}'.format(lb_ssl['display_name']))
                    skipped = [val for val in lb_ssl.keys()
                               if val not in self.supported_client_ssl_attributes]
                    na_attr = [val for val in lb_ssl.keys()
                               if val in self.common_na_attr]
                    na_list.append(na_attr)
                    progressbar_count += 1
                    name = lb_ssl.get('display_name')
                    if prefix:
                        name = name = '%s-%s' % (prefix, name)
                    if self.object_merge_check:
                        if name in self.merge_object_mapping['ssl_profile'].keys():
                            name = '%s-%s' % (name, lb_ssl["id"])
                    else:
                        c_ssl_temp = list(filter(lambda c_ssl: c_ssl["name"] == name, alb_config['SSLProfile']))
                        if c_ssl_temp:
                            name = '%s-%s' % (name, lb_ssl["id"])
                    alb_ssl = dict(
                        name=name,
                        tenant_ref=conv_utils.get_object_ref(tenant, 'tenant'),
                    )
                    ssl_profile_list[lb_ssl['id']] = name
                    if lb_ssl.get("session_cache_enabled"):
                        alb_ssl['enable_ssl_session_reuse'] = lb_ssl['session_cache_enabled']
                    if lb_ssl.get("session_cache_timeout"):
                        alb_ssl['ssl_session_timeout'] = lb_ssl['session_cache_timeout']

                    if lb_ssl.get("ciphers"):
                        converted_ciphers = self.convert_ciphers_to_valid_format(":".join(lb_ssl['ciphers']))
                        alb_ssl['accepted_ciphers'] = converted_ciphers

                    if lb_ssl.get("protocols"):
                        self.convert_protocols(lb_ssl['protocols'], alb_ssl)
                    if lb_ssl.get("prefer_server_ciphers"):
                        alb_ssl["prefer_client_cipher_ordering"] = not lb_ssl["prefer_server_ciphers"]

                    skipped_list.append(skipped)
                    ##
                    if self.object_merge_check:
                        common_avi_util.update_skip_duplicates(alb_ssl,
                                                               alb_config['SSLProfile'],
                                                               'ssl_profile',
                                                               converted_objs, name, None,
                                                               self.merge_object_mapping,
                                                               lb_ssl['resource_type'], prefix,
                                                               self.sys_dict['SSLProfile'])
                        self.ssl_profile_count += 1
                    else:
                        alb_config['SSLProfile'].append(alb_ssl)

                    val = dict(
                        id=lb_ssl["id"],
                        name=name,
                        resource_type=lb_ssl['resource_type'],
                        alb_ssl=alb_ssl

                    )
                    converted_alb_ssl.append(val)

                    msg = "SSLProfile conversion started..."
                    conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                                  prefix='Progress', suffix='')

                    LOG.info('[SSL-PROFILE] Migration completed for HM {}'.format(lb_ssl['display_name']))
                except:
                    update_count('error')
                    LOG.error("[SSL-PROFILE] Failed to convert Client SSLProfile: %s" % lb_ssl['display_name'],
                              exc_info=True)
                    conv_utils.add_status_row('sslprofile', None, lb_ssl['display_name'],
                                              conv_const.STATUS_ERROR)

            indirect = self.indirect_client_ssl_attr
            u_ignore = []
            ignore_for_defaults = {}
            for index, skipped in enumerate(skipped_list):
                conv_status = conv_utils.get_conv_status(
                    skipped_list[index], indirect, ignore_for_defaults, nsx_lb_config['LbClientSslProfiles'],
                    u_ignore, na_list[index])
                ssl_na = [val for val in na_list[index] if val not in self.common_na_attr]
                conv_status["na_list"] = ssl_na
                name = converted_alb_ssl[index]['name']
                ssl_id = converted_alb_ssl[index]['id']
                alb_mig_ssl = converted_alb_ssl[index]['alb_ssl']
                resource_type = converted_alb_ssl[index]['resource_type']
                if self.object_merge_check:
                    alb_mig_ssl = [pp for pp in alb_config['SSLProfile'] if
                                   pp.get('name') == self.merge_object_mapping['ssl_profile'].get(name)]
                    conv_utils.add_conv_status('sslprofile', resource_type, name, conv_status,
                                               [{'ssl_profile': alb_mig_ssl[0]}])
                else:
                    conv_utils.add_conv_status('sslprofile', resource_type, name, conv_status,
                                               [{'ssl_profile': alb_mig_ssl}])
                if len(conv_status['skipped']) > 0:
                    LOG.debug(
                        '[SSL-PROFILE] Skipped Attribute {}:{}'.format(name,
                                                                       conv_status['skipped']))

        if nsx_lb_config.get('LbServerSslProfiles'):
            converted_objs = []
            skipped_list = []
            converted_alb_ssl = []
            na_list = []
            progressbar_count = 0
            total_size = len(nsx_lb_config['LbServerSslProfiles'])
            print("\nConverting Server SSL Profile ...")
            LOG.info('[SSL-PROFILE] Converting Client SSL Profiles...')

            for lb_ssl in nsx_lb_config["LbServerSslProfiles"]:
                try:
                    LOG.info('[SSL-PROFILE] Migration started for AP {}'.format(lb_ssl['display_name']))
                    skipped = [val for val in lb_ssl.keys()
                               if val not in self.supported_client_ssl_attributes]
                    na_attr = [val for val in lb_ssl.keys()
                               if val in self.common_na_attr]
                    na_list.append(na_attr)
                    progressbar_count += 1
                    name = lb_ssl.get('display_name')
                    if prefix:
                        name = '%s-%s' % (prefix, name)
                    if self.object_merge_check:
                        if name in self.merge_object_mapping['ssl_profile'].keys():
                            name = '%s-%s' % (name, lb_ssl["id"])
                    else:
                        s_ssl_temp = list(filter(lambda ssl: ssl["name"] == name, alb_config['SSLProfile']))
                        if s_ssl_temp:
                            name = '%s-%s' % (name, lb_ssl["id"])
                    alb_ssl = dict(
                        name=name,
                        tenant_ref=conv_utils.get_object_ref(tenant, 'tenant'),
                    )
                    ssl_profile_list[lb_ssl['id']] = name
                    if lb_ssl.get("ciphers"):
                        converted_ciphers = self.convert_ciphers_to_valid_format(":".join(lb_ssl['ciphers']))
                        alb_ssl['accepted_ciphers'] = converted_ciphers

                    if lb_ssl.get("protocols"):
                        self.convert_protocols(lb_ssl['protocols'], alb_ssl)

                    skipped_list.append(skipped)
                    ##
                    if self.object_merge_check:
                        common_avi_util.update_skip_duplicates(alb_ssl,
                                                               alb_config['SSLProfile'],
                                                               'ssl_profile',
                                                               converted_objs, name, None,
                                                               self.merge_object_mapping,
                                                               lb_ssl['resource_type'], prefix,
                                                               self.sys_dict['SSLProfile'])
                        self.ssl_profile_count += 1
                    else:
                        alb_config['SSLProfile'].append(alb_ssl)

                    val = dict(
                        id=lb_ssl["id"],
                        name=name,
                        resource_type=lb_ssl['resource_type'],
                        alb_ssl=alb_ssl

                    )
                    converted_alb_ssl.append(val)

                    msg = "SSLProfile conversion started..."
                    conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                                  prefix='Progress', suffix='')

                    LOG.info('[SSL-PROFILE] Migration completed for HM {}'.format(lb_ssl['display_name']))
                except:
                    update_count('error')
                    LOG.error("[SSL-PROFILE] Failed to convert Server Side SSLProfile: %s" % lb_ssl['display_name'],
                              exc_info=True)
                    conv_utils.add_status_row('sslprofile', None, lb_ssl['display_name'],
                                              conv_const.STATUS_ERROR)

            indirect = self.indirect_server_ssl_attr
            u_ignore = []
            ignore_for_defaults = {}
            for index, skipped in enumerate(skipped_list):
                conv_status = conv_utils.get_conv_status(
                    skipped_list[index], indirect, ignore_for_defaults, nsx_lb_config['LbServerSslProfiles'],
                    u_ignore, na_list[index])
                ssl_na = [val for val in na_list[index] if val not in self.common_na_attr]
                conv_status["na_list"] = ssl_na
                name = converted_alb_ssl[index]['name']
                ssl_id = converted_alb_ssl[index]['id']
                alb_mig_ssl = converted_alb_ssl[index]['alb_ssl']
                resource_type = converted_alb_ssl[index]['resource_type']
                if self.object_merge_check:
                    alb_mig_ssl = [pp for pp in alb_config['SSLProfile'] if
                                   pp.get('name') == self.merge_object_mapping['ssl_profile'].get(name)]
                    conv_utils.add_conv_status('sslprofile', resource_type, name, conv_status,
                                               [{'ssl_profile': alb_mig_ssl[0]}])
                else:
                    conv_utils.add_conv_status('sslprofile', resource_type, name, conv_status,
                                               [{'ssl_profile': alb_mig_ssl}])
                if len(conv_status['skipped']) > 0:
                    LOG.debug(
                        '[SSL-PROFILE] Skipped Attribute {}:{}'.format(name,
                                                                       conv_status['skipped']))

    def convert_protocols(self, protocols, alb_ssl):
        accepted_version = dict(
            SSL_V2="",
            SSL_V3="SSL_VERSION_SSLV3",
            TLS_V1="SSL_VERSION_TLS1",
            TLS_V1_1="SSL_VERSION_TLS1_1",
            TLS_V1_2="SSL_VERSION_TLS1_2"

        )
        alb_ssl['accepted_versions'] = []

        for acc_ver in protocols:
            acc_version = dict(
                type=accepted_version[acc_ver]
            )
            alb_ssl['accepted_versions'].append(acc_version)

    def convert_ciphers_to_valid_format(self, cipher_str):
        cipher_str = cipher_str.replace('TLS_', '')
        cipher_str = cipher_str.replace('_', '-')
        cipher_str = cipher_str.replace('WITH-AES-128', 'AES128')
        cipher_str = cipher_str.replace('WITH-AES-256', 'AES256')
        return cipher_str
