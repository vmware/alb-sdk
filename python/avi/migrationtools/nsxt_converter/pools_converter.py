import logging
import random
import time
from random import randint

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.nsxt_converter.nsxt_util import get_object_segments, get_lb_service_name

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
skipped_pools_list = []
vs_pool_segment_list = dict()
vs_sorry_pool_segment_list = dict()


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

    def convert(self, alb_config, nsx_lb_config, prefix, tenant):
        '''
        LBPool to Avi Config pool converter
        '''
        alb_config['Pool'] = list()
        progressbar_count = 0
        total_size = len(nsx_lb_config['LbPools'])
        print("\nConverting Pools ...")
        LOG.info('[POOL] Converting Pools...')
        for lb_pl in nsx_lb_config['LbPools']:
            try:
                LOG.info('[POOL] Migration started for Pool {}'.format(lb_pl['display_name']))
                progressbar_count += 1
                tenant_name, name = conv_utils.get_tenant_ref(tenant)
                if not tenant:
                    tenant = tenant_name

                lb_type, name = self.get_name_type(lb_pl)
                alb_pl = {
                    'lb_algorithm': lb_type,
                }
                vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                           (vs.get("pool_path") and vs.get("pool_path").split("/")[-1] == lb_pl.get("id"))]
                vs_list_for_sorry_pool = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                            (vs.get("sorry_pool_path") and vs.get("sorry_pool_path").split("/")[-1] == lb_pl.get("id"))]
                if prefix:
                    name = prefix+"-"+name
                pool_temp = list(filter(lambda pl: pl["name"] == name, alb_config['Pool']))
                if pool_temp:
                    name = name + "-" + lb_pl["id"]
                pool_skip = True
                pool_count = 0
                if lb_pl.get("members") and vs_list:
                    for member in lb_pl.get("members"):
                        lb_list = {}
                        for vs_id in vs_list:
                            if vs_id in vs_pool_segment_list.keys():
                                continue
                            lb = get_lb_service_name(vs_id)
                            if not lb:
                                continue
                            pool_segment = get_object_segments(vs_id,
                                                             member["ip_address"])
                            if pool_segment:
                                if lb in lb_list.keys():
                                    pool_list = lb_list[lb]
 #                                   pool_list["name"] = pool_list["name"]+"-"+vs_id
                                    vs_pool_segment_list[vs_id] = lb_list[lb]
                                    continue

                                pool_skip = False
                                if pool_count == 0:
                                    vs_pool_segment_list[vs_id] = {
                                        "pool_name": name,
                                        "pool_segment": pool_segment
                                    }
                                    lb_list[lb] = vs_pool_segment_list[vs_id]

                                else:
                                    new_pool_name = '%s-%s' % (name, pool_segment[0]["subnets"]["network_range"])
                                    new_pool_name = new_pool_name.replace('/', '-')
                                    vs_pool_segment_list[vs_id] = {
                                        "pool_name": new_pool_name,
                                        "pool_segment": pool_segment
                                    }
                                    lb_list[lb] = vs_pool_segment_list[vs_id]
                                pool_count += 1
                        for vs_id in vs_list_for_sorry_pool:
                            if vs_id in vs_sorry_pool_segment_list.keys():
                                continue
                            lb = get_lb_service_name(vs_id)
                            pool_segment = get_object_segments(vs_id,
                                                             member["ip_address"])
                            if pool_segment:
                                if lb in lb_list.keys():
                                    vs_sorry_pool_segment_list[vs_id] = lb_list[lb]
                                    continue

                                pool_skip = False
                                if pool_count == 0:
                                    vs_sorry_pool_segment_list[vs_id] = {
                                        "pool_name": name,
                                        "pool_segment": pool_segment
                                    }
                                    lb_list[lb] = vs_sorry_pool_segment_list[vs_id]

                                else:
                                    vs_sorry_pool_segment_list[vs_id] = {
                                        "pool_name": '%s-%s' % (name, pool_segment[0]["subnets"]["network_range"]),
                                        "pool_segment": pool_segment
                                    }
                                    lb_list[lb] = vs_sorry_pool_segment_list[vs_id]
                                pool_count += 1

                    if pool_skip:
                        skipped_pools_list.append(name)
                        conv_utils.add_status_row('pool', None, lb_pl['display_name'],
                                                        conv_const.STATUS_SKIPPED)
                        continue

                na_list = [val for val in lb_pl.keys()
                           if val in self.common_na_attr or val in self.pool_na_attr]
                servers, member_skipped_config, skipped_servers, limits = \
                    self.convert_servers_config(lb_pl.get("members", []))
                alb_pl["name"] = name
                alb_pl["servers"] = servers

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
                if lb_pl.get('member_group'):
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
                        hm_config = list(
                            filter(lambda pr: pr["id"] == ref, nsx_lb_config["LbMonitorProfiles"]))
                        hm_name = hm_config[0]["display_name"]
                        if prefix:
                            hm_name = prefix + "-" + hm_name
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
                conv_utils.add_conv_status(
                    'pool', None, alb_pl['name'], conv_status,
                    {'pools': [alb_pl]})
                msg = "Pools conversion started..."
                conv_utils.print_progress_bar(
                    progressbar_count, total_size, msg, prefix='Progress',
                    suffix='')

                alb_config['Pool'].append(alb_pl)
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

    def get_name_type(self, lb_pl):
        type = ""
        if lb_pl['algorithm'] in ['ROUND_ROBIN', 'WEIGHTED_ROUND_ROBIN']:
            type = 'LB_ALGORITHM_ROUND_ROBIN'
        elif lb_pl['algorithm'] in ['LEAST_CONNECTION',
                                    'WEIGHTED_LEAST_CONNECTION']:
            type = 'LB_ALGORITHM_LEAST_CONNECTION'
        elif lb_pl['algorithm'] == 'IP_HASH':
            type = 'LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS'
        return type, lb_pl['display_name']

    def convert_servers_config(self, servers_config):
        server_list = []
        skipped_list = []
        server_skipped = []
        connection_limit = []
        pg_obj =[]
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

