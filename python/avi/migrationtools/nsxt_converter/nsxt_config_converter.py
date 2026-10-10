
import sys

from avi.migrationtools.ace_converter import pool_converter
from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util, pools_converter, vs_converter
from avi.migrationtools.nsxt_converter import monitor_converter
from avi.migrationtools.nsxt_converter import profiles_converter
from vmware.vapi.bindings.struct import PrettyPrinter
from com.vmware.vapi.std.errors_client import NotFound
from com.vmware.nsx.loadbalancer_client import Pools
import com.vmware.nsx_policy.infra_client as infra_client
import com.vmware.nsx_policy.model_client as model_client
import random
from com.vmware.vapi.std.errors_client import Error
from avi.migrationtools.nsxt_converter.nsxt_util import NSXUtil
import os
import json


def convert(nsx_ip, nsx_un, nsx_pw, nsx_port, output_dir,cloud_name='Default-Cloud'):
    nsx_util = NSXUtil(nsx_un, nsx_pw, nsx_ip, nsx_port)
    nsx_lb_config = nsx_util.get_nsx_config()
    input_path = output_dir + os.path.sep + nsx_ip + os.path.sep + "input"
    if not os.path.exists(input_path):
        os.makedirs(input_path)
    input_config = input_path + os.path.sep + "config.json"
    with open(input_config, "w", encoding='utf-8') as text_file:
        json.dump(nsx_lb_config, text_file, indent=4)


    alb_config = dict()  # Result Config

    monitor_converter.convert(alb_config, nsx_lb_config,cloud_name)
    profiles_converter.convert(alb_config, nsx_lb_config,cloud_name)
    pools_converter.convert(alb_config, nsx_lb_config,cloud_name)
    vs_converter.convert(alb_config,nsx_lb_config,cloud_name)

    output_path = output_dir + os.path.sep + nsx_ip + os.path.sep + "output"
    print(output_path)
    if not os.path.exists(output_path):
        os.makedirs(output_path)
    output_config = output_path + os.path.sep + "avi_config.json"
    with open(output_config, "w", encoding='utf-8') as text_file:
        json.dump(alb_config, text_file, indent=4)


    pp = PrettyPrinter()
    pp.pprint(alb_config)