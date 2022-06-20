import logging
import os
import unittest
import json
import copy

gSAMPLE_CONFIG = None
LOG = logging.getLogger(__name__)

from avi.migrationtools.nsxt_converter.monitor_converter import MonitorConfigConv
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.conversion_util as conv_util


def setUpModule():
    LOG.setLevel(logging.DEBUG)
    formatter = '%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    dir_path = os.path.abspath(os.path.dirname(__file__))
    dir_path = dir_path.rsplit(os.path.sep, 1)[0]
    dir_path = dir_path + os.path.sep + "output"
    logging.basicConfig(filename=os.path.join(dir_path, 'converter.log'),
                        level=logging.DEBUG, format=formatter)
    cfg_file = open('test_monitor_converter.conf', 'r')
    cfg = cfg_file.read()
    global gSAMPLE_CONFIG
    gSAMPLE_CONFIG = json.loads(cfg)
    global nsxt_attributes
    nsxt_attributes = conv_const.init()


class Test(unittest.TestCase):

    def test_monitor_conversion(self):

        avi_config = dict()
        monitor_converter = MonitorConfigConv(nsxt_attributes)
        monitor_converter.convert(avi_config, gSAMPLE_CONFIG,'')
        monitor_config=gSAMPLE_CONFIG['LbMonitorProfiles']
        avi_monitor_config=avi_config.get('HealthMonitor',None)

        assert avi_monitor_config
        non_passive_monitor_count=0
        for monitor in monitor_config:
            if monitor.get('resource_type') not in ['LBPassiveMonitorProfile']:
                non_passive_monitor_count += 1

        assert non_passive_monitor_count == len(avi_monitor_config)





