# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import ipaddress
import os
from datetime import datetime
import random

import copy
import xlsxwriter
import logging

from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util
import pprint
from avi.sdk.avi_api import ApiSession

pp = pprint.PrettyPrinter(indent=4)
vs_details = {}
controller_details = {}

LOG = logging.getLogger(__name__)


def is_segment_configured_with_subnet(vs_id, cloud_name, cloud_tenant):
    vs_config = vs_details[vs_id]
    network_type = vs_config["Network"]
    if network_type == "Vlan":
        segment_list = vs_config.get("Segments")
        if segment_list:
            for vs_segment in segment_list:
                seg_id = vs_segment["name"]
                session = ApiSession.get_session(controller_details.get("ip"), controller_details.get("username"),
                                                 controller_details.get("password"), tenant="admin",
                                                 api_version=controller_details.get("version"))
                cloud = session.get("cloud/", tenant=cloud_tenant).json()["results"]
                cloud_id = [cl.get("uuid") for cl in cloud if cl.get("name") == cloud_name]
                segment_list = session.get("network/?&cloud_ref.uuid=" + cloud_id[0]).json()["results"]
                segment = [seg for seg in segment_list if seg.get("name") == seg_id]
                if segment and segment[0].get("configured_subnets"):
                    if segment[0].get("configured_subnets")[0].get("prefix"):
                        if segment[0].get("configured_subnets")[0].get("static_ip_ranges"):
                            return True, segment[0], network_type, "Both are configured"
                        else:
                            return False, segment[0], network_type, "static ip pool is not configured"
                    else:
                        return False, segment[0], network_type, "ip subnet is not configured"
    return False, None, network_type, "overlay"


def is_vlan_configured_with_bgp(cloud_name, tenant, vlan_segment, cloud_tenant):
    session = ApiSession.get_session(controller_details.get("ip"), controller_details.get("username"),
                                     controller_details.get("password"), tenant="admin",
                                     api_version=controller_details.get("version"))
    cloud = session.get("cloud/", tenant=cloud_tenant).json()["results"]
    cloud_id = [cl.get("uuid") for cl in cloud if cl.get("name") == cloud_name]
    """
    Check if VLAN network is configured as a BGP peer
    https://<controller-ip>/api/vrfcontext/?exclude=name.in&name.in=management&cloud_ref.uuid=<uuid>
    """
    network_info = session. \
        get_object_by_name('vrfcontext', 'global',
                           params={"exclude": "name.in",
                                   "name.in": "management",
                                   "cloud_ref.uuid": cloud_id[0]})
    # LOG.info("ALB Plugin : vlan_configured_with_bgp : {}".format(network_info))
    if network_info:
        if network_info.get("bgp_profile"):
            if network_info["bgp_profile"].get("peers"):
                bgp_peers = network_info["bgp_profile"].get("peers")
                is_vlan_bgp_peer = [peer for peer in bgp_peers if peer.get("network_ref") == vlan_segment.get("url")]
                if is_vlan_bgp_peer:
                    return True
    return False


def get_name_and_entity(url):
    """
    Parses reference string to extract object type and
    :param url: reference url to be parsed
    :return: entity and object name
    """
    if url:
        parsed = url.split('/')
        return parsed[-2], parsed[-1]

    return '', ''


def get_vs_cloud_name(vs_id):
    if vs_details.get(vs_id):
        return vs_details[vs_id]["Cloud"]
    return None

def get_vs_cloud_type(vs_id):
    if vs_details.get(vs_id):
        return vs_details[vs_id]["Network"]
    return None

def get_lb_service_name(vs_id):
    if vs_details.get(vs_id):
        return vs_details[vs_id]["lb_name"]
    return None


def get_lb_skip_reason(vs_id):
    if vs_details.get(vs_id):
        return vs_details.get(vs_id).get("lb_skip_reason")
    return None


def get_vs_details(vs_id):
    if vs_details.get(vs_id):
        return vs_details.get(vs_id)
    return None


def get_object_segments(vs_id, obj_ip):
    vs = vs_details.get(vs_id, None)
    if not vs:
        return None
    segments = []
    if vs.get("Segments"):
        seg_list = vs.get("Segments")
        for seg in seg_list:
            seg_name = seg["name"]
            for subnet in seg["subnet"]:
                if subnet.get("network_range"):
                    network_range = subnet["network_range"]
                a_network = ipaddress.ip_network(network_range, False)
                address_in_network = ipaddress.ip_address(obj_ip) in a_network
                if address_in_network:
                    return [dict(
                        seg_name=seg_name,
                        subnets=subnet)]
    return None


