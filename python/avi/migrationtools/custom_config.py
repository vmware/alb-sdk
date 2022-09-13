# !/usr/bin/env python3

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0
# Version 0.06

import urllib3
import yaml
import re
import argparse
from avi.sdk.avi_api import ApiSession
urllib3.disable_warnings()
api_results = {}


def ref_clean_up(obj):
    """
    Loops through list of policies and datascripts and removes un-needed fields
    :param obj: Object for which referances to clean up
    :return Updated object
    """
    clean_up = ['uuid', 'url', '_last_modified', 'is_internal_policy']
    if isinstance(obj, dict):
        return {k: ref_clean_up(v) for k, v in obj.items()}
    elif isinstance(obj, list):
        # clean all unused k/v pairs in api call
        for clean_obj in clean_up:
            if clean_obj in obj:
                del obj[clean_obj]
        return [ref_clean_up(elem) for elem in obj]
    else:
        if isinstance(obj, str):
            return object_update(obj)
        else:
            return obj


def object_update(obj):
    """
    Removes Object IP/UUID from API call and formats it properly for playbooks
    Example:
    Before: https://<controller_ip>/api/pool/pool-06355c47-5e67-443f-92cf-06e946c95d91#foo_pool
    After: /api/pool/?name=foo_pool
    :param obj:
    :return Updated Object
    """
    match_api = re.match(".*(/api/\w+).*#(.*)", obj)
    if match_api:

        return "%s/?name=%s" % (match_api.group(1), match_api.group(2))
    else:
        return obj


def long_substring(v_policy):
    """
    Searches for the longest match of index names and creates a string
    "rule_name" containing the Policy name that matches the iRule name
    :param v_policy:
    :return
    """
    rule_name_list = []
    for i in v_policy:
        rule_name_list.append(i['name'])
    rule_name = ""
    for i in range(len(rule_name_list[0])):
        if rule_name_list[0][i] == rule_name_list[-1][i]:
            rule_name += rule_name_list[0][i]
        # Else, stop the comparison
        else:
            break

    # remove "-" at the end of rule_name string
    match = re.match("(.*)(--)", rule_name)
    if match:
        rule_name = match.group(0)
    return rule_name


def policyset(policytype, objecttype):
    """
    Loops through policies, adds required fields for ansible playbook and
    appends finished policies to "finished_policies" list
    Also parses rule names and combines those with the same index
    :param policytype:
    :param objecttype:
    :return:
    """
    rule_list = {}
    indexer = 0
    default_policy_name = "httppolicyset"

    finished_policies = []
    if "rules" in policytype and policytype["rules"]:
        rule_name_list = []
        for v in policytype["rules"]:
            suffix_match = (re.match(".*--(\W+)$", v['name'])
                            or re.match(".*-(\w+)$", v['name']))
            if suffix_match:
                rule_name_match = (re.match("^(.*)--(\w+)$", v['name'])
                                   or re.match(".*-(\w+)$", v['name']))
                policy_name_string = ("%s-%s" % (
                    default_policy_name, suffix_match.group(1)))
                rule_name_list.append(policy_name_string)
                if policy_name_string in rule_list:
                    indexer += 1
                    v['name'] = rule_name_match.group(1)
                    v['index'] = indexer
                    rule_list[policy_name_string].append(v)
                else:
                    indexer = 1
                    rule_list[policy_name_string] = []
                    v['name'] = rule_name_match.group(1)
                    v['index'] = indexer
                    rule_list[policy_name_string].append(v)
            else:
                indexer = 1
                rule_list[v['name']] = []
                v['index'] = indexer
                rule_list[v['name']].append(v)
        for k_policy, v_policy in rule_list.items():
            k_policy = long_substring(v_policy)
            if objecttype == "NetworkSecurityPolicy":
                finished_policies.append(
                    {
                        'rule_name': k_policy,
                        'type': objecttype,
                        'avi_config':
                            {
                                'name': k_policy,
                                'rules': v_policy
                            }
                    }
                )
            else:
                finished_policies.append(
                    {
                        'rule_name': k_policy,
                        'type': 'HTTPPolicySet',
                        'avi_config':
                            {
                                'name': k_policy,
                                objecttype:
                                    {
                                        'rules': v_policy
                                    }
                            }
                    }
                )
    return finished_policies


