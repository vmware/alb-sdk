import argparse
import logging
import os
import unittest
import json
import copy
import pytest
import sys
import pandas as pd
import yaml

from avi.migrationtools.nsxt_converter import nsxt_config_converter
from avi.migrationtools.nsxt_converter.alb_converter import ALBConverter
from avi.migrationtools.nsxt_converter.nsxt_converter import NsxtConverter
from avi.migrationtools.nsxt_converter.monitor_converter import MonitorConfigConv
from avi.migrationtools.nsxt_converter.persistant_converter import PersistantProfileConfigConv
from avi.migrationtools.nsxt_converter.profile_converter import ProfileConfigConv
from avi.migrationtools.nsxt_converter.ssl_profile_converter import SslProfileConfigConv
from avi.migrationtools.nsxt_converter.vs_converter import VsConfigConv
from avi.migrationtools.avi_migration_utils import get_count, set_update_count
from avi.migrationtools.nsxt_converter.test.excel_reader import ExcelReader
from avi.migrationtools.nsxt_converter.vs_converter import vs_data_path_not_work
gSAMPLE_CONFIG = None
LOG = logging.getLogger(__name__)

from avi.migrationtools.nsxt_converter.pools_converter import PoolConfigConv
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.conversion_util as conv_util

from conftest import option

avi_cfg_file = open(option.avi_config_file, 'r')
avi_cfg = avi_cfg_file.read()
avi_config_file = json.loads(avi_cfg)
output_dir = os.path.abspath(os.path.join(os.path.dirname(__file__),
                                          'output'))
if not os.path.exists(output_dir):
    os.mkdir(output_dir)
input_path = output_dir + os.path.sep + "input"
if not os.path.exists(input_path):
    os.makedirs(input_path)
output_path = output_dir + os.path.sep + "output"
if not os.path.exists(output_path):
    os.makedirs(output_path)
object_merge = True
no_object_merge = False
avi_config = dict()
input_role_config_file = os.path.abspath(os.path.join(
    os.path.dirname(__file__), 'custom_config.yaml'))
merge_object_mapping = {

    'ssl_profile': {'no': 0},
    'app_profile': {'no': 0},
    'network_profile': {'no': 0},
    'health_monitor': {'no': 0},
    'ssl_cert_key': {'no': 0}
}
sys_dict = {}
sys_dict = {}
merge_object_type = ['ApplicationProfile', 'NetworkProfile',
                     'SSLProfile', 'PKIProfile', 'SSLKeyAndCertificate',
                     'ApplicationPersistenceProfile', 'HealthMonitor',
                     'IpAddrGroup']
for key in merge_object_type:
    sys_dict[key] = []


def setUpModule():
    cfg_file = open(option.nsx_lb_config, 'r')
    cfg = cfg_file.read()
    global nsx_config
    nsx_config = json.loads(cfg)
    global nsxt_attributes
    nsxt_attributes = conv_const.init()


