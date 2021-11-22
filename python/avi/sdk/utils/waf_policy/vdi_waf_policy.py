# Copyright 2021 VMware, Inc.

import argparse
import json
import re
import logging
import os
import sys

from avi.sdk.avi_api import ApiSession

API_VERSION = "18.2.13"
SYSTEM_WAF_POLICY_VDI='System-WAF-Policy-VDI'

logger = logging.getLogger(__name__)

def get_latest_crs(api):
    resp = api.get("wafcrs/")
    if resp.status_code not in range(200, 300):
        logger.error('Error : %s' % resp.text)
        exit(0)
    waf_crses = json.loads(resp.text)["results"]
    latest_crs = waf_crses[0]
    latest_date = waf_crses[0]["version"]
    for waf_crs in waf_crses:
        if waf_crs["version"]>latest_date:
            latest_date = waf_crs["version"]
            latest_crs = waf_crs
    return latest_crs

def add_allowlist_rule(waf_policy_obj):
    #add a allowlist rule to allow request with uri beginning with /ice/
    allowlist_rule={
        "index": 0,
        "name": "allowlist-start-with-ice",
        "description": "WAF will buffer the whole request body first and then release to backend. With VDI, client wants to stream data between client and server for some URLs like /ice/..., we should allow these URLs",
        "actions": [
            "WAF_POLICY_WHITELIST_ACTION_ALLOW"
        ],
        "match": {
            "path": {
                "match_case": "SENSITIVE",
                "match_str": [
                    "/ice/"
                ],
                "match_criteria": "BEGINS_WITH"
            }
        }
    }
    index = 0
    waf_policy_obj.setdefault("whitelist", {}).setdefault("rules", [])
    for rule in waf_policy_obj["whitelist"]["rules"][:]:
        if rule["name"] == "allowlist-start-with-ice":
            waf_policy_obj["whitelist"]["rules"].remove(rule)
        if rule["index"]>index:
            index = rule["index"]
    allowlist_rule["index"] = index+1
    waf_policy_obj["whitelist"]["rules"].append(allowlist_rule)

def get_id_from_group(group):
    pattern = re.compile("[^\d]*(?P<group_id>\d\d\d)")
    match = pattern.match(group["name"])
    assert match, "can not extract group id from group '{}'".format(group["name"])
    groupid = int(match.group("group_id"))
    assert groupid == 0 or 100 <= groupid <= 999, "group id for group '{}' not in expected range".format(group["name"])
    return groupid

def disable_crs_response_rules(waf_policy_obj):
    #disable response side rules and some specific rules
    for crs_group in waf_policy_obj.get("crs_groups", []):
        group_id = get_id_from_group(crs_group)
        if group_id >= 950:
            crs_group["enable"] = False
        for rule in crs_group.get("rules", []):
            if rule["rule_id"] == "920330" or rule["rule_id"] == "932105":
                rule["enable"] = False

def add_pre_crs_group(waf_policy_obj):
    #add a rule to parse body as xml for requests with /broker/xml uri
    xml_rule = [
        {
            "index": 0,
            "name": "enforce XML parsing for /broker/xml",
            "description": "Clients often send the wrong Content-Type header. We ignore the header and enforce the request body to be parsed as XML in WAF",
            "rule": "SecRule REQUEST_METHOD \"@streq POST\" \"phase:1,id:4099822,t:none,nolog,pass,chain\" \n SecRule REQUEST_URI \"@streq /broker/xml\" \"t:none,ctl:requestBodyProcessor=XML\""
        }
    ]
    pre_crs_group = {
        "index": 0,
        "name": "VDI_409_ENFORCE_XML",
        "rules": xml_rule
    }
    index = 0
    if "pre_crs_groups" not in waf_policy_obj:
        waf_policy_obj["pre_crs_groups"] = list()
    for pre_crs in waf_policy_obj["pre_crs_groups"]:
        if pre_crs["name"] == "VDI_409_ENFORCE_XML":
            pre_crs["rules"] = xml_rule
            pre_crs["enable"] = True
            return
        if pre_crs["index"] > index:
            index = pre_crs["index"]
    pre_crs_group["index"] = index + 1
    waf_policy_obj["pre_crs_groups"].append(pre_crs_group)

def create_vdi_waf_policy(api, args):
    waf_policy_obj = {
        "name": SYSTEM_WAF_POLICY_VDI,
        "mode": "WAF_MODE_DETECTION_ONLY",
        "waf_profile_ref": "/api/wafprofile?name=System-WAF-Profile"
    }
    waf_crs = get_latest_crs(api)
    waf_policy_obj["waf_crs_ref"]="/api/wafcrs?name="+waf_crs["name"]
    waf_policy_obj["crs_groups"] = list()
    for group in waf_crs["groups"]:
        waf_policy_obj["crs_groups"].append(group)

    add_allowlist_rule(waf_policy_obj)
    disable_crs_response_rules(waf_policy_obj)
    add_pre_crs_group(waf_policy_obj)
    resp = api.post('wafpolicy', data=json.dumps(waf_policy_obj))
    if resp.status_code in range(200, 300):
        logger.debug('Create WAF policy successfully')
    else:
        logger.error('Error : %s' % resp.text)

def update_waf_policy(api, args, waf_policy_obj):
    add_allowlist_rule(waf_policy_obj)
    disable_crs_response_rules(waf_policy_obj)
    add_pre_crs_group(waf_policy_obj)
    resp = api.put('wafpolicy/%s' %waf_policy_obj['uuid'], data=waf_policy_obj)
    if resp.status_code in range(200, 300):
        logger.debug('Create WAF policy successfully')
    else:
        logger.error('Error : %s' % resp.text)

if __name__ == '__main__':

    parser = argparse.ArgumentParser()
    parser.add_argument('-u', '--user', action="store", help='controller user',
                        default='admin')
    parser.add_argument('-p', '--password', action="store", help='controller user password',
                        default='admin')
    parser.add_argument('-t', '--tenant', action="store", help='tenant name',
                        default='admin')
    parser.add_argument('-a', '--authtoken', help='Authentication token')
    parser.add_argument('-c', '--controller_ip', action="store", help='controller ip')

    args = parser.parse_args()
    if args.password:
        api = ApiSession.get_session(args.controller_ip, args.user, args.password,
                                     tenant=args.tenant, api_version=API_VERSION)
    elif args.authtoken:
        api = ApiSession.get_session(args.controller_ip, args.user, tenant=args.tenant,
                                     token=args.authtoken, api_version=API_VERSION)
    else:
        logging.error("Either password or authtokentoken must be provided.")
        sys.exit(1)

    waf_policy_obj = api.get_object_by_name('wafpolicy', SYSTEM_WAF_POLICY_VDI)

    if not waf_policy_obj:
        create_vdi_waf_policy(api, args)
    else:
        update_waf_policy(api, args, waf_policy_obj)
