# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import logging
import os

import avi
from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import MigrationUtil

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()
persistence_profile_list = {}
persistence_ds_list = {}


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
        self.vs_ds_count = 0

    def convert(self, alb_config, nsx_lb_config, prefix, tenant):
        alb_config["ApplicationPersistenceProfile"] = list()
        alb_config['VSDataScriptSet'] = []
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
                skipped = [val for val in lb_pp.keys()
                           if val not in self.supported_attr]
                if lb_pp.get('purge'):
                    if not lb_pp['purge'] == "FULL":
                        skipped.remove('purge')
                is_ds_created = False
                cookie_skipped_list, source_skipped_list = [], []
                if pp_type == "LBCookiePersistenceProfile":
                    na_attrs = [val for val in lb_pp.keys()
                                if val in self.common_na_attr or val in self.persistence_na_attr]
                    na_list.append(na_attrs)
                    skipped, cookie_skipped_list = self.convert_cookie(lb_pp, alb_pp, skipped, tenant)
                    vs_datascript, is_ds_created = self.create_datascript(lb_pp, alb_config, alb_pp,tenant)

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

                if not is_ds_created:
                    persistence_profile_list[lb_pp['id']] = name
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
                        id=lb_pp["id"],
                        name=name,
                        resource_type=lb_pp['resource_type'],
                        alb_pp=alb_pp

                    )
                    converted_alb_pp.append(val)
                else:
                    persistence_ds_list[lb_pp['id']] = name
                    if self.object_merge_check:
                        common_avi_util.update_skip_duplicates(vs_datascript,
                                                               alb_config['VSDataScriptSet'],
                                                               'vs_ds',
                                                               converted_objs, name, None, self.merge_object_mapping,
                                                               pp_type, prefix,
                                                               self.sys_dict['VSDataScriptSet'])
                        self.vs_ds_count += 1
                    else:
                        alb_config['VSDataScriptSet'].append(vs_datascript)
                    val = dict(
                        id=lb_pp["id"],
                        name=name,
                        resource_type=lb_pp['resource_type'],
                        alb_pp_ds=vs_datascript

                    )
                    converted_alb_pp.append(val)

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
            is_ds = False
            if 'alb_pp' in converted_alb_pp[index].keys():
                alb_mig_pp = converted_alb_pp[index]['alb_pp']
            else:
                alb_mig_pp = converted_alb_pp[index]['alb_pp_ds']
                is_ds = True
            resource_type = converted_alb_pp[index]['resource_type']
            if self.object_merge_check:
                if is_ds:
                    alb_mig_pp = [pp for pp in alb_config['VSDataScriptSet'] if
                                  pp.get('name') == self.merge_object_mapping['vs_ds'].get(name)]
                    conv_utils.add_conv_status('vsdatascript', resource_type, name, conv_status,
                                               [{'vs_ds': alb_mig_pp[0]}])
                else:
                    alb_mig_pp = [pp for pp in alb_config['ApplicationPersistenceProfile'] if
                                  pp.get('name') == self.merge_object_mapping['app_per_profile'].get(name)]
                    conv_utils.add_conv_status('persistence', resource_type, name, conv_status,
                                               [{'app_per_profile': alb_mig_pp[0]}])
            else:
                if is_ds:
                    conv_utils.add_conv_status('vsdatascript', resource_type, name, conv_status,
                                               [{'vs_ds': alb_mig_pp}])
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
        if lb_pp.get('cookie_httponly'):
            http_cookie_persistence_profile['http_only'] = lb_pp.get('cookie_httponly')
        if lb_pp.get("cookie_time", None):
            cookie_max_idle = lb_pp.get("cookie_time").get('cookie_max_idle')
            if cookie_max_idle:
                http_cookie_persistence_profile["timeout"] = cookie_max_idle
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

    def create_datascript(self, lb_pp, avi_config, alb_pp,tenant):

        vs_ds = dict(
            name=alb_pp.get('name'),
            datascript=list(),
            tenant_ref=conv_utils.get_object_ref(tenant, 'tenant')

        )
        is_ds_created = False
        datascript = dict(
            evt='VS_DATASCRIPT_EVT_HTTP_RESP',
        )
        if lb_pp.get("cookie_mode") == 'INSERT':
            if lb_pp.get('cookie_path', None) or lb_pp.get('cookie_domain', None):
                cookie_max_idle = 0
                cookie_max_life = 0
                if lb_pp.get('cookie_time'):
                    cookie_max_idle = lb_pp['cookie_time'].get('cookie_max_idle', 0)
                    cookie_max_life = lb_pp['cookie_time'].get('cookie_max_life', 0)
                script = "cookie_table={name=\"%s\",path=\"%s\",domain=\"%s\"," \
                         "expires=\"%s\",maxage=\"%s\",httponly=\"%s\"}" \
                         " avi.http.add_cookie(cookie_table)" \
                         % (lb_pp.get('cookie_name'), lb_pp.get('cookie_path', '/'), lb_pp.get('cookie_domain'),
                            cookie_max_idle, cookie_max_life, lb_pp.get('cookie_httponly', False))
                is_ds_created = True

        elif lb_pp.get("cookie_mode") == 'REWRITE':
            script = "ip,port = avi.pool.get_server_info() cookie_name = \"%s\" " \
                     "if avi.http.cookie_exists(cookie_name) then " \
                     "updated_cookie_value = ip .. \":\" ..port "\
                     "avi.http.update_cookie(cookie_name,updated_cookie_value )\nend " % lb_pp.get('cookie_name')
            is_ds_created = True

        else:
            script = "ip,port = avi.pool.get_server_info() cookie_name = \"%s\" " \
                     "if avi.http.cookie_exists(cookie_name) then " \
                     "updated_cookie_value = ip .. \":\" .. port .. avi.http.get_cookie(cookie_name)" \
                     "avi.http.update_cookie(cookie_name,updated_cookie_value )\nend" % lb_pp.get('cookie_name')
            is_ds_created = True
        if is_ds_created:
            datascript['script'] = script
            vs_ds['datascript'].append(datascript)

        return vs_ds, is_ds_created
