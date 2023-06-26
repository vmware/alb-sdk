#!/usr/bin/env python3

############################################################################
# ========================================================================
# Copyright 2021 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0
from datetime import datetime
import argparse
import logging
import os
import sys
import paramiko
import avi.migrationtools
import avi.migrationtools.f5_converter.converter_constants as conv_const
import yaml
from avi.migrationtools import avi_rest_lib
from avi.migrationtools.ansible.ansible_config_converter import \
    AviAnsibleConverterMigration
from avi.migrationtools.avi_converter import AviConverter
from avi.migrationtools.avi_migration_utils import (PasswordPromptAction,
                                                    get_count)
from avi.migrationtools.avi_orphan_object import wipe_out_not_in_use
from avi.migrationtools.f5_converter import (f5_config_converter, f5_parser,
                                             scp_util)
from avi.migrationtools.f5_converter.conversion_util import F5Util
from avi.migrationtools.f5_converter.ciphers_converter import CiphersConfigConv

# urllib3.disable_warnings()
LOG = logging.getLogger(__name__)
sdk_version = getattr(avi.migrationtools, "__version__", None)
controller_version = getattr(
    avi.migrationtools,
    "__controller_version__",
    None)

DEFAULT_SKIP_TYPES = [
    "SystemConfiguration",
    "Network",
    "debugcontroller",
    "VIMgrVMRuntime",
    "VIMgrIPSubnetRuntime",
    "Alert",
    "VIMgrSEVMRuntime",
    "VIMgrClusterRuntime",
    "VIMgrHostRuntime",
    "DebugController",
    "ServiceEngineGroup",
    "SeProperties",
    "ControllerProperties",
    "CloudProperties",
]

ARG_DEFAULT_VALUE = {
    "version": False,
    "skip_pki": False,
    "ansible": False,
    "skip_default_file": False,
    "controller_version": controller_version,
    "option": "cli-upload",
    "distinct_app_profile": False,
    "f5_ssh_port": 22,
    "reuse_http_policy": False,
    "vs_level_status": False,
    "cloud_name": "Default-Cloud",
    "convertsnat": False,
    "ansible_filter_types": [],
    "user": "admin",
    "not_in_use": False,
    "vs_state": "disable",
    "f5_config_version": "11",
    "ansible_skip_types": [
        "SystemConfiguration",
        "Network",
        "debugcontroller",
        "VIMgrVMRuntime",
        "VIMgrIPSubnetRuntime",
        "Alert",
        "VIMgrSEVMRuntime",
        "VIMgrClusterRuntime",
        "VIMgrHostRuntime",
        "DebugController",
        "ServiceEngineGroup",
        "SeProperties",
        "ControllerProperties",
        "CloudProperties",
    ],
    "input_folder_location": "./",
    "object_merge": True,
}

ARG_CHOICES = {
    "option": ["cli-upload", "auto-upload"],
    "vs_state": ["enable", "disable"],
}


is_host_present = False


