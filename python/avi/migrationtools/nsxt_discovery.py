import argparse
import json
import os
from datetime import datetime

import xlsxwriter

from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util
import pprint

from avi.sdk.avi_api import ApiSession

pp = pprint.PrettyPrinter(indent=4)


def get_name_and_entity(url):
    """
    Parses reference string to extract object type and
    :param url: reference url to be parsed
    :return: entity and object name
    """
    parsed = url.split('/')
    return parsed[-2], parsed[-1]


class NSXDiscoveryConv():
    nsx_api_client = None

    def __init__(self, nsx_un, nsx_pw, nsx_ip, nsx_port, c_pw, c_ip, c_un, c_vr):
        self.nsx_api_client = nsx_client_util.create_nsx_policy_api_client(
            nsx_un, nsx_pw, nsx_ip, nsx_port, auth_type=nsx_client_util.BASIC_AUTH)
        self.session = ApiSession.get_session(c_ip, c_un, c_pw, tenant="admin", api_version=c_vr)
        self.cloud = self.session.get("cloud/").json()["results"]
        self.avi_vs_object = []
        self.avi_object_temp = {}
        self.avi_pool_object = []
        self.enabled_pool_list = []
        self.lb_services = {}

    def get_cloud_type(self,avi_cloud_list, tz_id):
        for cl in avi_cloud_list:
            if cl.get("vtype") == "CLOUD_NSXT":
                if cl.get("nsxt_configuration"):
                    if cl["nsxt_configuration"].get("transport_zone"):
                        tz = cl["nsxt_configuration"].get("transport_zone")
                    elif cl["nsxt_configuration"].get("management_network_config"):
                        tz = cl["nsxt_configuration"]["management_network_config"].get("transport_zone")
                    if tz == tz_id:
                        return cl.get("name")

        return "Cloud Not Found"

    def get_lb_services_details(self):
        lb_services = self.nsx_api_client.infra.LbServices.list().to_dict().get('results', [])
        for lb in lb_services:
            tier = get_name_and_entity(lb["connectivity_path"])[-1]
            ls_id = self.nsx_api_client.infra.tier_1s.LocaleServices.list(tier).results[0].id
            interface_list = self.nsx_api_client.infra.tier_1s.locale_services.Interfaces.list(tier, ls_id).results
            network = None
            tz_id = None
            if len(interface_list):
                interface = interface_list[0].id
                segment_id = get_name_and_entity(interface_list[0].segment_path)[-1]
                segment = self.nsx_api_client.infra.Segments.get(segment_id)
                tz_path = segment.transport_zone_path
                tz_id = get_name_and_entity(tz_path)[-1]
                cloud_name = self.get_cloud_type(self.cloud, tz_id)
                if hasattr(segment, "vlan_ids"):
                    network = "Vlan"
                else:
                    network = "Overlay"
            else:
                segment_list = self.nsx_api_client.infra.Segments.list().to_dict().get('results', [])
                for seg in segment_list:
                    if seg.get("connectivity_path"):
                        gateway_name = get_name_and_entity(seg["connectivity_path"])[-1]
                        if gateway_name == tier:
                            tz_path = seg.get("transport_zone_path")
                            tz_id = get_name_and_entity(tz_path)[-1]
                            if seg.get("vlan_ids"):
                                network = "Vlan"
                            else:
                                network = "Overlay"
            cloud_name = self.get_cloud_type(self.cloud, tz_id)
            self.lb_services[lb["id"]] ={
                    "Network": network,
                    "Cloud": cloud_name}

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
                'id':vs["id"]
            }
            lb = get_name_and_entity(vs["lb_service_path"])[-1]
            lb_details = self.lb_services.get(lb)
            vs_object["Network_type"] = lb_details.get("Network")
            vs_object["Cloud"] = lb_details.get("Cloud")
            if vs["enabled"]:
                vs_object["enabled"] = True
            else:
                vs_object["enabled"] = False
            if vs.get('pool_path'):
                pool = vs.get("pool_path")
                pool_partition, pool_name = get_name_and_entity(pool)
                if pool_name:
                    vs_object['pool'] = {
                        'name': pool_name
                    }
                    self.enabled_pool_list.append(pool_name)
                    pool_obj = self.nsx_api_client.infra.LbPools.get(pool_name)
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
                profile_name = get_name_and_entity(vs["application_profile_path"])[1]
                vs_object["profiles"] = profile_name
                prof_obj_list = self.nsx_api_client.infra.LbAppProfiles.list().to_dict().get("results", [])
                prof_obj = [prof for prof in prof_obj_list if prof["display_name"] == profile_name]
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
            self.avi_object_temp[vs_object['name']] = vs_object
        self.avi_vs_object.append(self.avi_object_temp)
        vs_stats["complex_vs"] = vs_with_rules
        vs_stats["normal_vs"] = normal_vs
        vs_stats["enabled_vs"] = enab_vs
        vs_stats["disabled_vs"] = disab_vs
        print(vs_stats)

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

        for vs in obj_data.keys():
            total_vs = total_vs + 1
            vsval = obj_data[vs]
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
        for vs in obj_data.keys():
            row += 1
            vsval = obj_data[vs]
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
            network = vsval.get("Network_type")
            worksheet.write(row, 5, network)
            if network == "Vlan":
                total_vs_in_vlan += 1
            if network == "Overlay":
                total_vs_in_overlay += 1
            cloud = vsval.get("Cloud")
            worksheet.write(row, 6, cloud)

        # adding some more summary
        worksheet_summary.write(9, 5, "Total vs", bold)
        worksheet_summary.write(9, 6, str(total_vs))

        worksheet_summary.write(10, 5, "Total vs UP", bold)
        worksheet_summary.write(10, 6, str(total_enabled_vs))

        worksheet_summary.write(11, 5, "Total pools", bold)
        worksheet_summary.write(11, 6, str(total_pools))

        worksheet_summary.write(12, 5, "Total pools UP", bold)
        worksheet_summary.write(12, 6, str(total_enabled_pools))

        worksheet_summary.write(13, 5, "Total complex vs", bold)
        worksheet_summary.write(13, 6, str(total_complex_vs))

        worksheet_summary.write(14, 5, "Total l4 vs", bold)
        worksheet_summary.write(14, 6, str(total_l4_vs))

        worksheet_summary.write(15, 5, "Total l7 vs", bold)
        worksheet_summary.write(15, 6, str(total_l7_vs))

        worksheet_summary.write(16, 5, "Total vs in VLAN", bold)
        worksheet_summary.write(16, 6, str(total_vs_in_vlan))

        worksheet_summary.write(17, 5, "Total vs in OVERLAY", bold)
        worksheet_summary.write(17, 6, str(total_vs_in_overlay))

        print("====================")
        print(" Summary")
        print("====================")
        print("Total vs: ", total_vs)
        print("Total vs UP: ", total_enabled_vs)
        print("Total pools: ", total_pools)
        print("Total pools UP: ", total_enabled_pools)
        print("Total complex vs: ", total_complex_vs)
        print("Total l4 vs: ", total_l4_vs)
        print("Total l7 vs: ", total_l7_vs)
        print("Total vs in VLAN", total_vs_in_vlan)
        print("Total vs in OVERLAY", total_vs_in_overlay)

        print("--------------------")

        workbook.close()


