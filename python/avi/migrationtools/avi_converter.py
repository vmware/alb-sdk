# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import random

import json
import logging
import os
import string
import yaml

import avi.migrationtools
from avi.migrationtools import avi_rest_lib
from avi.migrationtools.config_patch import ConfigPatch
from avi.migrationtools.vs_filter import filter_for_vs
from avi.migrationtools.avi_migration_utils import MigrationUtil


LOG = logging.getLogger(__name__)
sdk_version = getattr(avi.migrationtools, '__version__', None)

mg_util = MigrationUtil()


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
        LOG.info('written avi config file %s %s output.son',
                 output_dir, os.path.sep)

    def init_logger_path(self):
        LOG.setLevel(logging.DEBUG)
        print("Log File Location: %s" % self.output_file_path)
        formatter = '[%(asctime)s] %(levelname)s [%(funcName)s:%(lineno)d] %(message)s'
        logging.basicConfig(filename=os.path.join(self.output_file_path, 'converter.log'),
                            level=logging.DEBUG, format=formatter)

    def trim_object_length(self, avi_config):
        '''
        Method for triming object length when it exceeds max allowed length
        param: passed migrated avi configuration
        '''
        list_with_max_280_char = ['VsVip', 'PoolGroup', 'Pool', 'NetworkSecurityPolicy', 'HTTPPolicySet']
        for key in avi_config.keys():
            if key in list_with_max_280_char:
                self.trim_length_if_name_field_exceeds_max_char(avi_config[key], avi_config, key, 280)
            else:
                self.trim_length_if_name_field_exceeds_max_char(avi_config[key], avi_config, key, 256)

    def trim_length_if_name_field_exceeds_max_char(self, obj_config_dict, avi_config, obj_type, max_char):
        """
        Trim object length

        Args:
            obj_config_dict: passed object configuration
            avi_config : passed migrated avi configuration
            obj_type : passed object type
            max_char : max allowed character for object length
        """
        cp = ConfigPatch(avi_config, '')
        for obj_config in obj_config_dict:
            if len(obj_config['name']) > max_char:

                random_str = ''.join(random.choice(string.ascii_uppercase + string.ascii_lowercase
                                                   + string.digits) for _ in range(3))

                obj_config['description'] = obj_config['name']
                new_obj_name = "%s-%s" % ((obj_config['name'])[:200],random_str)

                old_obj_ref, new_obj_ref = self.get_old_and_new_obj_ref(
                    avi_config, obj_config, new_obj_name, obj_config['name'], obj_type)

                cp.update_references(obj_type, old_obj_ref, new_obj_ref, avi_cfg=avi_config)
                obj_config['name'] = "%s-%s" % ((obj_config['name'])[:200],random_str)

    def get_old_and_new_obj_ref(self, avi_config, obj_config, new_name, old_name, obj_type):
        '''
        Method for getting object refrences
        '''

        cp = ConfigPatch(avi_config, '')
        tenant = (cp.param_value_in_ref(obj_config.get('tenant_ref'), 'name')
                  if 'tenant_ref' in obj_config else '')
        cloud = (cp.param_value_in_ref(obj_config.get('cloud_ref'), 'name')
                 if 'cloud_ref' in obj_config else '')
        new_obj_ref = mg_util.get_object_ref(
            new_name, obj_type.lower(), tenant, cloud_name=cloud)
        old_obj_ref = mg_util.get_object_ref(old_name, obj_type.lower(), tenant, cloud_name=cloud)

        return old_obj_ref, new_obj_ref
