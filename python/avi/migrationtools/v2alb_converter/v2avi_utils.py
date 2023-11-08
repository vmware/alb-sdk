import ast
import base64
import glob
import json
import logging
import os
import ssl
import urllib.request

import requests
import avi.migrationtools.v2alb_converter.v2avi_client as nsx_client_util
from avi.sdk.avi_api import ApiSession
from Crypto.Cipher import AES
from requests.packages.urllib3.exceptions import InsecureRequestWarning

# from Crypto.PublicKey import RSA

requests.packages.urllib3.disable_warnings(InsecureRequestWarning)

LOG = logging.getLogger(__name__)


def get_name_and_entity(url):
    """
    Parses reference string to extract object type and
    :param url: reference url to be parsed
    :return: entity and object name
    """
    if url:
        parsed = url.split("/")
        return parsed[-2], parsed[-1]

    return "", ""


interface_path = "/t-config/interface.json"
seg_path = "/t-config/segment_config.json"


class NsxvUtil:
    def __init__(
        self,
        v_host,
        v_user,
        v_pw,
        input_path,
        t_host=None,
        t_user=None,
        t_pw=None,
        t_port=443,
        c_user=None,
        c_ip=None,
        c_pw=None,
        c_vr=None,
        cloud_tenant="admin",
    ):

        self.input_path = input_path
        self.v_host = v_host
        self.v_user = v_user
        self.v_pass = v_pw
        self.input_path = input_path
        self.t_host = t_host
        self.t_user = t_user
        self.t_pw = t_pw
        self.t_port = t_port
        self.cloud_tenant = cloud_tenant
        self.nsx_api_client = nsx_client_util.create_nsx_policy_api_client(
            t_user, t_pw, t_host, t_port, auth_type=nsx_client_util.BASIC_AUTH
        )
        
        if c_ip and c_user and c_pw and c_vr:

            self.session = ApiSession.get_session(
                c_ip, c_user, c_pw, tenant="admin", api_version=c_vr
            )
            self.session.api_version=c_vr
            self.cloud = self.session.get("cloud/", tenant=self.cloud_tenant).json()[
                "results"
            ]

        self.nsxt_session = None
        if self.t_host and self.t_user and self.t_pw and self.t_port:
            self.nsxt_base_url, self.nsxt_session = self.authenticate_nsxt(
                self.t_host, self.t_port, self.t_user, self.t_pw
            )

        self.avi_vs_object = []
        self.avi_object_temp = {}
        self.avi_pool_object = []
        self.enabled_pool_list = []
        self.lb_services = {}
        self.edge_to_tier1 = {}
        self.edge_detailes = dict()
        self.interface_tier_dict = {}
        self.segment_list = []

        if os.path.exists(self.input_path + interface_path):
            with open(self.input_path + interface_path) as intrf:
                self.interface_tier_dict = json.load(intrf)

        if os.path.exists(self.input_path + seg_path):
            with open(self.input_path + seg_path) as seg:
                self.segment_list = json.load(seg)
    
    def get_v_discovery(self, edge_to_tier1):
        return

    def get_virtual_server(self, edge_id, virtual_server_id):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/virtualservers/{virtual_server_id}"
        response = requests.get(
            url,
            auth=(self.v_user, self.v_pass),
            verify=False,
            headers={"Accept": "application/json"},
            stream=True,
        )
        nsxv_config = dict()
        vs_config = json.loads(response.text)
        return vs_config

    def update_virtual_server(self, edge_id, virtual_server_id, vs_object):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/virtualservers/{virtual_server_id}"
        headers = {"Content-Type": "application/json",
                   "Accept": "application/json"}
        response = requests.put(
            url,
            auth=(self.v_user, self.v_pass),
            verify=False,
            headers=headers,
            data=json.dumps(vs_object),
        )
        return response

    def delete_nsxv_virtual_server(self, edge_id, virtual_server_id):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/virtualservers/{virtual_server_id}"
        headers = {"Content-Type": "application/json",
                   "Accept": "application/json"}
        response = requests.delete(
            url, auth=(self.v_user, self.v_pass), verify=False, headers=headers
        )
        return response

    def delete_nsxv_application_profile(self, edge_id, app_profile_id):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/applicationprofiles/{app_profile_id}"
        headers = {"Content-Type": "application/json",
                   "Accept": "application/json"}
        response = requests.delete(
            url, auth=(self.v_user, self.v_pass), verify=False, headers=headers
        )
        return response

    def delete_nsxv_pool(self, edge_id, pool_id):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/pools/{pool_id}"
        headers = {"Content-Type": "application/json",
                   "Accept": "application/json"}
        response = requests.delete(
            url, auth=(self.v_user, self.v_pass), verify=False, headers=headers
        )
        return response

    def delete_nsxv_monitor(self, edge_id, monitor_id):
        url = f"https://{self.v_host}/api/4.0/edges/{edge_id}/loadbalancer/config/monitors/{monitor_id}"
        headers = {"Content-Type": "application/json",
                   "Accept": "application/json"}
        response = requests.delete(
            url, auth=(self.v_user, self.v_pass), verify=False, headers=headers
        )
        return response

    def authenticate_nsxt(self, host, port, username, password):
        nsxt_base_url = f"https://{host}:{port}"
        nsxt_session = requests.Session()
        nsxt_session.auth = (username, password)
        return nsxt_base_url, nsxt_session

    def get(self, session, get_url, payload={}, verify=False):
        response = session.get(get_url, data=payload, verify=verify)
        return response

    def get_edge_tier1_mapping(self):
        response = self.get(
            self.nsxt_session, self.nsxt_base_url + "/policy/api/v1/infra/tier-1s"
        )

        # Fetch all tier1's from nsx-t
        tier1_list = list()
        for tier1 in response.json()["results"]:
            tier1_list.append(tier1["id"])

        edge_tier1_mapping = dict()

        # Get service interface of each tier1
        for tier1 in tier1_list:
            response = self.get(
                self.nsxt_session,
                self.nsxt_base_url + f"/policy/api/v1/infra/tier-1s/{tier1}"
                f"/locale-services/default/interfaces",
            )
            for interfaces in response.json()["results"]:
                if interfaces and "tags" in interfaces:
                    tags_list = interfaces["tags"]
                    for tag in tags_list:
                        if tag["scope"] == "v_origin":
                            edge_name = tag["tag"].split("t1_esg_csp-")[-1]
                            edge_tier1_mapping[edge_name] = tier1

        self.edge_to_tier1 = edge_tier1_mapping

        return edge_tier1_mapping
    
    def get_nsxv_Edges(self):

        edge_url = "/api/4.0/edges"
        url = "https://" + self.v_host + edge_url
        response = requests.get(
            url,
            auth=(self.v_user, self.v_pass),
            verify=False,
            headers={"Accept": "application/json"},
            stream=True,
        )
        if response.status_code == 200:
            nsxv_config = dict()
            config = json.loads(response.text)
            for edge in config["edgePage"].get("data"):
                nsxv_edge_id = edge.get("objectId")
                path = f"{self.input_path}/{nsxv_edge_id}.json"
                with open(path, "w", encoding="utf-8") as path:
                    lb_url = f"{url}/{nsxv_edge_id}/loadbalancer/config"
                    lb_res = requests.get(
                        lb_url,
                        auth=(self.v_user, self.v_pass),
                        verify=False,
                        headers={"Accept": "application/json"},
                        stream=True,
                    )
                    edge_config = json.loads(lb_res.text)
                    json.dump(edge_config, path, indent=4)
                    nsxv_config[nsxv_edge_id] = edge_config

            return nsxv_config
        else:
            raise Exception(f"Could not connect to NSX-V Manager. Error Code: {response.status_code}. "
                            f"Reason: {response.reason}")

    def set_details_for_edge(self, edge_to_tier1):
        for edge, tier in edge_to_tier1.items():
        
            interface_list = self.interface_tier_dict.get(tier)
            network = None
            tz_id = None
            cloud_name = None
            segment_info = []
            lb_tier1_lr = None
            warning_mesg = None
            is_cloud_configured = False
            
            if len(interface_list):
                for intf in interface_list:
                    #segment_path="/infra/segments/virtualwire-1"
                    segment_id = get_name_and_entity(intf.get("segment_path"))[-1]
                    segment = [seg for seg in self.segment_list if seg.get("id") == segment_id ]
                    segment = segment[0]

                    tz_path = segment.get("transport_zone_path")
                    tz_id = get_name_and_entity(tz_path)[-1]
                    if hasattr(segment, "vlan_ids") and segment.get("vlan_ids"):
                        network = "Vlan"
                    else:
                        network = "Overlay"

                    if network == "Overlay" and len(interface_list) > 0:
                        lb_tier1_lr = segment.get("connectivity_path")
                    cloud_name = self.get_cloud_type(self.cloud, tz_id, segment_id, lb_tier1_lr if lb_tier1_lr else tier)
                    
                    if cloud_name == "Cloud Not Found":
                        continue
                    is_cloud_configured=True
                    break

                for intrf in interface_list:
                    segment_id = get_name_and_entity(
                        intrf.get("segment_path"))[-1]
                    subnets = []
                    for subnet in intrf.get("subnets"):
                        subnets.append(
                            {
                                "network_range": (
                                    str(subnet.get("ip_addresses")[0])
                                    + "/"
                                    + str(subnet.get("prefix_len"))
                                )
                            }
                        )
                    segments = {"name": segment_id, "subnet": subnets}
                    segment_info.append(segments)
                    
            else:
                segment_list = self.segment_list
                is_tier_linked_segment_found = False
                
                for seg in segment_list:
                    if seg.get("connectivity_path"):
                        gateway_name = get_name_and_entity(
                            seg["connectivity_path"])[-1]
                        if gateway_name == tier:
                            is_tier_linked_segment_found = True
                            tz_path = seg.get("transport_zone_path")
                            tz_id = get_name_and_entity(tz_path)[-1]
                            dhcp_present = False
                            for subnet in seg["subnets"]:
                                if "dhcp_config" in subnet.keys() and not dhcp_present:
                                    dhcp_present = True
                            if not is_cloud_configured:
                                cloud_name = self.get_cloud_type(self.cloud, tz_id, seg.get("id"), tier)
                                if cloud_name != "Cloud Not Found":
                                    is_cloud_configured=True
                                    if seg.get("vlan_ids"):
                                        network = "Vlan"
                                    else:
                                        network = "Overlay"
                                    (
                                        is_dhcp_configured_on_avi,
                                        is_static_ip_pool_configured,
                                        is_ip_subnet_configured,
                                        static_ip_for_se_flag,
                                    ) = self.get_dhcp_config_details_on_avi_side(
                                        cloud_name, seg.get("id")
                                    )

                                    if not is_dhcp_configured_on_avi and (
                                        not is_static_ip_pool_configured
                                        or not is_ip_subnet_configured
                                        or not static_ip_for_se_flag
                                    ):
                                        warning_mesg = (
                                            "Warning : configuration of  %s network is incomplete , please check it once "
                                            % seg.get("display_name")
                                        )
                                        LOG.debug(warning_mesg)

                            if seg.get("subnets"):
                                subnets = []
                                for subnet in seg["subnets"]:
                                    subnets.append(
                                        {"network_range": subnet["network"]})
                                segments = {"name": seg.get(
                                    "id"), "subnet": subnets}
                                segment_info.append(segments)
                                
                if not is_tier_linked_segment_found:
                    skip_reason = "Skipping because edge has no segments or service interfaces configured"
                    self.lb_services[edge] = {
                        "edge": edge,
                        "edge_skip_reason": "Skipping because edge has no segments "
                        "or service interfaces configured",
                    }
                    LOG.debug("EDGE skipped : %s reason %s" %(edge, skip_reason))
                    continue

            if not is_cloud_configured:
                warning_mesg = "cloud is not configured for edge %s " % (edge)
                LOG.debug(warning_mesg)
      
            self.edge_detailes[edge] = {
                "Network": network,
                "Cloud": cloud_name,
                "tier1_lr": lb_tier1_lr,
            }
            if network == "Overlay" and not lb_tier1_lr:
                self.edge_detailes[edge]["tier1_lr"] = tier
            if segment_info:
                self.edge_detailes[edge]["Segments"] = segment_info
            if warning_mesg:
                self.edge_detailes[edge]["warning_mesg"] = warning_mesg

        return self.edge_detailes

    def get_dhcp_config_details_on_avi_side(self, cloud_name, seg_id):
        is_dhcp_configured_on_avi = False
        is_static_ip_pool_configured = False
        is_ip_subnet_configured = False
        static_ip_for_se_flag = False
        cloud_id = [cl.get("uuid")
                    for cl in self.cloud if cl.get("name") == cloud_name]
        segment_list = self.session.get(
            "network/?&cloud_ref.uuid=" + cloud_id[0]
        ).json()["results"]
        segment = [
            seg
            for seg in segment_list
            if seg.get("attrs")[0].get("value").split("segments/")[-1] == seg_id
        ]
        if segment:
            is_dhcp_configured_on_avi = segment[0].get("dhcp_enabled")
            if segment[0].get("configured_subnets"):
                configured_subnets = segment[0].get("configured_subnets")
                if configured_subnets[0].get("prefix"):
                    is_ip_subnet_configured = True
                    if configured_subnets[0].get("static_ip_ranges"):
                        is_static_ip_pool_configured = True
                        if configured_subnets[0].get("static_ip_ranges")[0].get(
                            "type"
                        ) in ["STATIC_IPS_FOR_VIP_AND_SE", "STATIC_IPS_FOR_SE"]:
                            static_ip_for_se_flag = True

        return (
            is_dhcp_configured_on_avi,
            is_static_ip_pool_configured,
            is_ip_subnet_configured,
            static_ip_for_se_flag,
        )

    def get_cloud_type(self, avi_cloud_list, tz_id, seg_id, tier1):
        is_seg_present = False
        vlan_cloud_list = list()
        overlay_cloud_list = list()
        for cl in avi_cloud_list:
            if cl.get("vtype") == "CLOUD_NSXT":
                if cl.get("nsxt_configuration"):
                    if cl["nsxt_configuration"].get("transport_zone"):
                        tz = cl["nsxt_configuration"].get("transport_zone")
                    elif cl["nsxt_configuration"].get("data_network_config"):
                        tz = cl["nsxt_configuration"]["data_network_config"].get(
                            "transport_zone"
                        )
                        if (
                            cl["nsxt_configuration"]["data_network_config"].get(
                                "tz_type"
                            )
                            == "OVERLAY"
                        ):
                            tz_type = "OVERLAY"
                            data_network = cl["nsxt_configuration"][
                                "data_network_config"
                            ]
                            if data_network.get("tier1_segment_config"):
                                if data_network["tier1_segment_config"].get("manual"):
                                    tier1_lrs = data_network["tier1_segment_config"][
                                        "manual"
                                    ].get("tier1_lrs")
                                    if tier1_lrs:
                                        is_seg_present = [
                                            True
                                            for tier in tier1_lrs
                                            if get_name_and_entity(
                                                tier.get("segment_id")
                                            )[-1]
                                            == seg_id
                                        ]
                        elif (
                            cl["nsxt_configuration"]["data_network_config"].get(
                                "tz_type"
                            )
                            == "VLAN"
                        ):
                            tz_type = "VLAN"
                            data_network = cl["nsxt_configuration"][
                                "data_network_config"
                            ]
                            vlan_seg = data_network.get("vlan_segments")
                            is_seg_present = [
                                True
                                for seg in vlan_seg
                                if get_name_and_entity(seg)[-1] == seg_id
                            ]
                    if tz.find("/") != -1:
                        tz = tz.split("/")[-1]
                    if tz == tz_id and is_seg_present:
                        return cl.get("name")
                    elif tz == tz_id and not is_seg_present:
                        if (
                            cl["nsxt_configuration"]["data_network_config"].get(
                                "tz_type"
                            )
                            == "VLAN"
                        ):
                            vlan_cloud_list.append(cl)
                            continue
                        elif (
                            cl["nsxt_configuration"]["data_network_config"].get(
                                "tz_type"
                            )
                            == "OVERLAY"
                        ):
                            overlay_cloud_list.append(cl)
                            continue

        if vlan_cloud_list:
            cloud_info = self.session.get_object_by_name(
                "cloud", vlan_cloud_list[0]["name"], tenant=self.cloud_tenant
            )
            cloud_vlan_segments = (
                cloud_info.get("nsxt_configuration")
                .get("data_network_config")
                .get("vlan_segments")
            )
            cloud_vlan_segments.append(f"/infra/segments/{seg_id}")
            cloud_info.get("nsxt_configuration").get("data_network_config").update(
                {"vlan_segments": cloud_vlan_segments}
            )
            self.session.put(
                "cloud/{}".format(cloud_info.get("uuid")),
                cloud_info,
                tenant=self.cloud_tenant,
            )
            return cloud_info.get("name")
        elif overlay_cloud_list:
            for cloud in overlay_cloud_list:
                cloud_info = self.session.get_object_by_name(
                    "cloud", cloud["name"], tenant=self.cloud_tenant
                )
                cloud_tier1_lrs = (
                    cloud_info.get("nsxt_configuration")
                    .get("data_network_config")
                    .get("tier1_segment_config")
                    .get("manual")
                    .get("tier1_lrs")
                )
                cloud_tier1_lrs.append(
                    {
                        "segment_id": f"/infra/segments/{seg_id}",
                        "tier1_lr_id": tier1
                        if "/infra/tier-1s" in tier1
                        else f"/infra/tier-1s/{tier1}",
                    }
                )
                cloud_info.get("nsxt_configuration").get("data_network_config").get(
                    "tier1_segment_config"
                ).get("manual").update({"tier1_lrs": cloud_tier1_lrs})
                response = self.session.put(
                    "cloud/{}".format(cloud_info.get("uuid")),
                    cloud_info,
                    tenant=self.cloud_tenant,
                )
                if response.status_code == 200:
                    return cloud_info.get("name")
                else:
                    continue

        return "Cloud Not Found"

    def cutover_vs(self, vedge_lb_config, edge, vs_list_filter, prefix, vs_tenant):
        nsxv_vs_not_found = list()
        alb_vs_not_found = list()

        try:
            nsxv_all_virtual_services = vedge_lb_config[edge]["virtualServer"]

            # Create nsxv VS list from input vs list
            nsxv_all_vs = dict()
            for nsxv_vs in nsxv_all_virtual_services:
                nsxv_all_vs[nsxv_vs["name"]] = nsxv_vs

            nsxv_vs_list = dict()
            for input_filter_vs in vs_list_filter:
                if input_filter_vs in nsxv_all_vs.keys():
                    nsxv_vs_list[input_filter_vs] = nsxv_all_vs[input_filter_vs]
                else:
                    nsxv_vs_not_found.append(input_filter_vs)

            # Get list of all ALB VS's
            alb_vs_list = dict()
            alb_all_vs_list = self.session.get("virtualservice/", tenant=vs_tenant).json()[
                "results"
            ]
            for vs in alb_all_vs_list:
                alb_vs_list[vs["name"]] = vs

            for vs_name in nsxv_vs_list:
                v_cutover_msg = f"Performing cutover for VS {vs_name} ..."
                print(v_cutover_msg)
                LOG.debug(v_cutover_msg)
                vs_config = self.get_virtual_server(edge, nsxv_vs_list[vs_name]["virtualServerId"])
                vs_config["enabled"] = False
                response = self.update_virtual_server(
                    edge, nsxv_vs_list[vs_name]["virtualServerId"], vs_config
                )
                if response.status_code == 200:
                    v_cutover_msg = f"Disconnected traffic for VS {vs_name} on NSX-V"
                    print(v_cutover_msg)
                    LOG.debug(v_cutover_msg)
                else:
                    msg = f"Error in disconnecting traffic on NSX-V for VS {vs_name}. Message: {str(response.text)}"
                    print("\033[91m" + msg + "\033[0m")
                    LOG.error(msg)
                    continue

                vs_name = f"{edge}-{vs_name}"
                vs_name_with_prefix = f"{prefix}-{vs_name}" if prefix else vs_name
                if vs_name_with_prefix in alb_vs_list.keys():
                    for alb_vs in alb_vs_list:
                        if alb_vs == vs_name_with_prefix:
                            vs_obj = alb_vs_list[alb_vs]
                            vs_obj["traffic_enabled"] = True
                            vs_obj["enabled"] = True
                            if "analytics_policy" in vs_obj:
                                vs_obj["analytics_policy"]["full_client_logs"][
                                    "enabled"
                                ] = True
                            else:
                                analytics_policy = {
                                    "full_client_logs": {
                                        "duration": 30,
                                        "enabled": True,
                                        "throttle": 10,
                                    }
                                }
                                vs_obj.update({"analytics_policy": analytics_policy})

                            alb_response = self.session.put("virtualservice/{}".format(vs_obj.get("uuid")),
                                                            vs_obj, tenant=vs_tenant)
                            if alb_response.status_code == 200:
                                enable_traffic_msg = f"Enabled traffic for VS {vs_name} on ALB"
                                print(enable_traffic_msg)
                                LOG.debug(enable_traffic_msg)

                                cutover_msg = f"Completed cutover for VS {vs_name}\n"
                                print(cutover_msg)
                                LOG.debug(cutover_msg)
                            else:
                                msg = f"Error in enabling traffic on ALB. Message: {str(alb_response.text)}"
                                print("\033[91m" + msg + "\033[0m")
                                LOG.error(msg)

                                print("\033[93m" + "Rollback traffic for VS {} on NSX-V started...".format(vs_name)
                                      + "\033[0m")
                                vs_config = self.get_virtual_server(edge, nsxv_vs_list[vs_name]["virtualServerId"])
                                vs_config["enabled"] = True
                                response = self.update_virtual_server(
                                    edge, nsxv_vs_list[vs_name]["virtualServerId"], vs_config
                                )
                                if response.status_code == 200:
                                    msg = "Traffic rollback for VS {} on NSX-V completed\n".format(vs_name)
                                    print("\033[93m" + msg + "\033[0m")
                                    LOG.debug(msg)
                                else:
                                    msg = "Failed to rollback traffic for VS {} on NSX-V\n".format(vs_name)
                                    print("\033[93m" + msg + "\033[0m")
                                    LOG.debug(msg)
                            break
                else:
                    alb_vs_not_found.append(vs_name_with_prefix)
        except Exception as e:
            print("\033[91m" + "Error while performing cutover. Message: ", str(e) + "\033[0m")

        return nsxv_vs_not_found, alb_vs_not_found

    def rollback_vs(self, vedge_lb_config, edge, vs_list_filter, prefix, vs_tenant):
        nsxv_vs_not_found = list()
        alb_vs_not_found = list()
        try:
            nsxv_all_virtual_services = vedge_lb_config[edge]["virtualServer"]

            # Create nsxv VS list from input vs list
            nsxv_all_vs = dict()
            for nsxv_vs in nsxv_all_virtual_services:
                nsxv_all_vs[nsxv_vs["name"]] = nsxv_vs

            nsxv_vs_list = dict()
            for input_filter_vs in vs_list_filter:
                if input_filter_vs in nsxv_all_vs.keys():
                    nsxv_vs_list[input_filter_vs] = nsxv_all_vs[input_filter_vs]
                else:
                    nsxv_vs_not_found.append(input_filter_vs)

            # Get list of all ALB VS's
            alb_vs_list = dict()
            alb_all_vs_list = self.session.get("virtualservice/", tenant=vs_tenant).json()["results"]
            for vs in alb_all_vs_list:
                alb_vs_list[vs["name"]] = vs

            # Perform roll back for vs filter list

            for vs_name in nsxv_vs_list:
                is_alb_disconnected = False
                vs_name_with_edge = f"{edge}-{vs_name}"
                vs_name_with_prefix = f"{prefix}-{vs_name_with_edge}" if prefix else vs_name
                vs_obj = None
                if vs_name_with_prefix in alb_vs_list.keys():
                    for alb_vs in alb_vs_list:
                        if alb_vs == vs_name_with_prefix:
                            rollback_msg = "Performing rollback for VS {} ...".format(vs_name)
                            print(rollback_msg)
                            LOG.debug(rollback_msg)

                            vs_obj = alb_vs_list[alb_vs]
                            vs_obj["traffic_enabled"] = True
                            vs_obj["enabled"] = False
                            if "analytics_policy" in vs_obj:
                                vs_obj["analytics_policy"]["full_client_logs"][
                                    "enabled"
                                ] = False
                            alb_response = self.session.put("virtualservice/{}".format(vs_obj.get("uuid")),
                                                            vs_obj, tenant=vs_tenant)
                            if alb_response.status_code == 200:
                                disconnect_traffic_msg = f"Disconnected traffic for VS {vs_name} on ALB"
                                print(disconnect_traffic_msg)
                                LOG.debug(disconnect_traffic_msg)
                                is_alb_disconnected = True
                            else:
                                error_msg = f"Error in disconnecting traffic on ALB. Message: {str(alb_response.text)}"
                                print("\033[91m" + error_msg + "\033[0m")
                                LOG.error(error_msg)
                            break

                    if is_alb_disconnected:
                        vs_config = self.get_virtual_server(edge, nsxv_vs_list[vs_name]["virtualServerId"])
                        vs_config["enabled"] = True
                        response = self.update_virtual_server(edge, nsxv_vs_list[vs_name]["virtualServerId"],
                                                              vs_config)

                        if response.status_code == 200:
                            enable_nsxv_traffic_msg = f"Enabled traffic for VS {vs_name} on NSX-V"
                            print(enable_nsxv_traffic_msg)
                            LOG.debug(enable_nsxv_traffic_msg)

                            rollback_msg = f"Completed rollback for VS {vs_name}\n"
                            print(rollback_msg)
                            LOG.debug(rollback_msg)
                        else:
                            error_msg = f"Error in enabling traffic on NSX-V for VS {vs_name}. " \
                                        f"Message: {str(response.text)}"
                            print("\033[91m" + error_msg + "\033[0m")
                            LOG.error(error_msg)

                            rollback_msg = "Rollback traffic for VS {} on ALB started...".format(vs_name)
                            print("\033[93m" + rollback_msg + "\033[0m")
                            LOG.debug(rollback_msg)

                            vs_obj = alb_vs_list[alb_vs]
                            vs_obj["traffic_enabled"] = True
                            vs_obj["enabled"] = False
                            if "analytics_policy" in vs_obj:
                                vs_obj["analytics_policy"]["full_client_logs"]["enabled"] = False
                            alb_response = self.session.put("virtualservice/{}".format(vs_obj.get("uuid")),
                                                            vs_obj, tenant=vs_tenant)
                            if alb_response.status_code == 200:
                                msg = "Traffic rollback for VS {} completed\n".format(vs_name)
                                print("\033[93m" + msg + "\033[0m")
                                LOG.warning(msg)
                            else:
                                disconnect_traffic_msg = f"Failed to rollback traffic for VS {vs_name} on ALB"
                                print("\033[91m" + disconnect_traffic_msg + "\033[0m")
                                LOG.error(disconnect_traffic_msg)
                else:
                    alb_vs_not_found.append(vs_name_with_prefix)
        except Exception as e:
            print("\033[91m" + "Error while performing rollback. Message: ", str(e) + "\033[0m")

        return nsxv_vs_not_found, alb_vs_not_found

    def get_filter_nsxv_list(self, nsxv_all_virtual_services, vs_list_filter):
        nsxv_vs_not_found = list()

        # Create nsxv VS list from input vs list
        nsxv_all_vs = dict()
        for nsxv_vs in nsxv_all_virtual_services:
            nsxv_all_vs[nsxv_vs["name"]] = nsxv_vs

        nsxv_vs_list = dict()
        for input_filter_vs in vs_list_filter:
            if input_filter_vs in nsxv_all_vs.keys():
                nsxv_vs_list[input_filter_vs] = nsxv_all_vs[input_filter_vs]
            else:
                nsxv_vs_not_found.append(input_filter_vs)

        return nsxv_vs_list, nsxv_vs_not_found

    def nsx_cleanup(self, vedge_lb_config, edge, vs_list_filter):
        vs_attached_pools = []
        vs_attached_profiles = []
        pool_attached_monitor = []
        nsxv_lb_config = vedge_lb_config[edge]

        nsxv_vs_list, nsxv_vs_not_found = self.get_filter_nsxv_list(
            vedge_lb_config[edge]["virtualServer"], vs_list_filter
        )

        if nsxv_lb_config.get("virtualServer", None):
            for vs_name in vs_list_filter:
                vs_list = list(
                    filter(
                        lambda vs: vs["name"] == vs_name,
                        nsxv_lb_config["virtualServer"],
                    )
                )
                if vs_list:
                    for vs in vs_list:
                        cleanup_msg = "Performing cleanup for VS {} ...".format(vs["name"])
                        print(cleanup_msg)
                        LOG.debug(cleanup_msg)

                        
                        if vs.get("defaultPoolId"):
                            vs_attached_pools.append(vs["defaultPoolId"])
                        
                        if vs.get("applicationProfileId"):
                            vs_attached_profiles.append(
                                vs["applicationProfileId"])

                        self.delete_nsxv_virtual_server(
                            edge, nsxv_vs_list[vs_name]["virtualServerId"]
                        )

                        cleanup_msg = "Deleted VS {} from NSX-V".format(vs["name"])
                        print(cleanup_msg)
                        LOG.debug(cleanup_msg)
                else:
                    LOG.warning(f"VS {vs_name} not found for deletion")

            nsxv_lb_config = self.get_nsxv_Edges()[edge]

            for app_profile_id in vs_attached_profiles:
                if nsxv_lb_config.get("applicationProfile", None):
                    vs_list = [
                        vs["virtualServerId"]
                        for vs in nsxv_lb_config["virtualServer"]
                        if (
                            vs.get("applicationProfileId")
                            and vs.get("applicationProfileId") == app_profile_id
                        )
                    ]
                    if vs_list:
                        msg = (
                            "No cleanup performed on application profile {} "
                            "as it is referenced by other virtual service/s on edge {}".format(
                                app_profile_id, edge
                            )
                        )
                        LOG.debug(msg)
                        print(msg)
                    else:
                        self.delete_nsxv_application_profile(edge, app_profile_id)

                        cleanup_msg = "Performed cleanup of referenced application profile"
                        LOG.debug(cleanup_msg)
                        print(cleanup_msg)

            for pool_id in vs_attached_pools:
                if nsxv_lb_config.get("pool", None):
                    pool_config = list(
                        filter(
                            lambda pr: pr["poolId"] == pool_id, nsxv_lb_config["pool"]
                        )
                    )
                    vs_list = [
                        vs["virtualServerId"]
                        for vs in nsxv_lb_config["virtualServer"]
                        if (
                            vs.get("defaultPoolId")
                            and vs.get("defaultPoolId") == pool_id
                        )
                    ]
                    if vs_list:
                        msg = "No cleanup performed on pool as it is referenced by other virtual service/s"
                        LOG.debug(msg)
                        print(msg)
                    else:
                        pool_attached_monitor.append(pool_config[0]["monitorId"][0])
                        self.delete_nsxv_pool(edge, pool_id)

                        cleanup_msg = "Performed cleanup of referenced pool"
                        LOG.debug(cleanup_msg)
                        print(cleanup_msg)

            nsxv_lb_config = self.get_nsxv_Edges()[edge]

            for monitor_id in pool_attached_monitor:
                if nsxv_lb_config.get("monitor", None):
                    pool_list = []
                    for pool in nsxv_lb_config["pool"]:
                        pool_monitor_id = pool.get("monitorId", None)
                        if pool_monitor_id[0] == monitor_id:
                            pool_list.append(pool["poolId"])

                    if pool_list:
                        msg = (
                            "No cleanup performed on monitor {} as it is referenced by "
                            "other pool/s in edge {}".format(monitor_id, edge)
                        )
                        LOG.debug(msg)
                        print(msg)
                    else:
                        self.delete_nsxv_monitor(edge, monitor_id)

                        cleanup_msg = "Performed cleanup of referenced monitor"
                        LOG.debug(cleanup_msg)
                        print(cleanup_msg)

        return nsxv_vs_not_found

    def get_controller_license_type(self):
        """
        Returns AVI controller license type.
        """
        LOG.debug(" Inside executing get_controller_license_type")
        response = self.session.get("systemconfiguration")
        config = json.loads(response.text)
        LOG.info(f"ALB Plugin : Licence Config : {config}")
        licence_type = None
        if "default_license_tier" in config:
            licence_type = config["default_license_tier"]
        LOG.info(f"ALB Plugin : Licence Type : {licence_type}")
        LOG.debug("__DONE__Executing get_controller_license_type is completed")
        return licence_type