def get_certificate_data(certificate_ref, nsxt_ip, ssh_root_password):
    import paramiko
    import json

    ssh = paramiko.SSHClient()
    ssh.load_system_host_keys()
    ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    ssh.connect(nsxt_ip, username='root', password=ssh_root_password, allow_agent=False, look_for_keys=False)

    data = None
    cmd = "curl --header 'Content-Type: application/json' --header 'x-nsx-username: admin' " \
          "http://'admin':'{}'@127.0.0.1:7440/nsxapi/api/v1/trust-management/certificates".\
        format(ssh_root_password)
    stdin, stdout, stderr = ssh.exec_command(cmd)

    output_dict = ''
    for line in stdout.read().splitlines():
        output_dict += line.decode()

    output_dict = json.loads(output_dict)

    LOG.info("output_dict for certificate_ref {}".format(certificate_ref))
    for cert_data in output_dict['results']:
        if 'tags' in cert_data.keys():
            cert_id = cert_data['tags'][0]['tag'].split('/')[-1]
        else:
            cert_id = cert_data['id']

        if cert_id == certificate_ref:
            cert_command = cmd + "/" + cert_data['id'] + '/' + "?action=get_private"
            cert_stdin, cert_stdout, cert_stderr = ssh.exec_command(cert_command)
            cert_dict = ''
            for line in cert_stdout.read().splitlines():
                cert_dict += line.decode()

            cert_dict = json.loads(cert_dict)
            LOG.debug("cert_dict for certificate_ref {}".format(certificate_ref))
            if 'private_key' in cert_dict:
                return cert_dict['private_key'], cert_dict['pem_encoded']

    ssh.close()
    stdin.close()
    return data


