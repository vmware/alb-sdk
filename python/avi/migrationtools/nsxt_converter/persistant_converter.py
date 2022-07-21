# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import logging
import os

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import MigrationUtil

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
persistence_profile_list = {}

class PersistantProfileConfigConv(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

        """
        self.supported_attr = nsxt_profile_attributes['PersistenceProfile_Supported_Attributes']
        self.supported_attr_cookie = nsxt_profile_attributes['CookiePersistenceProfile_Supported_Attributes']
        self.supported_attr_source = nsxt_profile_attributes['SourcePersistenceProfile_Supported_Attributes']
        self.common_na_attr = nsxt_profile_attributes['Common_Na_List']
        self.na_attr_source = nsxt_profile_attributes["SourcePersistenceProfile_NA_Attributes"]
        self.indirect_attr_cookie = nsxt_profile_attributes["Persistence_indirect_cookie"]
        self.persistence_na_attr = nsxt_profile_attributes["Persistence_na_attr"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.app_per_count = 0

    def convert(self, alb_config, nsx_lb_config, prefix, tenant):
        alb_config["ApplicationPersistenceProfile"] = list()
        converted_objs = []
        skipped_list = []
        converted_alb_pp = []
        na_list = []
        indirect = []
        # Added variable to get total object count.
        progressbar_count = 0
        total_size = len(nsx_lb_config['LbPersistenceProfiles'])
        print("\nConverting Persistence Profile ...")
        LOG.info('[ApplicationPersistenceProfile] Converting Profiles...')
        for lb_pp in nsx_lb_config["LbPersistenceProfiles"]:
            try:
                LOG.info('[ApplicationPersistenceProfile] Migration started for  {}'.format(lb_pp['display_name']))
                progressbar_count += 1
                if lb_pp['resource_type'] == 'LBGenericPersistenceProfile':
                    conv_utils.add_status_row('persistence', lb_pp['resource_type'], lb_pp['display_name'],
                                              conv_const.STATUS_SKIPPED)
                    continue
                tenant_name, name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name
                pp_type, name = self.get_name_type(lb_pp)

                if prefix:
                    name = prefix + '-' + name
                if self.object_merge_check:
                    if name in self.merge_object_mapping['app_per_profile'].keys():
                        name = '%s-%s' % (name, lb_pp["id"])
                else:
                    pp_temp = list(filter(lambda pp: pp["name"] == name, alb_config['ApplicationPersistenceProfile']))
                    if pp_temp:
                        name = '%s-%s' % (name, lb_pp["id"])
                alb_pp = dict(
                    name=name,
                )
                persistence_profile_list[lb_pp['id']] = name
                skipped = [val for val in lb_pp.keys()
                           if val not in self.supported_attr]

                cookie_skipped_list, source_skipped_list = [], []
                if pp_type == "LBCookiePersistenceProfile":
                    na_attrs = [val for val in lb_pp.keys()
                                if val in self.common_na_attr or val in self.persistence_na_attr]
                    na_list.append(na_attrs)
                    skipped, cookie_skipped_list = self.convert_cookie(lb_pp, alb_pp, skipped, tenant)
                elif pp_type == "LBSourceIpPersistenceProfile":
                    na_attrs = [val for val in lb_pp.keys()
                                if val in self.common_na_attr or val in self.na_attr_source
                                or val in self.persistence_na_attr]
                    na_list.append(na_attrs)
                    skipped = self.convert_source(lb_pp, alb_pp, skipped, tenant)
                    indirect = self.indirect_attr_cookie

                if cookie_skipped_list:
                    skipped.append(cookie_skipped_list)
                if source_skipped_list:
                    skipped.append(source_skipped_list)

                skipped_list.append(skipped)
                ##
                if self.object_merge_check:
                    common_avi_util.update_skip_duplicates(alb_pp,
                                                           alb_config['ApplicationPersistenceProfile'],
                                                           'app_per_profile',
                                                           converted_objs, name, None, self.merge_object_mapping,
                                                           pp_type, prefix,
                                                           self.sys_dict['ApplicationPersistenceProfile'])
                    self.app_per_count += 1
                else:
                    alb_config['ApplicationPersistenceProfile'].append(alb_pp)

                val = dict(
                    id = lb_pp["id"],
                    name=name,
                    resource_type=lb_pp['resource_type'],
                    alb_pp=alb_pp

                )
                converted_alb_pp.append(val)
                ###

                msg = "ApplicationPersistenceProfile conversion started..."
                conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                              prefix='Progress', suffix='')

                LOG.info('[ApplicationPersistenceProfile] Migration completed for HM {}'.format(lb_pp['display_name']))

            except Exception as e:
                LOG.error(
                    "[ApplicationPersistenceProfile] Failed to convert ApplicationPersistenceProfile: {}".format(e))
                update_count('error')
                LOG.error("[ApplicationPersistenceProfile] Failed to convert ApplicationPersistenceProfile: %s" % lb_pp[
                    'display_name'],
                          exc_info=True)
                conv_utils.add_status_row('persistence', None, lb_pp['display_name'],
                                          conv_const.STATUS_ERROR)

        u_ignore = []
        ignore_for_defaults = {}
        for index, skipped in enumerate(skipped_list):
            conv_status = conv_utils.get_conv_status(
                skipped_list[index], indirect, ignore_for_defaults, nsx_lb_config['LbPersistenceProfiles'],
                u_ignore, na_list[index])
            app_per_na_list = [val for val in na_list[index] if val not in self.common_na_attr]
            conv_status["na_list"] = app_per_na_list
            name = converted_alb_pp[index]['name']
            pp_id = converted_alb_pp[index]['id']
            alb_mig_pp = converted_alb_pp[index]['alb_pp']
            resource_type = converted_alb_pp[index]['resource_type']
            if self.object_merge_check:
                alb_mig_pp = [pp for pp in alb_config['ApplicationPersistenceProfile'] if
                              pp.get('name') == self.merge_object_mapping['app_per_profile'].get(name)]
                conv_utils.add_conv_status('persistence', resource_type, name, conv_status,
                                           [{'app_per_profile': alb_mig_pp[0]}])
            else:
                conv_utils.add_conv_status('persistence', resource_type, name, conv_status,
                                           [{'app_per_profile': alb_mig_pp}])
            if len(conv_status['skipped']) > 0:
                LOG.debug('[ApplicationPersistenceProfile] Skipped Attribute {}:{}'.format(name,
                                                                                           conv_status['skipped']))

    def get_name_type(self, lb_pp):
        """

        """
        return lb_pp['resource_type'], lb_pp['display_name']

    def convert_cookie(self, lb_pp, alb_pp, skipped, tenant):
        http_cookie_persistence_profile = {}
        skipped_list = []
        final_skiped_attr = []
        if lb_pp.get("cookie_name"):
            http_cookie_persistence_profile["cookie_name"] = lb_pp.get("cookie_name")

        if lb_pp.get("cookie_time", None):
            http_cookie_persistence_profile["timeout"] = lb_pp.get("cookie_time")['cookie_max_idle']
            for index, i in enumerate(skipped):
                if i == "cookie_time":
                    del skipped[index]
            _skipped = [key for key in lb_pp.get("cookie_time").keys()
                        if key not in self.supported_attr_cookie]
            for keys in _skipped:
                final_skiped_attr.append(keys)

        alb_pp['http_cookie_persistence_profile'] = http_cookie_persistence_profile
        alb_pp['tenant_ref'] = conv_utils.get_object_ref(
            tenant, 'tenant')
        alb_pp['persistence_type'] = "PERSISTENCE_TYPE_HTTP_COOKIE"
        if lb_pp.get("cookie_fallback"):
            alb_pp["server_hm_down_recovery"] = "HM_DOWN_PICK_NEW_SERVER"
        else:
            alb_pp["server_hm_down_recovery"] = "HM_DOWN_CONTINUE_PERSISTENT_SERVER"
        if final_skiped_attr:
            skipped_list.append({lb_pp['display_name']: final_skiped_attr})
        skipped = [key for key in skipped if key not in self.supported_attr_cookie]
        if lb_pp.get("cookie_mode", None) == "INSERT":
            skipped.remove("cookie_mode")
        return skipped, skipped_list

    def convert_source(self, lb_pp, alb_pp, skipped, tenant):
        ip_persistence_profile = {}
        if lb_pp.get("timeout"):
            ip_persistence_profile["ip_persistent_timeout"] = lb_pp.get("timeout")

        alb_pp['ip_persistence_profile'] = ip_persistence_profile
        alb_pp['tenant_ref'] = conv_utils.get_object_ref(
            tenant, 'tenant')
        alb_pp['persistence_type'] = "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS"

        skipped = [key for key in skipped if key not in self.supported_attr_source]
        return skipped
