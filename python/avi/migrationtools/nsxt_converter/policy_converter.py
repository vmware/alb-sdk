# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import copy
import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.avi_migration_utils import update_count
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.converter_constants as final
from avi.migrationtools.nsxt_converter.persistant_converter import persistence_ds_list, persistence_profile_list
from avi.migrationtools.nsxt_converter.pools_converter import vs_pool_segment_list, vs_select_pool_action_list

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()


class PolicyConfigConverter(object):
    def __init__(self, nsxt_profile_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

        """
        self.supported_attr = nsxt_profile_attributes['VS_supported_attr']
        self.server_ssl_attr = nsxt_profile_attributes['VS_server_ssl_supported_attr']
        self.client_ssl_attr = nsxt_profile_attributes['VS_client_ssl_supported_attr']
        self.common_na_attr = nsxt_profile_attributes['Common_Na_List']
        self.VS_na_attr = nsxt_profile_attributes["VS_na_list"]
        self.rule_match_na = nsxt_profile_attributes["HttpPolicySetRules_Skiped_List_MatchingCondition"]
        self.rules_actions_na = nsxt_profile_attributes["HttpPolicySetRules_Skiped_List_Actions"]
        self.supported_attr_httppolicyset = nsxt_profile_attributes["HttpPolicySetRules_Supported_Attributes"]
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict

    def convert(self, lb_vs_config, alb_vs_config, alb_config, nsx_lb_config, nsxt_util,
                is_pool_group_used, http_pool_group_list, http_pool_list, cloud_type, cloud_name, prefix,
                controller_version,
                cloud_tenant, tier1_lr, tenant="admin"):
        '''

        '''
        self.nsxt_util=nsxt_util
        self.lb_vs_config = lb_vs_config
        self.alb_config = alb_config
        self.alb_vs_config = alb_vs_config
        self.nsx_lb_config = nsx_lb_config
        self.tenant = tenant
        self.is_pool_group_used = is_pool_group_used
        self.controller_version = controller_version
        self.cloud_type = cloud_type
        self.cloud_tenant = cloud_tenant
        self.tier1_lr = tier1_lr
        self.http_pool_group_list = http_pool_group_list
        self.http_pool_list = http_pool_list
        self.datascript = dict(
            evt='VS_DATASCRIPT_EVT_HTTP_RESP',

        )
        self.ds_script = ''

        policy_set_name = lb_vs_config.get("display_name") + "-" + cloud_name + "-HTTP-Policy-Set"
        if prefix:
            policy_set_name = prefix + '-' + policy_set_name

        policy_obj = {
            'name': policy_set_name,
            'tenant_ref': conv_utils.get_object_ref(tenant, 'tenant'),
        }
        http_request_policy = {
            'rules': []
        }
        http_security_policy = {
            'rules': []
        }
        http_response_policy = {
            'rules': []
        }
        self.policy_datascript_obj={
            'tenant_ref': conv_utils.get_object_ref(tenant,'tenant'),
            'datascript': list(),
            'pool_group_refs': list(),
            'pool_refs': list()
        }
        self.http_policy_ds_obj = {
            'datascript': list(),
            'pool_group_refs': list(),
            'pool_refs': list()
        }
        self.sec_policy_ds_obj = {
            'datascript': list(),
            'pool_group_refs': list(),
            'pool_refs': list()
        }
        self.rsp_policy_ds_obj = {
            'datascript': list(),
            'pool_group_refs': list(),
            'pool_refs': list()
        }
        self.http_ds_scripts = ''
        self.sec_ds_script = ''
        self.resp_ds_scripts = ''

        http_rules = []
        rsp_rules = []
        sec_rules = []
        policy_datascript = []

        skipped_rule = []
        status_rule_list = []
        rules = lb_vs_config.get("rules")

        for index, policy in enumerate(rules):
            actions = policy.get("actions")
            na_action_list = list(filter(lambda x: x["type"] in self.rules_actions_na, actions))

            # If na_action_list is empty then we can mapped this rule otherwise skipped this rule
            if len(na_action_list) > 0:
                skipped_rule.append(policy)
                status_rule_list.append('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name,
                                                                                                       [action['type']
                                                                                                        for action in
                                                                                                        na_action_list]))
                LOG.info('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name,
                                                                                        [action['type'] for action in
                                                                                         na_action_list]))
                # print('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name, [action['type'] for action in na_action_list]))
                continue
            if not len(na_action_list):
                match_conditions = policy.get("match_conditions")
                match_strategy = policy.get("match_strategy")
                phase = policy.get("phase")
                actions = policy.get("actions")
                # if check all type of matches if any one not supported then check match_strategy is ALL
                # then skip other migrate whatever  supported
                if match_strategy == "ALL" and match_conditions:
                    na_match_list = list(filter(lambda x: x["type"] in self.rule_match_na, match_conditions))
                    if len(na_match_list) > 0:
                        LOG.info('[VS-RULES: {}] SKIPPING RULE One of Match Conditions is Not supported {}'.format(
                            policy_set_name,
                            [match['type'] for match in na_match_list]))
                        status_rule_list.append('[VS-RULES: {}] SKIPPING RULE One of Match Conditions is Not supported '
                                                '{}'.format(policy_set_name,
                                                            [match['type'] for match in na_match_list]))

                        skipped_rule.append(policy)
                        continue
                    if not len(na_match_list):
                        rule_dict = dict(name="Rule {}",
                                         index=0,
                                         enable=True)
                        match = {}

                        is_match_ds = list(filter(lambda match_cond: match_cond['type'] in
                                                                     ['LBSslSniCondition', 'LBHttpSslCondition'],
                                                  match_conditions))
                        if is_match_ds:
                            match, total_action_count = \
                                self.convert_match_conditions_to_match_ds(match, match_conditions, rule_dict,
                                                                          actions, prefix, cloud_name,match_strategy,
                                                                          phase)
                            rule_dict['match'] = match

                        else:
                            match, total_match_count = self.convert_match_conditions_to_match(match, match_conditions, rule_dict, actions,
                                                                           prefix, cloud_name)
                            rule_dict['match'] = match
                            total_action_count = 0
                            if total_match_count:
                                rule_dict, total_action_count = self.convert_actions_to_avi_actions(rule_dict, actions,
                                                                                                prefix,
                                                                                                cloud_name)
                        if total_action_count and not is_match_ds:
                            #if rule_dict['match'].get('Data_script'):
                            #    policy_datascript.append(match['Data_script'])
                            if phase == "HTTP_REQUEST_REWRITE" or phase == "TRANSPORT":
                                http_rules.append(rule_dict)
                            elif phase == "HTTP_RESPONSE_REWRITE":
                                rsp_rules.append(rule_dict)
                            elif phase == "HTTP_ACCESS":
                                sec_rules.append(rule_dict)
                            elif phase == "HTTP_FORWARDING":
                                if len(actions) == 1 and actions[0]['type'] == "LBConnectionDropAction":
                                    sec_rules.append(rule_dict)
                                elif rule_dict.__contains__('redirect_action') and rule_dict.__contains__(
                                        'switching_action'):
                                    redirect_action = copy.deepcopy(rule_dict)
                                    redirect_action.pop('switching_action')
                                    http_rules.append(redirect_action)

                                    switching_action = copy.deepcopy(rule_dict)
                                    switching_action.pop('redirect_action')
                                    http_rules.append(switching_action)
                                elif rule_dict.__contains__('redirect_action') or rule_dict.__contains__(
                                        'switching_action'):
                                    http_rules.append(rule_dict)
                if match_strategy == "ANY" and match_conditions:
                    supp_match_conditions = list()
                    for match_condition in match_conditions:
                        if match_condition["type"] in self.rule_match_na:
                            LOG.info('[VS-RULES: {}] SKIPPING RULE Match Condition is Not supported {}'.format(
                                policy_set_name,
                                [match_condition['type']]))
                            status_rule_list.append(
                                '[VS-RULES: {}] SKIPPING RULE Match Condition is Not supported {}'.format(
                                    policy_set_name,
                                    [match_condition['type']]))
                            continue
                        supp_match_conditions.append(match_condition)

                    if supp_match_conditions:
                        rule_dict = dict(name="Rule {}",
                                         index=0,
                                         enable=True)
                        match = {}

                        is_match_ds = list(filter(lambda match_cond: match_cond['type'] in
                                                                     ['LBSslSniCondition', 'LBHttpSslCondition'],
                                                  match_conditions))
                        if is_match_ds:
                            match, total_action_count = \
                                self.convert_match_conditions_to_match_ds(match, supp_match_conditions, rule_dict,
                                                                          actions, prefix, cloud_name,match_strategy,
                                                                          phase)
                            rule_dict['match'] = match
                        else:
                            match, total_match_count = self.convert_match_conditions_to_match(match, supp_match_conditions, rule_dict,
                                                                           actions,
                                                                           prefix, cloud_name)
                            rule_dict['match'] = match
                            total_action_count = 0
                            if total_match_count:
                                rule_dict, total_action_count = self.convert_actions_to_avi_actions(rule_dict, actions,
                                                                                                prefix,
                                                                                                cloud_name)
                        if total_action_count and not is_match_ds:
                            #if rule_dict['match'].get('Data_script'):
                            #    policy_datascript.append(match['Data_script'])
                            if phase == "HTTP_REQUEST_REWRITE" or phase == "TRANSPORT":
                                http_rules.append(rule_dict)
                            elif phase == "HTTP_RESPONSE_REWRITE":
                                rsp_rules.append(rule_dict)
                            elif phase == "HTTP_ACCESS":
                                sec_rules.append(rule_dict)
                            elif phase == "HTTP_FORWARDING":
                                if len(actions) == 1 and actions[0]['type'] == "LBConnectionDropAction":
                                    sec_rules.append(rule_dict)
                                elif rule_dict.__contains__('redirect_action') and rule_dict.__contains__(
                                        'switching_action'):
                                    redirect_action = copy.deepcopy(rule_dict)
                                    redirect_action.pop('switching_action')
                                    http_rules.append(redirect_action)

                                    switching_action = copy.deepcopy(rule_dict)
                                    switching_action.pop('redirect_action')
                                    http_rules.append(switching_action)
                                elif rule_dict.__contains__('redirect_action') or rule_dict.__contains__(
                                        'switching_action'):
                                    http_rules.append(rule_dict)
        ds_counter = 1
        for index, rule in enumerate(http_rules):
            counter = index + 1
            rule['name'] = rule.get("name").format(counter)
            rule['index'] = counter

        for index, rule in enumerate(sec_rules):
            counter = index + 1
            rule['name'] = rule.get("name").format(counter)
            rule['index'] = counter

        for index, rule in enumerate(rsp_rules):
            counter = index + 1
            rule['name'] = rule.get("name").format(counter)
            rule['index'] = counter

        indirect = []
        u_ignore = []
        ignore_for_defaults = {}

        conv_status = conv_utils.get_conv_status(
            [], indirect, ignore_for_defaults, [],
            u_ignore, [])

        if http_rules or sec_rules or rsp_rules or self.policy_datascript_obj:
            conv_status["skipped"] = skipped_rule
            conv_status["na_list"] = []
            if not skipped_rule:
                conv_status["status"] = "SUCCESSFUL"
            else:
                conv_status["status"] = "PARTIAL"
            if http_rules:
                http_request_policy['rules'] = http_rules
                policy_obj['http_request_policy'] = http_request_policy
            if sec_rules:
                http_security_policy['rules'] = sec_rules
                policy_obj['http_security_policy'] = http_security_policy
            if rsp_rules:
                http_response_policy['rules'] = rsp_rules
                policy_obj['http_response_policy'] = http_response_policy

            conv_utils.add_conv_status('policy', None, policy_set_name, conv_status,
                                       [{"policy_set": policy_obj}])

          #  if policy_datascript:
          #      policy_obj['datascripts'] = list()
          #      for policy_ds in policy_datascript:
          #          policy_ds['name'] = "%s-ds-%s" % (policy_set_name, ds_counter)
          #          policy_ds['tenant_ref'] = conv_utils.get_object_ref(tenant, 'tenant')
          #          policy_obj['datascripts'].append(policy_ds)
          #          conv_utils.add_conv_status('datascript', None, policy_ds['name'], conv_status,
          #                                     [{"datascript": policy_ds}])
          #          alb_config['VSDataScriptSet'].append(policy_ds)
          #          ds_counter += 1

            count_ds=1

            policy_obj['datascripts'] = list()
            if len(self.http_ds_scripts) > 1:
                datascript = dict(
                    evt='VS_DATASCRIPT_EVT_HTTP_RESP',

                )
                self.http_policy_ds_obj['name'] = "%s-ds-%s" % (policy_set_name, count_ds)
                self.http_ds_scripts = "%s end" % self.http_ds_scripts
                datascript['script'] = self.http_ds_scripts
                self.http_policy_ds_obj['datascript'].append(datascript)

                if not self.http_policy_ds_obj['pool_refs']:
                    self.http_policy_ds_obj.pop('pool_refs')
                if not self.http_policy_ds_obj['pool_group_refs']:
                    self.http_policy_ds_obj.pop('pool_group_refs')
                policy_obj['datascripts'].append(self.http_policy_ds_obj)
                conv_utils.add_conv_status('datascript', None, self.http_policy_ds_obj['name'], conv_status,
                                                     [{"datascript": self.http_policy_ds_obj}])
                alb_config['VSDataScriptSet'].append(self.http_policy_ds_obj)
                count_ds+=1

            if len(self.resp_ds_scripts) > 1:
                datascript = dict(
                    evt='VS_DATASCRIPT_EVT_HTTP_REQ',

                )
                self.rsp_policy_ds_obj['name'] = "%s-ds-%s" % (policy_set_name, count_ds)
                self.resp_ds_scripts = "%s end" % self.resp_ds_scripts
                datascript['script'] = self.resp_ds_scripts
                self.rsp_policy_ds_obj['datascript'].append(datascript)

                if not self.rsp_policy_ds_obj['pool_refs']:
                    self.rsp_policy_ds_obj.pop('pool_refs')
                if not self.rsp_policy_ds_obj['pool_group_refs']:
                    self.rsp_policy_ds_obj.pop('pool_group_refs')
                policy_obj['datascripts'].append(self.rsp_policy_ds_obj)
                conv_utils.add_conv_status('datascript', None, self.http_policy_ds_obj['name'], conv_status,
                                                     [{"datascript": self.rsp_policy_ds_obj}])
                alb_config['VSDataScriptSet'].append(self.rsp_policy_ds_obj)
                count_ds += 1

            if len(self.sec_ds_script) > 1:
                datascript = dict(
                    evt='VS_DATASCRIPT_EVT_HTTP_REQ',

                )
                self.sec_policy_ds_obj['name'] = "%s-ds-%s" % (policy_set_name, count_ds)
                self.sec_ds_script= "%s end" % self.sec_ds_script
                datascript['script'] = self.sec_ds_script
                self.sec_policy_ds_obj['datascript'].append(datascript)
                if not self.sec_policy_ds_obj['pool_refs']:
                    self.sec_policy_ds_obj.pop('pool_refs')
                if not self.sec_policy_ds_obj['pool_group_refs']:
                    self.sec_policy_ds_obj.pop('pool_group_refs')
                policy_obj['datascripts'].append(self.sec_policy_ds_obj)
                conv_utils.add_conv_status('datascript', None, self.sec_policy_ds_obj['name'], conv_status,
                                                     [{"datascript": self.sec_policy_ds_obj}])
                alb_config['VSDataScriptSet'].append(self.sec_policy_ds_obj)
                count_ds += 1

            return policy_obj, status_rule_list
        else:
            conv_utils.add_status_row('policy', [], policy_set_name,
                                      conv_const.STATUS_SKIPPED)
            return None, status_rule_list

    def convert_match_conditions_to_match(self, match, match_conditions, rule_dict, actions, prefix, cloud_name):
        total_match_count=0
        match['hdrs'] = list()
        match['rsp_hdrs'] = list()
        for match_condition in match_conditions:

            if match_condition.get("type") == "LBHttpResponseHeaderCondition":
                hdrs = dict(value=[match_condition.get("header_value")],
                            match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE")
                if match_condition.get("match_type"):
                    match_criteria = match_condition.get("match_type")
                    if match_condition.get("match_type") == "EQUALS":
                        match_criteria = "HDR_EQUALS"
                    elif match_condition.get("match_type") == "STARTS_WITH":
                        match_criteria = "HDR_BEGINS_WITH"
                    elif match_condition.get("match_type") == "ENDS_WITH":
                        match_criteria = "HDR_ENDS_WITH"
                    elif match_condition.get("match_type") == "CONTAINS" or match_condition.get(
                            "match_type") == "REGEX":
                        match_criteria = "HDR_CONTAINS"
                    hdrs["match_criteria"] = match_criteria
                if match_condition.get("header_name"):
                    hdrs["hdr"] = match_condition.get("header_name")
                match['rsp_hdrs'].append(hdrs)
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestUriCondition":
                request_uri = dict(match_str=[match_condition.get("uri")],
                                   match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE")
                if match_condition.get("match_type"):
                    match_criteria = match_condition.get("match_type")
                    if match_condition.get("match_type") == "EQUALS":
                        match_criteria = "EQUALS"
                    elif match_condition.get("match_type") == "STARTS_WITH":
                        match_criteria = "BEGINS_WITH"
                    elif match_condition.get("match_type") == "ENDS_WITH":
                        match_criteria = "ENDS_WITH"
                    elif match_condition.get("match_type") == "CONTAINS" or match_condition.get(
                            "match_type") == "REGEX":
                        match_criteria = "CONTAINS"
                    request_uri['match_criteria'] = match_criteria
                match["path"] = request_uri
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestHeaderCondition":
                hdrs = dict(value=[match_condition.get("header_value")],
                            match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE")
                if match_condition.get("match_type"):
                    match_criteria = match_condition.get("match_type")
                    if match_condition.get("match_type") == "EQUALS":
                        match_criteria = "HDR_EQUALS"
                    elif match_condition.get("match_type") == "STARTS_WITH":
                        match_criteria = "HDR_BEGINS_WITH"
                    elif match_condition.get("match_type") == "ENDS_WITH":
                        match_criteria = "HDR_ENDS_WITH"
                    elif match_condition.get("match_type") == "CONTAINS" or match_condition.get(
                            "match_type") == "REGEX":
                        match_criteria = "HDR_CONTAINS"
                    hdrs["match_criteria"] = match_criteria
                if match_condition.get("header_name"):
                    hdrs["hdr"] = match_condition.get("header_name")
                match['hdrs'].append(hdrs)
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestMethodCondition":
                method = dict(methods=["HTTP_METHOD_" + match_condition.get("method")], match_criteria="IS_IN")
                match["method"] = method
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestUriArgumentsCondition":
                query = dict(match_str=[match_condition.get("uri_arguments")],
                             match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE",
                             match_criteria="QUERY_MATCH_CONTAINS")
                match["query"] = query
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestVersionCondition":
                version = dict(
                    versions=["ONE_ONE" if match_condition.get("version") == "HTTP_VERSION_1_1" else "ONE_ZERO"],
                    match_criteria="IS_IN")
                match["version"] = version
                total_match_count += 1
            if match_condition.get("type") == "LBHttpRequestCookieCondition":
                cookie = dict(name=match_condition.get("cookie_name"),
                              value=match_condition.get("cookie_value"),
                              match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE")
                if match_condition.get("match_type"):
                    match_criteria = match_condition.get("match_type")
                    if match_condition.get("match_type") == "EQUALS":
                        match_criteria = "HDR_EQUALS"
                    elif match_condition.get("match_type") == "STARTS_WITH":
                        match_criteria = "HDR_BEGINS_WITH"
                    elif match_condition.get("match_type") == "ENDS_WITH":
                        match_criteria = "HDR_ENDS_WITH"
                    elif match_condition.get("match_type") == "CONTAINS" or match_condition.get(
                            "match_type") == "REGEX":
                        match_criteria = "HDR_CONTAINS"
                    cookie["match_criteria"] = match_criteria
                match["cookie"] = cookie
                total_match_count += 1
            if match_condition.get("type") == "LBIpHeaderCondition":
                if match_condition.get("source_address"):
                    client_ip = {
                        "match_criteria": "IS_IN",
                        "addrs": [{"addr": match_condition.get("source_address"), "type": "V4"}]
                    }
                    match['client_ip'] = client_ip
                    total_match_count += 1
                elif match_condition.get("group_path"):
                    group_path = match_condition['group_path']
                    group_name,ip_addr_list = self.nsxt_util.get_nsx_group_details(group_path)
                    if not ip_addr_list:
                        LOG.debug('Skipping ns group %s as it does not contain ip addresss' % group_name)
                    else:
                        ip_group_name = self.nsxt_util.create_ip_group\
                            (ip_addr_list, group_name, self.alb_config, prefix,self.tenant)
                        client_ip={
                            "match_criteria": "IS_IN",
                            "group_refs":list()
                        }
                        client_ip['group_refs'].append(conv_utils.get_object_ref(ip_group_name, "ipaddrgroup", self.tenant))
                        match['client_ip'] = client_ip
                        total_match_count += 1

        if not match['hdrs']:
            match.pop('hdrs')
        if not match['rsp_hdrs']:
            match.pop('rsp_hdrs')
        return match, total_match_count

    def convert_actions_to_avi_actions(self, rule_dict, actions, prefix, cloud_name):
        rule_dict['hdr_action'] = []
        total_action_count = 0
        for action in actions:
            if action["type"] == "LBVariablePersistenceLearnAction" or \
                    action['type'] == 'LBVariablePersistenceOnAction':
                # skip rule
                continue

            if action["type"] == "LBHttpRequestUriRewriteAction":
                rule_dict['rewrite_url_action'] = {}
                path = {"type": "URI_PARAM_TYPE_TOKENIZED",
                        "tokens": [{'type': 'URI_TOKEN_TYPE_STRING', 'str_value': action["uri"]}]}
                rule_dict['rewrite_url_action']['path'] = path
                if action.get("uri_arguments", None):
                    query = {'keep_query': True, 'add_string': action.get("uri_arguments", None)}
                    rule_dict['rewrite_url_action']['query'] = query
                total_action_count += 1
            if action['type'] == "LBHttpRequestHeaderRewriteAction":
                hdr_action = {'action': 'HTTP_REPLACE_HDR', 'hdr':
                    {'name': action.get("header_name"), 'value': {'val': action.get("header_value")}}}
                rule_dict['hdr_action'].append(hdr_action)
                total_action_count += 1
            if action['type'] == "LBHttpRequestHeaderDeleteAction":
                hdr_action = {'action': 'HTTP_REMOVE_HDR', 'hdr': {'name': action.get("header_name")}}
                rule_dict['hdr_action'].append(hdr_action)
                total_action_count += 1
            if action["type"] == "LBHttpResponseHeaderRewriteAction":
                hdr_action = {'action': 'HTTP_REPLACE_HDR', 'hdr':
                    {'name': action.get("header_name"), 'value': {'val': action.get("header_value")}}}
                rule_dict['hdr_action'].append(hdr_action)
                total_action_count += 1
            if action["type"] == "LBHttpResponseHeaderDeleteAction":
                hdr_action = {'action': 'HTTP_REMOVE_HDR', 'hdr':
                    {'name': action.get("header_name")}}
                rule_dict['hdr_action'].append(hdr_action)
                total_action_count += 1
            if action["type"] == "LBSelectPoolAction":
                pool_ref = action.get('pool_id')
                is_pool_group = False
                if pool_ref:
                    pool_ref, is_pool_group = self.pool_and_poolgroup_sharing(pool_ref, cloud_name, prefix)
                if is_pool_group:
                    rule_dict['switching_action'] = {'action': 'HTTP_SWITCHING_SELECT_POOLGROUP',
                                                     "pool_group_ref": conv_utils.get_object_ref(
                                                         pool_ref, 'poolgroup', tenant=self.tenant,
                                                         cloud_name=cloud_name)}
                    total_action_count += 1
                elif pool_ref:
                    rule_dict['switching_action'] = {'action': 'HTTP_SWITCHING_SELECT_POOL',
                                                     "pool_ref": conv_utils.get_object_ref(
                                                         pool_ref, 'pool', tenant=self.tenant,
                                                         cloud_name=cloud_name)}
                    total_action_count += 1
                else:
                    LOG.debug("No pool/poolgroup '%s' found",
                              pool_ref)
                    continue
            if action["type"] == "LBConnectionDropAction":
                rule_dict['action'] = {'action': 'HTTP_SECURITY_ACTION_CLOSE_CONN'}
                total_action_count += 1
            if action["type"] == "LBHttpRedirectAction" and action.get("redirect_url").__contains__("http"):
                redirect_url = action.get("redirect_url")
                host_protocol = redirect_url.split("://")
                if not len(host_protocol) > 1:
                    LOG.debug("No proper redirect url '%s' found",
                              redirect_url)
                    continue
                protocol = host_protocol[0].upper()
                host_path = host_protocol[1].split("/")

                port = 80 if protocol == "HTTP" else 443

                redirect_action = {
                    "protocol": protocol,
                    "port": port,
                    "status_code": "HTTP_REDIRECT_STATUS_CODE_{}".format(action.get("redirect_status")),
                    "host": {
                        "type": "URI_PARAM_TYPE_TOKENIZED",
                        "tokens": [
                            {
                                "type": "URI_TOKEN_TYPE_STRING",
                                "str_value": host_path[0]
                            }
                        ]
                    },
                }
                if len(host_path) > 1:
                    redirect_action["path"] = {
                        "type": "URI_PARAM_TYPE_TOKENIZED",
                        "tokens": [
                            {
                                "type": "URI_TOKEN_TYPE_STRING",
                                "str_value": host_path[1]
                            }
                        ]
                    }

                rule_dict['redirect_action'] = redirect_action
                total_action_count += 1
            if action['type'] == "LBHttpRejectAction":
                #  security_policy_counter = security_policy_counter + 1
                # rule_dict = dict(name="Rule {}".format(security_policy_counter),
                #                  index=security_policy_counter,
                #                  enable=True)
                rule_dict['action'] = {'action': 'HTTP_SECURITY_ACTION_SEND_RESPONSE',
                                       'status_code': "HTTP_LOCAL_RESPONSE_STATUS_CODE_%s" % action.get("reply_status"),
                                       }
                total_action_count += 1
                # match_conditions = policy.get("match_conditions")
            #  match = {}
            #  for match_condition in match_conditions:
            #      match = self.convert_match_conditions_to_match(match, match_condition)
            #  if match: rule_dict["match"] = match
            #  httppolicyset['http_security_policy']['rules'].append(rule_dict)

        if not rule_dict['hdr_action']:
            rule_dict.pop('hdr_action')
        return rule_dict, total_action_count

    def pool_and_poolgroup_sharing(self, pool_ref, cloud_name, prefix):
        pl_id = pool_ref.split('/')[-1]
        pl_config = list(filter(lambda pr: pr["id"] == pl_id, self.nsx_lb_config["LbPools"]))
        pool_name = pl_config[0]["display_name"]
        ##
        persist_ds = None
        if self.lb_vs_config.get('lb_persistence_profile_path'):
            persist_ref = self.lb_vs_config['lb_persistence_profile_path'].split('/')[-1]
            persist_ds = persistence_ds_list.get(persist_ref, None)

        pool_present = False
        if self.lb_vs_config["id"] in vs_select_pool_action_list.keys():
            pool_segment = vs_pool_segment_list[self.lb_vs_config["id"]].get("pool_segment")
            is_pg_created = False
            if pool_ref:
                p_tenant, pool_ref = conv_utils.get_tenant_ref(pool_ref)
                if self.tenant:
                    p_tenant = self.tenant
                pool_ref = pool_name
                persist_ref = self.lb_vs_config.get("lb_persistence_profile_path", None)
                if persist_ref:
                    persist_ref = self.lb_vs_config['lb_persistence_profile_path'].split('/')[-1]
                    persist_ref = persistence_profile_list.get(persist_ref, None)
                avi_persistence = self.alb_config['ApplicationPersistenceProfile']
                persist_type = None
                if persist_ref:
                    # Called tenant ref to get object name
                    persist_ref = conv_utils.get_tenant_ref(persist_ref)[1]
                    if prefix:
                        persist_ref = '{}-{}'.format(prefix, persist_ref)
                    persist_profile_objs = (
                            [ob for ob in avi_persistence if ob['name'] ==
                             self.merge_object_mapping['app_per_profile'].get(
                                 persist_ref)] or
                            [obj for obj in avi_persistence if
                             (obj["name"] == persist_ref or persist_ref in obj.get(
                                 "dup_of", []))])
                    persist_type = (persist_profile_objs[0]['persistence_type'] if
                                    persist_profile_objs else None)
                # cookie persistence or app profile type is different and poolgroup
                # cloned
                vs_name = self.alb_vs_config['name']
                pool_ref, is_pool_group = conv_utils.clone_pool_if_shared(
                    pool_ref, self.alb_config, vs_name, self.tenant, p_tenant, persist_type,
                    self.controller_version, self.alb_vs_config['application_profile_ref'], self.is_pool_group_used,
                    self.http_pool_group_list, self.http_pool_list,
                    cloud_name=cloud_name, prefix=prefix)
                if is_pool_group:
                    is_pg_created = is_pool_group
                    self.is_pool_group_used[pool_ref] = vs_name
                    self.http_pool_group_list[pool_ref] = {
                        'vs_name': vs_name,
                        'cloud_name': cloud_name,
                        'tenant': self.tenant
                    }
                elif pool_ref:
                    pool_present = True
                    self.http_pool_list[pool_ref] = {
                        'vs_name': vs_name,
                        'cloud_name': cloud_name,
                        'tenant': self.tenant
                    }
                if self.cloud_type == 'Vlan':
                    if is_pool_group:
                        conv_utils.add_placement_network_to_pool_group(pool_ref, pool_segment,
                                                                       self.alb_config, cloud_name, self.tenant)

                    elif pool_ref:
                        conv_utils.add_placement_network_to_pool(self.alb_config['Pool'],
                                                                 pool_ref, pool_segment, cloud_name, self.tenant)

                if persist_ref:
                    if is_pool_group:
                        conv_utils.add_poolgroup_with_persistence(self.alb_config, self.nsx_lb_config,
                                                                  self.lb_vs_config,
                                                                  pool_ref, prefix, cloud_name, self.tenant,
                                                                  self.object_merge_check,
                                                                  self.merge_object_mapping)
                    elif pool_ref:
                        conv_utils.add_pool_with_persistence(self.alb_config, self.nsx_lb_config, self.lb_vs_config,
                                                             pool_ref, prefix, cloud_name, self.tenant,
                                                             self.object_merge_check, self.merge_object_mapping)
                if is_pool_group:
                    conv_utils.add_teir_to_poolgroup(pool_ref, self.alb_config, self.tier1_lr)
                    conv_utils.update_poolgroup_with_cloud(pool_ref, self.alb_config, cloud_name, self.tenant,
                                                           self.cloud_tenant)

                elif pool_present:
                    conv_utils.add_tier_to_pool(pool_ref, self.alb_config, self.tier1_lr)
                    conv_utils.update_pool_with_cloud(pool_ref, self.alb_config, cloud_name, self.tenant,
                                                      self.cloud_tenant)

                return pool_ref, is_pool_group

        return None, False

    def get_ds_action_list(self, rule_dict, ds):
        list_actions = []
        actions = rule_dict

        if actions.get('switching_action'):
            if 'pool_ref' in actions['switching_action'].keys():
                pool_ref = actions['switching_action'].get('pool_ref')
                ds['pool_refs'].append(pool_ref)
                pool_ref=pool_ref.split('name=')[1].split('&')[0]
                action_script = "avi.pool.select(\"%s\") " % pool_ref
            elif 'pool_group_ref' in actions['switching_action'].keys():
                pg_ref = actions['switching_action'].get('pool_group_ref')
                ds['pool_group_refs'].append(pg_ref)
                pg_ref = pg_ref.split('name=')[1].split('&')[0]
                action_script = "avi.poolgroup.select(\"%s\")" % pg_ref
            list_actions.append(action_script)
        if actions.get('action'):
            if actions['action'].get('action') == 'HTTP_SECURITY_ACTION_CLOSE_CONN':
                action_script = "avi.http.close_conn() "
                list_actions.append(action_script)
            if actions['action'].get('action') == 'HTTP_SECURITY_ACTION_SEND_RESPONSE':
                action_script = "avi.http.response(%s)" % (actions["action"].get('status_code').split('_')[-1],
                                                           )
                list_actions.append(action_script)
        if actions.get('redirect_action'):
            redirect_action = actions['redirect_action']
            protocol = redirect_action.get('protocol')
            if redirect_action.get('host'):
                host = redirect_action['host']['tokens'][0].get('str_value')
                if redirect_action.get('path'):
                    path = redirect_action['path']['tokens'][0].get('str_value')
                    action_script = "avi.http.redirect(\"%s%s%s\") " % (protocol, host, path)
                    list_actions.append(action_script)
                else:
                    action_script = "avi.http.redirect(\"%s%s\") " % (protocol, host)
                    list_actions.append(action_script)
        if actions.get('hdr_action'):
            hdr_action_list = actions['hdr_action']
            for hdr_action in hdr_action_list:
                hdr = hdr_action.get('hdr')
                if hdr_action.get('action') == 'HTTP_REPLACE_HDR':
                    action_script = "avi.http.replace_header(\"%s\",\"%s\") " % (
                        hdr.get('name'), hdr['value'].get('val'))
                    list_actions.append(action_script)
                if hdr_action.get('action') == 'HTTP_REMOVE_HDR':
                    action_script = "avi.http.remove_header(\"%s\") " % (hdr.get('name'))
                    list_actions.append(action_script)
        return list_actions

    def get_ds_match_criteria(self, match_type):

        match_criteria = match_type
        if match_type == "EQUALS":
            match_criteria = "string.equals"
        elif match_type == "STARTS_WITH":
            match_criteria = "string.beginswith"
        elif match_type == "ENDS_WITH":
            match_criteria = "string.endswith"
        elif match_type == "CONTAINS" or match_type == "REGEX":
            match_criteria = "string.contains"
        return match_criteria

    def convert_match_conditions_to_match_ds(self, match, match_conditions, rule_dict, actions,
                                             prefix, cloud_name, match_strategy,phase):
        script_list=[]
        total_matches = 0
        initializing_data={}
        is_sec_ds = False
        is_http_ds = False
        is_rsp_ds = False



        rule_dict, total_action_count = self.convert_actions_to_avi_actions(rule_dict, actions, prefix,
                                                                            cloud_name)
        if not total_action_count:
            return None, total_action_count
        if phase == "HTTP_REQUEST_REWRITE" or phase == "TRANSPORT":
            temp_policy_ds_obj=self.http_policy_ds_obj
            temp_ds_script=self.http_ds_scripts
            is_http_ds=True
        if phase == "HTTP_RESPONSE_REWRITE":
            temp_policy_ds_obj=self.rsp_policy_ds_obj
            temp_ds_script=self.resp_ds_scripts
            is_rsp_ds = True
        if phase == "HTTP_ACCESS":
            temp_policy_ds_obj=self.sec_policy_ds_obj
            temp_ds_script=self.sec_ds_script
            is_sec_ds = True
        elif phase == "HTTP_FORWARDING":
            if len(actions) == 1 and actions[0]['type'] == "LBConnectionDropAction":
                temp_policy_ds_obj = self.sec_policy_ds_obj
                temp_ds_script = self.sec_ds_script
                is_sec_ds = True
            else:
                temp_policy_ds_obj = self.http_policy_ds_obj
                temp_ds_script = self.http_ds_scripts
                is_http_ds = True

        list_of_action = self.get_ds_action_list(rule_dict, temp_policy_ds_obj)
       # list_of_action = self.get_ds_action_list(rule_dict, self.policy_datascript_obj)
        for match_condition in match_conditions:
            if match_condition.get('type') == 'LBSslSniCondition':

                sni = match_condition.get('sni')
                case_sensitive = match_condition.get('case_sensitive')
                negate = match_condition.get('inverse')
                match_type = match_condition.get('match_type')
                match_criteria = match_condition.get('match_type')
                if match_type:
                    match_criteria = self.get_ds_match_criteria(match_type)
                if negate:
                    if not case_sensitive:
                        script = " ~(%s(avi.ssl.server_name(),\"%s\"))  " % (match_criteria, sni)
                    else:
                        script = " ~(%s(string.lower(avi.ssl.server_name()),\"%s\"))  " % (
                            match_criteria, str.lower(sni))
                else:
                    if not case_sensitive:
                        script = " %s(avi.ssl.server_name(),\"%s\")  " % (match_criteria, sni)
                    else:
                        script = " %s(string.lower(avi.ssl.server_name()),\"%s\")  " % (
                            match_criteria, str.lower(sni))
                script_list.append(script)

            if match_condition.get('type') == 'LBHttpSslCondition':

                if 'client_certificate_issuer_dn' in match_condition.keys():
                    client_cert_issuer = match_condition['client_certificate_issuer_dn']
                    issuer_dn = client_cert_issuer.get("issuer_dn")
                    negate = match_condition.get('inverse')
                    case_sensitive = client_cert_issuer.get('case_sensitive')
                    match_type = client_cert_issuer.get('match_type')
                    match_criteria = client_cert_issuer.get('match_type')
                    if match_type:
                        match_criteria = self.get_ds_match_criteria(match_type)
                    if negate:
                        if not case_sensitive:
                            script = " ~(%s(avi.ssl.client_cert(avi.CLIENT_CERT_ISSUER),\"%s\"))  " % (
                                match_criteria, issuer_dn)
                        else:
                            script = " ~(%s(string.lower(avi.ssl.client_cert(avi.CLIENT_CERT_ISSUER)),\"%s\"))  " % (
                                match_criteria, str.lower(issuer_dn))
                    else:
                        if not case_sensitive:
                            script = " %s(avi.ssl.client_cert(avi.CLIENT_CERT_ISSUER),\"%s\")  " % (
                                match_criteria, issuer_dn)
                        else:
                            script = " %s(string.lower(avi.ssl.client_cert(avi.CLIENT_CERT_ISSUER)),\"%s\")  " % (
                                match_criteria, str.lower(issuer_dn))
                    script_list.append(script)

                if "client_certificate_subject_dn" in match_condition.keys():
                    client_cert_subject = match_condition['client_certificate_subject_dn']
                    subject_dn = client_cert_subject.get('subject_dn')
                    negate = match_condition.get('inverse')
                    case_sensitive = client_cert_subject.get('case_sensitive')
                    match_type = client_cert_subject.get('match_type')
                    match_criteria = client_cert_subject.get('match_type')
                    if match_type:
                        match_criteria = self.get_ds_match_criteria(match_type)
                    if negate:
                        if not case_sensitive:
                            script = " ~(%s(avi.ssl.client_cert(avi.CLIENT_CERT_SUBJECT),\"%s\"))  " % (
                                match_criteria, subject_dn)
                        else:
                            script = " ~(%s(string.lower(avi.ssl.client_cert(avi.CLIENT_CERT_SUBJECT)),\"%s\")) " % (
                                match_criteria, str.lower(subject_dn))
                    else:
                        if not case_sensitive:
                            script = " %s(avi.ssl.client_cert(avi.CLIENT_CERT_SUBJECT),\"%s\")  " % (
                                match_criteria, subject_dn)
                        else:
                            script = " %s(string.lower(avi.ssl.client_cert(avi.CLIENT_CERT_SUBJECT)),\"%s\") " % (
                                match_criteria, str.lower(subject_dn))
                    script_list.append(script)

                if "client_supported_ssl_ciphers" in match_condition.keys():
                    client_supported_ssl_ciphers = match_condition.get('client_supported_ssl_ciphers')
                    negate = match_condition.get('inverse')
                    initializing_data['client_supp_ssl_ciphers'] = client_supported_ssl_ciphers
                    if negate:
                        script = " ~(avi.ssl.cipher() in client_supp_ssl_ciphers)  "
                    else:
                        script = " (avi.ssl.cipher() in client_supp_ssl_ciphers) "
                    script_list.append(script)

                if "used_protocol" in match_condition.keys():
                    used_protocol = match_condition['used_protocol']
                    negate = match_condition.get('inverse')
                    if negate:
                        script = " (avi.ssl.protocol() ~= \"%s\")  " % used_protocol
                    else:
                        script = " (avi.ssl.protocol() == \"%s\")  " % used_protocol
                    script_list.append(script)

                if not match_condition.get('session_reused') and not match_condition.get('client_supported_ssl_ciphers')\
                    and not match_condition.get('client_certificate_subject_dn') and not\
                    match_condition.get('client_certificate_issuer_dn'):
                    if match_condition.get('session_reused'):
                        if match_condition['session_reused'] in ['NEW','IGNORE']:
                            script = " (avi.ssl.protocol()) "
                        if match_condition['session_reused'] in ['REUSED']:
                            if actions[0] == "LBConnectionDropAction":
                                if self.alb_vs_config.get('ssl_profile_ref'):
                                    self.unable_session_reuse_in_ssl_profile()

            if match_condition.get("type") == "LBHttpResponseHeaderCondition":
                header_name = match_condition.get("header_name")
                header_value = match_condition.get("header_value")
                negate = match_condition.get('inverse')
                case_sensitive = match_condition.get('case_sensitive')
                match_criteria = match_condition.get('match_type')
                if match_criteria:
                    match_criteria = self.get_ds_match_criteria(match_criteria)
                if negate:
                    if not case_sensitive:
                        script = " ~(%s(avi.http.get_header(\"%s\"),\"%s\"))  " % \
                                 (match_criteria, header_name, header_value)
                    else:
                        script = " ~(%s(string.lower(avi.http.get_header(\"%s\")), \"%s\"))  " % (
                            match_criteria, header_name, str.lower(header_value))
                else:
                    if not case_sensitive:
                        script = " %s(avi.http.get_header(\"%s\"),\"%s\")  " % \
                                 (match_criteria, header_name, header_value)
                    else:
                        script = " %s(string.lower(avi.http.get_header(\"%s\")), \"%s\")  " % (
                            match_criteria, header_name, str.lower(header_value))
                script_list.append(script)

            if match_condition.get("type") == "LBHttpRequestUriCondition":

                match_str = match_condition.get("uri")
                negate = match_condition.get('inverse')
                case_sensitive = match_condition.get('case_sensitive')
                match_type = match_condition.get('match_type')
                match_criteria = match_condition.get('match_type')
                if match_type:
                    match_criteria = self.get_ds_match_criteria(match_type)
                if negate:
                    if not case_sensitive:
                        script = " ~(%s(avi.http.get_path(),\"%s\"))  " % (match_criteria, match_str)
                    else:
                        script = " ~(%s(string.lower(avi.http.get_path()),\"%s\"))  " % (
                            match_criteria, str.lower(match_str))
                else:
                    if not case_sensitive:
                        script = "  %s(avi.http.get_path(),\"%s\")  " % (match_criteria, match_str)
                    else:
                        script = "  %s(string.lower(avi.http.get_path()),\"%s\")  " % (
                            match_criteria, str.lower(match_str))
                script_list.append(script)

            if match_condition.get("type") == "LBHttpRequestHeaderCondition":
                header_name = match_condition.get("header_name")
                header_value = match_condition.get("header_value")
                negate = match_condition.get('inverse')
                case_sensitive = match_condition.get('case_sensitive')
                match_criteria = match_condition.get('match_type')
                if match_criteria:
                    match_criteria = self.get_ds_match_criteria(match_criteria)
                if negate:
                    if not case_sensitive:
                        script = " ~(%s(avi.http.get_header(\"%s\"),\"%s\"))  " % \
                                 (match_criteria, header_name, header_value)
                    else:
                        script = " ~(%s(string.lower(avi.http.get_header(\"%s\")), \"%s\"))  " % (
                            match_criteria, header_name, str.lower(header_value))
                else:
                    if not case_sensitive:
                        script = "  %s(avi.http.get_header(\"%s\"),\"%s\")  " % \
                                 (match_criteria, header_name, header_value)
                    else:
                        script = " %s(string.lower(avi.http.get_header(\"%s\")), \"%s\")  " % (
                            match_criteria, header_name, str.lower(header_value))
                script_list.append(script)

            if match_condition.get("type") == "LBHttpRequestMethodCondition":
                method = match_condition.get("method")
                negate = match_condition.get("inverse")

                if negate:
                    script = " ~(string.contains(avi.http.method(), \"%s\")) " % method
                else:
                    script = " string.contains(avi.http.method(), \"%s\") " % method
                script_list.append(script)

            if match_condition.get("type") == "LBHttpRequestUriArgumentsCondition":
                query = match_condition.get("uri_arguments")
                match_criteria = "string.contains"
                script = " %s(avi.http.get_path(\"%s\"))  " % (match_criteria, query)
                script_list.append(script)

            if match_condition.get("type") == "LBHttpRequestVersionCondition":
                version = dict(
                    versions=["ONE_ONE" if match_condition.get("version") == "HTTP_VERSION_1_1" else "ONE_ZERO"],
                    match_criteria="IS_IN")
                match["version"] = version

            if match_condition.get("type") == "LBHttpRequestCookieCondition":
                cookie_name = match_condition.get("cookie_name")
                cookie_value = match_condition.get('cookie_value')
                negate = match_condition.get("inverse")
                match_criteria = match_condition.get('match_type')
                if match_criteria:
                    match_criteria = self.get_ds_match_criteria(match_criteria)
                if negate:
                    script = "  ~(%s(avi.http.get_cookie(\"%s\"),\"%s\"))  " % \
                             (match_criteria, cookie_name, cookie_value)
                else:
                    script = "  %s(avi.http.get_cookie(\"%s\"),\"%s\")  " % \
                             (match_criteria, cookie_name, cookie_value)

                script_list.append(script)

            if match_condition.get("type") == "LBIpHeaderCondition":

                negate = match_condition.get("inverse")
                if match_condition.get("source_address"):
                    if negate:
                        script = " avi.vs.client_ip() ~= \"%s\" " % match_condition['source_address']
                    else:
                        script = " avi.vs.client_ip() == \"%s\" " % match_condition['source_address']
                    script_list.append(script)
                elif match_condition.get("group_path"):
                    # TODO Need to discuss
                    group_path = match_condition['group_path']
                    group_name, ip_addr_list = self.nsxt_util.get_nsx_group_details(group_path)
                    if ip_addr_list:
                        ip_group_name = self.nsxt_util.create_ip_group \
                            (ip_addr_list, group_name, self.alb_config, prefix, self.tenant)
                        if negate:
                            script = " avi.vs.client_ip() ~= \"%s\" " % match_condition['source_address']
                        else:
                            script = " avi.vs.client_ip() == \"%s\" " % match_condition['source_address']
                        script_list.append(script)

        if match_strategy == 'ALL':
            script_connector = 'or'
        else:
            script_connector = 'and'
        script = ""
        if not script_list:
            return match, total_action_count

        if len(temp_ds_script)>1 :
            script = "elseif %s " % (script_list[0])
        else:
            script = "if %s" % (script_list[0])
        if len(script_list) > 1:
            for index in range(1, len(script_list)):
                script = "%s %s %s" % (script, script_connector, script_list[index])
        script = "%s then " % script
        if initializing_data:
            for key in initializing_data.keys():
                script = " %s %s=%s " % (script, key, initializing_data[key])
        for action in list_of_action:
            script = "%s %s" % (script, action)
        script = "%s " % script
        if len(temp_ds_script) > 0:
            temp_ds_script = "%s\n%s" % (temp_ds_script, script)
        else:
            temp_ds_script = script

        if is_sec_ds:
            self.sec_ds_script = temp_ds_script
        elif is_rsp_ds:
            self.resp_ds_scripts = temp_ds_script
        elif is_http_ds:
            self.http_ds_scripts = temp_ds_script

        return match, total_action_count

    def unable_session_reuse_in_ssl_profile(self):
        client_ssl_ref = self.alb_vs_config.get('ssl_profile_ref')
        client_ssl_name = client_ssl_ref.split('name=')[1]
        ssl_config = [config for config in self.alb_config["SSLProfile"] if config['name'] == client_ssl_name ]
        ssl_config[0]['enable_ssl_session_reuse'] = False