class NSXUtil():
    nsx_api_client = None
    nsxt_ip = None
    nsxt_pw = None
    nsxt_un = None
    cloud_tenant = None

    def __init__(self, nsx_un, nsx_pw, nsx_ip, nsx_port, c_ip=None, c_un=None, c_pw=None, c_vr=None,
                 cloud_tenant='admin'):
        self.nsx_api_client = nsx_client_util.create_nsx_policy_api_client(
            nsx_un, nsx_pw, nsx_ip, nsx_port, auth_type=nsx_client_util.BASIC_AUTH)
        if c_ip and c_un and c_pw and c_vr:
            self.session = ApiSession.get_session(c_ip, c_un, c_pw, tenant="admin", api_version=c_vr)
            controller_details["ip"] = c_ip
            controller_details["password"] = c_pw
            controller_details["username"] = c_un
            controller_details["version"] = c_vr
            controller_details["session"] = self.session

            self.nsxt_ip = nsx_ip
            self.nsxt_pw = nsx_pw
            self.nsxt_un = nsx_un
            self.cloud_tenant = cloud_tenant

            self.cloud = self.session.get("cloud/", tenant=self.cloud_tenant).json()["results"]
            self.avi_vs_object = []
            self.avi_object_temp = {}
            self.avi_pool_object = []
            self.enabled_pool_list = []
            self.lb_services = {}

    def get_nsx_config(self):
        nsx_lb_config = dict()
        nsx_lb_config["LBServices"] = self.nsx_api_client.infra.LbServices.list().to_dict().get("results", [])
        nsx_lb_config["LbMonitorProfiles"] = self.nsx_api_client.infra.LbMonitorProfiles.list().to_dict().get("results",
                                                                                                              [])
        nsx_lb_config["LbPools"] = self.nsx_api_client.infra.LbPools.list().to_dict().get("results", [])
        nsx_lb_config["LbAppProfiles"] = self.nsx_api_client.infra.LbAppProfiles.list().to_dict().get("results", [])
        nsx_lb_config["LbClientSslProfiles"] = self.nsx_api_client.infra.LbClientSslProfiles.list().to_dict()["results"]
        nsx_lb_config["LbServerSslProfiles"] = self.nsx_api_client.infra.LbServerSslProfiles.list().to_dict()["results"]
        nsx_lb_config["LbPersistenceProfiles"] = self.nsx_api_client.infra.LbPersistenceProfiles.list().to_dict()[
            "results"]
        nsx_lb_config['LbVirtualServers'] = self.nsx_api_client.infra.LbVirtualServers.list().to_dict().get('results',
                                                                                                            [])
        return nsx_lb_config

    def nsx_cleanup(self):
        nsx_lb_config = self.get_nsx_config()
        if nsx_lb_config.get("LbVirtualServers", None):
            for vs in nsx_lb_config["LbVirtualServers"]:
                if not vs["_system_owned"]:
                    self.nsx_api_client.infra.LbVirtualServers.delete(vs["id"])

        if nsx_lb_config.get("LbPersistenceProfiles", None):
            for persis in nsx_lb_config["LbPersistenceProfiles"]:
                if not persis["_system_owned"]:
                    self.nsx_api_client.infra.LbPersistenceProfiles.delete(persis["id"])
        if nsx_lb_config.get("LbServerSslProfiles", None):
            for server_ssl in nsx_lb_config["LbServerSslProfiles"]:
                if not server_ssl["_system_owned"]:
                    self.nsx_api_client.infra.LbServerSslProfiles.delete(server_ssl["id"])
        if nsx_lb_config.get("LbClientSslProfiles", None):
            for client_ssl in nsx_lb_config["LbClientSslProfiles"]:
                if not client_ssl["_system_owned"]:
                    self.nsx_api_client.infra.LbClientSslProfiles.delete(client_ssl["id"])
        if nsx_lb_config.get("LbAppProfiles", None):
            for app in nsx_lb_config["LbAppProfiles"]:
                if not app["_system_owned"]:
                    self.nsx_api_client.infra.LbAppProfiles.delete(app["id"])

        if nsx_lb_config.get("LbPools", None):
            for pool in nsx_lb_config["LbPools"]:
                if not pool["_system_owned"]:
                    self.nsx_api_client.infra.LbPools.delete(pool["id"])

        if nsx_lb_config.get("LbMonitorProfiles", None):
            for monitor in nsx_lb_config["LbMonitorProfiles"]:
                if not monitor["_system_owned"]:
                    self.nsx_api_client.infra.LbMonitorProfiles.delete(monitor["id"])

    def cutover_vs(self, vs_list, prefix, vs_tenant):
        vs_not_found = list()
        nsxt_all_virtual_services = self.get_all_virtual_service()

        # Create nsxt VS list from input vs list
        nsxt_vs_list = dict()
        for input_vs in vs_list:
            vs_found = False
            for nsxt_vs in nsxt_all_virtual_services:
                if nsxt_vs["display_name"] == input_vs:
                    nsxt_vs_list[nsxt_vs["display_name"]] = nsxt_vs
                    vs_found = True
                    break
            if not vs_found:
                vs_not_found.append(input_vs)

        # Get list of all ALB VS's
        alb_vs_list = dict()
        alb_all_vs_list = self.session.get("virtualservice/", tenant=vs_tenant).json()["results"]
        for vs in alb_all_vs_list:
            alb_vs_list[vs["name"]] = vs

        for nsxt_vs_name in nsxt_vs_list:
            vs_body = self.nsx_api_client.infra.LbVirtualServers.get(nsxt_vs_list[nsxt_vs_name]["id"])
            if not vs_body.system_owned:
                cutover_msg = "Performing cutover for VS {} ...".format(nsxt_vs_name)
                LOG.debug(cutover_msg)
                print(cutover_msg)
                vs_body.lb_service_path = None
                vs_body.enabled = False
                self.nsx_api_client.infra.LbVirtualServers.update(nsxt_vs_list[nsxt_vs_name]["id"], vs_body)
                print("Disconnected traffic for VS {} on NSX-T".format(nsxt_vs_name))

                for alb_vs in alb_vs_list:
                    vs_name_with_prefix = "{}-{}".format(prefix, nsxt_vs_name) if prefix else nsxt_vs_name
                    if alb_vs == vs_name_with_prefix:
                        vs_obj = alb_vs_list[alb_vs]
                        vs_obj["traffic_enabled"] = True
                        vs_obj["enabled"] = True
                        if "analytics_policy" in vs_obj:
                            vs_obj["analytics_policy"]["full_client_logs"]["enabled"] = True
                        else:
                            analytics_policy = {
                                "full_client_logs": {
                                    "duration": 30,
                                    "enabled": True,
                                    "throttle": 10
                                }
                            }
                            vs_obj.update({"analytics_policy": analytics_policy})
                        self.session.put("virtualservice/{}".format(vs_obj.get("uuid")), vs_obj, tenant=vs_tenant)
                        print("Enabled traffic for VS {} on ALB".format(nsxt_vs_name))
                        print("Completed cutover for VS {}\n".format(nsxt_vs_name))
                        break

        return vs_not_found

    def rollback_vs(self, vs_list, input_data, prefix, vs_tenant):
        vs_not_found = list()
        nsxt_all_virtual_services = self.get_all_virtual_service()

        # Create nsxt VS list from input vs list
        nsxt_vs_list = dict()
        for input_vs in vs_list:
            vs_found = False
            for nsxt_vs in nsxt_all_virtual_services:
                if nsxt_vs["display_name"] == input_vs:
                    nsxt_vs_list[nsxt_vs["display_name"]] = nsxt_vs
                    vs_found = True
                    break
            if not vs_found:
                vs_not_found.append(input_vs)

        # Get list of all ALB VS's
        alb_vs_list = dict()
        alb_all_vs_list = self.session.get("virtualservice/", tenant=vs_tenant).json()["results"]
        for vs in alb_all_vs_list:
            alb_vs_list[vs["name"]] = vs

        # Retrieve old LB service path data from input json
        vs_lb_mapping_list = dict()
        old_nsxt_vs_list = input_data['LbVirtualServers']
        vs_with_no_lb = list()
        for vs in old_nsxt_vs_list:
            if vs.get('lb_service_path'):
                vs_lb_mapping_list['{}_{}'.format(vs["id"], vs["display_name"])] \
                    = vs['lb_service_path']
            else:
                if vs.get("display_name") in input_vs:
                    vs_with_no_lb.append(vs["display_name"])

        # Perform roll back for vs filter list
        for nsxt_vs_name in nsxt_vs_list:
            vs_body = self.nsx_api_client.infra.LbVirtualServers.get(nsxt_vs_list[nsxt_vs_name]["id"])
            if not vs_body.system_owned:
                cutover_msg = "Performing rollback for VS {} ...".format(nsxt_vs_name)
                LOG.debug(cutover_msg)
                print(cutover_msg)

                for alb_vs in alb_vs_list:
                    vs_name_with_prefix = "{}-{}".format(prefix, nsxt_vs_name) if prefix else nsxt_vs_name
                    if alb_vs == vs_name_with_prefix:
                        vs_obj = alb_vs_list[alb_vs]
                        vs_obj["traffic_enabled"] = False
                        vs_obj["enabled"] = False
                        if "analytics_policy" in vs_obj:
                            vs_obj["analytics_policy"]["full_client_logs"]["enabled"] = False
                        self.session.put("virtualservice/{}".format(vs_obj.get("uuid")), vs_obj, tenant=vs_tenant)
                        print("Disconnected traffic for VS {} on ALB".format(nsxt_vs_name))
                        break

                lb_service_path = vs_lb_mapping_list.get("{}_{}".format(nsxt_vs_list[nsxt_vs_name]["id"],
                                                                        nsxt_vs_name))
                vs_body.lb_service_path = lb_service_path
                vs_body.enabled = True
                self.nsx_api_client.infra.LbVirtualServers.update(nsxt_vs_list[nsxt_vs_name]["id"],
                                                                  vs_body)
                print("Enabled traffic for VS {} on NSX-T".format(nsxt_vs_name))
                print("Completed rollback for VS {}\n".format(nsxt_vs_name))

        return vs_not_found, vs_with_no_lb

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
                        tz = cl["nsxt_configuration"]["data_network_config"].get("transport_zone")
                        if cl["nsxt_configuration"]["data_network_config"].get("tz_type") == "OVERLAY":
                            tz_type = "OVERLAY"
                            data_netwrk = cl["nsxt_configuration"]["data_network_config"]
                            if data_netwrk.get("tier1_segment_config"):
                                if data_netwrk["tier1_segment_config"].get("manual"):
                                    tier1_lrs = data_netwrk["tier1_segment_config"]["manual"].get("tier1_lrs")
                                    if tier1_lrs:
                                        is_seg_present = [True for tier in tier1_lrs if
                                                          get_name_and_entity(tier.get("segment_id"))[-1] == seg_id]
                        elif cl["nsxt_configuration"]["data_network_config"].get("tz_type") == "VLAN":
                            tz_type = "VLAN"
                            data_netwrk = cl["nsxt_configuration"]["data_network_config"]
                            vlan_seg = data_netwrk.get("vlan_segments")
                            is_seg_present = [True for seg in vlan_seg if get_name_and_entity(seg)[-1] == seg_id]
                    if tz.find("/") != -1:
                        tz = tz.split("/")[-1]
                    if tz == tz_id and is_seg_present:
                        return cl.get("name")
                    elif tz == tz_id and not is_seg_present:
                        if cl["nsxt_configuration"]["data_network_config"].get("tz_type") == "VLAN":
                            vlan_cloud_list.append(cl)
                            continue
                        elif cl["nsxt_configuration"]["data_network_config"].get("tz_type") == "OVERLAY":
                            overlay_cloud_list.append(cl)
                            continue

        if vlan_cloud_list:
            cloud_info = self.session.get_object_by_name("cloud", vlan_cloud_list[0]['name'], tenant=self.cloud_tenant)
            cloud_vlan_segments = cloud_info.get("nsxt_configuration").get("data_network_config").get("vlan_segments")
            cloud_vlan_segments.append("/infra/segments/{}".format(seg_id))
            cloud_info.get("nsxt_configuration").get("data_network_config").update({
                "vlan_segments": cloud_vlan_segments
            })
            self.session.put("cloud/{}".format(cloud_info.get("uuid")), cloud_info, tenant=self.cloud_tenant)
            return cloud_info.get("name")
        elif overlay_cloud_list:
            for cloud in overlay_cloud_list:
                cloud_info = self.session.get_object_by_name("cloud", cloud['name'], tenant=self.cloud_tenant)
                cloud_tier1_lrs = cloud_info.get("nsxt_configuration").get("data_network_config").\
                    get("tier1_segment_config").get("manual").get("tier1_lrs")
                cloud_tier1_lrs.append({
                    "segment_id": "/infra/segments/{}".format(seg_id),
                    "tier1_lr_id": tier1 if '/infra/tier-1s' in tier1 else "/infra/tier-1s/{}".format(tier1)
                })
                cloud_info.get("nsxt_configuration").get("data_network_config").get("tier1_segment_config").get("manual").update({
                    "tier1_lrs": cloud_tier1_lrs
                })
                response = self.session.put("cloud/{}".format(cloud_info.get("uuid")), cloud_info,
                                            tenant=self.cloud_tenant)
                if response.status_code == 200:
                    return cloud_info.get("name")
                else:
                    continue

        return "Cloud Not Found"

    def get_lb_services_details(self):
        lb_services = self.nsx_api_client.infra.LbServices.list().to_dict().get('results', [])
        for lb in lb_services:
            self.cloud = self.session.get("cloud/", tenant=self.cloud_tenant).json()["results"]
            if not lb.get("connectivity_path"):
                continue
            tier = get_name_and_entity(lb["connectivity_path"])[-1]
            ls_id = self.nsx_api_client.infra.tier_1s.LocaleServices.list(tier).results[0].id
            interface_list = self.nsx_api_client.infra.tier_1s.locale_services.Interfaces.list(tier, ls_id).results
            network = None
            tz_id = None
            cloud_name = None
            lb_details = []
            lb_tier1_lr = None
            if len(interface_list):
                interface = interface_list[0].id
                segment_id = get_name_and_entity(interface_list[0].segment_path)[-1]
                segment = self.nsx_api_client.infra.Segments.get(segment_id)
                if hasattr(segment, "vlan_ids") and segment.vlan_ids:
                    network = "Vlan"
                else:
                    network = "Overlay"

                if network == "Overlay" and len(interface_list) > 0:
                    lb_tier1_lr = segment.connectivity_path

                tz_path = segment.transport_zone_path
                tz_id = get_name_and_entity(tz_path)[-1]
                cloud_name = self.get_cloud_type(self.cloud, tz_id, segment_id, lb_tier1_lr if lb_tier1_lr else tier)

                for intrf in interface_list:
                    segment_id = get_name_and_entity(intrf.segment_path)[-1]
                    subnets = []
                    for subnet in intrf.subnets:
                        subnets.append({
                            "network_range": (str(subnet.ip_addresses[0]) + "/" + str(subnet.prefix_len))
                        })
                    segments = {
                        "name": segment_id,
                        "subnet": subnets}
                    lb_details.append(segments)

            else:
                segment_list = self.nsx_api_client.infra.Segments.list().to_dict().get('results', [])
                for seg in segment_list:
                    if seg.get("connectivity_path"):
                        gateway_name = get_name_and_entity(seg["connectivity_path"])[-1]
                        if gateway_name == tier:
                            tz_path = seg.get("transport_zone_path")
                            tz_id = get_name_and_entity(tz_path)[-1]
                            dhcp_present = False
                            for subnet in seg["subnets"]:
                                if "dhcp_config" in subnet.keys() and not dhcp_present:
                                    dhcp_present = True
                            if dhcp_present:
                                cloud_name = self.get_cloud_type(self.cloud, tz_id, seg.get("id"), tier)
                                if seg.get("vlan_ids"):
                                    network = "Vlan"
                                else:
                                    network = "Overlay"
                                if seg.get("subnets"):
                                    subnets = []
                                    for subnet in seg["subnets"]:
                                        subnets.append({
                                            "network_range": subnet["network"]
                                        })
                                    segments = {
                                        "name": seg.get("id"),
                                        "subnet": subnets}
                                    lb_details.append(segments)
                                if cloud_name == "Cloud Not Found":
                                    continue
                                break

                if not (network and cloud_name):
                    self.lb_services[lb["id"]] = {
                        "lb_name": lb["id"],
                        "lb_skip_reason": "Skipping because NSX Load Balancer has no segments "
                                          "or service interfaces configured"
                    }
                    continue

            self.lb_services[lb["id"]] = {
                "lb_name": lb["id"],
                "Network": network,
                "Cloud": cloud_name,
                "lb_tier1_lr": lb_tier1_lr
                }
            if lb_details:
                self.lb_services[lb["id"]]["Segments"] = lb_details

    def get_all_virtual_service(self):
        """
        :return:list of virtual server objects
        """
        virtual_services = self.nsx_api_client.infra.LbVirtualServers.list().to_dict().get('results', [])
        return virtual_services

    def get_all_pool(self):
        """
        returns the list of all pools
        """
        pool = self.nsx_api_client.infra.LbPools.list().to_dict().get("results", [])
        return pool

    def get_inventory(self):
        self.get_lb_services_details()
        # lb_vs_config = lb_vs_config["LbVirtualServers"]
        virtual_service = self.get_all_virtual_service()
        vs_stats = dict()
        vs_with_rules = 0
        normal_vs = 0
        enab_vs = 0
        disab_vs = 0
        vs_stats["vs_count"] = len(virtual_service)
        for vs in virtual_service:
            vs_object = {
                'name': vs["display_name"],
                'id': vs["id"]
            }
            if vs.get("lb_service_path"):
                lb = get_name_and_entity(vs["lb_service_path"])[-1]
                lb_details = self.lb_services.get(lb)
                if lb_details:
                    vs_object["Network"] = lb_details.get("Network")
                    vs_object["Cloud"] = lb_details.get("Cloud")
                    vs_object['Segments'] = lb_details.get('Segments')
                    vs_object["Cloud_type"] = lb_details.get("Cloud_type")
                    vs_object['lb_name'] = lb
                    vs_object['lb_skip_reason'] = lb_details.get("lb_skip_reason")
                    vs_object['lb_tier1_lr'] = lb_details.get("lb_tier1_lr")
                    # lb_details["vs_name"] = vs["display_name"]
                    vs_details[vs["id"]] = vs_object
            if vs["enabled"]:
                vs_object["enabled"] = True
            else:
                vs_object["enabled"] = False
            if vs.get('pool_path'):
                pool = vs.get("pool_path")
                pool_partition, pool_id = get_name_and_entity(pool)
                if pool_id:
                    vs_object['pool'] = {
                        'name': pool_id
                    }
                    self.enabled_pool_list.append(pool_id)
                    pool_obj = self.nsx_api_client.infra.LbPools.get(pool_id)
                    vs_object["pool"]["pool_id"] = pool_obj.id
                    if pool_obj.active_monitor_paths:
                        health_monitors = [
                            get_name_and_entity(monitors)[1]
                            for monitors in pool_obj.active_monitor_paths
                            if monitors
                        ]
                        if health_monitors:
                            vs_object['pool']['health_monitors'] = \
                                health_monitors
                    if pool_obj.members:
                        members = [
                            {
                                'name': pool_member.display_name,
                                'address': pool_member.ip_address,
                                'state': pool_member.admin_state
                            }
                            for pool_member in
                            pool_obj.members if pool_member
                        ]
                        if members:
                            vs_object['pool']['members'] = members
                    if vs_object["enabled"]:
                        vs_object['pool']["vs_enabled"] = vs_object["enabled"]
            if vs.get("application_profile_path"):
                profile_id = get_name_and_entity(vs["application_profile_path"])[1]
                vs_object["profiles"] = profile_id
                prof_obj_list = self.nsx_api_client.infra.LbAppProfiles.list().to_dict().get("results", [])
                prof_obj = [prof for prof in prof_obj_list if prof["id"] == profile_id]
                prof_type = prof_obj[0].get("resource_type")
                if prof_type == "LBHttpProfile":
                    vs_type = "L7"
                else:
                    vs_type = "L4"
                vs_object["vs_type"] = vs_type

            if vs.get('rules'):
                vs_object["rules"] = True
                vs_with_rules += 1
            else:
                vs_object["rules"] = False
                normal_vs += 1
            if vs.get("enabled"):
                enab_vs += 1
            else:
                disab_vs += 1
            self.avi_object_temp[vs_object['id']] = vs_object
        self.avi_vs_object.append(self.avi_object_temp)
        vs_stats["complex_vs"] = vs_with_rules
        vs_stats["normal_vs"] = normal_vs
        vs_stats["enabled_vs"] = enab_vs
        vs_stats["disabled_vs"] = disab_vs

    def get_pool_details(self):
        temp_pool_list = {}
        pool_list = self.get_all_pool()
        for pool in pool_list:
            pool_obj = {
                'name': pool["display_name"],
                'id': pool["id"]
            }
            if pool["display_name"] in self.enabled_pool_list:
                pool_obj["enabled"] = "connected"
            else:
                pool_obj["disabled"] = "disconnected"
            temp_pool_list[pool_obj["name"]] = pool_obj
        self.avi_pool_object.append(temp_pool_list)

    def write_output(self, path, nsx_ip):
        # Print the Summary
        workbook = xlsxwriter.Workbook(
            path + os.sep + '{}_discovery_data.xlsx'.format(nsx_ip))

        bold = workbook.add_format({'bold': True})
        deactivated = workbook.add_format({'font_color': 'red'})
        enabled = workbook.add_format({'font_color': 'green'})

        large_heading = workbook.add_format({'bold': True, 'font_size': '20'})
        large_heading.set_align('center')

        worksheet_summary = workbook.add_worksheet('Summary')
        worksheet_summary.merge_range(3, 4, 3, 7, 'Summary', large_heading)
        worksheet_summary.set_row(3, 40)
        worksheet_summary.set_column(5, 6, width=24)

        worksheet_summary.write(5, 5, "Ip Address", bold)
        worksheet_summary.write(5, 6, str(nsx_ip))

        worksheet_summary.write(6, 5, "Created on", bold)
        worksheet_summary.write(6, 6, str(datetime.now()).split('.')[0])

        total_vs = total_pools = total_enabled_vs = total_enabled_pools = total_complex_vs = 0
        total_disabled_pools = 0
        total_disabled_vs = 0
        total_vs_in_vlan = 0
        total_vs_in_overlay = 0
        total_l4_vs = 0
        total_l7_vs = 0

        obj_data = self.avi_vs_object[0]
        total_input = self.avi_vs_object
        pool_obj_data = self.avi_pool_object[0]
        pool_list = []
        vs_list = []

        for vs_id in obj_data.keys():
            total_vs = total_vs + 1
            vsval = obj_data[vs_id]
            if vsval.get("rules"):
                total_complex_vs += 1
            if vsval.get("vs_type") == "L4":
                total_l4_vs += 1
            else:
                total_l7_vs += 1
            if vsval.get('pool'):
                if vsval['pool'].get('members'):
                    pool_details = vsval['pool']['members'][0]
                    pool_list.append({
                        'name': vsval["pool"]['name'],
                        'status': pool_details.get('state'),
                        'vs_enabled': vsval["enabled"],
                        "id": vsval["pool"]["pool_id"]
                    })
                else:
                    pool_list.append({
                        'name': vsval["pool"]['name'],
                        'status': vsval["enabled"],
                        'vs_enabled': vsval["enabled"],
                        "id": vsval["pool"]["pool_id"]
                    })

        worksheet = workbook.add_worksheet('VS')
        worksheet_pool = workbook.add_worksheet('Pools')

        # writing pools
        row = 0
        col = 1
        worksheet_pool.write('A1', 'Name', bold)
        worksheet_pool.write('B1', "Enabled", bold)
        worksheet_pool.write('C1', 'Status', bold)
        for pool in pool_obj_data:
            total_pools += 1
            pool_val = pool_obj_data[pool]
            row = row + 1
            worksheet_pool.write(row, 0, pool_val['name'], bold)
            if pool_val.get("enabled"):
                worksheet_pool.write(row, 1, pool_val['enabled'], enabled)
            elif pool_val.get("disabled"):
                worksheet_pool.write(row, 1, pool_val['disabled'], deactivated)
            pool_status = self.nsx_api_client.infra.realized_state.RealizedEntities. \
                list(intent_path="/infra/lb-pools/" + pool_val["id"]).to_dict()["results"][0]["runtime_status"]
            if pool_status == "UP":
                worksheet_pool.write(row, 2, pool_status, enabled)
            else:
                worksheet_pool.write(row, 2, pool_status, deactivated)
            if pool_status == "UP" and pool_val.get("enabled"):
                total_enabled_pools += 1
            else:
                total_disabled_pools += 1
            col += 1

        row, col = 0, 1

        # write vs details
        worksheet.write('A1', 'Name', bold)
        worksheet.write('B1', 'Enabled', bold)
        worksheet.write('C1', "Type", bold)
        worksheet.write('D1', "Complexity", bold)
        worksheet.write('E1', 'Status', bold)
        worksheet.write("F1", "Network", bold)
        worksheet.write("G1", "Cloud", bold)
        init = 0
        for vs_id in obj_data.keys():
            row += 1
            vsval = obj_data[vs_id]
            vs_id = vsval["id"]
            vs_name = vsval["name"]
            worksheet.write(row, 0, vs_name, bold)
            status = vsval["enabled"]
            v = "N"
            if status:
                v = "Y"
                worksheet.write(row, 1, v, enabled)
            else:
                worksheet.write(row, 1, v, deactivated)
            worksheet.write(row, 2, vsval["vs_type"])
            complexity = "Basic"
            if vsval.get("rules"):
                complexity = "Advanced"
            worksheet.write(row, 3, complexity)
            vs_status = self.nsx_api_client.infra.realized_state.RealizedEntities. \
                list(intent_path="/infra/lb-virtual-servers/" + vs_id).to_dict()["results"][0]["runtime_status"]
            if vs_status == "UP":
                worksheet.write(row, 4, vs_status, enabled)
            elif vs_status == "DISABLED":
                worksheet.write(row, 4, "DEACTIVATED", deactivated)
            else:
                worksheet.write(row, 4, vs_status, deactivated)
            if vs_status == "UP" and v == "Y":
                total_enabled_vs += 1
            else:
                total_disabled_vs += 1
            network = vsval.get("Network")
            worksheet.write(row, 5, network)
            if network == "Vlan":
                total_vs_in_vlan += 1
            if network == "Overlay":
                total_vs_in_overlay += 1
            cloud = vsval.get("Cloud")
            worksheet.write(row, 6, cloud)

        # adding some more summary
        worksheet_summary.write(9, 5, "Total Virtual Service", bold)
        worksheet_summary.write(9, 6, str(total_vs))

        worksheet_summary.write(10, 5, "Total Virtual Service UP", bold)
        worksheet_summary.write(10, 6, str(total_enabled_vs))

        worksheet_summary.write(11, 5, "Total Pools", bold)
        worksheet_summary.write(11, 6, str(total_pools))

        worksheet_summary.write(12, 5, "Total Pools UP", bold)
        worksheet_summary.write(12, 6, str(total_enabled_pools))

        worksheet_summary.write(13, 5, "Total Complex Virtual Service", bold)
        worksheet_summary.write(13, 6, str(total_complex_vs))

        worksheet_summary.write(14, 5, "Total L4 Virtual Service", bold)
        worksheet_summary.write(14, 6, str(total_l4_vs))

        worksheet_summary.write(15, 5, "Total L7 Virtual Service", bold)
        worksheet_summary.write(15, 6, str(total_l7_vs))

        worksheet_summary.write(16, 5, "Total Virtual Service in VLAN", bold)
        worksheet_summary.write(16, 6, str(total_vs_in_vlan))

        worksheet_summary.write(17, 5, "Total Virtual Service in OVERLAY", bold)
        worksheet_summary.write(17, 6, str(total_vs_in_overlay))

        print("=====================================")
        print(" Summary")
        print("=====================================")
        print("Total Virtual Service: ", total_vs)
        print("Total Virtual Service UP: ", total_enabled_vs)
        print("Total Pools: ", total_pools)
        print("Total Pools UP: ", total_enabled_pools)
        print("Total Complex Virtual Service: ", total_complex_vs)
        print("Total L4 Virtual Service: ", total_l4_vs)
        print("Total L7 Virtual Service: ", total_l7_vs)
        print("Total Virtual Service in VLAN", total_vs_in_vlan)
        print("Total Virtual Service in OVERLAY", total_vs_in_overlay)

        print("-------------------------------------")

        workbook.close()

    def upload_alb_config(self, alb_config):
        if alb_config.get("alb-health-monitors"):
            self.upload_monitor_alb_config(alb_config.get("alb-health-monitors"))

    def upload_monitor_alb_config(self, alb_hm_config):

        for hm in alb_hm_config:
            is_create_hm = False
            try:
                hm_obj = self.nsx_api_client.infra.AlbHealthMonitors.get(hm["id"])
                print(hm_obj)
            except Exception as e:
                print(e)
                is_create_hm = True
            if is_create_hm:
                try:
                    alb_hm_obj = self.nsx_api_client.infra.AlbHealthMonitors.update(hm["id"], hm)
                    print(alb_hm_obj)
                except Exception as e:
                    print(e)

    def create_and_update_nsgroup(self, pool_name, alb_config, pool_members):
        domain_obj = self.nsx_api_client.infra.Domains.list().to_dict().get("results", [])
        domain_id = None

        if domain_obj:
            domain_id = domain_obj[0]["id"]
        ns_name = "{}-{}".format(pool_name, "alb-nsgroup")
        try:
            import requests
            import json
            headers = {'content-type': 'application/json'}
            requests.packages.urllib3.disable_warnings()

            response = requests.get(
                "https://{}/policy/api/v1/infra/domains/{}/groups/{}".format(self.nsxt_ip, domain_id, ns_name),
                auth=(self.nsxt_un, self.nsxt_pw), headers=headers, verify=False)
            response = json.loads(response.text)

            if response.get('httpStatus') == "NOT_FOUND":
                ip_address_list = list()
                for member in pool_members:
                    ip_address_list.append(member["ip_address"])

                data = {
                    "expression": [{
                        "ip_addresses": ip_address_list,
                        "resource_type": "IPAddressExpression"
                    }],
                    "resource_type": "Group",
                    "id": ns_name,
                    "display_name": ns_name
                }

                response = requests.put("https://{}/policy/api/v1/infra/domains/{}/groups/{}".
                                        format(self.nsxt_ip, domain_id, ns_name),
                                        data=json.dumps(data), auth=(self.nsxt_un, self.nsxt_pw),
                                        headers=headers, verify=False)
                response = json.loads(response.text)

            for pool in alb_config["Pool"]:
                if pool["name"] == pool_name:
                    pool["nsx_securitygroup"] = [response["path"]]
                    # Make sure to update the pool server port to be retained
                    if pool_members:
                        pool["default_server_port"] = pool_members[0]["port"]
                    if "servers" in pool:
                        del pool["servers"]
                    break

            LOG.debug("ns group created for pool {}".format(pool_name))
        except Exception:
            LOG.debug("Error in creating ns group for pool {}".format(pool_name))

    def create_network_service_obj(self, name, se_group_ref, cloud_ref, vrf_ref, floating_ip, tenant_ref):
        new_network_service = dict()
        new_network_service["name"] = name
        new_network_service["se_group_ref"] = se_group_ref
        new_network_service["cloud_ref"] = cloud_ref
        new_network_service["vrf_ref"] = vrf_ref
        new_network_service["service_type"] = "ROUTING_SERVICE"
        new_network_service["tenant_ref"] = tenant_ref
        new_network_service["routing_service"] = {
            "floating_intf_ip": [
                    {
                        "addr": floating_ip,
                        "type": "V4"
                    }
                ]
        }
        return new_network_service