class F5Converter(AviConverter):
    def __init__(self, args):
        self.bigip_config_file = args.bigip_config_file
        self.skip_default_file = args.skip_default_file
        self.skip_pki = args.skip_pki
        self.f5_config_version = args.f5_config_version
        self.input_folder_location = args.input_folder_location
        self.output_file_path = args.output_file_path if args.output_file_path else "output"
        self.option = args.option
        self.user = args.user
        self.password = args.password
        self.controller_ip = args.controller_ip
        self.tenant = args.tenant
        self.cloud_name = args.cloud_name
        self.vs_state = args.vs_state
        self.controller_version = args.controller_version
        self.distinct_app_profile = args.distinct_app_profile
        self.f5_host_ip = args.f5_host_ip
        self.f5_ssh_user = args.f5_ssh_user
        self.f5_ssh_password = args.f5_ssh_password
        self.f5_ssh_port = args.f5_ssh_port
        self.f5_key_file = args.f5_key_file
        self.ignore_config = args.ignore_config
        self.partition_config = args.partition_config
        self.version = args.version
        self.object_merge_check = args.object_merge
        # config_patch.py args taken into class variable
        self.patch = args.patch
        # vs_filter.py args taken into classs variable
        self.vs_filter = args.vs_filter
        # skip the object while creating ansible playbook
        self.ansible_skip_types = args.ansible_skip_types
        # Create ansible object playbook based on filter types.
        self.ansible_filter_types = args.ansible_filter_types
        # Tag to create ansible playbook.
        self.create_ansible = args.ansible
        # Prefix for objects
        self.prefix = args.prefix
        # rule config for irule conversion
        self.custom_config = args.custom_config
        # Setting snat conversion flag using args
        self.con_snatpool = args.convertsnat
        # Added not in use flag
        self.not_in_use = args.not_in_use
        # Added args for baseline profile json file to be changed
        self.profile_path = args.baseline_profile
        self.f5_passphrase_file = args.f5_passphrase_file
        self.vs_level_status = args.vs_level_status
        # Added args for creating test vips
        self.test_vip = args.test_vip
        # Support for vrf ref and segroup ref
        self.vrf = args.vrf
        self.segroup = args.segroup
        self.reuse_http_policy = args.reuse_http_policy
        self.skip_disabled_vs = args.skip_disabled_vs
        # Created f5 util object.
        self.conversion_util = F5Util()

    def print_pip_and_controller_version(self):
        """
        This method print the sdk version and controller version
        :return:
        """
        # Added input parameters to log file
        params = " ".join(sys.argv)
        if self.f5_ssh_password:
            params = params.replace(self.f5_ssh_password, "******")
        if self.password:
            params = params.replace(self.password, "******")
        LOG.info("Input parameters: %s", params)
        # Add logger and print avi migrationtool version
        LOG.info(
            "AVI sdk version: %s Controller Version: %s",
            sdk_version,
            self.controller_version,
        )
        print(
            "AVI sdk version: %s Controller Version: %s",
            sdk_version,
            self.controller_version,
        )

    def upload_config_to_controller(self, avi_config):
        """

        :param avi_config: conversion of f5 to avi compatible dict.
        :return:
        """
        avi_rest_lib.upload_config_to_controller(
            avi_config,
            self.controller_ip,
            self.user,
            self.password,
            self.tenant,
            self.controller_version,
        )

    def convert(self):
        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        self.init_logger_path()
        output_dir = os.path.normpath(self.output_file_path)
        input_dir = os.path.normpath(self.input_folder_location)
        is_download_from_host = False
        if self.f5_host_ip:
            input_dir = output_dir + os.path.sep + self.f5_host_ip + os.path.sep + "input"
            if not os.path.exists(input_dir):
                os.makedirs(input_dir)
            output_dir = output_dir + os.path.sep + self.f5_host_ip + os.path.sep + "output"
            if not os.path.exists(output_dir):
                os.makedirs(output_dir)
            is_download_from_host = True
        is_host_present=is_download_from_host
        user_ignore = {}

        # Read the attributes for user ignore val
        if self.ignore_config:
            with open(self.ignore_config) as stream:
                user_ignore = yaml.safe_load(stream)
        custom_mappings = None
        if self.custom_config:
            with open(self.custom_config) as stream:
                custom_mappings = yaml.safe_load(stream)
        partitions = []
        # Add logger and print avi f5 converter version
        self.print_pip_and_controller_version()
        if self.partition_config and isinstance(self.partition_config, str):
            partitions = self.partition_config.split(",")
        elif self.partition_config and isinstance(self.partition_config, list):
            partitions = self.partition_config
        source_file = None
        if is_download_from_host:
            LOG.debug("Copying files from host")
            print("Copying Files from Host...")
            scp_util.get_files_from_f5(
                input_dir,
                self.f5_host_ip,
                self.f5_ssh_user,
                self.f5_ssh_password,
                None,
                self.f5_ssh_port,
            )
            LOG.debug("Copied input files")
            source_file = open(input_dir + os.path.sep + "bigip.conf", "r")
            files = os.listdir(input_dir)
            for file_name in files:
                if file_name.endswith("_bigip.conf"):
                    partitions.append(input_dir + os.path.sep + file_name)
        elif self.bigip_config_file:
            source_file = open(self.bigip_config_file, "r")
        if not source_file:
            print("Not found F5 configuration file")
            return
        source_str = source_file.read()
        total_size = source_file.tell()
        LOG.debug("Parsing config file: %s", source_file.name)
        print("Parsing Input Configuration...")
        f5_config_dict, not_supported_list = f5_parser.parse_config(
            source_str, total_size, self.f5_config_version)


        if is_download_from_host:
            cipher_conf_file = open(input_dir + os.path.sep + "cipher.conf", "r")
            cipher_config_dict=None
            if cipher_conf_file:
                cipher_source_str = cipher_conf_file.read()
                cipher_total_size = cipher_conf_file.tell()
                cipher_config_dict, cipher_not_supported_list = f5_parser.parse_config(
                cipher_source_str, cipher_total_size, self.f5_config_version)

        LOG.debug("Config file %s parsed successfully", source_file.name)
        avi_config_dict = None
        LOG.debug("Parsing defaults files")
        f5_defaults_dict = self.get_default_config(
            is_download_from_host, input_dir)
        # Added to get not supported parse config
        not_supported_list_partition = []
        if partitions:
            partition_conf = {}
            for partition in partitions:
                with open(partition, "r") as p_source_file:
                    p_src_str = p_source_file.read()
                    total_size = p_source_file.tell()
                LOG.debug(
                    "Parsing partition config file: %s",
                    p_source_file.name)
                print("Parsing Partitions Configuration...")
                partition_dict, not_supported_list = f5_parser.parse_config(
                    p_src_str, total_size, self.f5_config_version)
                LOG.debug(
                    "Config file %s parsed successfully",
                    p_source_file.name)
                # TO get all not supported configuration.
                not_supported_list_partition = not_supported_list_partition + not_supported_list
                self.dict_merge(partition_conf, partition_dict)
            self.dict_merge(partition_conf, f5_config_dict)
            f5_config_dict = partition_conf
        # Added not supported parse config to file
        merged_not_supported_list = not_supported_list + not_supported_list_partition
        # Added status of all command that are not supported in parsing.
        for command in merged_not_supported_list:
            d = command.rsplit("/", 1)
            object_type = d[0].rsplit(" ", 1)
            object_name = '%s/%s' % (object_type[-1], d[-1])
            self.conversion_util.add_status_row(
                object_type[0], "", object_name, conv_const.STATUS_NOT_SUPPORTED)
        LOG.debug("Defaults files parsed successfully")
        LOG.debug("Conversion started")
        self.dict_merge(f5_defaults_dict, f5_config_dict)
        f5_config_dict = f5_defaults_dict
        report_name = os.path.splitext(os.path.basename(source_file.name))[0]
        start = datetime.now()

        migrated_ciphers_dict={}
        migrated_ciphers_group_dict={}
        if is_download_from_host:
            cipher_conv = CiphersConfigConv(self.f5_host_ip, self.f5_ssh_password,
                                            self.f5_ssh_user,self.controller_ip,self.user,
                                            self.password,self.f5_config_version)

            migrated_ciphers_dict,migrated_ciphers_group_dict=cipher_conv.migrate_ciphers_and_cipher_group(
                                                            f5_config_dict,cipher_config_dict,self.f5_config_version)

        avi_config_dict, part_mapping = f5_config_converter.convert(
            f5_config_dict, output_dir, self.vs_state, input_dir, self.f5_config_version,
            self.object_merge_check, self.controller_version, report_name, self.prefix,
            self.con_snatpool, user_ignore, self.profile_path, self.tenant, self.cloud_name,
            self.f5_passphrase_file, self.vs_level_status, self.vrf, self.segroup,
            custom_mappings, self.skip_pki, self.distinct_app_profile, self.reuse_http_policy,
            self.skip_disabled_vs,migrated_ciphers_dict=migrated_ciphers_dict,
            migrated_ciphers_group_dict=migrated_ciphers_group_dict
        )
        # validating avi config dict for object length
        self.trim_object_length(avi_config_dict)
        avi_config = self.process_for_utils(avi_config_dict)
        # Check if flag true then skip not in use object
        if self.not_in_use:
            avi_config = wipe_out_not_in_use(avi_config)
        self.write_output(avi_config, output_dir, '%s-Output.json' %
                          report_name)
        if self.vs_filter:
            F5Util().remove_vs_names_when_vs_filter_is_provided(
                output_dir=output_dir, report_name=report_name, vs_names=self.vs_filter)
        # Call to create ansible playbook if create ansible flag set.
        if self.create_ansible:
            avi_traffic = AviAnsibleConverterMigration(
                avi_config,
                output_dir,
                self.prefix,
                self.not_in_use,
                test_vip=self.test_vip,
                skip_types=self.ansible_skip_types,
                partitions=part_mapping,
                controller_version=self.controller_version,
                filter_types=self.ansible_filter_types,
            )
            avi_traffic.write_ansible_playbook(
                self.f5_host_ip, self.f5_ssh_user, self.f5_ssh_password, "f5")
        if self.option == "auto-upload":
            self.upload_config_to_controller(avi_config)
        print("Total Warning: ", get_count("warning"))
        print("Total Errors: ", get_count("error"))


    def get_default_config(self, is_download, path):
        """

        :param is_download:
        :param path:
        :return:
        """
        f5_defaults_dict = {}
        if is_download:
            print("Copying Files from Host...")
            with open(path + os.path.sep + "profile_base.conf", "r") as profile:
                profile_base = profile.read()
                total_size = profile.tell()
            with open(path + os.path.sep + "base_monitors.conf", "r") as monitor:
                monitor_base = monitor.read()
                total_size_mnt = monitor.tell()
            if self.skip_default_file:
                LOG.warning(
                    "Skipped default profile base file : %s\nSkipped "
                    "default monitor base file : %s", profile.name, monitor.name, )
                return f5_defaults_dict
            profile_dict, not_supported_list = f5_parser.parse_config(
                profile_base, total_size, self.f5_config_version)
            monitor_dict, not_supported_list = f5_parser.parse_config(
                monitor_base, total_size_mnt, self.f5_config_version)
            if int(self.f5_config_version) == 10:
                default_mon = monitor_dict.get("monitor", {})
                root_mon = monitor_dict["monitorroot"]
                for key in root_mon.keys():
                    default_mon[key.replace("type ", "")] = root_mon[key]
                monitor_dict["monitor"] = default_mon
                del monitor_dict["monitorroot"]
            profile_dict.update(monitor_dict)
            f5_defaults_dict = profile_dict

        else:
            if self.f5_config_version == "12":
                self.f5_config_version = "11"
            if getattr(sys, "frozen", False):
                # running in a exe bundle
                dir_path = os.path.abspath(os.path.dirname(__file__))
            else:
                # Added to get directory path.
                dir_path = self.conversion_util.get_project_path()
                dir_path = dir_path + os.path.sep + "f5_converter"
            with open(dir_path + os.path.sep + "f5_v%s_defaults.conf" %
                      self.f5_config_version, "r") as defaults_file:
                if self.skip_default_file:
                    LOG.warning(
                        "Skipped default file : %s",
                        defaults_file.name)
                    return f5_defaults_dict
                f5_defaults_dict, not_supported_list = f5_parser.parse_config(
                    defaults_file.read(), defaults_file.tell(), self.f5_config_version)
        return f5_defaults_dict

    def dict_merge(self, dct, merge_dct):
        """
        This method merge the two dicts into one.
        :param dct:
        :param merge_dct:
        :return:
        """
        for key in merge_dct:
            if key in dct and isinstance(
                    dct[key], dict) and isinstance(merge_dct[key], dict):
                self.dict_merge(dct[key], merge_dct[key])
            else:
                dct[key] = merge_dct[key]


