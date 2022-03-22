# !/usr/bin/env python3
import json
import logging
import os

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
from avi.migrationtools.nsxt_converter.vs_converter import vs_list_with_snat_deactivated

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
        self.nsxt_passord = args.nsxt_passord
        self.nsxt_port = args.nsxt_port
        self.cloud_name = args.cloud_name
        self.prefix = args.prefix
        self.prefix = args.prefix
        self.controller_ip = args.controller_ip
        self.user = args.user
        self.password = args.password
        self.tenant = args.tenant
        self.not_in_use = args.not_in_use
        self.ansible_skip_types = args.ansible_skip_types
        self.controller_version = args.controller_version
        self.ansible_filter_types = args.ansible_filter_types
        self.vs_level_status=args.vs_level_status
        self.run_on_local = args.run_on_local
        self.output_file_path = args.output_file_path if args.output_file_path \
            else 'output'
        self.migrate_to = args.migrate_to
        self.option = args.option
        self.ansible = args.ansible
        self.object_merge_check = args.no_object_merge
        self.vs_state = args.vs_state
        self.vrf = args.vrf
        self.vs_filter = args.vs_filter
        self.segroup = args.segroup
        self.patch=args.patch
        # rule config for irule conversion
        self.custom_config = args.custom_config
        self.traffic_enabled=args.traffic_enabled
        self.config_file = args.config_file



    def conver_lb_config(self):

        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        self.init_logger_path()
        output_dir = os.path.normpath(self.output_file_path)

        is_download_from_host = False
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
        nsx_lb_config = None
        if is_download_from_host:
            LOG.debug("Copying files from host")
            print("Copying Files from Host...")
            nsx_util = NSXUtil(self.nsxt_user, self.nsxt_passord, self.nsxt_ip, self.nsxt_port)
            nsx_lb_config = nsx_util.get_nsx_config()
            LOG.debug("Copied input files")
        elif self.config_file:
            source_file = open(self.config_file, "r")
            nsx_lb_config = source_file.read()
            nsx_lb_config = json.loads(nsx_lb_config)

        if not nsx_lb_config:
            print('Not found NSX configuration file')
            return

        custom_mappings = None
        if self.custom_config:
            with open(self.custom_config) as stream:
                custom_mappings = yaml.safe_load(stream)
        alb_config = nsxt_config_converter.convert(
            nsx_lb_config, input_path, output_path,self.tenant,
            self.cloud_name, self.prefix, self.migrate_to,self.object_merge_check,self.controller_version,self.vs_state ,
            self.vs_level_status, self.vrf, self.segroup,self.not_in_use,custom_mappings
            )
        avi_config = self.process_for_utils(alb_config)
        # Check if flag true then skip not in use object
        #if self.not_in_use:
            #avi_config = wipe_out_not_in_use(avi_config)
       # output_path = (output_dir + os.path.sep + self.nsxt_ip + os.path.sep +
                      # "output")
        self.write_output(avi_config, output_path, 'avi_config.json')
        if self.ansible:
            self.convert(alb_config, output_path)
        if self.option == 'auto-upload':
            self.upload_config_to_controller(alb_config)
        if vs_list_with_snat_deactivated:
            print('\033[93m'+"Warning: for following virtual service/s please follow steps giving in KB: "+
                  "https://avinetworks.com/docs/21.1/migrating-nsx-transparent-lb-to-nsx-alb/"+'\033[0m')
            print(vs_list_with_snat_deactivated)
        print("Total Warning: ", get_count('warning'))
        print("Total Errors: ", get_count('error'))
        LOG.info("Total Warning: {}".format(get_count('warning')))
        LOG.info("Total Errors: {}".format(get_count('error')))

    def upload_config_to_controller(self, alb_config):
        avi_rest_lib.upload_config_to_controller(
            alb_config, self.controller_ip, self.user, self.password,
            self.tenant,self.controller_version)

    def convert(self, alb_config,output_path):
        #output_path = (self.output_file_path + os.path.sep + self.nsxt_ip +
                     #  os.path.sep + "output")
        avi_traffic = AviAnsibleConverterMigration(
            alb_config, output_path, self.prefix, self.not_in_use,
             skip_types=self.ansible_skip_types,
             controller_version=self.controller_version,
            filter_types=self.ansible_filter_types)
        avi_traffic.write_ansible_playbook(
            self.nsxt_ip, self.nsxt_user, self.nsxt_passord, 'nsxt')