if __name__ == '__main__':
    HELP_STR = '''
            Nsx instance Discovery
            Example to get the inventory of NSX instance:
                nsxt_discovery.py  --nsx_ip xxx.xxx.xxx.xxx --nsx_user
                admin --nsx_password xxxxx -o  output/
            '''

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter,
        description=HELP_STR)
    parser.add_argument('--nsx_user', help='nsx host username')
    parser.add_argument('--nsx_ip', help='host ip of nsx instance')
    parser.add_argument('--nsx_password', help='nsx host password')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )
    parser.add_argument('-port', '--nsx_port', default=443,
                        help='NSX-T Port')
    parser.add_argument('--password',
                        help='controller password')
    parser.add_argument('-c', '--controller_ip',
                        help='controller ip ')
    parser.add_argument('--user',
                        help='controller username ')
    parser.add_argument("--controller_version" , help="version of controller", default='17.2.1')

    args = parser.parse_args()
    if not args.nsx_ip:
        print('Please provide nsx host')
        exit(0)
    if not args.nsx_user:
        print('Please provide ssh username of nsx host')
        exit(0)
    if not args.nsx_password:
        print('Please provide ssh password of nsx host')
        exit(0)

    if not os.path.isdir(args.output_file_path):
        print("Creating output directory ...")
        os.makedirs(args.output_file_path)

    nsx_inventory = NSXDiscoveryConv(args.nsx_user, args.nsx_password, args.nsx_ip, args.nsx_port,\
                                     args.password, args.controller_ip, args.user, args.controller_version)
    nsx_inventory.get_inventory()
    nsx_inventory.get_pool_details()
    nsx_inventory.write_output(
        args.output_file_path, args.nsx_ip)
