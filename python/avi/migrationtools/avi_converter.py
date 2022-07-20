# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

from pkg_resources import parse_version
from avi.migrationtools.config_patch import ConfigPatch
from avi.migrationtools.vs_filter import filter_for_vs
from avi.migrationtools import avi_rest_lib
import yaml
import json
import logging
import os
import avi.migrationtools


LOG = logging.getLogger(__name__)
sdk_version = getattr(avi.migrationtools, '__version__', None)


class AviConverter(object):
    output_file_path = None
    patch = None
    vs_filter = None
    controller_ip = None
    user = None
    password = None
    tenant = None
    prefix = None
    skip_ref_object_list = ['cloud_ref', 'tenant_ref', 'se_group_ref']

    def print_pip_and_controller_version(self):
        pass

    def convert(self):
        pass

    def process_for_utils(self, avi_config, skip_ref_objects=skip_ref_object_list):
        """
        Check if patch args present then execute the config_patch.py with args
        :param avi_config: converted avi object dict
        :param skip_ref_objects: comma separated names of objects ref to be skipped
        :return: avi_config
        """

        if self.patch:
            with open(self.patch) as f:
                patches = yaml.load(f, Loader=yaml.Loader)
            cp = ConfigPatch(avi_config, patches)
            avi_config = cp.patch()
        # Check if vs_filter args present then execute vs_filter.py with args
        if self.vs_filter:
            avi_config = filter_for_vs(avi_config, self.vs_filter, self.prefix, skip_ref_objects=skip_ref_objects)
        return avi_config

    def upload_config_to_controller(self, avi_config):
        """
        Upload configuration to controller
        :param avi_config: converted avi object dict
        :return:
        """
        print("Uploading Configuration to Controller...")
        avi_rest_lib.upload_config_to_controller(
            avi_config, self.controller_ip, self.user, self.password,
            self.tenant, self.controller_version)

    def download_gslb_config_form_controller(self):
        """ Downloading gslb configuration from controller
            and return the output json"""
        return avi_rest_lib.download_gslb_from_controller(
            self.controller_ip, self.user, self.password, self.password)

    def write_output(self, avi_config, output_dir, report_name):
        """
        write output file for conversion
        :param avi_config: dict of converted avi object
        :param output_dir: location for output file
        :param report_name: name of file
        :param prefix: prefix for object
        :return: None
        """
        report_path = output_dir + os.path.sep + report_name
        print("Converted Output Location: %s" % \
              (report_path))
        with open(report_path, "w", encoding='utf-8') as text_file:
            json.dump(avi_config, text_file, indent=4)
        LOG.info('written avi config file ' +
                 output_dir + os.path.sep + "Output.json")

    def init_logger_path(self):
        LOG.setLevel(logging.DEBUG)
        print("Log File Location: %s" % self.output_file_path)
        formatter = '[%(asctime)s] %(levelname)s [%(funcName)s:%(lineno)d] %(message)s'
        logging.basicConfig(filename=os.path.join(self.output_file_path, 'converter.log'),
                            level=logging.DEBUG, format=formatter)