if __name__ == "__main__":
    HELP_STR = """
    Usage:
    python nsxt_converter.py -n 192.168.100.101 -u admin -p password 
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR)

    # Create Ansible Script based on Flag
    parser.add_argument('--ansible',
                        help='Flag for create ansible file',
                        action='store_true')

    parser.add_argument('-n', '--nsxt_ip',
                        help='Ip of NSXT')
    parser.add_argument('-u', '--nsxt_user',
                        help='NSX-T User name')
    parser.add_argument('-p', '--nsxt_passord',
                        help='NSX-T Password')
    parser.add_argument('-port', '--nsxt_port', default=443,
                        help='NSX-T Port')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )
    parser.add_argument('--prefix', help='Prefix for objects')
    parser.add_argument('--cloud_name', help='cloud name for auto upload',
                        required=True)
    parser.add_argument('--password',
                        help='controller password for auto upload. Input '
                             'prompt will appear if no value provided')
    parser.add_argument('-c', '--controller_ip',
                        help='controller ip for auto upload')
    parser.add_argument('--controller_version',
                        help='Target Avi controller version')
    parser.add_argument('--user',
                        help='controller username for auto upload')
    parser.add_argument('-t', '--tenant', help='tenant name for auto upload',default="admin")
    parser.add_argument('-O', '--option', choices=ARG_CHOICES['option'],
                        help='Upload option cli-upload genarates Avi config ' +
                             'file auto upload will upload config to ' +
                             'controller')
    parser.add_argument('--migrate_to', choices=ARG_CHOICES['migrate_option'],
                        help='Select migration to NSX-T ALB or ALB Controller',
                        default='Avi')
    # Added command line args to take skip type for ansible playbook
    parser.add_argument('--ansible_skip_types',
                        help='Comma separated list of Avi Object types to skip '
                             'during conversion.\n  Eg. -s DebugController,'
                             'ServiceEngineGroup will skip debugcontroller and '
                             'serviceengine objects')
    parser.add_argument('--vs_level_status', action='store_true',
                        help='Add columns of vs reference and overall skipped '
                             'settings in status excel sheet')
    # Added command line args to take skip type for ansible playbook
    parser.add_argument('--ansible_filter_types',
                        help='Comma separated list of Avi Objects types to '
                             'include during conversion.\n Eg. -f '
                             'VirtualService, Pool will do ansible conversion '
                             'only for Virtualservice and Pool objects')
    # Added not in use flag
    parser.add_argument('--not_in_use',
                        help='Flag for skipping not in use object',
                        action="store_false")

    parser.add_argument('--no_object_merge',
                        help='Flag for object merge', action='store_false')
    parser.add_argument('-s', '--vs_state', choices=ARG_CHOICES['vs_state'],
                        help='traffic_enabled state of VS created')
    parser.add_argument('--vrf',
                        help='Update the available vrf ref with the custom vrf'
                             'reference')
    parser.add_argument('--run_on_local',
                        help='Flag for running script in nsx manager',
                        action="store_true")
    # Added command line args to execute vs_filter.py with vs_name.
    parser.add_argument('--vs_filter',
                        help='comma seperated names of virtualservices.\n'
                             'Note: If patch data is supplied, vs_name should match '
                             'the new name given in it'
                        )
    parser.add_argument('--segroup',
                        help='Update the available segroup ref with the'
                             'custom ref')
    # json file location and patch location
    parser.add_argument('--patch', help='Run config_patch please provide '
                                        'location of patch.yaml')
    parser.add_argument('--custom_config',
                        help='iRule/monitor custom mapping yml file path')
    parser.add_argument('--traffic_enabled',
                        help='Traffic Enabled on all migrated VS VIPs',
                        action = "store_true")
    parser.add_argument('-f', '--config_file',
                        help='absolute path for nsx config file')




    args = parser.parse_args()
    nsxt_converter = NsxtConverter(args)
    nsxt_converter.conver_lb_config()
