#!/usr/bin/env python3

############################################################################
# ========================================================================
# Copyright 2021 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0


import json
import logging
import os
import sys
from datetime import datetime

import copy
import yaml

from avi.migrationtools import avi_rest_lib
from avi.migrationtools.ansible.ansible_config_converter import \
    AviAnsibleConverterMigration
from avi.migrationtools.avi_converter import AviConverter
from avi.migrationtools.avi_migration_utils import get_count
from avi.migrationtools.avi_orphan_object import wipe_out_not_in_use
from avi.migrationtools.nsxt_converter import nsxt_config_converter, vs_converter
import argparse

from avi.migrationtools.nsxt_converter.nsxt_util import NSXUtil
from avi.migrationtools.nsxt_converter.vs_converter import vs_list_with_snat_deactivated, \
    vs_with_no_cloud_configured, vs_with_no_lb_configured, vs_with_lb_skipped, vs_with_no_snat_no_floating_ip,\
vips_not_configured, vs_with_custom_se_group

ARG_CHOICES = {
    'option': ['cli-upload', 'auto-upload'],
    'migrate_option': ['Avi', 'NSX'],
    'vs_state': ['enable', 'deactivate']

}
LOG = logging.getLogger(__name__)


class NsxtConverter(AviConverter):
    def __init__(self, args):
        '''

        :param args:
        '''
        self.nsxt_ip = args.nsxt_ip
        self.nsxt_user = args.nsxt_user
        self.nsxt_password = args.nsxt_password
        self.nsxt_port = args.nsxt_port
        self.prefix = args.prefix
        self.controller_ip = args.alb_controller_ip
        self.user = args.alb_controller_user
        self.password = args.alb_controller_password
        self.tenant = args.alb_controller_tenant
        self.not_in_use = args.not_in_use
        self.ansible_skip_types = args.ansible_skip_types
        self.controller_version = args.alb_controller_version
        self.ansible_filter_types = args.ansible_filter_types
        self.vs_level_status = args.vs_level_status
        self.output_file_path = args.output_file_path if args.output_file_path \
            else 'output'
        self.option = args.option
        self.ansible = args.ansible
        self.object_merge_check = args.no_object_merge
        self.vs_state = args.vs_state
        self.vs_filter = args.vs_filter
        self.segroup = args.segroup
        self.patch = args.patch
        self.traffic_enabled = args.traffic_enabled
        self.default_params_file = args.default_params_file
        self.cloud_tenant = args.cloud_tenant
        self.ssh_root_password = args.ssh_root_password

    def conver_lb_config(self, args):
        
        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        self.init_logger_path()
        output_dir = os.path.normpath(self.output_file_path)

        is_download_from_host = False
        args_copy = copy.deepcopy(args)
        vars(args_copy).pop('nsxt_password')
        vars(args_copy).pop('alb_controller_password')
        output_path = None
        if self.nsxt_ip:
            output_path = output_dir + os.path.sep + self.nsxt_ip + os.path.sep + "output"
            if not os.path.exists(output_path):
                os.makedirs(output_path)
            input_path = output_dir + os.path.sep + self.nsxt_ip + os.path.sep + "input"
            if not os.path.exists(input_path):
                os.makedirs(input_path)
            is_download_from_host = True
        else:
            output_path = output_dir + os.path.sep + "config-output" + os.path.sep + "output"
            if not os.path.exists(output_path):
                os.makedirs(output_path)
            input_path = output_dir + os.path.sep + "config-output" + os.path.sep + "input"
            if not os.path.exists(input_path):
                os.makedirs(input_path)
        with open(output_path + os.path.sep + "state.json", 'w') as f:
            f.write("%s" % json.dumps(vars(args_copy)))
        nsx_lb_config = None
        nsx_util = None
        if is_download_from_host:
            LOG.debug("Copying files from host")
            print("Copying Files from Host...")
            nsx_util = NSXUtil(self.nsxt_user, self.nsxt_password, self.nsxt_ip, self.nsxt_port \
                               , self.controller_ip, self.user, self.password, self.controller_version,
                               self.cloud_tenant)
            nsx_util.get_inventory()
            nsx_util.get_pool_details()
            nsx_util.write_output(
                output_path, args.nsxt_ip)
            nsx_lb_config = nsx_util.get_nsx_config()
            LOG.debug("Copied input files")

        migration_input_config = None
        if self.default_params_file:
            try:
                default_params_file = open(self.default_params_file, "r")
                migration_input_config = default_params_file.read()
                migration_input_config = json.loads(migration_input_config)
            except:
                print("\033[93m" + "Warning: Default parameter config file specified with --default_params_file "
                                   "parameter not found" + "\033[0m")
                sys.exit()

        if not nsx_lb_config:
            print('Not found NSX configuration file')
            return

        if not self.cloud_tenant:
            self.cloud_tenant = "admin"
        alb_config = nsxt_config_converter.convert(
            nsx_lb_config, input_path, output_path, self.tenant,
            self.prefix, None, self.object_merge_check, self.controller_version, self.ssh_root_password,
            nsx_util, migration_input_config,
            self.vs_state,
            self.vs_level_status, None, self.segroup, self.not_in_use, None,
            self.traffic_enabled, self.cloud_tenant,
            self.nsxt_ip, self.nsxt_password)

        avi_config = self.process_for_utils(alb_config, skip_ref_objects=["cloud_ref", "tenant_ref"])
        # Check if flag true then skip not in use object
        # if self.not_in_use:
        # avi_config = wipe_out_not_in_use(avi_config)
        # output_path = (output_dir + os.path.sep + self.nsxt_ip + os.path.sep +
        # "output")

        # Network, ServiceEngineGroup objects are created as whole migration
        # is executed and then vs are filtered. Need to verify whether filtered
        # vs are using these objects, if yes, add it back to final config
        if avi_config.get("VirtualService"):
            vs_names_after_filter = [vs["name"] for vs in avi_config["VirtualService"]]

        if alb_config.get("NetworkService") and (set(vs_with_custom_se_group) & set(vs_names_after_filter)):
            avi_config["NetworkService"] = alb_config["NetworkService"]
        if alb_config.get("ServiceEngineGroup") and (set(vs_with_custom_se_group) & set(vs_names_after_filter)):
            avi_config["ServiceEngineGroup"] = alb_config["ServiceEngineGroup"]
        self.write_output(avi_config, output_path, 'avi_config.json')
        if self.ansible:
            self.convert(avi_config, output_path)
        if self.option == 'auto-upload':
            self.upload_config_to_controller(avi_config)
        if self.vs_filter:
            filtered_vs_list=[]
            virtual_services=[]
            if self.vs_filter and type(self.vs_filter) == str:
                virtual_services = self.vs_filter.split(',')
            elif self.vs_filter and type(self.vs_filter) == list:
                virtual_services = self.vs_filter
            for vs_name in virtual_services:
                if self.prefix:
                    if not vs_name.startswith(self.prefix):
                        vs_name = self.prefix + "-" + vs_name
                        filtered_vs_list.append(vs_name)
                else:
                    filtered_vs_list = virtual_services
        if vs_with_lb_skipped:
            print_msg = "\033[93m"+"Warning: For following virtual service/s load balancer are skipped due to " \
                                   "unsupported LB configuration"+'\033[0m'
            if self.vs_filter:
                if list(set(vs_with_lb_skipped).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vs_with_lb_skipped).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vs_with_lb_skipped)
        if vs_with_no_lb_configured:
            print_msg = "\033[93m"+"Warning: Following virtual service/s are skipped as " \
                                   "load balancer not configured" + '\033[0m'
            if self.vs_filter:
                if list(set(vs_with_no_lb_configured).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vs_with_no_lb_configured).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vs_with_no_lb_configured)
        if vs_with_no_cloud_configured:
            print_msg = "\033[93m"+"Warning: Following virtual service/s cloud is not configured"+'\033[0m'
            if self.vs_filter:
                if list(set(vs_with_no_cloud_configured).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vs_with_no_cloud_configured).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vs_with_no_cloud_configured)
        if vs_list_with_snat_deactivated:
            print_msg = '\033[93m' + "Warning: For following virtual service/s please follow steps giving in KB: " \
                                     "https://avinetworks.com/docs/21.1/migrating-nsx-transparent-lb-to-nsx-alb/" + \
                        '\033[0m'
            if self.vs_filter:
                if list(set(vs_list_with_snat_deactivated).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vs_list_with_snat_deactivated).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vs_list_with_snat_deactivated)
        if vs_with_no_snat_no_floating_ip:
            print_msg = "\033[93m"+"Warning: Following virtual service/s are skipped as " \
                                   "Network service on ALB is not configured for datapath to work. " \
                                   "\nEither configure Network service on ALB or provide floating IP in " \
                                   "default_params.json file and provide --default_params_file parameter" + '\033[0m'
            if self.vs_filter:
                if list(set(vs_with_no_snat_no_floating_ip).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vs_with_no_snat_no_floating_ip).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vs_with_no_snat_no_floating_ip)
        if vips_not_configured:
            print_msg = "\033[93m" + "Warning: Following virtual service/s are skipped as " \
                                     "VIP segment not configured in cloud networks on ALB" + "\033[0m"
            if self.vs_filter:
                if list(set(vips_not_configured).intersection(set(filtered_vs_list))):
                    print(print_msg)
                    print(list(set(vips_not_configured).intersection(set(filtered_vs_list))))
            else:
                print(print_msg)
                print(vips_not_configured)
        print("Total Warning: ", get_count('warning'))
        print("Total Errors: ", get_count('error'))
        LOG.info("Total Warning: {}".format(get_count('warning')))
        LOG.info("Total Errors: {}".format(get_count('error')))


    def upload_config_to_controller(self, alb_config):
        try:
            avi_rest_lib.upload_config_to_controller(
                alb_config, self.controller_ip, self.user, self.password,
                self.tenant, self.controller_version)
        except Exception as e:
            print("Exception occurred while uploading config to controller. Reason: {}".format(str(e)))
            sys.exit(1)

    def convert(self, alb_config, output_path):
        # output_path = (self.output_file_path + os.path.sep + self.nsxt_ip +
        #  os.path.sep + "output")
        avi_traffic = AviAnsibleConverterMigration(
            alb_config, output_path, self.prefix, self.not_in_use,
            skip_types=self.ansible_skip_types,
            controller_version=self.controller_version,
            filter_types=self.ansible_filter_types)
        avi_traffic.write_ansible_playbook(
            self.nsxt_ip, self.nsxt_user, self.nsxt_password, 'nsxt')


