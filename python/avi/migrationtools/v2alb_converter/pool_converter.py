import copy
import json
import logging
import os

import avi.migrationtools.v2alb_converter.converter_constants as conv_const
import requests
from avi.migrationtools.v2alb_converter.conversion_util import NsxvConvUtil
from avi.migrationtools.v2alb_converter.monitor_converter import MONITOR_ID_NAME_MAPS
from avi.migrationtools.avi_migration_utils import update_count

conv_utils = NsxvConvUtil()
LOG = logging.getLogger(__name__)


class PoolConfigConv:

    POOL_ID_NAME_MAPS = {}

    def __init__(
        self,
        nsxv_util,
        nsxv_pool_attributes,
        object_merge_check,
        merge_object_mapping,
        sys_dict,
        input_path,
    ):
        """
        :param nsxt_pool_attributes: Supported attributes for pool migration
        """
        self.SUPPORTED_POOL_TYPE_HASH_DICT = {
            "ROUND-ROBIN": ["LB_ALGORITHM_ROUND_ROBIN", None],
            "LEASTCONN": ["LB_ALGORITHM_LEAST_CONNECTIONS", None],
            "IP-HASH": [
                "LB_ALGORITHM_CONSISTENT_HASH",
                "LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS",
            ],
            "URI": ["LB_ALGORITHM_CONSISTENT_HASH", "LB_ALGORITHM_CONSISTENT_HASH_URI"],
            "HTTPHEADER": [
                "LB_ALGORITHM_CONSISTENT_HASH",
                "LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_HEADER",
            ],
            "URL": ["LB_ALGORITHM_CONSISTENT_HASH", "LB_ALGORITHM_CONSISTENT_HASH_URI"],
        }

        self.supported_attr = nsxv_pool_attributes["Pool_supported_attr"]
        self.server_attributes = nsxv_pool_attributes[
            "Pool_supported_attr_convert_servers_config"
        ]

        self.pool_na_attr = nsxv_pool_attributes["Pool_na_list"]
        self.pool_member_na_attr = nsxv_pool_attributes["Pool_server_na_list"]
        self.pool_member_ignore_attr = nsxv_pool_attributes["Pool_server_ignore_list"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.nsxv_util = nsxv_util
        self.input_path = input_path

    def convert(
        self, avi_config_dict, vedge_lb_config, prefix, tenant, licence_type="BASIC"
    ):
        avi_config_dict["Pool"] = list()
        progressbar_count = 0
        total_obj_count = conv_utils.get_total_objects_count_in_v(
            vedge_lb_config, "pool"
        )
        print("\nConverting Pools ...")
        LOG.info("[POOL] Converting Pools...")
        msg = "Pool conversion started..."

        for edge_name, edge_config in vedge_lb_config.items():
            if not edge_config.get("pool") or len(edge_config.get("pool")) == 0:
                LOG.warning(f"EDGE {edge_name} does not contain pools ")
                continue

            pool_config = edge_config.get("pool")
            vs_config = edge_config.get("virtualServer")

            self.POOL_ID_NAME_MAPS[edge_name] = dict()
            for v_pool in pool_config:
                try:
                    skipped = []
                    na_list = []
                    indirect = []
                    u_ignore = []
                    ignore_for_defaults = {}
                    progressbar_count += 1
                    v_pool_name = v_pool.get("name")
                    pool_id = v_pool.get("poolId")

                    is_pool_orphan, pool_vs_list = self.check_is_pool_attached_with_vs(
                        pool_id, vs_config
                    )

                    if is_pool_orphan:
                        skip_mesg = "POOL SKIPPED: {} {} Reason : Orphan Pool ".format(
                            edge_name,
                            v_pool_name,
                        )
                        LOG.warning(skip_mesg)
                        conv_utils.add_status_row(
                            "pool", None, v_pool_name, conv_const.STATUS_SKIPPED, skip_mesg
                        )
                        conv_utils.print_progress_bar(
                            progressbar_count,
                            total_obj_count,
                            msg,
                            prefix="Progress",
                            suffix="",
                        )

                        continue

                    skipped = [
                        key for key in v_pool.keys() if key not in self.supported_attr
                    ]
                    na_list = [key for key in v_pool.keys() if key in self.pool_na_attr]
                    active_monitor = v_pool.get("monitorId", None)
                    name = f"{edge_name}-{v_pool_name}"
                    if prefix:
                        name = f"{prefix}-{name}"
                    PoolConfigConv.POOL_ID_NAME_MAPS[edge_name][pool_id] = name
                    alb_pool = dict(
                        name=name,
                    )
                    alb_pool["tenant_ref"] = conv_utils.get_object_ref(
                        tenant, "tenant")

                    algo_type = v_pool.get("algorithm")
                    algo_hash = v_pool.get("lb_algorithm_hash")
                    if algo_type:
                        algo_type = algo_type.upper()
                    if algo_hash:
                        algo_hash = algo_hash.upper()

                    if licence_type == "ENTERPRISE":
                        pool_algo_hash = self.SUPPORTED_POOL_TYPE_HASH_DICT.get(
                            algo_type)
                        alb_pool["lb_algorithm"] = pool_algo_hash[0]
                        if pool_algo_hash[1]:
                            alb_pool["lb_algorithm_hash"] = pool_algo_hash[1]
                            LOG.debug(f"License type is Enterprise. Algorithm \
                                      set is {pool_algo_hash[0]} and hash set \
                                      is {pool_algo_hash[1]}")

                    elif algo_type in ("LEASTCONN", "ROUND-ROBIN", "IP-HASH"):
                        pool_algo_hash = self.SUPPORTED_POOL_TYPE_HASH_DICT.get(
                            algo_type)

                        alb_pool["lb_algorithm"] = pool_algo_hash[0]
                        if algo_type == "IP-HASH":
                            alb_pool["lb_algorithm_hash"] = pool_algo_hash[1]
                            LOG.debug(f"Algorithm set is {pool_algo_hash[0]} and hash set is {pool_algo_hash[1]}")
                    else:
                        skip_mesg = "POOL SKIPPED: {} {} Reason : Algorithm type not supported in avi basic licence "\
                            .format(edge_name, v_pool_name)
                        LOG.warning(skip_mesg)

                        conv_utils.add_status_row(
                            "pool", None, v_pool_name, conv_const.STATUS_SKIPPED, skip_mesg
                        )
                        conv_utils.print_progress_bar(
                            progressbar_count,
                            total_obj_count,
                            msg,
                            prefix="Progress",
                            suffix="",
                        )

                        continue

                    # If algorithm is HTTPHEADER then need to set lb_algorithm_consistent_hash_hdr
                    # otherwise must check on AVI fails
                    if v_pool["algorithm"].upper() == "HTTPHEADER":
                        if v_pool["algorithmParameters"] is not None:
                            header_name = v_pool["algorithmParameters"].split("=")[
                                1]
                            alb_pool["lb_algorithm_consistent_hash_hdr"] = header_name
                        else:
                            alb_pool["lb_algorithm_consistent_hash_hdr"] = "testheader"
                        LOG.debug(f"Algorithm is HTTPHEADER and hash set is {alb_pool['lb_algorithm_consistent_hash_hdr']}")

                    if active_monitor:
                        monitor_name = MONITOR_ID_NAME_MAPS[edge_name].get(active_monitor[0])

                        if self.object_merge_check:
                            monitor_name = self.merge_object_mapping["health_monitor"].get(monitor_name)

                        if monitor_name:
                            monitor_ref = "/api/healthmonitor/?tenant={}&name={}".format(tenant, monitor_name)
                            alb_pool["health_monitor_refs"] = [monitor_ref]
                            LOG.debug(f"Health monitor ref {monitor_ref} set to pool {v_pool_name}")

                    na_member_atr = []
                    v_pool_members = v_pool.get("member")
                    if v_pool_members:
                        alb_pool["max_concurrent_connections_per_server"] = self.get_max_conn(v_pool_members)

                        servers, member_skipped_attr = self.convert_pool_members(alb_pool, v_pool_members)
                        alb_pool["servers"] = servers
                        LOG.debug(f"Pool: {v_pool_name}, Servers: {servers}, Skipped attr: {member_skipped_attr}")

                        if member_skipped_attr:
                            skipped.append(member_skipped_attr)

                        na_member_atr.append(self.pool_member_na_attr)

                    conv_status = conv_utils.get_conv_status(
                        skipped,
                        indirect,
                        ignore_for_defaults,
                        pool_config,
                        u_ignore,
                        na_list,
                    )
                    if na_member_atr:
                        conv_status["na_list"].append(na_member_atr)
                        u_ignore = self.pool_member_ignore_attr
                    avi_config_dict["Pool"].append(alb_pool)

                    conv_utils.print_progress_bar(
                        progressbar_count,
                        total_obj_count,
                        msg,
                        prefix="Progress",
                        suffix="",
                    )
                    conv_utils.add_conv_status(
                        "pool", None, v_pool.get("name"), conv_status, [
                            {"pools": alb_pool}]
                    )
                except Exception as e:
                    update_count('error')
                    LOG.error("[POOL] Failed to convert pool: %s Message %s"
                              % (v_pool.get("name"), e), exc_info=True)
                    conv_utils.add_status_row('pool', None, v_pool.get("name"),
                                              "ERROR")

    def convert_pool_members(self, alb_pool, members_config):

        server_list = []
        skipped_list = []

        found_ip_member = found_group_member = False
        copy_members_config = copy.deepcopy(members_config)
        for count in range(len(members_config)):
            if "ipAddress" in members_config[count] and not found_ip_member:
                found_ip_member = True
                LOG.debug("ipAddress member found for pool")
            if "groupingObjectId" in members_config[count] and not found_group_member:
                found_group_member = True
                alb_pool["nsx_securitygroup"] = list()
                LOG.debug("Group member found for pool")
                del copy_members_config[count]

        ns_group_mapping = {}
        t_config_file = self.input_path + "/nsgroup_mapping.json"
        if os.path.exists(t_config_file):
            with open(t_config_file) as f:
                ns_group_mapping = json.load(f)

        if found_ip_member and found_group_member:

            # If both ip member and group are found then
            # 1. attached the existing ns group to alb config
            # 2. for ip members create new nsx group and attach to alb pool

            # Get existing nsx group and attach to alb config
            for member in members_config:
                if "groupingObjectId" in member:
                    if member["groupingObjectId"] in ns_group_mapping.keys() and \
                            ns_group_mapping[member["groupingObjectId"]]:
                        alb_pool["nsx_securitygroup"].append(ns_group_mapping[member["groupingObjectId"]])
                    else:
                        LOG.warning(f"nsx group mapping for {member['groupingObjectId']} not found ")
                elif "groupingObjectName" in member:
                    if member["groupingObjectName"] in ns_group_mapping.keys() and \
                            ns_group_mapping[member["groupingObjectName"]]:
                        alb_pool["nsx_securitygroup"].append(ns_group_mapping[member["groupingObjectName"]])
                    else:
                        LOG.warning(f"nsx group mapping for {member['groupingObjectName']} not found ")

            # Online mode - Convert all ip member to one nsx group and attach to alb pool
            # Offline mode - nsxgroup containing ip_member(s) is expected to be present.
            #                Find this nsgroup and assign to pool.
            # alb_pool["name"] format: <edge-name>-<pool-name> e.g edge-1-pool-31
            combined_ns_group = "{}-{}".format(alb_pool["name"], "alb-nsgroup")
            ns_group = None
            if self.nsxv_util.nsxt_session:
                ns_group = self.create_and_update_nsgroup(alb_pool["name"], copy_members_config, ns_group_mapping)
                if alb_pool.get("nsx_securitygroup"):
                    alb_pool["nsx_securitygroup"].append(ns_group)
                else:
                    alb_pool["nsx_securitygroup"] = [ns_group]
                LOG.debug(f"nsx group mapping {ns_group} created")
            elif combined_ns_group in ns_group_mapping.keys() and ns_group_mapping[combined_ns_group]:
                ns_group = ns_group_mapping[combined_ns_group]
                if alb_pool.get("nsx_securitygroup"):
                    alb_pool["nsx_securitygroup"].append(ns_group)
                else:
                    alb_pool["nsx_securitygroup"] = [ns_group]
                LOG.debug(f"nsx group mapping {ns_group} got from ns group mapping")
            else:
                LOG.warning(f"combined nsx group mapping with name {combined_ns_group} having ip member and ns group "
                            f"not found ")
        elif not found_ip_member and found_group_member:
            # Get existing nsx group and attach to alb config
            for member in members_config:
                if "groupingObjectId" in member:
                    if member["groupingObjectId"] in ns_group_mapping.keys():
                        alb_pool["nsx_securitygroup"].append(ns_group_mapping[member["groupingObjectId"]])
                        LOG.debug(f"nsx group mapping {ns_group_mapping[member['groupingObjectId']]} "
                                  f"got from ns group mapping")
                    else:
                        LOG.warning(f"nsx group mapping for {member['groupingObjectId']} not found ")
                elif "groupingObjectName" in member:
                    if member["groupingObjectName"] in ns_group_mapping.keys():
                        alb_pool["nsx_securitygroup"].append(ns_group_mapping[member["groupingObjectName"]])
                        LOG.debug(f"nsx group mapping {ns_group_mapping[member['groupingObjectName']]} "
                                  f"got from ns group mapping")
                    else:
                        LOG.warning(f"nsx group mapping for {member['groupingObjectName']} not found ")
        elif found_ip_member and not found_group_member:
            for member in copy_members_config:
                if "." in member["ipAddress"]:
                    ip_type = "V4"
                else:
                    ip_type = "V6"
                server_obj = {
                    "ip": {"addr": member["ipAddress"], "type": ip_type},
                    "description": member.get("name"),
                }
                if member.get("port", ""):
                    server_obj["port"] = int(member.get("port"))

                if member.get("weight"):
                    server_obj["ratio"] = member.get("weight")

                server_obj["enabled"] = False
                if member.get("condition") == "enabled":
                    server_obj["enabled"] = True

                LOG.debug(f"Server object with ip members: {server_obj}")
                server_list.append(server_obj)
                skipped_list = [
                    key for key in member.keys() if key not in self.server_attributes
                ]

        skipped_list = [
            key for key in skipped_list if key not in self.pool_member_na_attr
        ]
        skipped_list = [
            key for key in skipped_list if key not in self.pool_member_ignore_attr
        ]
        return server_list, skipped_list

    def get_max_conn(self, v_members):
        max_conn_values = []

        for member in v_members:
            max_conn_values.append(int(member.get("maxConn", 0)))

        LOG.debug(f"Max connect value is {max(max_conn_values)}")
        return max(max_conn_values)

    def check_is_pool_attached_with_vs(self, pool_id, vs_configs):
        is_pool_orphan = True

        pool_vs_list = [
            vs.get("virtualServerId")
            for vs in vs_configs
            if vs.get("defaultPoolId") == pool_id
        ]

        if pool_vs_list:
            is_pool_orphan = False

        LOG.debug(f"is_pool_orphan: {is_pool_orphan}, pool_vs_list: {pool_vs_list}")
        return is_pool_orphan, pool_vs_list

    def get_mig_pool_name_by_v_pool_id(self, edge_id, v_pool_id):
        if self.POOL_ID_NAME_MAPS.get(edge_id):
            avi_pool_name = self.POOL_ID_NAME_MAPS[edge_id].get(v_pool_id)
            return avi_pool_name
        return None

    def get_domain_id(self):
        # Get domain id from NSX-T
        domain_id = None
        response = self.nsxv_util.nsxt_session.get(
            self.nsxv_util.nsxt_base_url + "/policy/api/v1/infra/domains/",
            headers={},
            data={},
            verify=False,
        )
        results = response.json()["results"]
        if results:
            domain_id = results[0]["id"]

        LOG.debug(f"domain id {domain_id}")
        return domain_id

    def get_existing_ns_group(self, pool_name, ns_name):
        # Get existing ns group from NSX-T
        domain_id = self.get_domain_id()
        ns_path = ""
        try:
            headers = {"content-type": "application/json"}
            requests.packages.urllib3.disable_warnings()

            response = self.nsxv_util.nsxt_session.get(
                self.nsxv_util.nsxt_base_url
                + "/policy/api/v1/infra/domains/{}/groups/{}".format(
                    domain_id, ns_name
                ),
                headers=headers,
                verify=False,
            )
            response = json.loads(response.text)

            LOG.debug(f"Found existing ns group {response['path']}")
            return response["path"]
        except Exception:
            LOG.debug(f"Error in getting existing ns group for pool {pool_name}")

    def create_and_update_nsgroup(
        self, pool_name, pool_member_config, ns_group_mapping
    ):

        ip_address_list = [
            pool_member["ipAddress"]
            for pool_member in pool_member_config
            if pool_member.get("ipAddress")
        ]

        ns_name = "{}-{}".format(pool_name, "alb-nsgroup")

        try:
            if ns_name in ns_group_mapping.keys():
                ns_path = ns_group_mapping.get(ns_name)
                LOG.debug(f"Found existing ns group {ns_path}")
            else:
                domain_id = self.get_domain_id()

                headers = {"content-type": "application/json"}
                requests.packages.urllib3.disable_warnings()

                response = self.nsxv_util.nsxt_session.get(
                    self.nsxv_util.nsxt_base_url
                    + "/policy/api/v1/infra/domains/{}/groups/{}".format(
                        domain_id, ns_name
                    ),
                    headers=headers,
                    verify=False,
                )
                response = json.loads(response.text)

                if response.get("httpStatus") == "NOT_FOUND":
                    data = {
                        "expression": [
                            {
                                "ip_addresses": ip_address_list,
                                "resource_type": "IPAddressExpression",
                            }
                        ],
                        "resource_type": "Group",
                        "id": ns_name,
                        "display_name": ns_name,
                    }

                    response = self.nsxv_util.nsxt_session.put(
                        self.nsxv_util.nsxt_base_url
                        + "/policy/api/v1/infra/domains/{}/groups/{}".format(
                            domain_id, ns_name
                        ),
                        headers=headers,
                        data=json.dumps(data),
                        verify=False,
                    )
                    response = json.loads(response.text)

                    print(f"ns group created for pool {pool_name}")
                    ns_path = response["path"]

                else:
                    ns_path = response["path"]

            LOG.debug(f"Created ns group with path {ns_path}")
            return ns_path
        except Exception as e:
            print(f"Error in creating ns group for pool {pool_name}. Message: {e}")
