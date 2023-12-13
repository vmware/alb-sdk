#!/usr/bin/env python3

############################################################################
# ========================================================================
# Copyright 2023 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0


import glob
import re
import json
import os
import yaml
import argparse
import xlsxwriter

# v_backup_folder1 = "/Users/slatkar/Downloads/DR-lbConfig-03-11-2022-142517"


class V2ALBDiscovery:

    unique_vips = set()
    PARTIAL_STATUS = "PARTIAL"
    SUPPORTED_STATUS = "SUPPORTED"
    NOT_SUPPORTED_STATUS = "NOT SUPPORTED"
    virtual_service_list = list()
    app_profile_list = list()
    pool_list = list()
    monitor_list = list()
    v_config_directory = None
    discovery_command_status = None
    app_profile_name_object_mapping = dict()

    def get_edges_for_lb(self):
        all_edges = self._read_edges()
        return all_edges

    def _read_edges(self):
        return self._read_site_edges()

    def _read_site_edges(self, site_id=None):
        # match any string not containing dot character with prefix "edges.edge-"
        # to read all edges
        return self._read_site_v_config("edge-*.json", re_pattern=None)

    def _read_site_v_config(self, pattern, re_pattern=None):
        '''Reads files that match specified pattern from v config,
        returns list of dictionaries

        @param pattern: glob filename pattern
        @param re_pattern: re pattern to filter filename again
        '''
        return self._read_v_config_wrapper(pattern, re_pattern)

    def sortKeyFunc(self, s):
        return int(os.path.basename(s)[:-4])

    def _read_v_config_wrapper(self, pattern, re_pattern=None):
        print("Loading from nsx-v backup files named %s under %s", pattern, self.v_config_directory)
        config = []

        files = glob.glob("%s/%s" % (self.v_config_directory, pattern))
        files.sort(key=lambda f: int(re.sub('\D', '', f)))
        for fname in files:
            if re_pattern:
                if not re.search(re_pattern, fname):
                    continue
            with open(fname, 'r') as v_file:
                text = v_file.read()

                obj_json = json.loads(text)
                file_name = fname.split("/")[-2] + "/" + fname.split("/")[-1]
                obj_json["fileName"] = file_name
                config.append(obj_json)

        print("Loaded %d objects", len(config))
        return config

    def read_config_file(self):
        """
        This function defines that to initialize constant from yaml file
        :return: None
        """
        with open(os.path.dirname(__file__) + "/discovery_status.yaml") as stream:
            file_data = yaml.safe_load(stream)
        self.discovery_command_status = file_data['DISCOVERY']

    def set_config_dir(self, config_dir):
        self.v_config_directory = config_dir

    def fetch_discovery_status(self):
        all_edges = self.get_edges_for_lb()
        print(all_edges)

        summary_stats = dict()

        total_vs_count = total_pool_count = complex_l4_virtual_service = complex_l7_virtual_service = total_l4_vs = \
            total_l7_vs = total_app_profiles = is_transparent_pool = total_vs_disabled = 0

        for edge in all_edges:

            if 'virtualServer' in edge.keys() and edge["virtualServer"]:
                for virtual_service in edge["virtualServer"]:
                    total_vs_count += 1
                    self.virtual_service_list.append(virtual_service)
                    virtual_service['fileName'] = edge["fileName"]

                    if not virtual_service['enabled']:
                        total_vs_disabled += 1

                    if virtual_service["protocol"].lower() in ['tcp', 'udp']:
                        total_l4_vs += 1
                        if "applicationRuleId" in virtual_service and virtual_service['applicationRuleId']:
                            complex_l4_virtual_service += 1
                    else:
                        total_l7_vs += 1
                        if "applicationRuleId" in virtual_service and virtual_service['applicationRuleId']:
                            complex_l7_virtual_service += 1

                    vip = virtual_service.get("ipAddress")
                    if vip:
                        self.unique_vips.add(vip)
            if "applicationProfile" in edge.keys() and edge['applicationProfile']:
                for app_profile in edge["applicationProfile"]:
                    total_app_profiles += 1
                    self.app_profile_list.append(app_profile)
                    app_profile['fileName'] = edge["fileName"]

            if 'pool' in edge.keys() and edge["pool"]:
                for v_pool in edge["pool"]:
                    total_pool_count += 1
                    self.pool_list.append(v_pool)
                    v_pool['fileName'] = edge["fileName"]
                    if v_pool.get('transparent') is True:
                        is_transparent_pool += 1

            if 'monitor' in edge.keys() and edge["monitor"]:
                for v_monitor in edge["monitor"]:
                    self.monitor_list.append(v_monitor)
                    v_monitor['fileName'] = edge["fileName"]

            if 'applicationRule' in edge.keys() and edge['applicationRule']:
                for v_application_rule in edge["applicationRule"]:
                    edge_name = edge["fileName"].split("/")[-1].split('.json')[0]
                    self.app_profile_name_object_mapping[f"{edge_name}_{v_application_rule['applicationRuleId']}"] \
                        = v_application_rule

        summary_stats["total_vs_count"] = total_vs_count
        summary_stats["total_pool_count"] = total_pool_count
        summary_stats["complex_l4_virtual_service"] = complex_l4_virtual_service
        summary_stats["complex_l7_virtual_service"] = complex_l7_virtual_service
        summary_stats["total_l4_vs"] = total_l4_vs
        summary_stats["total_l7_vs"] = total_l7_vs
        summary_stats["total_app_profiles"] = total_app_profiles
        summary_stats["is_transparent_pool"] = is_transparent_pool
        summary_stats["total_vs_disabled"] = total_vs_disabled

        return summary_stats

    def create_work_book(self):
        workbook = xlsxwriter.Workbook(
            os.path.dirname(__file__) + os.sep + 'v2alb_discovery_data.xlsx')

        return workbook

    def write_summary_stats(self, summary_stats):

        workbook = self.create_work_book()
        bold = workbook.add_format({'bold': True})
        partial = workbook.add_format({'bold': True, 'font_color': 'orange'})
        supported = workbook.add_format({'bold': True, 'font_color': 'green'})
        not_supported = workbook.add_format({'bold': True, 'font_color': 'red'})

        large_heading = workbook.add_format({'bold': True, 'font_size': '20'})
        large_heading.set_align('center')

        worksheet_summary = workbook.add_worksheet('Summary')
        worksheet_summary.merge_range(3, 4, 3, 7, 'Summary', large_heading)
        worksheet_summary.set_row(3, 40)
        worksheet_summary.set_column(5, 6, width=24)

        worksheet_summary.write(5, 5, "Total Virtual Services", bold)
        worksheet_summary.write(5, 6, str(summary_stats["total_vs_count"]))

        worksheet_summary.write(6, 5, "Deactivated Virtual Services", bold)
        worksheet_summary.write(6, 6, str(summary_stats["total_vs_disabled"]))

        worksheet_summary.write(7, 5, "Total Unique VIP's", bold)
        worksheet_summary.write(7, 6, str(len(self.unique_vips)))

        worksheet_summary.write(8, 5, "Total Pools", bold)
        worksheet_summary.write(8, 6, str(summary_stats["total_pool_count"]))

        worksheet_summary.write(9, 5, "Pools with Inline(Transparent/Preserve Client IP)", bold)
        worksheet_summary.write(9, 6, str(summary_stats["is_transparent_pool"]))

        worksheet_summary.write(10, 5, "Total Application Profiles", bold)
        worksheet_summary.write(10, 6, str(summary_stats["total_app_profiles"]))

        worksheet_summary.write(11, 5, "Total L4 Virtual Service", bold)
        worksheet_summary.write(11, 6, str(summary_stats["total_l4_vs"]))

        worksheet_summary.write(12, 5, "Complex L4 Virtual Services", bold)
        worksheet_summary.write(12, 6, str(summary_stats["complex_l4_virtual_service"]))

        worksheet_summary.write(13, 5, "Total L7 Virtual Service", bold)
        worksheet_summary.write(13, 6, str(summary_stats["total_l7_vs"]))

        worksheet_summary.write(14, 5, "Complex L7 Virtual Services", bold)
        worksheet_summary.write(14, 6, str(summary_stats["complex_l7_virtual_service"]))

        print("=====================================")
        print(" Summary")
        print("=====================================")
        print("Total Virtual Services: ", summary_stats["total_vs_count"])
        print("Deactivated Virtual Services: ", summary_stats["total_vs_disabled"])
        print("Total Unique VIP's: ", len(self.unique_vips))
        print("Total Pools: ", summary_stats["total_pool_count"])
        print("Pools with Inline (Transparent/Preserve Client IP): ", summary_stats["is_transparent_pool"])
        print("Total Application Profiles: ", summary_stats["total_app_profiles"])
        print("Total L4 Virtual Services: ", summary_stats["total_l4_vs"])
        print("Complex L4 Virtual Services: ", summary_stats["complex_l4_virtual_service"])
        print("Total L7 Virtual Service: ", summary_stats["total_l7_vs"])
        print("Complex L7 Virtual Services: ", summary_stats["complex_l7_virtual_service"])
        print("-------------------------------------")

        # 1. Monitor not in supported type - Not Supported
        # 2. Monitor properties not supported
        # 3. Pool attributes not supported
        # 4. Application profile supported but persistent type Msrdp and L4 with persistent type cookie and
        #    ssl_sessionid not supported
        # 5. VS not supported attributes

        # writing pools
        row, col = 0, 1
        worksheet_discovery = workbook.add_worksheet('Monitor')
        worksheet_discovery.write('A1', 'Name', bold)
        worksheet_discovery.write('B1', 'Edge', bold)
        worksheet_discovery.write('C1', "Type", bold)
        worksheet_discovery.write('D1', 'Status', bold)

        for v_monitor in self.monitor_list:
            row = row + 1
            worksheet_discovery.write(row, 0, v_monitor['name'], bold)
            worksheet_discovery.write(row, 1, v_monitor['fileName'].split("/")[-1].split('.json')[0])
            worksheet_discovery.write(row, 2, v_monitor['type'])
            if v_monitor['type'] in self.discovery_command_status["Monitor_Type_Supported"]:
                if 'extension' in v_monitor.keys() and v_monitor.get('extension', None):
                    worksheet_discovery.write(row, 4, "Not Supported field(s): " +
                                              str(self.discovery_command_status["Monitor_Attributes_Not_Supported"]))
                    worksheet_discovery.write(row, 3, self.PARTIAL_STATUS, partial)
                else:
                    worksheet_discovery.write(row, 3, self.SUPPORTED_STATUS, supported)
            else:
                worksheet_discovery.write(row, 3, self.NOT_SUPPORTED_STATUS, not_supported)

            col += 1

        # writing pools
        row, col = 0, 1
        worksheet_discovery = workbook.add_worksheet('Pool')
        worksheet_discovery.write('A1', 'Name', bold)
        worksheet_discovery.write('B1', 'Edge', bold)
        worksheet_discovery.write('C1', 'Status', bold)

        for v_pool in self.pool_list:
            row = row + 1
            worksheet_discovery.write(row, 0, v_pool['name'], bold)
            worksheet_discovery.write(row, 1, v_pool['fileName'].split("/")[-1].split('.json')[0])

            if ('ipVersionFilter' in v_pool.keys() and v_pool.get('ipVersionFilter')) or \
                    ('monitorPort' in v_pool.keys() and v_pool.get('monitorPort')) or \
                    ('minConn' in v_pool.keys() and v_pool.get('minConn')):
                worksheet_discovery.write(row, 2, self.PARTIAL_STATUS, partial)
                worksheet_discovery.write(row, 3, "Not Supported field(s): " +
                                          str(self.discovery_command_status["Pool_Attributes_Not_Supported"]))
            else:
                worksheet_discovery.write(row, 2, self.SUPPORTED_STATUS, supported)
            col += 1

        # writing application profiles
        row, col = 0, 1
        worksheet_discovery = workbook.add_worksheet('ApplicationProfile')
        worksheet_discovery.write('A1', 'Name', bold)
        worksheet_discovery.write('B1', 'Edge', bold)
        worksheet_discovery.write('C1', 'Status', bold)

        for v_app_profile in self.app_profile_list:
            row = row + 1
            worksheet_discovery.write(row, 0, v_app_profile['name'], bold)
            worksheet_discovery.write(row, 1, v_app_profile['fileName'].split("/")[-1].split('.json')[0])

            persistence = v_app_profile.get('persistence')
            if persistence and persistence['method'] not in \
                    self.discovery_command_status["Persistant_Method_Supported"]:
                worksheet_discovery.write(row, 2, self.PARTIAL_STATUS, partial)
                worksheet_discovery.write(row, 3, "Persistence Not Supported: " + str(persistence['method']))
            else:
                worksheet_discovery.write(row, 2, self.SUPPORTED_STATUS, supported)
            col += 1

        # writing virtual service
        row, col = 0, 1
        worksheet_discovery = workbook.add_worksheet('VirtualService')
        worksheet_discovery.write('A1', 'Name', bold)
        worksheet_discovery.write('B1', 'Edge', bold)
        worksheet_discovery.write('C1', 'Status', bold)

        for v_vs in self.virtual_service_list:
            row = row + 1
            worksheet_discovery.write(row, 0, v_vs['name'], bold)
            worksheet_discovery.write(row, 1, v_vs['fileName'].split("/")[-1].split('.json')[0])

            if ('enableServiceInsertion' in v_vs.keys() and v_vs.get('enableServiceInsertion')) or \
                    ('applicationRuleId' in v_vs.keys() and v_vs.get('applicationRuleId')):
                worksheet_discovery.write(row, 2, self.PARTIAL_STATUS, partial)
                worksheet_discovery.write(row, 3, "Virtual Service Properties Not Supported: " +
                                          str(self.discovery_command_status["VS_Attributes_Not_Supported"]))
            else:
                worksheet_discovery.write(row, 2, self.SUPPORTED_STATUS, supported)
            col += 1

        # writing virtual service
        row, col = 0, 1
        worksheet_discovery = workbook.add_worksheet('ApplicationRule')
        worksheet_discovery.write('A1', 'Name', bold)
        worksheet_discovery.write('B1', 'Edge', bold)
        worksheet_discovery.write('C1', 'Status', bold)
        worksheet_discovery.write('D1', 'Config', bold)

        for v_vs in self.virtual_service_list:

            if ('enableServiceInsertion' in v_vs.keys() and v_vs.get('enableServiceInsertion')) or \
                    ('applicationRuleId' in v_vs.keys() and v_vs.get('applicationRuleId')):
                msg = "Properties Not Supported: "
                if v_vs.get('enableServiceInsertion'):
                    msg += "enableServiceInsertion "

                for app_rule in v_vs.get('applicationRuleId'):
                    row = row + 1
                    edge_name = v_vs['fileName'].split("/")[-1].split('.json')[0]
                    worksheet_discovery.write(row, 0, app_rule, bold)
                    worksheet_discovery.write(row, 1, edge_name)
                    worksheet_discovery.write(row, 2, self.NOT_SUPPORTED_STATUS, not_supported)
                    if v_vs.get('applicationRuleId'):
                        msg += " applicationRuleId"
                    worksheet_discovery.write(row, 3, msg + " Object: " +
                                              str(self.app_profile_name_object_mapping.get(f"{edge_name}_{app_rule}")))

            col += 1

        workbook.close()


if __name__ == "__main__":
    HELP_STR = """
    Usage:

    Example to use -c or --config to provide directory containing NSX-V config file(s):
        v2alb_discovery.py --c v_config_files/
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR)

    # To specify directory that contains NSX-V config files
    parser.add_argument('-c', '--config',
                        help='Folder containing NSX-V config file(s)',
                        required=True)

    args = parser.parse_args()
    v_config_directory = args.config

    v2t_discovery = V2ALBDiscovery()
    v2t_discovery.set_config_dir(v_config_directory)
    v2t_discovery.read_config_file()
    summary_stats = v2t_discovery.fetch_discovery_status()
    v2t_discovery.write_summary_stats(summary_stats)