if __name__ == "__main__":
    HELP_STR = """
    Usage:

    Example to use -O or --option to auto upload config to controller after conversion:
        nsxt_converter.py --option auto-upload

    Example to use -s or --vs_state option:
        nsxt_converter.py -s enable
    Usecase: Traffic enabled state of a VS after conversion to AVI (default value is disable).

    Example to use --alb_controller_version option:
        nsxt_converter.py --alb_controller_version 21.1.4
    Usecase: To provide the version of controller for getting output in respective controller format.

    Example to use no object merge option:
        nsxt_converter.py --no_object_merge
    Usecase: When we don't need to merge two same object (based on their attribute values except name)

    Example to patch the config after conversion:
       nsxt_converter.py --patch test/patch.yaml where patch.yaml file contains
       <avi_object example Pool>:
        - match_name: <existing name example p1>
       patch:
        name: <changed name example coolpool>
    Usecase: Sample file test/patch.yaml

    Example to export a single VS:
         nsxt_converter.py --vs_filter test_vs

    Example to skip avi object during playbook creation
         nsxt_converter.py --ansible --ansible_skip_types DebugController
    Usecase:
         Comma separated list of Avi Object types to skip during conversion.
         Eg. DebugController, ServiceEngineGroup will skip debugcontroller and
         serviceengine objects

    Example to filter ansible object
         nsxt_converter.py --ansible --ansible_filter_types virtualservice, pool
    Usecase:
        Comma separated list of Avi Objects types to include during conversion.
        Eg. VirtualService , Pool will do ansible conversion only for
        Virtualservice and Pool objects

    Example to use ansible option:
        nsxt_converter.py --ansible
    Usecase: To generate the ansible playbook for the avi configuration
    which can be used for upload to controller

    Example to add the prefix to avi object name:
        nsxt_converter.py --prefix abc
    Usecase: When two configuration is to be uploaded to same controller then
     in order to differentiate between the objects that will be uploaded in
     second time.

    Example to use not_in_use option:
        nsxt_converter.py --not_in_use
    Usecase: Dangling object which are not referenced by any avi object will be removed

    Example to use vs level status option:
        nsxt_converter.py --vs_level_status
    Usecase: To get the vs level status for the avi objects in excel sheet

    Example to use segroup flag
        nsxt_converter.py --segroup segroup_name
    UseCase: To add / change segroup reference of vs

    Example to default param files
        nsxt_converter.py --default_params_file test/default_params.json
    UseCase: To set default parameters for migration. Sample file test/default_params.json
    1. "bgp_peer_configured_for_vlan": true/false
    2. "network_service": {
            "<tier1_name>-floating-ip": "<floating-ip>"
        }
    e.g 1. "bgp_peer_configured_for_vlan": true/false
        2. "network_service": {
            "PBOneArm-floating-ip": "<floating-ip>"
        }
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR)

    # Create Ansible Script based on Flag
    parser.add_argument('--ansible',
                        help='Flag for create ansible file',
                        action='store_true')
    # Added command line args to take skip type for ansible playbook
    parser.add_argument('--ansible_skip_types',
                        help='Comma separated list of Avi Object types to skip '
                             'during conversion.\n  Eg. -s DebugController,'
                             'ServiceEngineGroup will skip debugcontroller and '
                             'serviceengine objects')
    # Added command line args to take skip type for ansible playbook
    parser.add_argument('--ansible_filter_types',
                        help='Comma separated list of Avi Objects types to '
                             'include during conversion.\n Eg. -f '
                             'VirtualService, Pool will do ansible conversion '
                             'only for Virtualservice and Pool objects')
    parser.add_argument('-c', '--alb_controller_ip',
                        help='controller ip for auto upload', required=True)
    parser.add_argument('--alb_controller_version',
                        help='Target Avi controller version', default='21.1.4')
    parser.add_argument('--alb_controller_user',
                        help='controller username for auto upload', required=True)
    parser.add_argument('--alb_controller_password',
                        help='controller password for auto upload. Input '
                             'prompt will appear if no value provided')
    parser.add_argument('-t', '--alb_controller_tenant', help='tenant name for auto upload',
                        default="admin")
    parser.add_argument('--cloud_tenant', help="tenant for cloud ref")
    parser.add_argument('-i', '--default_params_file',
                        help='absolute path for nsx-t default params file')
    parser.add_argument('-n', '--nsxt_ip',
                        help='Ip of NSXT', required=True)
    parser.add_argument('-u', '--nsxt_user',
                        help='NSX-T User name', required=True)
    parser.add_argument('-p', '--nsxt_password',
                        help='NSX-T Password')
    parser.add_argument('-port', '--nsxt_port', default=443,
                        help='NSX-T Port')
    parser.add_argument( '--ssh_root_password',
                        help='ssh root  Password')
    # Added not in use flag
    parser.add_argument('--not_in_use',
                        help='Flag for skipping not in use object',
                        action="store_false")
    parser.add_argument('--no_object_merge',
                        help='Flag for object merge', action='store_false')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )
    parser.add_argument('-O', '--option', choices=ARG_CHOICES['option'],
                        help='Upload option cli-upload generates Avi config ' +
                             'file auto upload will upload config to ' +
                             'controller')
    # json file location and patch location
    parser.add_argument('--patch', help='Run config_patch please provide '
                                        'location of patch.yaml')
    parser.add_argument('--prefix', help='Prefix for objects')
    parser.add_argument('--segroup',
                        help='Update the available segroup ref with the '
                             'custom ref')
    parser.add_argument('--traffic_enabled',
                        help='Traffic Enabled on all migrated VS VIPs',
                        action="store_true")
    # Added command line args to execute vs_filter.py with vs_name.
    parser.add_argument('--vs_filter',
                        help='comma separated names of virtualservices.\n'
                             'Note: If patch data is supplied, vs_name should match '
                             'the new name given in it'
                        )
    parser.add_argument('--vs_level_status', action='store_true',
                        help='Add columns of vs reference and overall skipped '
                             'settings in status excel sheet')
    parser.add_argument('-s', '--vs_state', choices=ARG_CHOICES['vs_state'],
                        help='State of created VS')


    start = datetime.now()
    args = parser.parse_args()
    if not args.nsxt_password:
        if os.environ.get('nsxt_password'):
            args.nsxt_password = os.environ.get('nsxt_password')
        else:
            print("\033[91m"+'ERROR: please provide nsxt password either through environment variable or as a script parameter'+"\033[0m")
            exit()
    if not args.alb_controller_password:
        if os.environ.get('alb_controller_password'):
            args.alb_controller_password= os.environ.get('alb_controller_password')
        else:
            print('\033[91m'+'ERROR: please provide alb_controller_password either through environment variable or as a script parameter'+"\033[0m")
            exit()
    if not args.ssh_root_password:
        if os.environ.get('ssh_root_password'):
            args.ssh_root_password = os.environ.get('ssh_root_password')
    nsxt_converter = NsxtConverter(args)
    nsxt_converter.conver_lb_config(args)
    end = datetime.now()
    print("The time of execution of above program is :",
          str(end - start))