def set_default_args(terminal_args):
    """
    set default arguments
    """
    for argument in terminal_args.__dict__:
        if argument in ARG_DEFAULT_VALUE and terminal_args.__dict__[
                argument] is None:
            terminal_args.__dict__[argument] = ARG_DEFAULT_VALUE[argument]


def get_terminal_args(terminal_args):
    """
    for getting terminal arguments
    """
    if terminal_args.__dict__["ansible_skip_types"]:
        terminal_args.__dict__["ansible_skip_types"] = terminal_args.__dict__[
            "ansible_skip_types"].split(",")
    if terminal_args.__dict__["ansible_filter_types"]:
        terminal_args.__dict__["ansible_filter_types"] = terminal_args.__dict__[
            "ansible_filter_types"].split(",")
    if terminal_args.__dict__["vs_filter"]:
        terminal_args.__dict__["vs_filter"] = terminal_args.__dict__[
            "vs_filter"].split(",")
    if terminal_args.__dict__["partition_config"]:
        terminal_args.__dict__["partition_config"] = terminal_args.__dict__[
            "partition_config"].split(",")

    LOG.debug("\n TERMINAL ARGS: %s", terminal_args)

    if terminal_args.args_config_file:
        with open(terminal_args.args_config_file) as file:
            global config_file
            config_file = yaml.full_load(file)
            if config_file:
                LOG.debug("\n CONFIG ARGS: %s", config_file)
                for terminal_arg in terminal_args.__dict__:
                    if (
                        terminal_arg not in config_file.keys()
                        and terminal_args.__dict__[terminal_arg] is None
                        and terminal_arg in ARG_DEFAULT_VALUE.keys()
                    ):
                        terminal_args.__dict__[
                            terminal_arg] = ARG_DEFAULT_VALUE[terminal_arg]
                    elif (
                        terminal_arg in config_file.keys()
                        and config_file[terminal_arg] is None
                        and terminal_args.__dict__[terminal_arg] is None
                        and terminal_arg in ARG_DEFAULT_VALUE.keys()
                    ):
                        terminal_args.__dict__[
                            terminal_arg] = ARG_DEFAULT_VALUE[terminal_arg]
                    elif terminal_arg in config_file.keys() and terminal_arg in ARG_DEFAULT_VALUE.keys():
                        if terminal_args.__dict__[terminal_arg] == ARG_DEFAULT_VALUE[terminal_arg] and not isinstance(
                                terminal_args.__dict__[terminal_arg], bool):
                            continue
                        if terminal_args.__dict__[
                                terminal_arg] == ARG_DEFAULT_VALUE[terminal_arg]:
                            terminal_args.__dict__[
                                terminal_arg] = config_file[terminal_arg]
                        elif terminal_args.__dict__[terminal_arg] is None:
                            terminal_args.__dict__[
                                terminal_arg] = config_file[terminal_arg]
                    elif (
                        terminal_arg in config_file.keys()
                        and terminal_arg not in ARG_DEFAULT_VALUE.keys()
                        and terminal_args.__dict__[terminal_arg] is None
                    ):
                        terminal_args.__dict__[
                            terminal_arg] = config_file[terminal_arg]

                # Validate argument choice values
                for argument in ARG_CHOICES.keys():
                    if terminal_args.__dict__[argument] not in ARG_CHOICES[argument]:
                        msg = "%s: error: argument --%s: invalid choice: " \
                              "'%s' (choose from %s)" % (parser.prog, argument,
                                                         terminal_args.__dict__[argument],
                                                         ARG_CHOICES[argument])
                        LOG.debug(msg)
                        print(msg)
                        exit(1)
            else:
                set_default_args(terminal_args)
    else:
        set_default_args(terminal_args)
    terminal_args.f5_config_version = str(terminal_args.f5_config_version)

    LOG.debug("\n FINAL ARGS ============== %s", terminal_args.__dict__)
    return terminal_args


