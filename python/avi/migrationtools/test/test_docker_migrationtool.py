# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
This testsuite contains the initial test cases for testing the
f5 converter tool along with its options / parameters
"""
import json
import logging
import os
import sys
import subprocess

import pytest
import yaml
from avi.migrationtools.test.conftest import option

config_file = option.config
output_file = option.out
avi_version = option.docker_avi_version
if not output_file:
    output_file = 'output'

if not config_file:
    print("Config file not provided!.")
    sys.exit(1)

if not avi_version:
    print("avi_version is mandatory for docker image.")
    sys.exit(1)

with open(config_file) as f:
    file_attribute = yaml.load(f, Loader=yaml.Loader)

ARG_DEFAULT_VALUE = {
    "option": "cli-upload",
    "cloud_name": "Default-Cloud",
    "user": "admin",
    "vs_state": "disable"
}

setup = dict(
    controller_version_v17=file_attribute['controller_version_v17'],
    file_version_v10='10',
    file_version_v11='11',
    version=True,
    option=file_attribute['option'],
    controller_ip_17_1_1=file_attribute['controller_ip_17_1_1'],
    controller_user_17_1_1=file_attribute['controller_user_17_1_1'],
    controller_password_17_1_1=file_attribute['controller_password_17_1_1'],
    f5_host_ip_v10=file_attribute['f5_host_ip_v10'],
    f5_host_ip_v11=file_attribute['f5_host_ip_v11'],
    f5_ssh_user=file_attribute['f5_ssh_user'],
    f5_ssh_user_10=file_attribute['f5_ssh_user_10'],
    f5_ssh_password=file_attribute['f5_ssh_password'],
    f5_ssh_port=file_attribute['f5_ssh_port'],
    no_profile_merge=file_attribute['no_profile_merge'],
    prefix=file_attribute['prefix'],
    cloud_name=file_attribute['cloud_name'],
    tenant=file_attribute['tenant'],
    input_folder_location='/alb-sdk/python/avi/migrationtools/f5_converter/test/certs',
    partition_config='new',  # this is new
    f5_key_file='cd_rt_key.pem',
    ignore_config=os.path.abspath(os.path.join(os.path.dirname(__file__),
                                               'ignore-config.yaml')),
    patch=os.path.abspath(os.path.join(os.path.dirname(__file__),
                                       'patch.yaml')),
    vs_filter='EngVIP,F5-VIP-80-001,F5-VIP-443-002',
    not_in_use=True,
    skip_file=False,
    ansible=True,
    skip_disabled_vs=False,
    baseline_profile=None,
    f5_passphrase_file=os.path.abspath(os.path.join(
        os.path.dirname(__file__), 'passphrase.yaml')),
    f5_ansible_object=os.path.abspath(os.path.join(
        os.path.dirname(__file__), 'output',
        'avi_config_create_object.yml')),
    vs_level_status=True,
    test_vip=None,
    output_file_path=output_file,
    vrf='test_vrf',
    segroup='test_se',
    distinct_app_profile=True,
    docker_input_file=file_attribute['docker_input_file'],
    docker_script_path='./run.sh'
)

if not os.path.exists(setup.get("output_file_path")):
    os.mkdir(setup.get("output_file_path"))

formatter = '[%(asctime)s] %(levelname)s [%(funcName)s:%(lineno)d] %(message)s'
logging.basicConfig(filename=os.path.join(
    setup.get('output_file_path'), 'converter.log'),
    level=logging.DEBUG, format=formatter)

mylogger = logging.getLogger(__name__)


class Namespace:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


def f5_conv(
        bigip_config_file=None, skip_default_file=False, f5_config_version=None,
        input_folder_location=setup.get('input_folder_location'),
        output_file_path=output_file, option=ARG_DEFAULT_VALUE['option'],
        user='admin',
        password=None, controller_ip=None,
        tenant='admin', cloud_name=ARG_DEFAULT_VALUE['cloud_name'],
        vs_state=ARG_DEFAULT_VALUE['vs_state'],
        controller_version=None, f5_host_ip=None, f5_ssh_user=None,
        f5_ssh_password=None, f5_ssh_port=None, f5_key_file=None,
        ignore_config=None, partition_config=None, version=False,
        no_profile_merge=False, patch=None, vs_filter=None,
        ansible_skip_types=[], ansible_filter_types=[], ansible=False, skip_disabled_vs=False,
        prefix=None, convertsnat=False, not_in_use=False, baseline_profile=None,
        f5_passphrase_file=None, vs_level_status=False, test_vip=None,
        vrf=None, segroup=None, custom_config=None, skip_pki=False,
        distinct_app_profile=False, reuse_http_policy=False, args_config_file=None):
    args = Namespace(bigip_config_file=bigip_config_file,
                     skip_default_file=skip_default_file,
                     f5_config_version=f5_config_version,
                     input_folder_location=input_folder_location,
                     output_file_path=output_file_path, option=option,
                     user=user, password=password, controller_ip=controller_ip,
                     tenant=tenant, cloud_name=cloud_name, vs_state=vs_state,
                     controller_version=controller_version,
                     f5_host_ip=f5_host_ip, f5_ssh_user=f5_ssh_user,
                     f5_ssh_password=f5_ssh_password,
                     f5_ssh_port=f5_ssh_port, f5_key_file=f5_key_file,
                     ignore_config=ignore_config,
                     partition_config=partition_config, version=version,
                     object_merge=no_profile_merge, patch=patch,
                     vs_filter=vs_filter, ansible_skip_types=ansible_skip_types,
                     skip_disabled_vs=skip_disabled_vs,
                     ansible_filter_types=ansible_filter_types, ansible=ansible,
                     prefix=prefix, convertsnat=convertsnat,
                     not_in_use=not_in_use, baseline_profile=baseline_profile,
                     f5_passphrase_file=f5_passphrase_file,
                     vs_level_status=vs_level_status, test_vip=test_vip,
                     vrf=vrf, segroup=segroup,
                     custom_config=custom_config,
                     skip_pki=skip_pki,
                     distinct_app_profile=distinct_app_profile,
                     reuse_http_policy=reuse_http_policy,
                     args_config_file=args_config_file)

    generated_f5_converter_cmd = get_docker_run_cmd(args)
    docker_cmd = "{} -v {} -c '{}'".format(setup.get('docker_script_path'),
                                                avi_version,
                                                generated_f5_converter_cmd)
    f5_converter_result = subprocess.run(docker_cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                                         text=True)
    avi_config = {'resp': f5_converter_result.stdout.strip(),
                  'error': f5_converter_result.stderr.strip()}
    return avi_config


def get_docker_run_cmd(terminal_args):
    """
    Generate f5_converter cmd to run on docker container
    """
    args_list = []
    for key, value in vars(terminal_args).items():
        if value is not None and value:
            if isinstance(value, list):
                args_list.append("--{} {}".format(key, ",".join(str(x) for x in value)))
                continue
            elif isinstance(value, bool):
                args_list.append("--{}".format(key))
                continue
            else:
                args_list.append("--{} {}".format(key, value))

    docker_cmd = "f5_converter.py {}".format(" ".join(str(x) for x in args_list))
    return docker_cmd


class TestF5Converter:

    def test_configuration_with_config_yaml_on_docker(self):
        """
        This will test convert f5_config to AVI json
        Test config flow
        """
        result = f5_conv(bigip_config_file=setup.get('docker_input_file'),
                         f5_config_version=setup.get('file_version_v11'),
                         controller_version=setup.get('controller_version_v17'),
                         cloud_name=setup.get("cloud_name"),
                         tenant=setup.get("tenant"),
                         option='cli-upload',
                         vrf=setup.get("vrf"),
                         output_file_path=setup.get('output_file_path'))
        assert not result['error']

    def test_without_options(self):
        """
        Check the configuration file for v11
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'))

    def test_no_profile_merge(self):
        """
        Input File on Local Filesystem, Test for Controller,
        No_profile_merge Flag Reset
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                no_profile_merge=setup.get('no_profile_merge'))

    def test_prefix_v11(self):
        """
        Input File on Local Filesystem, Test for Controller,
        Prefix Added
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                prefix=setup.get('prefix'))

    def test_cloud_name_v11(self):
        """
        Input File on Local Filesystem, Test for Controller ,
        Prefix Added
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                cloud_name=setup.get('cloud_name'))

    def test_tenant_v11(self):
        """
        Input File on Local Filesystem, Test for Controller,
        Tenant Added
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                tenant=setup.get('tenant'))

    def test_ignore_config_v11(self):
        """
        Input File on Local Filesystem, Test for Controller v17.1.1,
        ignore_config option usage
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                ignore_config=setup.get('ignore_config'))

    def test_patch_v11(self):
        """
        Input File on Local Filesystem, Test for Controller v17.1.1,
        Patch option usage
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                patch=setup.get('patch'))

    def test_not_in_use_v11(self):
        """
        Input File on Local Filesystem, Test for Controller v17.1.1,
        No_profile_merge Flag Reset
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                not_in_use=setup.get('not_in_use'))

    def test_create_ansible_object_creation(self):
        """
        Input File on Local Filesystem, Test for Controller
        Create Ansible Script based on Flag
        """
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                output_file_path=setup.get('output_file_path'),
                controller_version=setup.get('controller_version_v17'),
                f5_config_version=setup.get('file_version_v11'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                ansible=setup.get('ansible'),
                skip_pki=True)
        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        file_name = docker_output_file + '/avi_config_create_object.yml'
        with open(file_name) as o_file:
            file_object = yaml.load(o_file, Loader=yaml.Loader)
            assert file_object[0].get('tasks', False)

    def test_http_cookie_type_on_file(self):
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                f5_config_version=setup.get('file_version_v11'),
                controller_version=setup.get('controller_version_v17'),
                f5_ssh_port=setup.get('f5_ssh_port'),
                output_file_path=setup.get('output_file_path'))
        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        file_name = docker_output_file + '/bigip_v11-Output.json'
        with open(file_name) as o_file:
            file_object = yaml.load(o_file, Loader=yaml.Loader)
        persistence_profiles = file_object['ApplicationPersistenceProfile']
        for p_type in persistence_profiles:
            if "COOKIE" in p_type['persistence_type']:
                assert (p_type['persistence_type'] ==
                        'PERSISTENCE_TYPE_HTTP_COOKIE')

    def test_pool_hm_ref(self):
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                f5_config_version=setup.get('file_version_v11'),
                controller_version=setup.get('controller_version_v17'),
                tenant=file_attribute['tenant'],
                cloud_name=file_attribute['cloud_name'],
                no_profile_merge=file_attribute['no_profile_merge'],
                output_file_path=setup.get('output_file_path'),
                f5_ssh_port=setup.get('f5_ssh_port'))

        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        o_file = docker_output_file + '/bigip_v11-Output.json'
        with open(o_file) as json_file:
            data = json.load(json_file)
            vs_object = data['Pool']

            pool_with_hm = [data for data in vs_object if data['name'] == "F5-Pool-001"]
            # Check if health monitor ref migrated to Avi
            assert pool_with_hm[0].get('health_monitor_refs')

    def test_pool_sharing(self):
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                f5_config_version=setup.get('file_version_v11'),
                controller_version=setup.get('controller_version_v17'),
                tenant=file_attribute['tenant'],
                cloud_name=file_attribute['cloud_name'],
                no_profile_merge=file_attribute['no_profile_merge'],
                output_file_path=setup.get('output_file_path'),
                f5_ssh_port=setup.get('f5_ssh_port'))

        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        o_file = docker_output_file + '/bigip_v11-Output.json'
        with open(o_file) as json_file:
            data = json.load(json_file)
            vs_object = data['VirtualService']

            first_vs = [data for data in vs_object if data['name'] == "vs_1_up"]
            second_vs = [data for data in vs_object if data['name'] == "vs_2_up"]
            if first_vs and second_vs:
                first_pool = first_vs[0]['pool_ref'].split(
                    'name=')[1].split('&')[0]
                second_pool = second_vs[0]['pool_ref'].split(
                    'name=')[1].split('&')[0]
                assert first_pool == second_pool

    def test_pool_without_sharing(self):
        f5_conv(bigip_config_file=setup.get('docker_input_file'),
                f5_config_version=setup.get('file_version_v11'),
                controller_version=setup.get('controller_version_v17'),
                tenant=file_attribute['tenant'],
                cloud_name=file_attribute['cloud_name'],
                no_profile_merge=file_attribute['no_profile_merge'],
                output_file_path=setup.get('output_file_path'),
                f5_ssh_port=setup.get('f5_ssh_port'))

        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        o_file = docker_output_file + '/bigip_v11-Output.json'
        with open(o_file) as json_file:
            data = json.load(json_file)
            vs_object = data['VirtualService']

            first_vs = [data for data in vs_object if data['name'] == "vs_http_policy_share_1"]
            second_vs = [data for data in vs_object if data['name'] == "vs_http_policy_share_2"]
            if first_vs and second_vs:
                first_pool = first_vs[0]['pool_ref'].split('name=')[1].split('&')[0]
                second_pool = second_vs[0]['pool_ref'].split('name=')[1].split(
                    '&')[0]
                assert first_pool != second_pool

    def test_configuration_exists_in_config_yaml(self):
        docker_output_file = "avi/%s/" % (setup.get('output_file_path'))
        o_file = "%s/%s" % (docker_output_file, "bigip_v11-Output.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            vs_object = data['VirtualService'][0]
            assert not vs_object.get('enabled')
        assert os.path.exists("%s/%s" % (docker_output_file, "avi_config_create_object.yml"))
        assert os.path.exists("%s/%s" % (docker_output_file, "avi_config_delete_object.yml"))

    def test_auto_upload_using_docker(self):
        """
        Input File on Local Filesystem,
        AutoUpload Flow
        """
        result = f5_conv(bigip_config_file=setup.get('docker_input_file'),
                         f5_config_version=setup.get('file_version_v11'),
                         controller_version=setup.get('controller_version_v17'),
                         option=setup.get('option'),
                         controller_ip=setup.get('controller_ip_17_1_1'),
                         user=setup.get('controller_user_17_1_1'),
                         password=setup.get('controller_password_17_1_1'),
                         vrf="global",
                         output_file_path=setup.get('output_file_path'),
                         skip_pki=True)
        assert not result['error']

    def test_teardown_for_docker(self):
        """
        This will remove all created config from AVI controller
        """
        docker_ansible_file_path = "%s/avi_config_delete_object.yml" % (setup.get('output_file_path'))
        docker_ansible_cmd = "%s -e controller=%s -e username=%s -e password=%s" % (docker_ansible_file_path,
                                                                                    setup.get('controller_ip_17_1_1'),
                                                                                    setup.get('controller_user_17_1_1'),
                                                                                    setup.get(
                                                                                        'controller_password_17_1_1'))
        ansible_cmd = "ansible-playbook {}".format(docker_ansible_cmd)
        docker_cmd = "{} -v {} -c '{}'".format(setup.get('docker_script_path'), avi_version, ansible_cmd)
        f5_converter_process = subprocess.run(docker_cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        result = f5_converter_process.stdout.strip()
        assert result


def teardown():
    pass
