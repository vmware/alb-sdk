# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import argparse
import json
import logging
import os
import yaml
import avi.migrationtools.nsxt_converter.converter_constants as conv_const

LOG = logging.getLogger(__name__)

class ALBConverter:
    def __init__(self, avi_config_file, output_file_path):
        self.avi_config_file = avi_config_file
        self.output_file_path = output_file_path
        with open(os.path.dirname(__file__) + "/command_status.yaml") as stream:
            nsxt_command_status = yaml.safe_load(stream)
        self.nsxt_attributes = nsxt_command_status.get('NSXT')

    def convert(self):

        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        output_dir = os.path.normpath(self.output_file_path)
        with open(self.avi_config_file, "r") as read_file:
            avi_config = json.load(read_file)

        alb_config = self.convert_to_alb(avi_config)

        if not os.path.exists(output_dir):
            os.makedirs(output_dir)
        output_config = output_dir + os.path.sep + "alb_config.json"
        with open(output_config, "w", encoding='utf-8') as text_file:
            json.dump(alb_config, text_file, indent=4)

    def convert_to_alb(self, avi_config):
        alb_config = dict()
        for key in avi_config.keys():
            if key in self.nsxt_attributes['SUPPORTED_ALB_OBJECTS']:
                config = []
                supported_obj = avi_config[key]
                for obj in supported_obj:
                    data = self.recursive_items(obj, {})
                    config.append(data)
                alb_config[self.nsxt_attributes['albObjectType'].get(key.lower())] = config
        return alb_config

    def recursive_items(self, obj, data):

        for k, v in obj.items():
            if k not in self.nsxt_attributes['NOT_APPLICABLE']:
                if type(v) is dict:
                    data[k] = self.recursive_items(v, {})
                elif not k.endswith("_refs") and type(v) is list:
                    tmp = []
                    for iter_over_obj in v:
                        if type(iter_over_obj) is dict:
                            tmp.append(self.recursive_items(iter_over_obj, {}))
                        else:
                            tmp.append(iter_over_obj)
                    data[k] = tmp
                elif k in self.nsxt_attributes['REPLACE_KEYS']:

                    if k == self.nsxt_attributes['REPLACE_KEYS'][0]:
                        data['display_name'] = v
                        data['id'] = v
                    if k == self.nsxt_attributes['REPLACE_KEYS'][1]:
                        data['cloud_name'] = v.split("name=")[1]
                    if k == self.nsxt_attributes['REPLACE_KEYS'][2]:
                        data['vrf_name'] = v.split("name=")[1].split("&")[0]
                    if k == self.nsxt_attributes['REPLACE_KEYS'][3]:
                        data['vrf_context_name'] = v.split("name=")[1].split(
                            "&")[0]
                    if k == self.nsxt_attributes['REPLACE_KEYS'][4]:
                        data["tier1_path"] = v
                elif k.endswith("_ref"):
                    if (v.split('/')[2] not in
                            self.nsxt_attributes['albObjectType'].keys()):
                        continue
                    object_type = self.nsxt_attributes['albObjectType'][
                        v.split('/')[2]]
                    obj_name = v.split("name=")[1]
                    if object_type == "alb-application-persistence-profiles":
                        data['application_persistence_profile_path'] = "/infra/%s/%s" % (
                            object_type, obj_name)
                    elif obj_name.__contains__("&cloud"):
                        name = obj_name.split("&cloud")[0]
                        data[k.replace("_ref", "_path")] = "/infra/%s/%s" % (
                            object_type, name)
                    else:
                        data[k.replace("_ref", "_path")] = "/infra/%s/%s" % (
                            object_type, obj_name)
                elif k.endswith("_refs"):
                    list_of_paths = list()
                    for refs in v:
                        list_of_paths.append("/infra/%s/%s" % (
                            self.nsxt_attributes['albObjectType'][
                                refs.split('/')[2]], refs.split("name=")[1]))
                    data[k.replace("_refs", "_paths")] = list_of_paths
                else:
                    data[k] = v
        return data


if __name__ == "__main__":
    HELP_STR = '''
       Converts AVI Config to ALB config.
       Example to convert AVI config file to ALB config json:
            alb_converter.py -f tmp_exported_config.json
       '''

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter,
        description=(HELP_STR))

    # Added args for baseline profile json file
    parser.add_argument('-f', '--avi_config_file',
                        help='absolute path for avi config file')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )

    args = parser.parse_args()

    output_file_path = args.output_file_path if args.output_file_path \
        else 'output-alb'
    alb_converter = ALBConverter(args.avi_config_file, output_file_path)
    alb_converter.convert()
