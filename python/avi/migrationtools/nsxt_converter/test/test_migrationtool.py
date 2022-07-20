# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
This testsuite contains the initial test cases for testing the
nsxt converter tool along with its options / parameters
"""
import json
import logging
import os
import pytest
import yaml
import vcr
import subprocess
from avi.migrationtools.avi_migration_utils import get_count, set_update_count
from avi.migrationtools.nsxt_converter.nsxt_converter import NsxtConverter

from avi.migrationtools.test.common.excel_reader \
    import percentage_success, output_sanitization, output_vs_level_status
from avi.migrationtools.test.common.test_clean_reboot \
    import verify_controller_is_up, clean_reboot


config_file = pytest.config.getoption('--config')
output_file = pytest.config.getoption('--out')

with open(config_file) as f:
    file_attribute = yaml.load(f, Loader=yaml.Loader)

my_vcr = vcr.VCR(
    cassette_library_dir='fixtures/cassettes/',
    serializer='yaml',
    match_on= ['method','url']
)

setup = dict(nsxt_ip=file_attribute['nsxt_ip'],
             nsxt_user=file_attribute['nsxt_user'],
             nsxt_password=file_attribute['nsxt_password'],
             ssh_root_password=file_attribute['ssh_root_password'],
             alb_controller_ip=file_attribute['alb_controller_ip'],
             alb_controller_user=file_attribute['alb_controller_user'],
             alb_controller_password=file_attribute['alb_controller_password'],
             alb_controller_version= file_attribute['alb_controller_version'],
             output_file_path = output_file,
             nsxt_port = 443,
             prefix = 'test-pre-',
             alb_controller_tenant = file_attribute['alb_controller_tenant'],
             not_in_use = False,
             ansible_skip_types = None,
             controller_version = None,
             ansible_filter_types = None,
             vs_level_status = True,
             option = 'auto-upload',
             ansible = True,
             object_merge_check = False,
             vs_state = 'deactivate',
             vs_filter = 'PB-svc-inline-T0-noSNAT-8.1',
             segroup = None,
             patch = os.path.abspath(os.path.join(os.path.dirname(__file__),
                                       'patch.yaml')),
             traffic_enabled = False,
             default_params_file = None,
             cloud_tenant = 'admin'
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


def Nsxt_conv(nsxt_ip=None, nsxt_user=None, nsxt_password=None, ssh_root_password=None,
              controller_ip=None, password=None, user=None,alb_controller_version=None,output_file_path = None,
              nsxt_port = 443, prefix = None, tenant = 'admin', not_in_use = True, ansible_skip_types = None,
              controller_version = None, ansible_filter_types = None, vs_level_status = False,
              option = None, ansible = False, object_merge_check = True,
              vs_state = None, vs_filter = None, segroup = None, patch = None,
              traffic_enabled = False, default_params_file = None, cloud_tenant = 'admin'
              ):
    args = Namespace(nsxt_ip=nsxt_ip, nsxt_user=nsxt_user, nsxt_password=nsxt_password, ssh_root_password=ssh_root_password,
                     alb_controller_ip=controller_ip, alb_controller_password=password, alb_controller_user=user, alb_controller_version=alb_controller_version,
                     output_file_path=output_file_path, nsxt_port=nsxt_port, prefix=prefix, alb_controller_tenant=tenant,
                     not_in_use=not_in_use, ansible_skip_types=ansible_skip_types, controller_version=controller_version,
                     ansible_filter_types=ansible_filter_types, vs_level_status=vs_level_status,
                     option=option, ansible=ansible, no_object_merge=object_merge_check,
                     vs_state=vs_state, vs_filter=vs_filter, segroup=segroup, patch=patch,
                     traffic_enabled=traffic_enabled, default_params_file=default_params_file, cloud_tenant=cloud_tenant
                     )
    nsxt_converter = NsxtConverter(args)
    nsxt_converter.conver_lb_config(args)


class TestNSXTConverter:

    @pytest.fixture
    def cleanup(self):
        import avi.migrationtools.nsxt_converter.conversion_util as conv
        import shutil
        conv.csv_writer_dict_list = list()
        if os.path.exists(output_file):
            for each_file in os.listdir(output_file):
                file_path = os.path.join(output_file, each_file)
                try:
                    if os.path.isfile(file_path):
                        if file_path.endswith('.log'):
                            open('converter.log', 'w').close()
                        else:
                            os.unlink(file_path)
                    elif os.path.isdir(file_path):
                        shutil.rmtree(file_path)
                except Exception as e:
                    raise e

    def test_output_sanitization(self, cleanup):
        """
        Test case to verify the excel sheet with the avi_config.json
        """
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  tenant = setup.get('alb_controller_tenant'),
                  output_file_path = setup.get('output_file_path'))

        nsxt_ip = setup.get('nsxt_ip')
        excel_path = os.path.abspath(os.path.join(
            output_file, '{}/output/nsxt-report-ConversionStatus.xlsx'.format(nsxt_ip)))
        json_path = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(nsxt_ip)))
        log_path = os.path.abspath(os.path.join(
            output_file, 'converter.log'))
        assert output_sanitization(excel_path, json_path, log_path)

    def test_excel_report(self, cleanup):
        """
        Test case to verify the success ratio of each object
        """
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path = setup.get('output_file_path'))
        nsxt_ip = setup.get('nsxt_ip')
        excel_path = os.path.abspath(os.path.join(
            output_file, '{}/output/nsxt-report-ConversionStatus.xlsx'.format(nsxt_ip)))
        percentage_success(os.path.join(excel_path))

    def test_no_object_merge(self, cleanup):
        """
        Test case to verify no object merge
        """
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  object_merge_check=setup.get('object_merge_check'),
                  output_file_path=setup.get('output_file_path'))

    def test_prefix(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  prefix=setup.get('prefix'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)
        assert setup.get('prefix') in data['VirtualService'][0]['name']

    def test_tenant(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  tenant='test-tenant')

    def test_patch(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  vs_state=setup.get('vs_state'),
                  patch=setup.get('patch'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)
            assert len([True for each_vs in data['VirtualService'] if not each_vs['enabled']]) == 0

    def test_not_in_use(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  tenant = setup.get('alb_controller_tenant'),
                  not_in_use=True)

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)
            vs_count = len(data['VirtualService'])
            vs_vip = len(data['VsVip'])
            assert vs_vip == vs_count

    def test_vs_state(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  vs_state=setup.get('vs_state'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)
            assert len([ True for each_vs in data['VirtualService'] if each_vs['enabled']]) == 0

    def test_vs_filter(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  vs_filter=setup.get('vs_filter'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)
            assert len(data['VirtualService']) == 1

    def test_create_ansible_playbook(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  ansible=setup.get('ansible'))

        ansible_create_object = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config_create_object.yml'.format(setup.get('nsxt_ip'))))
        ansible_delete_object = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config_delete_object.yml'.format(setup.get('nsxt_ip'))))

        assert os.path.exists(ansible_create_object)
        assert os.path.exists(ansible_delete_object)

    def test_vs_level_status_true(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  vs_level_status=setup.get('vs_level_status'))

        nsxt_ip = setup.get('nsxt_ip')
        excel_path = os.path.abspath(os.path.join(
            output_file, '{}/output/nsxt-report-ConversionStatus.xlsx'.format(nsxt_ip)))
        assert output_vs_level_status(excel_path)

    def test_error_count(self, cleanup):
        set_update_count()
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'))
        assert get_count('error') == 0

    def test_none_should_not_be_in_json(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  tenant=setup.get('alb_controller_tenant'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        res = subprocess.run("cat %s | grep None" %(output_json), shell=True, capture_output=True)
        assert res.returncode == 1

    def test_check_dup_of_key_should_not_be_in_json(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)

        for key in data.keys():
            if isinstance(data[key], list):
                for i in data[key]:
                    assert 'dup_of' not in i.keys()

    def test_pool_sharing(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'))

        output_json = os.path.abspath(os.path.join(
            output_file, '{}/output/avi_config.json'.format(setup.get('nsxt_ip'))))
        with open(output_json) as json_file:
            data = json.load(json_file)

            vs_object = data['VirtualService']
            first_vs = [data for data in vs_object if data['name'] ==
                        "2.5-vs-inline-SNAT"][0]
            second_vs = [data for data in vs_object if data['name'] ==
                         "2.7-vs-inline-SNAT"][0]
            assert first_vs.get('pool_ref') == second_vs.get('pool_ref')

    def test_auto_upload(self, cleanup):
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  output_file_path=setup.get('output_file_path'),
                  option=setup.get('option'),
                  object_merge_check=False,
                  tenant=setup.get('alb_controller_tenant'),
                  prefix=setup.get('prefix'))
