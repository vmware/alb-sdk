# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import logging

from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util
from avi.migrationtools.nsxt_converter.nsxt_util import NSXUtil

LOG = logging.getLogger(__name__)


class NSXCleanup:
    nsx_api_client = None
    vs_not_found = list()

    def __init__(self, nsx_un, nsx_pw, nsx_ip, nsx_port):
        self.nsx_api_client = nsx_client_util.create_nsx_policy_api_client(
            nsx_un, nsx_pw, nsx_ip, nsx_port, auth_type=nsx_client_util.BASIC_AUTH)
        self.nsx_util = NSXUtil(nsx_un, nsx_pw, nsx_ip, nsx_port)
        self.nsx_lb_config = self.nsx_util.get_nsx_config()

    def nsx_cleanup(self, vs_names):
        nsx_lb_config = self.nsx_lb_config
        if vs_names and type(vs_names) == str:
            virtual_services = vs_names.split(',')
        elif vs_names and type(vs_names) == list:
            virtual_services = vs_names
        vs_attached_pools = []
        vs_attached_profiles = []
        vs_attached_persis = []
        vs_attached_client_ssl = []
        vs_attached_server_ssl = []
        pool_attached_monitor = []
        if nsx_lb_config.get("LbVirtualServers", None):
            for vs_name in virtual_services:
                vs_list = list(filter(lambda vs: vs["display_name"] == vs_name, nsx_lb_config['LbVirtualServers']))
                if vs_list:
                    for vs in vs_list:
                        if not vs["_system_owned"]:
                            cleanup_msg = "Performing cleanup for VS {} ...".format(vs["display_name"])
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                            if vs.get("pool_path"):
                                vs_attached_pools.append(vs['pool_path'].split('/')[-1])
                            if vs.get("sorry_pool_path"):
                                vs_attached_pools.append(vs['sorry_pool_path'].split('/')[-1])
                            if vs.get("lb_persistence_profile_path"):
                                vs_attached_persis.append(vs['lb_persistence_profile_path'].split('/')[-1])
                            if vs.get("application_profile_path"):
                                vs_attached_profiles.append(vs['application_profile_path'].split('/')[-1])
                            if vs.get("client_ssl_profile_binding"):
                                if vs['client_ssl_profile_binding'].get('ssl_profile_path'):
                                    vs_attached_client_ssl.append(
                                        vs['client_ssl_profile_binding']['ssl_profile_path'].split('/')[-1])
                            if vs.get("server_ssl_profile_binding"):
                                if vs['server_ssl_profile_binding'].get('ssl_profile_path'):
                                    vs_attached_server_ssl.append(
                                        vs['server_ssl_profile_binding']['ssl_profile_path'].split('/')[-1])

                            self.nsx_api_client.infra.LbVirtualServers.delete(vs["id"])
                            cleanup_msg = "Deleted VS {} from NSX-T".format(vs["display_name"])
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                else:
                    self.vs_not_found.append(vs_name)
                    LOG.warning("VS {} not found for deletion".format(vs_name))

            nsx_lb_config = self.nsx_util.get_nsx_config()

            for persis_id in vs_attached_persis:
                if nsx_lb_config.get("LbPersistenceProfiles", None):
                    persis_config = \
                        list(filter(lambda pp: pp["id"] == persis_id, nsx_lb_config['LbPersistenceProfiles']))
                    if not persis_config[0]["_system_owned"]:
                        vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                   (vs.get("lb_persistence_profile_path") and
                                    vs.get("lb_persistence_profile_path").split("/")[-1] == persis_id)]
                        if not vs_list:
                            self.nsx_api_client.infra.LbPersistenceProfiles.delete(persis_id)
                            cleanup_msg = "Performed cleanup of referenced persistence profile"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on persistence profile " \
                            "as it is referenced by other virtual service/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on persistence profile " \
                              "as default(system owned) persistence profile is attached"
                        LOG.debug(msg)
                        print(msg)

            for s_ssl_id in vs_attached_server_ssl:
                if nsx_lb_config.get("LbServerSslProfiles", None):
                    s_ssl_config = \
                        list(filter(lambda s_ssl: s_ssl["id"] == s_ssl_id, nsx_lb_config['LbServerSslProfiles']))
                    if not s_ssl_config[0]["_system_owned"]:
                        vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                   (vs.get("server_ssl_profile_binding") and
                                    vs['server_ssl_profile_binding'].get('ssl_profile_path') and
                                    vs['server_ssl_profile_binding']['ssl_profile_path'].split("/")[-1] == s_ssl_id)]
                        if not vs_list:
                            self.nsx_api_client.infra.LbServerSslProfiles.delete(s_ssl_id)
                            cleanup_msg = "Performed cleanup of referenced server ssl profile"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on server ssl profile " \
                            "as it is referenced by other virtual service/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on server ssl profile " \
                              "as default(system owned) server ssl profile is attached"
                        LOG.debug(msg)
                        print(msg)   

            for c_ssl_id in vs_attached_client_ssl:
                if nsx_lb_config.get("LbClientSslProfiles", None):
                    c_ssl_config = \
                        list(filter(lambda c_ssl: c_ssl["id"] == c_ssl_id, nsx_lb_config['LbClientSslProfiles']))
                    if not c_ssl_config[0]["_system_owned"]:
                        vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                   (vs.get("client_ssl_profile_binding") and
                                    vs['client_ssl_profile_binding'].get('ssl_profile_path') and
                                    vs['client_ssl_profile_binding']['ssl_profile_path'].split("/")[-1] == c_ssl_id)]
                        if not vs_list:
                            self.nsx_api_client.infra.LbClientSslProfiles.delete(c_ssl_id)
                            cleanup_msg = "Performed cleanup of referenced client ssl profile"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on client ssl  profile " \
                                "as it is referenced by other virtual service/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on client ssl profile" \
                              " as default(system owned) client ssl profile is attached "
                        LOG.debug(msg)
                        print(msg)

            for pr_id in vs_attached_profiles:
                if nsx_lb_config.get("LbAppProfiles", None):
                    pr_config = \
                        list(filter(lambda pr: pr["id"] == pr_id, nsx_lb_config['LbAppProfiles']))
                    if not pr_config[0]["_system_owned"]:
                        vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                   (vs.get("application_profile_path") and
                                    vs.get("application_profile_path").split("/")[-1] == pr_id)]
                        if not vs_list:
                            self.nsx_api_client.infra.LbAppProfiles.delete(pr_id)
                            cleanup_msg = "Performed cleanup of referenced application profile"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on application profile " \
                            "as it is referenced by other virtual service/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on application profile" \
                              " as default (system owned) application profile is attached"
                        LOG.debug(msg)
                        print(msg)

            for pool_id in vs_attached_pools:
                if nsx_lb_config.get("LbAppProfiles", None):
                    pool_config = \
                        list(filter(lambda pr: pr["id"] == pool_id, nsx_lb_config['LbPools']))
                    if not pool_config[0]["_system_owned"]:
                        vs_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                   (vs.get("pool_path") and
                                    vs.get("pool_path").split("/")[-1] == pool_id)]
                        vs_sr_pool_list = [vs["id"] for vs in nsx_lb_config["LbVirtualServers"] if
                                           (vs.get("sorry_pool_path") and
                                            vs.get("sorry_pool_path").split("/")[-1] == pool_id)]
                        if not vs_list and not vs_sr_pool_list:
                            if pool_config[0].get("active_monitor_paths"):
                                active_monitor_list = pool_config[0].get("active_monitor_paths")
                                for monitor in active_monitor_list:
                                    pool_attached_monitor.append(monitor.split('/')[-1])
                            self.nsx_api_client.infra.LbPools.delete(pool_id)
                            cleanup_msg = "Performed cleanup of referenced pool"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on pool as it is referenced by other virtual service/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on pool as default(system owned) pool is attached"
                        LOG.debug(msg)
                        print(msg)

            nsx_lb_config = self.nsx_util.get_nsx_config()
            for monitor_id in pool_attached_monitor:
                if nsx_lb_config.get("LbMonitorProfiles", None):
                    monitor_config = \
                        list(filter(lambda pr: pr["id"] == monitor_id, nsx_lb_config['LbMonitorProfiles']))
                    if not monitor_config[0]["_system_owned"]:
                        pool_list = []
                        for pool in nsx_lb_config["LbPools"]:
                            monitor_list = pool.get("active_monitor_paths", None)
                            if monitor_list:
                                pool_temp = [True for monitor in monitor_list if
                                             monitor.split('/')[-1] == monitor_id]
                                if pool_temp:
                                    pool_list.append(pool["id"])

                        if not pool_list:
                            self.nsx_api_client.infra.LbMonitorProfiles.delete(monitor_id)
                            cleanup_msg = "Performed cleanup of referenced monitor"
                            LOG.debug(cleanup_msg)
                            print(cleanup_msg)
                        else:
                            msg="No cleanup performed on monitor as it is referenced by other pool/s"
                            LOG.debug(msg)
                            print(msg)
                    else:
                        msg = "No cleanup performed on monitor as default(system owned) monitor is attached"
                        LOG.debug(msg)
                        print(msg)
