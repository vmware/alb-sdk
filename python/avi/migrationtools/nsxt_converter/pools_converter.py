# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import copy
import logging
import random
import time
from random import randint

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.nsxt_converter.monitor_converter import monitor_list
from avi.migrationtools.nsxt_converter.nsxt_util import get_object_segments, get_lb_service_name

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
skipped_pools_list = []
vs_pool_segment_list = dict()
vs_sorry_pool_segment_list = dict()
pool_name_dict = {}
vs_select_pool_action_list = dict()

class PoolConfigConv(object):
    def __init__(self, nsxt_pool_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """
        :param nsxt_pool_attributes: Supported attributes for pool migration
        """
        self.supported_attr = nsxt_pool_attributes['Pool_supported_attr']
        self.server_attributes = nsxt_pool_attributes[
            'Pool_supported_attr_convert_servers_config']
        self.member_group_attr = nsxt_pool_attributes[
            'Pool_supported_attr_convert_member_group']
        self.common_na_attr = nsxt_pool_attributes['Common_Na_List']
        self.pool_na_attr = nsxt_pool_attributes['Pool_na_list']
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict

    def convert(self, alb_config, nsx_lb_config, nsxt_util, prefix, tenant):
        '''
        LBPool to Avi Config pool converter
        '''
        alb_config['Pool'] = list()
        alb_config['PoolGroup'] = list()
        progressbar_count = 0
        pool_list = []
        rule_select_pool_action_list = []
        total_size = len(nsx_lb_config['LbPools'])
        print("\nConverting Pools ...")
        LOG.info('[POOL] Converting Pools...')
        for lb_pl in nsx_lb_config['LbPools']:
            try:
                LOG.info('[POOL] Migration started for Pool {}'.format(lb_pl['display_name']))
                msg = "Pools conversion started..."
                progressbar_count += 1
                tenant_name, name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name

                lb_type, name = self.get_name_type(lb_pl)
                alb_pl = {
                    'lb_algorithm': lb_type['lb_algorithm'],
                }
                if lb_type.get('lb_algorithm_hash'):
                    alb_pl['lb_algorithm_hash'] = lb_type['lb_algorithm_hash']

                vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                           (vs.get("pool_path") and vs.get("pool_path").split("/")[-1] == lb_pl.get("id"))]

                vs_list_for_sorry_pool = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"]
                                          if vs.get("sorry_pool_path")
                                          and vs.get("sorry_pool_path").split("/")[-1] == lb_pl.get("id")]

                vs_list_for_rules_select_action_pool = [vs['id'] for vs in nsx_lb_config['LbVirtualServers']
                                                        if vs.get('rules')
                                                        for vs_rules in vs['rules']
                                                        for action in vs_rules.get('actions')
                                                        if action.get('pool_id')
                                                        and action.get('pool_id').split("/")[-1] == lb_pl.get("id")]

                pool_name_without_prefix = name
                if prefix:
                    name = '%s-%s' % (prefix, name)
                pool_temp = list(filter(lambda pl: pl["name"] == name, alb_config['Pool']))
                if not pool_temp:
                    pool_temp = list(filter(lambda pl: pl["name"] == name, alb_config['PoolGroup']))
                if pool_temp:
                    name = '%s-%s' % (name, lb_pl["id"])
                is_sry_pool_present = False
                pool_skip = True
                pool_count = 0
                is_pool_orphan=True
                pool_members_list = list()
                if lb_pl.get('member_group'):
                    ns_grp_name, ip_addr_grp = nsxt_util.get_nsx_group_details(lb_pl['member_group']['group_path'])
                    if ip_addr_grp:
                        for ip in ip_addr_grp:
                            pool_members_list.append(dict(
                                ip_address=ip))
                    else:
                        skipped_pools_list.append(name)
                        skip_msg = 'Member group does not contain ip addresses'
                        conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                                  conv_const.STATUS_SKIPPED, skip_msg)
                        LOG.warning("POOL {} not migrated. Reason: {}".format(name,
                                                                              skip_msg))
                        conv_utils.print_progress_bar(progressbar_count, total_size, msg, prefix='Progress', suffix='')
                        continue

                elif lb_pl.get('members'):
                    pool_members_list = lb_pl['members']
                if pool_members_list:
                    lb_list = {}
                    if vs_list:
                        pool_seg_list,is_member_ip_in_range,pool_skip = self.check_pool_member_ip_ranges\
                            (vs_list, pool_count, lb_list, pool_members_list, pool_skip, name, vs_pool_segment_list)
                        is_pool_orphan=False

                    if vs_list_for_sorry_pool:
                        pool_seg_list,is_member_ip_in_range ,pool_skip= self.check_pool_member_ip_ranges \
                            (vs_list_for_sorry_pool, pool_count, lb_list, pool_members_list, pool_skip, name,
                             vs_sorry_pool_segment_list)
                        if is_member_ip_in_range:
                            is_sry_pool_present = True
                        is_pool_orphan=False

                    if vs_list_for_rules_select_action_pool:
                        pool_seg_list,is_member_ip_in_range, pool_skip = self.check_pool_member_ip_ranges \
                            (vs_list_for_rules_select_action_pool, pool_count, lb_list, pool_members_list, pool_skip, name,
                             vs_select_pool_action_list)
                        is_pool_orphan=False


                    if is_pool_orphan:
                        skipped_pools_list.append(name)
                        skip_msg = 'Pool is orphan , it is not associated with any vs'
                        conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                                  conv_const.STATUS_SKIPPED, skip_msg)
                        LOG.warning("POOL {} not migrated. Reason: {}".format(name,
                                                                              skip_msg))
                        conv_utils.print_progress_bar(progressbar_count, total_size, msg, prefix='Progress', suffix='')
                        continue

                    if pool_skip:
                        skipped_pools_list.append(name)
                        skip_msg = 'Member ip not falling in segment range'
                        conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                                  conv_const.STATUS_SKIPPED, skip_msg)
                        LOG.warning("POOL {} not migrated. Reason: {}".format(name,
                                                                              skip_msg))
                        conv_utils.print_progress_bar(progressbar_count, total_size, msg, prefix='Progress', suffix='')
                        continue
                else:
                    skipped_pools_list.append(name)
                    skip_msg = 'Pool does not contains members'
                    conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                              conv_const.STATUS_SKIPPED, skip_msg)
                    LOG.warning("POOL {} not migrated. Reason: {}".format(name,
                                                                          skip_msg))
                    conv_utils.print_progress_bar(progressbar_count, total_size, msg, prefix='Progress', suffix='')
                    continue

                na_list = [val for val in lb_pl.keys()
                           if val in self.common_na_attr or val in self.pool_na_attr]
                if lb_pl['snat_translation'].get('type') != "LBSnatDisabled":
                    if lb_pl.get('member_group'):
                        servers, member_skipped_config, skipped_servers, limits = \
                            self.convert_member_group_to_pool_servers(ip_addr_grp, lb_pl['member_group'])
                        if lb_pl['member_group'].get('customized_members'):
                            customized_members = lb_pl['member_group'].get('customized_members')
                            self.update_pool_member_group_with_customized_member(servers, customized_members)
                    else:
                        servers, member_skipped_config, skipped_servers, limits = \
                            self.convert_servers_config(lb_pl.get("members", []))
                else:
                    servers, member_skipped_config, skipped_servers, limits = \
                        self.convert_servers_config(lb_pl.get("members", []))
                alb_pl["name"] = name
                alb_pl["servers"] = servers
                pool_name_dict[lb_pl['id']] = pool_name_without_prefix
                if any(server.get("port") == None for server in servers):
                    alb_pl.update({"use_service_port": "true"})
                alb_pl['tenant_ref'] = conv_utils.get_object_ref(
                    tenant, 'tenant')

                if lb_pl.get("tcp_multiplexing_enabled"):
                    # TO-DO - HANDLE In APPLICATION PROFILE
                    # Need to set in Application profile
                    LOG.info('[POOL] tcp_multiplexing_enabled Needs to Handle in Application Profile.')
                    pass

                if lb_pl.get("tcp_multiplexing_number"):
                    alb_pl['conn_pool_properties'] = {
                        'upstream_connpool_server_max_cache': lb_pl.get(
                            'tcp_multiplexing_number')
                    }
                if lb_pl.get('min_active_members'):
                    alb_pl['min_servers_up'] = lb_pl.get('min_active_members')
                if limits.get('connection_limit', 0) > 0:
                    alb_pl['max_concurrent_connections_per_server'] = \
                        limits['connection_limit']

                skipped_list_mg = []
                if lb_pl.get('member_group') and lb_pl['snat_translation'].get('type') == "LBSnatDisabled":
                    skipped_mg = [val for val in
                                  lb_pl.get('member_group').keys()
                                  if val not in self.member_group_attr]
                    skipped_list_mg.append({"skipped_mg": skipped_mg})
                    if lb_pl['member_group'].get('group_path'):
                        alb_pl['nsx_securitygroup'] = [
                            lb_pl.get('member_group').get('group_path')
                        ]
                    if lb_pl['member_group'].get("port", None):
                        alb_pl['default_server_port'] = lb_pl[
                            'member_group'].get("port")
                if lb_pl.get("snat_translation"):
                    # TO-DO - HANDLE In APPLICATION PROFILE
                    # Need to set in Application profile
                    LOG.info('[POOL] snat_translation Needs to Handle in Application Profile.')
                    pass

                active_monitor_paths = lb_pl.get("active_monitor_paths", None)
                if active_monitor_paths:
                    monitor_refs = []
                    for lb_hm_path in active_monitor_paths:
                        ref = lb_hm_path.split("/lb-monitor-profiles/")[1]
                        hm_name = None
                        if ref in monitor_list.keys():
                            hm_name = monitor_list[ref]
                        if hm_name in [monitor_obj.get('name') for monitor_obj in alb_config['HealthMonitor']]:
                            hm_name = hm_name
                        elif self.object_merge_check:
                            if hm_name in self.merge_object_mapping['health_monitor'].keys():
                                hm_name = self.merge_object_mapping['health_monitor'].get(hm_name)
                        else:
                            continue
                        monitor_refs.append(
                            "/api/healthmonitor/?tenant=%s&name=%s" % (tenant, hm_name))

                    alb_pl["health_monitor_refs"] = list(set(monitor_refs))
                skipped = [val for val in lb_pl.keys()
                           if val not in self.supported_attr]
                ##
                if is_sry_pool_present:
                    is_pg, pg_dict = self.check_for_pool_group(servers, sorry_pool=True)
                else:
                    is_pg, pg_dict = self.check_for_pool_group(servers)
                converted_objs = dict()
                if is_pg:
                    converted_objs = self.convert_for_pg(pg_dict,
                                                         alb_pl, name,
                                                         tenant, alb_config)
                else:
                    converted_objs['pools'] = [alb_pl]
                pool_list += converted_objs['pools']
                if 'pg_obj' in converted_objs:
                    alb_config['PoolGroup'].extend(converted_objs['pg_obj'])

                ##
                indirect = []
                u_ignore = []
                ignore_for_defaults = {}
                if skipped_servers:
                    skipped.append({"server": skipped_servers})
                if member_skipped_config:
                    skipped.append(member_skipped_config)
                if skipped_list_mg:
                    skipped.append(skipped_list_mg)

                conv_status = conv_utils.get_conv_status(
                    skipped, indirect, ignore_for_defaults,
                    nsx_lb_config['LbPools'], u_ignore, na_list)
                na_list = [val for val in na_list if val not in self.common_na_attr]
                conv_status["na_list"] = na_list
                conv_utils.add_conv_status('pool', None, alb_pl['name'], conv_status, converted_objs)
                #                conv_utils.add_conv_status(
                #                    'pool', None, alb_pl['name'], conv_status,
                #                   {'pools': [alb_pl]})

                conv_utils.print_progress_bar(
                    progressbar_count, total_size, msg, prefix='Progress',
                    suffix='')

                #                alb_config['Pool'].append(alb_pl)
                # time.sleep(0.1)

                if len(conv_status['skipped']) > 0:
                    LOG.debug('[POOL] Skipped Attribute {}:{}'.format(lb_pl['display_name'], conv_status['skipped']))
                LOG.info('[POOL] Migration completed for Pool {}'.format(lb_pl['display_name']))
            except:
                update_count('error')
                LOG.error("[POOL] Failed to convert pool: %s" % lb_pl['display_name'],
                          exc_info=True)
                conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                          conv_const.STATUS_ERROR)
        alb_config['Pool'] = pool_list

    def get_name_type(self, lb_pl):
        lb_type = {}
        if lb_pl['algorithm'] in ['ROUND_ROBIN', 'WEIGHTED_ROUND_ROBIN']:
            lb_type['lb_algorithm'] = 'LB_ALGORITHM_ROUND_ROBIN'
        elif lb_pl['algorithm'] in ['LEAST_CONNECTION',
                                    'WEIGHTED_LEAST_CONNECTION']:
            lb_type['lb_algorithm'] = 'LB_ALGORITHM_LEAST_CONNECTIONS'
        elif lb_pl['algorithm'] == 'IP_HASH':
            lb_type['lb_algorithm'] = 'LB_ALGORITHM_CONSISTENT_HASH'
            lb_type['lb_algorithm_hash'] = 'LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS'
        return lb_type, lb_pl['display_name']

    def convert_servers_config(self, servers_config):
        server_list = []
        skipped_list = []
        server_skipped = []
        connection_limit = []
        pg_obj = []
        for member in servers_config:
            server_obj = {
                'ip': {
                    'addr': member['ip_address'],
                    'type': 'V4'
                },
                'description': member.get("display_name"),
            }
            if member["backup_member"]:
                server_obj['backup_member'] = member["backup_member"]
            if member.get("port", ""):
                server_obj['port'] = int(member.get("port"))
            else:
                server_skipped.append(member.get("display_name"))

            if member.get("weight"):
                server_obj['ratio'] = member.get('weight')

            server_obj["enabled"] = False
            if member.get("admin_state") == "ENABLED":
                server_obj['enabled'] = True
            if member.get("max_concurrent_connections"):
                c_lim = int(member.get("max_concurrent_connections", '0'))
                if c_lim > 0:
                    connection_limit.append(c_lim)
            server_list.append(server_obj)

            skipped = [key for key in member.keys()
                       if key not in self.server_attributes]
            if skipped:
                skipped_list.append({member['display_name']: skipped})
        limits = dict()
        if connection_limit:
            limits['connection_limit'] = min(connection_limit)
        return server_list, skipped_list, server_skipped, limits

    #
    def check_for_pool_group(self, servers, sorry_pool=False):
        """
        Check if the priority group for the server exist
        :param servers: List of servers to check server priority
        :return: if priority exist returns true and priority wise
        dict of servers
        """
        #

        pool_bmd = []
        pool_bme = []
        pg_dict = {}
        is_pool_group = False
        for member in servers:
            if member.get("backup_member"):
                pool_bme.append(member)
            else:
                pool_bmd.append(member)
        if pool_bme and pool_bmd:
            is_pool_group = True
            if not sorry_pool:
                bmd_priority = "3"
                bme_priority = "2"
            else:
                bmd_priority = "1"
                bme_priority = "0"
            priority_list = pg_dict.get(bmd_priority, [])
            priority_list = pool_bmd
            pg_dict[bmd_priority] = priority_list
            pg_dict[bmd_priority] = pg_dict[bmd_priority][0]
            priority_list = pg_dict.get(bme_priority, [])
            priority_list = pool_bme
            pg_dict[bme_priority] = priority_list
            pg_dict[bme_priority] = pg_dict[bme_priority][0]

        elif pool_bme:
            is_pool_group = True
            if not sorry_pool:
                priority = "2"
            else:
                priority = "0"
            priority_list = pg_dict.get(priority, [])
            priority_list = pool_bme
            pg_dict[priority] = priority_list
            pg_dict[priority] = pg_dict[priority][0]

        else:
            if sorry_pool:
                is_pool_group = True
                priority = "1"
                priority_list = pg_dict.get(priority, [])
                priority_list = pool_bmd
                pg_dict[priority] = priority_list
                pg_dict[priority] = pg_dict[priority][0]

        return is_pool_group, pg_dict

    def convert_for_pg(self, pg_dict, pool_obj, name, tenant, avi_config,
                       ):
        """
        Creates a pool group object
        :param pg_dict: priority wise sorted dict of pools
        :param pool_obj: Converted f5 pool object
        :param name: name of the pool
        :param tenant: tenant name for tenant reference
        :param avi_config: Avi config to add temporary labels
        :return:
        """
        pg_members = []
        pools = []
        for priority in pg_dict:
            priority_pool = copy.deepcopy(pool_obj)
            priority_pool['servers'] = [pg_dict[priority]]
            priority_pool_ref = '%s-%s' % (name, priority)
            # Added prefix for objects
            priority_pool['name'] = priority_pool_ref
            pools.append(priority_pool)
            if priority_pool_ref:
                member = {
                    'pool_ref': conv_utils.get_object_ref(priority_pool_ref, 'pool', tenant=tenant),
                    'priority_label': priority
                }
                pg_members.append(member)

        pg_obj = {
            'name': name,
            'members': pg_members,
        }

        pg_obj['tenant_ref'] = conv_utils.get_object_ref(tenant, 'tenant')
        converted_objs = {
            'pools': pools,
            'pg_obj': [pg_obj]
        }
        return converted_objs

    #
    def convert_member_group_to_pool_servers(self, ip_group_list, member_group_config):
        server_list = []
        skipped_list = []
        server_skipped = []
        connection_limit = []
        pg_obj = []
        member_count = 1
        for ip in ip_group_list:
            type = "V6"
            if "." in ip:
                type = "V4"
            server_obj = {
                'ip': {
                    'addr': ip,
                    'type': type
                },
                'description': "member-%s" % member_count,
            }
            if member_group_config.get("port", ""):
                server_obj['port'] = int(member_group_config.get("port"))
            else:
                server_skipped.append(server_obj.get("description"))

            server_obj["enabled"] = True
            server_list.append(server_obj)

            skipped = [key for key in member_group_config.keys()
                       if key not in self.member_group_attr]
            if skipped:
                skipped_list.append({server_obj['description']: skipped})
        limit = dict()
        return server_list, skipped_list, server_skipped, limit

    def update_pool_member_group_with_customized_member(self, pool_servers, customized_members):
        for c_member in customized_members:
            server_member = [server for server in pool_servers if server['ip']['addr'] == c_member['ip_address']]
            if server_member:
                server_member = server_member[0]
                if c_member.get('display_name'):
                    server_member['description'] = c_member.get('display_name')
                if c_member.get('admin_state') == "ENABLED":
                    server_member['enabled'] = True
                if c_member.get('admin_state') == "DISABLED":
                    server_member['enabled'] = False
                if c_member.get('weight'):
                    server_member['ratio'] = c_member.get('weight')

    def check_pool_member_ip_ranges(self, vs_list, pool_count, lb_list, pool_members_list, pool_skip, pool_name,
                                    pool_segment_list):
        is_member_ip_in_range=False
        for member in pool_members_list:
            for vs_id in vs_list:
                LOG.debug("Checking pool member ip  %s falling in range or not  , pool %s attached with vip %s " % (member.get("ip_address"),
                                                                                                                pool_name,vs_id))
                if vs_id in pool_segment_list.keys():
                    pool_skip = False
                    is_member_ip_in_range=True
                    continue
                lb = get_lb_service_name(vs_id)
                if not lb:
                    LOG.debug("lb not configured for vs %s" % vs_id)
                    continue
                pool_segment = get_object_segments(vs_id,
                                                   member.get("ip_address"))

                if pool_segment:
                    pool_skip = False
                    is_member_ip_in_range = True
                    if lb in lb_list.keys():
                        pool_segment_list[vs_id] = lb_list.get(lb)
                        continue

                    if pool_count == 0:
                        pool_segment_list[vs_id] = {
                            "pool_name": pool_name,
                            "pool_segment": pool_segment
                        }
                        lb_list[lb] = pool_segment_list.get(vs_id)
                    else:
                        new_pool_name = '%s-%s' % (pool_name, pool_segment[0].get("subnets").get("network_range"))
                        new_pool_name = new_pool_name.replace('/', '-')
                        vs_pool_segment_list[vs_id] = {
                            "pool_name": new_pool_name,
                            "pool_segment": pool_segment
                        }
                        lb_list[lb] = pool_segment_list.get(vs_id)
                    pool_count += 1

        return pool_segment_list, is_member_ip_in_range,pool_skip


