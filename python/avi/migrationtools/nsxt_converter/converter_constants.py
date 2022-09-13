# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import yaml
import os

STATUS_SKIPPED = 'SKIPPED'
STATUS_SUCCESSFUL = 'SUCCESSFUL'
STATUS_ERROR = 'ERROR'
HM_CUSTOM_KEY = 'healthmonitor_custom_config'
PLACE_HOLDER_STR = "auto_created"
OBJECT_TYPE_HTTP_POLICY_SET = "httppolicyset"

def init():
    """
    This function defines that to initialize constant from yaml file
    :return: None
    """
    global nsxt_command_status
    with open(os.path.dirname(__file__) + "/command_status.yaml") as stream:
        nsxt_command_status = yaml.safe_load(stream)
    return nsxt_command_status.get('NSXT')
