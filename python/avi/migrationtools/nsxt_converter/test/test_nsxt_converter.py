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
                                      cloud_name='cloud',
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
        avi_monitor_config = avi_config.get('HealthMonitor', None)
        monitor_config = nsx_config['LbMonitorProfiles']
        assert avi_monitor_config
        non_passive_monitor_count = 0
        index = 0
        for monitor in monitor_config:
            if monitor.get('resource_type') not in ['LBPassiveMonitorProfile']:
                non_passive_monitor_count += 1
                if monitor.get('interval'):
                    assert monitor.get('interval') == avi_monitor_config[index]['send_interval']
                if monitor.get('fall_count'):
                    assert monitor.get('fall_count') == avi_monitor_config[index]['failed_checks']
                if monitor.get('rise_count'):
                    assert monitor.get('rise_count') == avi_monitor_config[index]['successful_checks']
                if monitor.get('timeout'):
                    assert monitor.get('timeout') == avi_monitor_config[index]['send_interval']
                if monitor.get('monitor_port'):
                    assert monitor.get('monitor_port') == avi_monitor_config[index]['monitor_port']
                index += 1

        assert non_passive_monitor_count == len(avi_monitor_config)

    def test_passive_health_monitor(self):
        data_path = option.conv_excel
        data = pd.read_excel(data_path)
        for k, row in data.iterrows():
            if row['NsxT SubType'] in ["LBPassiveMonitorProfile"]:
                assert row["Status"] == "SUCCESSFUL"

    def test_pool_conversion(self):

        pool_config = nsx_config['LbPools']
        pool_converter = PoolConfigConv(nsxt_pool_attributes=nsxt_attributes,
                                        object_merge_check=no_object_merge,
                                        merge_object_mapping=merge_object_mapping,
                                        sys_dict=sys_dict)
        pool_converter.convert(alb_config=avi_config,
                               nsx_lb_config=nsx_config,
                               cloud_name='',
                               prefix='',
                               tenant="admin")
        avi_pool_config = avi_config['Pool']
        print(avi_pool_config)
        assert avi_pool_config

        for index, pool in enumerate(avi_pool_config):
            assert pool.get('name')
            assert pool.get('lb_algorithm')
            if pool_config[index].get('member'):
                assert pool.get('servers')
            if pool_config[index].get('active_monitor_path'):
                assert len(pool['health_monitor_refs']) == len(pool_config[index]['active_monitor_path'])

        assert len(pool_config) == len(avi_pool_config)

    def test_profile_conversion(self):

        profile_config = nsx_config['LbAppProfiles']
        profile_converter = ProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                              object_merge_check=no_object_merge,
                                              merge_object_mapping=merge_object_mapping,
                                              sys_dict=sys_dict)
        profile_converter.convert(alb_config=avi_config,
                                  nsx_lb_config=nsx_config,
                                  prefix='',
                                  tenant='admin')
        avi_app_profile_config = avi_config.get('ApplicationProfile', None)
        avi_network_profile_confg = avi_config.get('NetworkProfile', None)

        assert avi_app_profile_config
        assert avi_network_profile_confg
        assert len(profile_config) == len(avi_app_profile_config) + len(avi_network_profile_confg)

    def test_config_hm_http(self):

        avi_monitor_config = avi_config_file.get('HealthMonitor', None)
        monitor_config = nsx_config['LbMonitorProfiles']
        lb_http = []
        for lb_hm in monitor_config:
            if lb_hm.get('resource_type') in ['LBHttpMonitorProfile']:
                lb_http.append(lb_hm)

        for alb_hm in avi_monitor_config:
            for monitor in lb_http:
                if alb_hm['name'] == monitor['display_name']:
                    if monitor.get('request_url'):
                        assert monitor['request_url'] == alb_hm['http_monitor']['http_request']
                    if monitor.get('request_body'):
                        assert monitor['request_body'] == alb_hm['http_monitor']['http_request_body']
                    if monitor.get('response_body'):
                        assert monitor['response_body'] == alb_hm['http_monitor']['http_response']

    def test_config_hm_https(self):

        avi_monitor_config = avi_config_file.get('HealthMonitor', None)
        monitor_config = nsx_config['LbMonitorProfiles']
        lb_https = []
        for lb_hm in monitor_config:
            if lb_hm.get('resource_type') in ['LBHttpsMonitorProfile']:
                lb_https.append(lb_hm)

        for alb_hm in avi_monitor_config:
            for monitor in lb_https:
                if alb_hm['name'] == monitor['display_name']:
                    if monitor.get('request_url'):
                        assert monitor['request_url'] == alb_hm['https_monitor']['http_request']
                    if monitor.get('request_body'):
                        assert monitor['request_body'] == alb_hm['https_monitor']['http_request_body']
                    if monitor.get('response_body'):
                        assert monitor['response_body'] == alb_hm['https_monitor']['http_response']

    def test_config_hm_udp(self):

        avi_monitor_config = avi_config_file.get('HealthMonitor', None)
        monitor_config = nsx_config['LbMonitorProfiles']
        lb_udp = []
        for lb_hm in monitor_config:
            if lb_hm.get('resource_type') in ['LBUdpMonitorProfile']:
                lb_udp.append(lb_hm)

        for alb_hm in avi_monitor_config:
            for monitor in lb_udp:
                if alb_hm['name'] == monitor['display_name']:
                    if monitor.get('send'):
                        assert monitor['send'] == alb_hm['udp_monitor']['udp_request']
                    if monitor.get('receive'):
                        assert monitor['receive'] == alb_hm['udp_monitor']['udp_response']

    def test_config_hm_tcp(self):

        avi_monitor_config = avi_config_file.get('HealthMonitor', None)
        monitor_config = nsx_config['LbMonitorProfiles']
        lb_tcp = []
        for lb_hm in monitor_config:
            if lb_hm.get('resource_type') in ['LBTcpMonitorProfile']:
                lb_tcp.append(lb_hm)

        for alb_hm in avi_monitor_config:
            for monitor in lb_tcp:
                if alb_hm['name'] == monitor['display_name']:
                    if monitor.get('send'):
                        assert monitor['send'] == alb_hm['tcp_monitor']['tcp_request']
                    if monitor.get('receive'):
                        assert monitor['receive'] == alb_hm['tcp_monitor']['tcp_response']

    def test_converted_status(self):

        assert nsx_config['LbPools'] and avi_config_file['Pool']
        assert nsx_config['LbMonitorProfiles'] and avi_config_file['HealthMonitor']
        data_path = option.conv_excel
        data = pd.read_excel(data_path)
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
                               cloud_name='',
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
        vs_converter = VsConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                    object_merge_check=no_object_merge,
                                    merge_object_mapping=merge_object_mapping,
                                    sys_dict=sys_dict)
        vs_converter.convert(alb_config=avi_config,
                             nsx_lb_config=nsx_config,
                             cloud_name='',
                             prefix=prefix,
                             tenant="admin",
                             vs_state=vs_state,
                             controller_version="")
        avi_vs_config = avi_config.get('VirtualService', None)
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
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
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

        persistence_config = nsx_config['LbPersistenceProfiles']
        persistance_converter = PersistantProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                                            object_merge_check=no_object_merge,
                                                            merge_object_mapping=merge_object_mapping,
                                                            sys_dict=sys_dict)
        persistance_converter.convert(alb_config=avi_config,
                                      nsx_lb_config=nsx_config,
                                      prefix="",
                                      tenant="admin")

        avi_persis_config = avi_config.get('ApplicationPersistenceProfile', None)
        for alb_persis in avi_persis_config:
            for persis in persistence_config:
                if alb_persis['name'] == persis['display_name']:
                    if persis['resource_type'] == "LBCookiePersistenceProfile":
                        if persis['cookie_name']:
                            assert alb_persis['http_cookie_persistence_profile']
                            assert persis['cookie_name'] == alb_persis['http_cookie_persistence_profile']['cookie_name']
                    elif persis['resource_type'] == "LBSourceIpPersistenceProfile":
                        if persis['timeout']:
                            assert alb_persis['ip_persistence_profile']
                            assert persis['timeout'] == alb_persis['ip_persistence_profile']['ip_persistent_timeout']

        assert avi_persis_config

    def test_ssl_profile_conversion(self):

        ssl_client_config = nsx_config['LbClientSslProfiles']
        ssl_server_config = nsx_config['LbServerSslProfiles']
        ssl_converter = SslProfileConfigConv(nsxt_profile_attributes=nsxt_attributes,
                                             object_merge_check=no_object_merge,
                                             merge_object_mapping=merge_object_mapping,
                                             sys_dict=sys_dict)

        ssl_converter.convert(alb_config=avi_config,
                              nsx_lb_config=nsx_config,
                              prefix="",
                              tenant="admin")
        avi_ssl_config = avi_config.get('SSLProfile', None)
        assert avi_ssl_config
        assert len(avi_ssl_config) == len(ssl_client_config) + len(ssl_server_config)

    def test_excel_report(self):
        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
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
                                      cloud_name='cloud',
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="")


    def test_pki_profile(self):

        pki_obj = avi_config_file.get("PKIProfile", None)
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

    def test_remove_not_in_use_object(self):

        nsxt_config_converter.convert(nsx_lb_config=nsx_config,
                                      input_path=input_path,
                                      output_path=output_path,
                                      tenant="admin",
                                      cloud_name='cloud',
                                      prefix="",
                                      migrate_to="",
                                      object_merge_check=no_object_merge,
                                      controller_version="",
                                      not_in_use=True)
        o_file = "%s/%s" % (output_path, "avi_config.json")
        with open(o_file) as json_file:
            data = json.load(json_file)
        vs_object = data.get("VirtualService", None)
        pool_object = data.get("Pool", None)
        app_object = data.get("ApplicationProfile", None)
        hm_object = data.get("HealthMonitor", None)
        ssl_object = data.get("SSLProfile")
        np_object = data.get("NetworkProfile", None)
        vsvip_object = data.get("VsVip")
        pki_object = data.get("PKIProfile")
        persis_object = data.get("ApplicationPersistenceProfile")
        mg_pool = set()
        mg_app_pr = set()
        mg_pki = set()
        mg_nw_pr = set()
        mg_hm = set()
        mg_ssl = set()
        mg_persis_pr = set()
        mg_vsvip = set()

        for vs in vs_object:
            if vs.get("pool_ref"):
                pool_name = (vs["pool_ref"].split("name=")[-1]).split("&cloud")[0]
                mg_pool.add(pool_name)
                pool_obj = [pool for pool in pool_object if pool["name"] == pool_name]
                if pool_obj[0].get("health_monitor_refs"):
                    hm_list = pool_obj[0]["health_monitor_refs"]
                    for obj in hm_list:
                        hm = obj.split("name=")[-1]
                        mg_hm.add(hm)
                        hm_obj = [val for val in hm_object if val["name"] == hm]
                        if hm_obj[0].get("ssl_attributes"):
                            if hm_obj[0].get("ssl_attributes").get("ss_profile_ref"):
                                ssl = (hm_obj[0]["ssl_attributes"]["ss_profile_ref"]).split("name=")
                                mg_ssl.add(ssl)
                        if hm_obj[0].get("pki_profile_ref"):
                            pki = (hm_obj[0]["pki_profile_ref"]).split("name=")[-1]
                            mg_pki.add(pki)

                if pool_obj[0].get("persistence_profile_ref"):
                    pr = (pool_obj[0]["persistence_profile_ref"]).split("name=")[-1]
                    mg_persis_pr.add(pr)
                if pool_obj[0].get("ssl_profile_ref"):
                    ssl = (pool_obj[0]["ssl_profile_ref"]).split("name=")[-1]
                    mg_ssl.add(ssl)
                if pool_obj[0].get("pki_profile_ref"):
                    pki = (pool_obj[0]["pki_profile_ref"]).split("name=")[-1]
                    mg_pki.add(pki)

            if vs.get("vsvip_ref"):
                vsvip = (vs["vsvip_ref"].split("name=")[-1]).split("&cloud")[0]
                mg_vsvip.add(vsvip)
            if vs.get("application_profile_ref"):
                app_name = (vs["application_profile_ref"].split("name=")[-1]).split("&cloud")[0]
                if app_name != "System-L4-Application":
                    mg_app_pr.add(app_name)
                    app_obj = [app for app in app_object if app["name"] == app_name]
                    if app_obj[0].get("pki_profile_ref"):
                        pki = (app_obj[0]["pki_profile_ref"]).split("name=")[-1]
                        mg_pki.add(pki)

            if vs.get("network_profile_ref"):
                np = (vs["network_profile_ref"].split("name=")[-1]).split("&cloud")[0]
                if np != "System-TCP-Proxy":
                    mg_nw_pr.add(np)

        for obj in hm_object:
            assert obj["name"] in mg_hm
        for obj in app_obj:
            assert obj["name"] in mg_app_pr
        for obj in np_object:
            assert obj["name"] in mg_nw_pr
        for obj in pool_object:
            assert obj["name"] in mg_pool
        for obj in pki_object:
            assert obj["name"] in mg_pki
        for obj in vsvip_object:
            assert obj["name"] in mg_vsvip
        for obj in ssl_object:
            assert obj["name"] in mg_ssl
        for obj in persis_object:
            assert obj["name"] in mg_persis_pr
