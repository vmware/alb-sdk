import logging
import os
import unittest
import json
import copy

gSAMPLE_CONFIG = None
LOG = logging.getLogger(__name__)

from avi.migrationtools.nsxt_converter.pools_converter import PoolConfigConv
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
    cfg_file = open('test_pool_converter.conf', 'r')
    cfg = cfg_file.read()
    global gSAMPLE_CONFIG
    gSAMPLE_CONFIG = json.loads(cfg)
    global nsxt_attributes
    nsxt_attributes= conv_const.init()

class Test(unittest.TestCase):

    def test_pool_conversion(self):

        avi_config = dict()
        pool_converter = PoolConfigConv(nsxt_attributes)
        pool_converter.convert(avi_config, gSAMPLE_CONFIG, '', {})
        pool_config=gSAMPLE_CONFIG['LbPools']
        avi_pool_config=avi_config.get('Pool',None)

        assert avi_pool_config

        for index,pool in enumerate(avi_pool_config):
            assert pool.get('name')
            assert pool.get('lb_algorithm')
            if pool_config[index].get('member'):
                assert pool.get('servers')


        assert len(pool_config) == len(avi_pool_config)