class Test(unittest.TestCase, ExcelReader):

    @pytest.fixture
    def cleanup(self):
        import avi.migrationtools.f5_converter.conversion_util as conv
        import shutil
        conv.csv_writer_dict_list = list()
        if os.path.exists(output_dir):
            for each_file in os.listdir(output_dir):
                file_path = os.path.join(output_dir, each_file)
                try:
                    if os.path.isfile(file_path):
                        if file_path.endswith('.log'):
                            open('converter.log', 'w').close()
                        else:
                            os.unlink(file_path)
                    elif os.path.isdir(file_path):
                        shutil.rmtree(file_path)
                except Exception as e:
                    print(e)

    def test_output_sanitization(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

        self.excel_path = os.path.abspath(os.path.join(
            output_path, 'nsxt-report-ConversionStatus.xlsx'))
        self.json_path = os.path.abspath(os.path.join(
            output_path, 'avi_config.json'))
        assert self.excel_path
        assert self.json_path

    def test_prefix(self):
        """
        prefix added
        """
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="prefix",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

    def test_health_monitor_conversion(self):
        tenant = "admin"
        monitor_converter = MonitorConfigConv(nsxt_monitor_attributes=nsxt_attributes,
                                              object_merge_check=no_object_merge,
                                              merge_object_mapping=merge_object_mapping,
                                              sys_dict=sys_dict)
        monitor_converter.convert(alb_config=avi_config,
                                  nsx_lb_config=nsx_config,
                                  prefix='',
                                  tenant=tenant,
                                  custom_mapping=False)

    def test_passive_health_monitor(self):
        data_path = option.conv_excel
        data = pd.read_excel(data_path)
        for k, row in data.iterrows():
            if row['NsxT SubType'] in ["LBPassiveMonitorProfile"]:
                assert row["Status"] == "SUCCESSFUL"

    def test_pool_conversion(self):

        pool_converter = PoolConfigConv(nsxt_pool_attributes=nsxt_attributes,
                                        object_merge_check=no_object_merge,
                                        merge_object_mapping=merge_object_mapping,
                                        sys_dict=sys_dict)
        pool_converter.convert(alb_config=avi_config,
                               nsx_lb_config=nsx_config,
                               prefix='',
                               tenant="admin")

    def test_profile_conversion(self):

        profile_converter = ProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                              object_merge_check=no_object_merge,
                                              merge_object_mapping=merge_object_mapping,
                                              sys_dict=sys_dict)
        profile_converter.convert(alb_config=avi_config,
                                  nsx_lb_config=nsx_config,
                                  prefix='',
                                  tenant='admin')

    def test_config_hm_http(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="prefix",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False
                                      )
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_monitor_config = data['HealthMonitor']
            for alb_hm in avi_monitor_config:
                if alb_hm["type"] == "HEALTH_MONITOR_HTTP":
                    assert alb_hm['http_monitor']['http_request']
                    assert alb_hm['http_monitor']['http_response_code']

    def test_config_hm_https(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="prefix",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False
                                      )
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_monitor_config = data['HealthMonitor']
            for alb_hm in avi_monitor_config:
                if alb_hm["type"] == "HEALTH_MONITOR_HTTPS":
                    assert alb_hm['https_monitor']['http_request']
                    assert alb_hm['https_monitor']['http_response_code']

    def test_config_hm_udp(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="prefix",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False
                                      )
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_monitor_config = data['HealthMonitor']
            for alb_hm in avi_monitor_config:
                if alb_hm["type"] == "HEALTH_MONITOR_UDP":
                    assert alb_hm["udp_monitor"]

    def test_config_hm_tcp(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="prefix",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False
                                      )
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_monitor_config = data['HealthMonitor']
            for alb_hm in avi_monitor_config:
                if alb_hm["type"] == "HEALTH_MONITOR_TCP":
                    assert alb_hm["tcp_monitor"]

    def test_converted_status(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

        excel_path = os.path.abspath(os.path.join(
            output_path, 'nsxt-report-ConversionStatus.xlsx'))
        data = pd.read_excel(excel_path)
        for k, row in data.iterrows():
            assert row['Status'] != "ERROR"

    def test_healthmonitor_prefix(self):
        """
        for testing prefix in HealthMonitors
        """

        prefix = "AVI"
        monitor_converter = MonitorConfigConv(nsxt_monitor_attributes=nsxt_attributes,
                                              object_merge_check=no_object_merge,
                                              merge_object_mapping=merge_object_mapping,
                                              sys_dict=sys_dict)
        monitor_converter.convert(alb_config=avi_config,
                                  nsx_lb_config=nsx_config,
                                  prefix=prefix,
                                  tenant="admin",
                                  custom_mapping=False)
        avi_monitor_config = avi_config.get('HealthMonitor', None)
        assert avi_monitor_config

        for hm in avi_monitor_config:
            assert hm['name'].startswith(prefix)

    def test_pool_prefix(self):
        """
        for testing prefix in Pool
        """

        prefix = "AVI"
        pool_converter = PoolConfigConv(nsxt_pool_attributes=nsxt_attributes,
                                        object_merge_check=no_object_merge,
                                        merge_object_mapping=merge_object_mapping,
                                        sys_dict=sys_dict)
        pool_converter.convert(alb_config=avi_config,
                               nsx_lb_config=nsx_config,
                               prefix=prefix,
                               tenant="admin")
        avi_pool_config = avi_config['Pool']

        assert avi_pool_config
        for pools in avi_pool_config:
            assert pools['name'].startswith(prefix)
            if pools.get('health_monitor_refs'):
                for pool_hm in pools['health_monitor_refs']:
                    assert pool_hm.split('name=')[1].startswith(prefix)

    def test_profile_prefix(self):
        """
        for testing prefix in ApplicationProfiles
        """

        prefix = "AVI"
        profile_converter = ProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                              object_merge_check=no_object_merge,
                                              merge_object_mapping=merge_object_mapping,
                                              sys_dict=sys_dict)
        profile_converter.convert(alb_config=avi_config,
                                  nsx_lb_config=nsx_config,
                                  prefix=prefix,
                                  tenant="admin")
        avi_app_profile_config = avi_config.get('ApplicationProfile', None)
        avi_network_profile_confg = avi_config.get('NetworkProfile', None)

        assert avi_app_profile_config
        for app_pr in avi_app_profile_config:
            assert app_pr['name'].startswith(prefix)
        assert avi_network_profile_confg
        for np_pr in avi_network_profile_confg:
            assert np_pr['name'].startswith(prefix)

    def test_vs_prefix(self):
        """
        for testing prefix in virtual service
        """

        prefix = "AVI"
        vs_state = True
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to='',
                                      object_merge_check=no_object_merge,
                                      controller_version="")
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_vs_config = data.get('VirtualService', None)
            assert avi_vs_config

            for hm in avi_vs_config:
                assert hm['name'].startswith(prefix)

    def test_migrate_to(self):
        """
        added migrate_to
        """
        migrate_to = 'NSX'
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to=migrate_to,
                                      object_merge_check=no_object_merge,
                                      controller_version="")

    def test_skipped_object(self):
        """
        test case for skipped objct
        """

        data_path = option.conv_excel
        data = pd.read_excel(data_path)
        for k, row in data.iterrows():
            if row['NsxT SubType'] in ["LBGenericPersistenceProfile"]:
                assert row['Status'] == 'SKIPPED'

    def test_object_merge(self):
        """
        testing with object merge flag
        """
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=object_merge,
                                      controller_version="")

    def test_vs_state_level_true(self):
        """
        testing when vs level status is true
        """
        controller_version = "20.1.7"
        vs_state = True
        vs_level_status = True
        migrate_to = 'NSX'
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to=migrate_to,
                                      object_merge_check=no_object_merge,
                                      controller_version=controller_version,
                                      vs_state=vs_state,
                                      vs_level_status=vs_level_status)
        excel_path = os.path.abspath(
            os.path.join(
                output_path, 'nsxt-report-ConversionStatus.xlsx'
            )
        )
        self.output_vs_level_status(excel_path)

    def test_vs_level_status_false(self):
        """
        testing when vs level status is false
        """

        vs_state = True
        vs_level_status = False
        migrate_to = 'NSX'
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to=migrate_to,
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      vs_state=vs_state,
                                      vs_level_status=vs_level_status)

    def test_error_and_warning_count(self):

        set_update_count()
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      )

        assert get_count('error') == 0

    def test_ssl_prefix(self):
        """
        for testing prefix in ssl profile
        """

        prefix = "AVI"
        ssl_converter = SslProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                             object_merge_check=no_object_merge,
                                             merge_object_mapping=merge_object_mapping,
                                             sys_dict=sys_dict)
        ssl_converter.convert(alb_config=avi_config,
                              nsx_lb_config=nsx_config,
                              prefix=prefix,
                              tenant="admin")
        avi_ssl_config = avi_config.get('SSLProfile', None)
        assert avi_ssl_config

        for hm in avi_ssl_config:
            assert hm['name'].startswith(prefix)

    def test_persistance_prefix(self):
        """
        for testing prefix in persistance profile
        """

        prefix = "AVI"
        persistance_converter = PersistantProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                                            object_merge_check=no_object_merge,
                                                            merge_object_mapping=merge_object_mapping,
                                                            sys_dict=sys_dict)
        persistance_converter.convert(alb_config=avi_config,
                                      nsx_lb_config=nsx_config,
                                      prefix=prefix,
                                      tenant="admin")
        avi_persis_config = avi_config.get('ApplicationPersistenceProfile', None)
        assert avi_persis_config

        for hm in avi_persis_config:
            assert hm['name'].startswith(prefix)

    def test_persistence_conversion(self):

        persistance_converter = PersistantProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                                            object_merge_check=no_object_merge,
                                                            merge_object_mapping=merge_object_mapping,
                                                            sys_dict=sys_dict)
        persistance_converter.convert(alb_config=avi_config,
                                      nsx_lb_config=nsx_config,
                                      prefix="",
                                      tenant="admin")

    def test_ssl_profile_conversion(self):

        ssl_converter = SslProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                             object_merge_check=no_object_merge,
                                             merge_object_mapping=merge_object_mapping,
                                             sys_dict=sys_dict)

        ssl_converter.convert(alb_config=avi_config,
                              nsx_lb_config=nsx_config,
                              prefix="",
                              tenant="admin")

    def test_excel_report(self):
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

        self.percentage_success(os.path.join(output_path,
                                             'nsxt-report-ConversionStatus.xlsx'))

    def test_check_health_monitor_request_url(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            hm_object = data['HealthMonitor']
            monitor_urls = []
            for monitor in hm_object:
                if 'https_monitor' in monitor:
                    monitor_urls.append(monitor['https_monitor'][
                                            'http_request'])
                elif 'http_monitor' in monitor:
                    monitor_urls.append(monitor['http_monitor']['http_request'])
            for eachUrl in monitor_urls:
                request = eachUrl.split('\r\n')[0]
                assert (request.endswith('HTTP/1.1') or
                        request.endswith('HTTP/1.0'))

    def test_no_profile_merge(self):
        """
        No_profile_merge Flag Reset
        """
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")

    def test_pki_profile(self):

        pki_obj = avi_config_file.get("PKIProfile", None)
        if pki_obj:
            for pki in pki_obj:
                assert pki["tenant_ref"]
                assert pki["name"]
                assert pki["ca_certs"]
                assert pki["crl_check"]

    def test_tier1_lr_in_pools(self):
        vs_object = avi_config_file.get("VirtualService", None)
        pool_object = avi_config_file.get("Pool", None)
        for vs in vs_object:
            if vs.get("pool_ref"):
                pool_name = vs["pool_ref"].split("name=")[-1]
                pool_name = pool_name.split("&cloud")[0]
                print(pool_name)
                pool = [pool for pool in pool_object if pool["name"] == pool_name]
                print(pool)
                assert pool[0]["tier1_lr"]

    def test_tier1_lr_in_vsvip(self):
        vs_object = avi_config_file.get("VirtualService", None)
        vsvip_object = avi_config_file.get("VsVip", None)
        for vs in vs_object:
            if vs.get("vsvip_ref"):
                vsvip_name = vs["vsvip_ref"].split("name=")[-1]
                vsvip_name = vsvip_name.split("&cloud")[0]
                vsvip = [vsvip for vsvip in vsvip_object if vsvip["name"] == vsvip_name]
                assert vsvip[0]["tier1_lr"]

    def test_cmd_profile(self):
        app_object = avi_config_file.get("ApplicationProfile", None)
        for app in app_object:
            if app["name"].endswith("cmd"):
                assert not app["connection_multiplexing_enabled"]
                assert app["preserve_client_ip"]

    def test_not_in_use(self):
        """
        testing migration of not in use objects
        """
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False)

    def test_is_bgp_configured_for_vlan_vs(self):
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=False)
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
            avi_vs_config = data.get('VirtualService', None)
            for vs in avi_vs_config:
                if vs in vs_data_path_not_work:
                    assert not vs.get("enable_rhi", None)