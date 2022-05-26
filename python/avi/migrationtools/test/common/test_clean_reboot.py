# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import json
import os
import time
from avi.sdk.avi_api import ApiSession
import requests

def verify_controller_is_up(controller_ip, username, password):
    """""
    Verify the given Controller is running by getting it's
    CLUSTER_UP_HA_ACTIVE, CLUSTER_UP_NO_HA states using AVI API.
    """
    session = ApiSession.get_session (controller_ip, username, password)
    cluster_up_states = ["CLUSTER_UP_HA_ACTIVE", "CLUSTER_UP_NO_HA"]
    data = session.get('cluster/runtime')
    response_content = data.content.decode() if type(data.content) == bytes else data.content
    data = json.loads (response_content)
    if data['cluster_state']['state'] in cluster_up_states:
        print("Node is active. We can use controller for further process.")
        return True
    return False


def clean_reboot(controller_ip, username, password, version, licensefile_path):
    """""
    Clean Reboot the given Controller by using AVI API and polls the
    controller status till the cluster up.
    """
    session = ApiSession.get_session (controller_ip, username, password)
    res = session.post('cluster/reboot/',
                        data=json.dumps ({'mode': 'REBOOT_CLEAN'}),
                        auth=(username, password))
    if res.status_code < 300:
        ApiSession.clear_cached_sessions()
        wait_until_node_ready(controller_ip)
        if version > "16.5.4" :
            ApiSession.clear_cached_sessions()
            set_default_password(controller_ip, username, password)
    else:
        raise Exception("Failed with error %s" % res.content)
    with open(licensefile_path, 'r') as license:
        license_text = license.read()
        licensefile = json.dumps({"license_text": license_text})
    upload_license(session, licensefile)


def set_default_password(controller_ip, username, password=None):
    if not password:
        password = 'Admin!23'
    api = ApiSession.get_session(controller_ip, username, password=os.environ['default_password'])
    passData = {
        "username": "admin",
        "password": password,
        "old_password": os.environ['default_password'],
        'full_name': 'System Administrator',
    }
    resp = api.get('systemconfiguration', tenant='admin')
    r = resp.json()
    data = r['portal_configuration']['password_strength_check'] = False
    sysresp = api.put('systemconfiguration', data=data, tenant='admin')
    if sysresp.status_code == 200:
        res = api.put('useraccount', data=passData, tenant='admin')
        if res.status_code == 200:
            api.clear_cached_sessions()
            return
        else:
            raise Exception("Controller password updation faild %s" % res.content)
    else:
        raise Exception("Failed with error %s" % sysresp.content)

def upload_license(session, licensefile):
    """""
    Upload the AviInternal license using API API And Verify
    that it is uploaded successfully using assert.
    """
    response = session.put('license', data=licensefile)
    response_content = response.content.decode() if type(response.content) == bytes else response.content
    response = json.loads(response_content)
    assert "Successfully uploaded license AviInternal" in response['result']
    time.sleep(60)
    print("Successfully uploaded license AviInternal")


def wait_until_node_ready(controller_ip, interval=120, timeout=3000):
    """""
    Polls the controller at every minute status till we get success state
    and verify cluster state.
    """
    cluster_up_states = ["CLUSTER_UP_HA_ACTIVE", "CLUSTER_UP_NO_HA"]
    iters = int(timeout / interval)
    for count in range(0, iters):
        data = requests.get('https://{ip}/api/cluster/runtime'.format(ip=controller_ip), verify=False)
        if type(data) != dict and data.status_code == 200:
            response_content = data.content.decode() if type(data.content) == bytes else data.content
            data = json.loads (response_content)
            if data['cluster_state']['state'] in cluster_up_states:
                print("node is active")
                break
        time.sleep (interval)
    else:
        raise Exception("Node is not in up state after timeout %s" % timeout)