def build_custom_config():
    """
    Loops through Keys and builds a list of policies and datascripts
    :return:
    """
    results = []
    policy_rule_types = ['http_security_policy',
                         'http_request_policy', 'http_response_policy']
    for k, v in api_results.items():
        if "HTTPPolicySet" == k:
            for policy_item in v:
                for objecttype in policy_rule_types:
                    try:
                        results.extend(
                            policyset(policy_item[objecttype], objecttype))
                    except KeyError:
                        continue
        if "VSDataScriptSet" == k:
            for script in v:
                for ds in script['datascript']:
                    results.append(
                        {
                            'rule_name': script['name'],
                            'type': 'VSDataScriptSet',
                            'avi_config':
                                {
                                    'name': script['name'],
                                    'datascript':
                                        [{
                                            'evt': ds['evt'],
                                            'script': ds['script']
                                        }]
                                }
                        }
                    )
        if "NetworkSecurityPolicy" == k:
            for policy_item in v:
                results.extend(policyset(policy_item, "NetworkSecurityPolicy"))
    return ref_clean_up(results)


def login_api():
    """
    Logs into controller via CLI argparse inputs and completes api GET
    :return:
    """
    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter,
        description=(HELP_STR))

    parser.add_argument(
        "-c", "--controller",
        help="Provide the controller IP Address",
        type=str
    )
    parser.add_argument(
        "-u", "--username",
        help="Provide the controller login username",
        type=str,
        default='admin'
    )
    parser.add_argument(
        "-p", "--password",
        help="Provide the controller login password",
        type=str
    )
    parser.add_argument(
        "-v", "--api_version",
        help="Provide the controller version",
        type=str
    )
    parser.add_argument(
        "-t", "--tenant",
        help="Provide the controller tenant",
        type=str,
        default='*'
    )
    args = parser.parse_args()
    api = ApiSession.get_session(
        args.controller, args.username, args.password, tenant=args.tenant,
        api_version=args.api_version
    )
    global api_results
    api_query = ['NetworkSecurityPolicy', 'HTTPPolicySet', 'VSDataScriptSet']
    for q in api_query:
        resp = api.get(q.lower()+"?include_name")
        api_results[q] = resp.json()["results"]
    # return api_results[q]


if __name__ == '__main__':
    HELP_STR = '''
    For all iRules in migration scope, configure them on the Avi Controller as appropriate object
        Network Security policy
        HTTP Security policy
        HTTP Request policy
        HTTP Response policy
        DataScript
    
    Script converts all Network Security, HTTP Security, HTTP Request, HTTP Response polices and Datascripts on controller into YAML file to run with the F5 Migration tool

    Script will complete a GET API call to controller for policies and datascripts, convert the RAW JSON to YAML, and write it to a file called converted_irules.yml.

    For policies that require multiple indexes
        You must save each policy with a unique name while configuring it in the UI
 
        The script parses the longest match for the policy name. The longest match should be exactly what the irule name is on the F5. 
            Example
                mobile-https.redirect.irule (Actual iRule name)
                mobile-https.redirect.irule-mobilesecure.com 
            The longest match between the two policies is "mobile-https.redirect.irule”

        Suffix
            Must have two dashes "--" followed by a unique word (--foo --bar,--one, --two, etc)

        Policies that belong to the same HTTP policy set need to have a suffix tying them together
            Example
                mobile-https.redirect.irule--foo
                mobile-https.redirect.irule-mobilesecure.com--foo

    Running the script: python3 custom_config.py –c controller.local –u admin -p VMware1!
    '''
    login_api()
    custom_config = build_custom_config()
    custom_config_yaml = yaml.dump(custom_config)
    custom_config = open("converted_irules.yml", "w+")
    custom_config.write("irule_custom_config:" + "\n")
    custom_config.write("\n")
    custom_config.write(custom_config_yaml)
    custom_config.close()
