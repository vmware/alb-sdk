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
from avi.migrationtools.nsxt_converter.nsx_cleanup import NSXCleanup

LOG = logging.getLogger(__name__)


class NsxtAlbCleanup(AviConverter):
    def __init__(self, args):
        '''

        :param args:
        '''
        self.nsxt_ip = args.nsxt_ip
        self.nsxt_user = args.nsxt_user
        self.nsxt_passord = args.nsxt_password
        self.nsxt_port = args.nsxt_port
        self.cleanup_vs_names = args.vs_filter
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
        if not self.output_file_path:
            self.output_file_path = data.get('output_file_path')

        input_path = None
        self.input_data = None
        if self.nsxt_ip:
            input_path = output_dir + os.path.sep + self.nsxt_ip + os.path.sep + "input"
        else:
            input_path = output_dir + os.path.sep + "config-output" + os.path.sep + "input"
        with open(input_path + os.path.sep + "config.json", 'r') as file:
            self.input_data = json.load(file)

    def initiate_cleanup(self):

        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        self.init_logger_path()

        if self.cleanup_vs_names:
            nsx_c = NSXCleanup(self.nsxt_user, self.nsxt_passord, self.nsxt_ip, self.nsxt_port)
            nsx_c.nsx_cleanup(self.cleanup_vs_names)

            if nsx_c.vs_not_found:
                print_msg = "\033[93m"+"Warning: Following virtual service/s could not be found"+'\033[0m'
                print(print_msg)
                print(nsx_c.vs_not_found)
        else:
            print_msg = "\033[93m" + "Warning: No virtual service/s specified for cleanup" + '\033[0m'
            print(print_msg)

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

    # Added command line args to take skip type for ansible playbook
    parser.add_argument('--vs_filter',
                        help='comma separated vs names that we want to cleanup from nsx-t side',
                        required=True)
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

    start = datetime.now()
    args = parser.parse_args()
    if not args.nsxt_password:
        if os.environ.get('nsxt_password'):
            args.nsxt_password = os.environ.get('nsxt_password')
        else:
            print("\033[91m"+'ERROR: please provide nsxt password either through '
                            'environment variable or as a script parameter'+"\033[0m")
            exit()
    nsxtalb_cleanup = NsxtAlbCleanup(args)
    nsxtalb_cleanup.initiate_cleanup()
    end = datetime.now()
    print("The time of execution of above program is :",
          str(end - start))
