#!/usr/bin/env python3

############################################################################
# ========================================================================
# Copyright 2021 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0


import logging
import os
import json
import argparse
from datetime import datetime
from avi.migrationtools.avi_converter import AviConverter
from avi.migrationtools.avi_migration_utils import get_count
from avi.migrationtools.nsxt_converter.nsxt_util import NSXUtil

LOG = logging.getLogger(__name__)


class NsxtAlbRollback(AviConverter):
    def __init__(self, args):
        '''

        :param args:
        '''
        self.nsxt_ip = args.nsxt_ip
        self.nsxt_user = args.nsxt_user
        self.nsxt_passord = args.nsxt_password
        self.nsxt_port = args.nsxt_port

        self.controller_ip = args.alb_controller_ip
        self.controller_version = args.alb_controller_version
        self.user = args.alb_controller_user
        self.password = args.alb_controller_password
        self.alb_controller_tenant = None
        self.vs_filter = None
        if args.vs_filter:
            self.vs_filter = \
                (set(args.vs_filter) if type(args.vs_filter) == list
                 else set(args.vs_filter.split(',')))
        self.output_file_path = args.output_file_path if args.output_file_path \
            else 'output'

        output_dir = os.path.normpath(self.output_file_path)

        # Load values from state file if not given on command line while executing script
        if self.nsxt_ip:
            output_path = output_dir + os.path.sep + self.nsxt_ip + os.path.sep + "output"
        with open(output_path + os.path.sep + "state.json", 'r') as file:
            data = json.load(file)
        if not self.nsxt_user:
            self.nsxt_user = data.get('nsxt_user')
        if not self.nsxt_port:
            self.nsxt_port = data.get('nsxt_port')
        if not self.controller_ip:
            self.controller_ip = data.get('alb_controller_ip')
        if not self.controller_version:
            self.controller_version = data.get('alb_controller_version')
        if not self.user:
            self.user = data.get('alb_controller_user')
        if not self.password:
            self.password = data.get('alb_controller_password')
        if not self.output_file_path:
            self.output_file_path = data.get('output_file_path')
        if not self.alb_controller_tenant:
            self.alb_controller_tenant = data.get('alb_controller_tenant')
        if not self.prefix:
            self.prefix = data.get('prefix')

        input_path = None
        self.input_data = None
        if self.nsxt_ip:
            input_path = output_dir + os.path.sep + self.nsxt_ip + os.path.sep + "input"
        else:
            input_path = output_dir + os.path.sep + "config-output" + os.path.sep + "input"
        with open(input_path + os.path.sep + "config.json", 'r') as file:
            self.input_data = json.load(file)

    def initiate_rollback(self):

        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        self.init_logger_path()

        nsx_util = NSXUtil(self.nsxt_user, self.nsxt_passord, self.nsxt_ip, self.nsxt_port,
                           self.controller_ip, self.user, self.password, self.controller_version)
        vs_not_found, vs_with_no_lb = nsx_util.rollback_vs(self.vs_filter, self.input_data,
                                                           self.prefix, self.alb_controller_tenant)
        if vs_not_found:
            print_msg = "\033[93m" + "Warning: Following virtual service/s could not be found" + "\033[0m"
            print(print_msg)
            print(vs_not_found)
            LOG.warning("{} {}".format(print_msg, vs_not_found))
        if vs_with_no_lb:
            warn_msg = "\033[93m" + "Warning: Load balancer configuration details not found for performing " \
                       "rollback operation for following virtual services:" + "\033[0m"
            print(warn_msg)
            print(vs_with_no_lb)
            LOG.warning("{} {}".format(warn_msg, vs_with_no_lb))

        print("Total Warning: ", get_count('warning'))
        print("Total Errors: ", get_count('error'))
        LOG.info("Total Warning: {}".format(get_count('warning')))
        LOG.info("Total Errors: {}".format(get_count('error')))


if __name__ == "__main__":
    HELP_STR = """
    Usage:
    python nsxt_converter.py -n 192.168.100.101 -u admin -p password 
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR)

    parser.add_argument('-c', '--alb_controller_ip',
                        help='controller ip for auto upload')
    parser.add_argument('--alb_controller_version',
                        help='Target Avi controller version')
    parser.add_argument('--alb_controller_user',
                        help='controller username')
    parser.add_argument('--alb_controller_password',
                        help='controller password. Input '
                             'prompt will appear if no value provided')
    parser.add_argument('-n', '--nsxt_ip',
                        help='Ip of NSXT', required=True)
    parser.add_argument('-u', '--nsxt_user',
                        help='NSX-T User name')
    parser.add_argument('-p', '--nsxt_password',
                        help='NSX-T Password')
    parser.add_argument('-port', '--nsxt_port', default=443,
                        help='NSX-T Port')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )
    parser.add_argument('--vs_filter',
                        help='comma separated names of virtual services for performing rollback.\n',
                        required=True)

    start = datetime.now()
    args = parser.parse_args()
    if not args.nsxt_password:
        if os.environ.get('nsxt_password'):
            args.nsxt_password = os.environ.get('nsxt_password')
        else:
            print("\033[91m"+'ERROR: please provide nsxt password either through '
                            'environment variable or as a script parameter'+"\033[0m")
            exit()
    if not args.alb_controller_password:
        if os.environ.get('alb_controller_password'):
            args.alb_controller_password= os.environ.get('alb_controller_password')
        else:
            print('\033[91m'+'ERROR: please provide alb_controller_password either through environment variable or as a script parameter'+"\033[0m")
            exit()
    nsxtalb_rollback = NsxtAlbRollback(args)
    nsxtalb_rollback.initiate_rollback()
    end = datetime.now()
    print("The time of execution of above program is :",
          str(end - start))
