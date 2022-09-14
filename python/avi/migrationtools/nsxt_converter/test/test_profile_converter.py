import logging
import os
import unittest
import json
import copy

gSAMPLE_CONFIG = None
LOG = logging.getLogger(__name__)

from avi.migrationtools.nsxt_converter.profile_converter import ProfileConfigConv
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
    cfg_file = open('test_profile_converter.conf', 'r')
    cfg = cfg_file.read()
    global gSAMPLE_CONFIG
    gSAMPLE_CONFIG = json.loads(cfg)
    global nsxt_attributes
    nsxt_attributes= conv_const.init()
    global profile_converter
    profile_converter=ProfileConfigConv(nsxt_attributes)


class Test(unittest.TestCase):

    def test_profile_conversion(self):

        avi_config = dict()
      #  profile_converter = ProfileConfigConv(nsxt_attributes)
        profile_converter.convert(avi_config, gSAMPLE_CONFIG, '')
        profile_config=gSAMPLE_CONFIG['LbAppProfiles']
        avi_app_profile_config=avi_config.get('ApplicationProfile',None)
        avi_network_profile_confg=avi_config.get('NetworkProfile',None)

        assert avi_app_profile_config
        assert avi_network_profile_confg
        assert len(profile_config) == len(avi_app_profile_config) + len(avi_network_profile_confg)