if __name__ == "__main__":

    HELP_STR = """
    Converts F5 Config to Avi config.

    Example to convert F5 config file to Avi json config:
        f5_converter.py -f bigip.conf
    Usecase:
        Runs migration tool against local bipip.conf. (bigip.conf doesn't contain certificates and keys.
        Migration tool will auto-generate place holder ones)

    Example to skip default file in f5:
        f5_converter.py -f bigip.conf --skip_default_file
    Usecase:
        To skip default profile and monitor configuration

    Example to f5_config_version
        f5_converter.py -f bigip.conf -v 10
    Usecase:
        Used for specifying the version of LTM you're migrating

    Example to download config from f5 host and convert to Avi config:
        f5_converter.py --f5_host_ip 1.1.1.1 --f5_ssh_user username --f5_ssh_password password
    Usecase:
        Download configuration, certificates, and keys, to create Avi json config

    Example to auto upload to controller after conversion:
        f5_converter.py -f bigip.conf -O auto-upload -c 2.2.2.2 -u username -p password -t tenant
    Usecase:
        Run the migration tool, create the Avi config,
        and upload all in one step

    Example to use -s or --vs_state option:
        f5_converter.py -f bigip.conf -s enable
    Usecase:
        Sets traffic_enabled to true in Virtual Service configuration

    Example to use input file for local certs and key
        f5_converter.py -f bigip.conf -l /home/username
    Usecase:
        Creates Avi config mapping local certificates and keys.
        Local certificate and key names must match names in config to properly map
        F5 appends digits to the end of the original certificate name

    Example to use --controller_version option:
        f5_converter.py -f bigip.conf --controller_version <21.1.4>
    Usecase: To provide the version of controller for getting output in respective controller format.

    Example to use ignore config option:
         f5_converter.py -f bigip.conf --ignore_config
    Usecase:
        The attributes mentioned in ignore_config.
        yaml will appear in ignore column in excel sheet instead of skip.
        It will need an ignore_config.yaml file in the input directory defined by user
        <Example Format>
            monitor:
              https:
              - 'destination'
              gateway-icmp:
              - 'destination'
              - 'adaptive'

    Example to use --partition_config option:
       f5_converter.py -f bigip.conf --partition_config /home/username/abc.txt
    Usecase:
        When auto-download option enable.
        It will download the files from different
        f5 partitions with comma separated path provided with partition config option.

    Example to use  object merge option:
        f5_converter.py -f bigip.conf --object_merge
    Usecase:
        When we don't need to merge two of the same objects
        (Multiple objects with matching attributes but different names)

    Example to patch the config after conversion:
        f5_converter.py -f bigip.conf --patch test/patch.yaml
        where patch.yaml file contains
        <avi_object example Pool>:
        Pool:
          - match_name: <existing name example p1>
            patch:
              name: <changed name example coolpool>
    Usecase:
        Use for bulk changes to config. Example:
        Enabling XFF in application profile or disabling traffic on VS

    Example to export/migrate list of virtual services
         f5_converter.py -f bigip.conf --vs_filter vs1,vs3,vs5
    Usecase:
        Comma seperated list that is useful for only migrating VSs
        and their child objects that are in scope

    Example to skip Avi object during playbook creation
        f5_converter.py -f bigip.conf --ansible
        --ansible_skip_types DebugController
    Usecase:
        Comma separated list of Avi Object types to skip during conversion.
        Example: DebugController, ServiceEngineGroup will
        skip debugcontroller and serviceengine objects

    Example to filter ansible object
        f5_converter.py -f bigip.conf --ansible
        --ansible_filter_types virtualservice, pool
    Usecase:
        Comma separated list of Avi Objects types to include during conversion.
        Example: VirtualService , Pool will do ansible conversion
        only for Virtualservice and Pool objects

    Example to use ansible option:
        f5_converter.py -f bigip.conf --ansible
    Usecase: To generate the ansible playbook for the Avi
    configuration which can be used for upload to controller

    Example to add the prefix to Avi object name:
        f5_converter.py -f bigip.conf --prefix abc
    Usecase:
        When two configuration is to be uploaded to same controller then in order
        to differentiate between the objects that will be uploaded in second time.

    Example to convert snatpool into individual address
        f5_converter.py -f bigip.conf --convertsnat
    Usecase:
        Flag to enable Source Network Address Translation in Avi.

    Example to use not_in_use option:
        f5_converter.py -f bigip.conf --not_in_use
    Usecase:
        Dangling object which are not referenced by any
        Avi object will be removed

    Example to provide baseline json file absolute location:
        f5_converter.py -f bigip.conf --baseline_profile
        /home/<'sys_conf.json' or 'bigip-Output.json'>
    Usecase:
        Need to merge objects if there is migration of two
        f5 instances/box to single controller.

    Example to provide passphrase of encrypted certs and certkey file location
         f5_converter.py -f bigip.conf -l /home/certs/
         --f5_passphrase_file passphrase.yaml
         passphrase.yaml file contains
          <file_name>:<passphrase>
          <file_name2>:<passphrase2>
          Example:
            mcqcim.key: ZcZawJ7ps0AJ+5TMDi7UA==
            avi_key.pem : foobar
    Usecase:
        To complete an offline migration,
        you need to call a directory containing certs and keys because the
        bigip.conf doesn't contain them. If not used,
        the migration tool will auto create placeholder ones.

    Example to use vs level status option:
        f5_converter.py -f bigip.conf --vs_level_status
    Usecase:
        To get the vs level status for enhanced reporting for the Avi objects in excel sheet

    Example to use segroup flag
        f5_converter.py -f bigip.conf --segroup segroup_name
    UseCase:
        To add or update segroup reference of vs

    Example to use vrf flag
        f5_converter.py -f bipip.conf --vrf vrf_name
    Usecase:
        Change all the vrf reference in the configuration while conversion

    Example to use args config_file
       f5_converter.py --args_config_file ./test/config.yaml
    Usecase:
        To pass the cli params using config.yaml file bigip_config_file:
        './test/bigip_v11.conf' controller_version: '20.1.4'
        File located https://github.com/vmware/alb-sdk/blob/eng/python/avi/migrationtools/f5_converter/config.yaml

    Example to use reuse http policy flag
        f5_converter.py -f bipip.conf --reuse_http_policy
    Usecase:
        Create http policy once and reuse it with all applicable VSs

    Example to use the skip PKI flag
        f5_converter.py -f bipip.conf --skip_pki
    Usecase:
        --skip_pki flag is used for testing and debugging.
        Sometimes pki profile is quite big and it takes
        more time to convert so for testing purpose
        we use this flag to skip the pki profile
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter,
        description=(HELP_STR))

    # Create Ansible Script based on Flag
    parser.add_argument(
        "--ansible",
        help="Flag for create ansible files (Create and Delete playbooks)",
        action="store_false",
    )
    # Added command line args to take skip type for ansible playbook
    parser.add_argument(
        "--ansible_skip_types",
        help="Comma separated list of Avi Object types to skip "
        "during conversion.\n  Example: -s DebugController,"
        "ServiceEngineGroup will skip debugcontroller and "
        "serviceengine objects",
    )
    # Added command line args to take skip type for ansible playbook
    parser.add_argument(
        "--ansible_filter_types",
        help="Comma separated list of Avi Objects types to "
        "include during conversion.\n Example: -f "
        "VirtualService, Pool will do ansible conversion "
        "only for Virtualservice and Pool objects",
    )
    # Added args for baseline profile json file
    parser.add_argument(
        "--baseline_profile",
        help="Absolute path for json " "File containing baseline profiles",
    )
    parser.add_argument(
        "-c",
        "--controller_ip",
        help="Destination controller ip or fqdn for config upload",
    )
    parser.add_argument(
        "--cloud_name",
        help="Destination cloud name",
        required=True)
    parser.add_argument(
        "--controller_version",
        help="Target Avi controller version",
        required=True)
    # Added snatpool conversion option
    parser.add_argument(
        "--convertsnat",
        help="Flag for converting snatpool into " "individual addresses",
        action="store_true",
    )
    parser.add_argument(
        "--custom_config",
        help="iRule/monitor custom mapping yml file path.\
            (File containing converted iRules or health monitors)",
    )
    parser.add_argument(
        "--distinct_app_profile",
        action="store_true",
        help="Option to create distinct application profile for"
        " each VS even though it is shared in F5 config",
    )
    parser.add_argument(
        "-f",
        "--bigip_config_file",
        help="Absolute path for F5 config file")
    parser.add_argument("--f5_host_ip", help="Host ip of f5 instance")
    parser.add_argument(
        "--f5_key_file",
        help="F5 host key file location if key based " + "authentication",
    )
    parser.add_argument(
        "--f5_passphrase_file",
        help="F5 key passphrase yaml file path")
    parser.add_argument("--f5_ssh_user", help="f5 host ssh username")
    parser.add_argument(
        "--f5_ssh_password",
        action=PasswordPromptAction,
        nargs="?",
        help="f5 host ssh password if password "
        "based authentication. Input prompt "
        "will appear if no value provided",
    )
    parser.add_argument(
        "--f5_ssh_port",
        help="F5 host ssh port id non default port is used ")
    parser.add_argument(
        "--ignore_config",
        help="Config file to skip specific configuration in conversion",
    )

    parser.add_argument(
        "-l",
        "--input_folder_location",
        help="Location of input files like cert files " +
        "external monitor scripts",
    )
    # Changed the command line option to more generic term object
    parser.add_argument(
        "--object_merge",
        help="Flag for enabling object merge",
        action="store_true")
    # Added not in use flag
    parser.add_argument(
        "--not_in_use",
        help="Flag for migrating not in use object",
        action="store_false",
    )
    parser.add_argument(
        "-o",
        "--output_file_path",
        help="Folder path for output files to be created in",
    )
    parser.add_argument(
        "-O",
        "--option",
        choices=ARG_CHOICES["option"],
        help="Upload option cli-upload genarates Avi config " +
        "file auto upload will upload config to " + "controller",
    )
    parser.add_argument(
        "-p",
        "--password",
        help="Destination controller password for config upload. Input "
        "prompt will appear if no value provided",
    )
    parser.add_argument(
        "--partition_config",
        help="Comma separated partition config files")
    # Added command line args to execute config_patch file with related Avi
    # json file location and patch location
    parser.add_argument("--patch", help="Absolute path to patch.yaml file")
    # Added prefix for objects
    parser.add_argument("--prefix", help="Prefix for objects")
    parser.add_argument(
        "-s",
        "--vs_state",
        choices=ARG_CHOICES["vs_state"],
        help="traffic_enabled state of VS created",
    )
    parser.add_argument(
        "--segroup",
        help="Update the available segroup ref with the custom ref")
    parser.add_argument(
        "--skip_default_file",
        help="Flag for skip default file",
        action="store_true")
    parser.add_argument(
        "--skip_pki",
        help="Skip migration of PKI profile",
        action="store_true")
    parser.add_argument(
        "-t",
        "--tenant",
        help="Destination tenant name",
        required=True)
    # Adding support for test vip
    parser.add_argument(
        "--test_vip",
        help="Enable test vip for ansible generated file "
        "It will replace the original vip "
        "Note: The actual ip will vary from input to output"
        "use it with caution ",
    )
    parser.add_argument(
        "-u",
        "--user",
        help="Username on destination controller for config upload")
    parser.add_argument(
        "-v",
        "--f5_config_version",
        help="Version of f5 config file")
    parser.add_argument(
        "--version",
        help="Print product version and exit",
        action="store_true")
    parser.add_argument(
        "--vrf",
        help="Update the available vrf ref with the custom vrf" "reference",
        required=True,
    )
    # Added command line args to execute vs_filter.py with vs_name.
    parser.add_argument(
        "--vs_filter",
        help="Comma seperated names of virtualservices. vs1,vs3,vs5\n"
        "Note: If patch data is supplied, vs_name should match "
        "the new name given in it",
    )
    parser.add_argument(
        "--vs_level_status",
        action="store_true",
        help="Add columns of vs reference and overall skipped "
        "settings in status excel sheet",
    )
    parser.add_argument(
        "--reuse_http_policy",
        action="store_true",
        help="Detect and reuse the HTTP policy that are "
        "shared across multiple VS",
    )
    # Config file to override all parameters of this script

    parser.add_argument(
        "--args_config_file",
        help="Config file to specify all the arguments "
        "of this script. Argument values provided "
        "on terminal take precedence over config file "
        "argument values",
    )
    parser.add_argument(
        "--skip_disabled_vs",
        help="Flag for skipping those vs/s which are disabled on f5",
        action="store_true",
    )

    terminal_args = parser.parse_args()
    args = get_terminal_args(terminal_args)

    # print avi f5 converter version
    if args.version:
        print("SDK Version: %s\nController Version: %s" % \
              (sdk_version, args.controller_version))
        exit(0)
    f5_converter = F5Converter(args)
    f5_converter.convert()
