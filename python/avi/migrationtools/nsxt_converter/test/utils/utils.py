import json
import logging
import os
import subprocess
import sys
import requests as requests

LOG_LOCATION = "./"
log = logging.getLogger("t2alb_functional")


def setup_logging(filename):
    """
    Sets up global logging
    """
    level = logging.DEBUG
    formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
    ch1 = logging.FileHandler(filename)
    ch1.setLevel(level)
    ch1.setFormatter(formatter)
    log.addHandler(ch1)
    log.setLevel(level)
    print("logger initialised %s" % filename)
    return log


def verify_vs_is_up_on_nsxt(nsxt_ip, nsxt_un, nsxt_pw, vs_name):
    headers = {'content-type': 'application/json'}
    response = requests.get("https://{}/policy/api/v1/infra/lb-virtual-servers".format(nsxt_ip),
                auth=(nsxt_un, nsxt_pw), headers=headers, verify=False)
    response = json.loads(response.text)
    for each_lbvs in response['results']:
        if each_lbvs['display_name'] == vs_name:
            if each_lbvs.get('enabled') == True and each_lbvs.get('lb_service_path'):
                return True


def verify_traffic(req, tag):
    dir_name = os.path.dirname(os.path.abspath(__file__))
    ansible_path = dir_name + '/ansible.yml'
    inventory_path = dir_name + '/inventory'
    cmd = "ansible-playbook %s -i %s -e traffic_vip='%s' --tags %s" % (ansible_path, inventory_path, req, tag)
    log.info('Ansible playbook command for traffic: {}'.format(cmd))
    res = subprocess.run(cmd, shell=True, capture_output=True)
    return res


def verify(condition, err_message):
    """
    :param condition: Condition to applya assert on it
    :param err_message: Error message if assert fails
    :return:
    """
    try:
        assert condition
    except AssertionError:
        log.error(err_message)
        sys.exit(err_message)


class Error(Exception):
    """Base class for other exceptions"""
    pass

class VSStateDown(Error):
    """Raised when the vs state is down"""
    pass
