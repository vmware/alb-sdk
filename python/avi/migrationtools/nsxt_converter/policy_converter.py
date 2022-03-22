import copy
import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.avi_migration_utils import update_count
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
import avi.migrationtools.nsxt_converter.converter_constants as final

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


    def convert(self, lb_vs_config, alb_config, cloud_name, prefix, tenant="admin"):
        '''

        '''
        self.lb_vs_config = lb_vs_config
        self.alb_config = alb_config

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

        http_rules = []
        rsp_rules = []
        sec_rules = []

        skipped_rule = []
        status_rule_list = []
        rules = lb_vs_config.get("rules")
        print("\n")
        for index, policy in enumerate(rules):
            actions = policy.get("actions")
            na_action_list = list(filter(lambda x: x["type"] in self.rules_actions_na, actions))

            #If na_action_list is empty then we can mapped this rule otherwise skipped this rule
            if len(na_action_list) > 0:
                skipped_rule.append(policy)
                status_rule_list.append('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name, [action['type'] for action in na_action_list]))
                LOG.info('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name, [action['type'] for action in na_action_list]))
                #print('[VS-RULES: {}] SKIPPING RULE Actions Not supported {}'.format(policy_set_name, [action['type'] for action in na_action_list]))
                continue
            if not len(na_action_list):
                match_conditions = policy.get("match_conditions")
                match_strategy = policy.get("match_strategy")
                phase = policy.get("phase")
                actions = policy.get("actions")
                # if check all type of matches if any one not supported then check match_strategy is ALL
                # then skip other migrate whaterver supported
                if match_strategy == "ALL":
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
                        for match_condition in match_conditions:
                            if match_condition['type'] == "LBHttpSslCondition":
                                # TODO Silent Skip add loggers
                                #GR: If action allow -> add it to the SSL profile; otherwise skip
                                continue
                            match = self.convert_match_conditions_to_match(match, match_condition)
                        rule_dict['match'] = match
                        rule_dict = self.convert_actions_to_avi_actions(rule_dict, actions, prefix, cloud_name)
                        if phase == "HTTP_REQUEST_REWRITE" or phase == "TRANSPORT":
                            http_rules.append(rule_dict)
                        elif phase == "HTTP_RESPONSE_REWRITE":
                            rsp_rules.append(rule_dict)
                        elif phase == "HTTP_ACCESS":
                            sec_rules.append(rule_dict)
                        elif phase == "HTTP_FORWARDING":
                            if len(actions) == 1 and actions[0]['type'] == "LBConnectionDropAction":
                                sec_rules.append(rule_dict)
                            elif rule_dict.__contains__('redirect_action') and rule_dict.__contains__('switching_action'):
                                redirect_action = copy.deepcopy(rule_dict)
                                redirect_action.pop('switching_action')
                                http_rules.append(redirect_action)

                                switching_action = copy.deepcopy(rule_dict)
                                switching_action.pop('redirect_action')
                                http_rules.append(switching_action)
                if match_strategy == "ANY":
                    for match_condition in match_conditions:
                        if match_condition["type"] in self.rule_match_na:
                            LOG.info('[VS-RULES: {}] SKIPPING RULE Match Condition is Not supported {}'.format(
                                policy_set_name,
                                [match_condition['type']]))
                            status_rule_list.append('[VS-RULES: {}] SKIPPING RULE Match Condition is Not supported {}'.format(
                                policy_set_name,
                                [match_condition['type']]))
                            continue
                        rule_dict = dict(name="Rule {}",
                                         index=0,
                                         enable=True)
                        match = {}

                        if match_condition['type'] == "LBHttpSslCondition":
                            # TODO Silent Skip add loggers
                            # GR: If action allow -> add it to the SSL profile; otherwise skip
                            continue
                        match = self.convert_match_conditions_to_match(match, match_condition)
                        rule_dict['match'] = match
                        rule_dict = self.convert_actions_to_avi_actions(rule_dict, actions, prefix, cloud_name)
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


        for skipped in status_rule_list:
            print(skipped)
        if http_rules or sec_rules or rsp_rules:
            if http_rules:
                http_request_policy['rules'] = http_rules
                policy_obj['http_request_policy'] = http_request_policy
            if sec_rules:
                http_security_policy['rules'] = sec_rules
                policy_obj['http_security_policy'] = http_security_policy
            if rsp_rules:
                http_response_policy['rules'] = rsp_rules
                policy_obj['http_response_policy'] = http_response_policy

            conv_status["skipped"] = skipped_rule
            conv_status["na_list"] = []
            conv_status["status"] = "PARTIAL"
            conv_utils.add_conv_status('policy', None, policy_set_name, conv_status,
                                       [{"policy_set": policy_obj}])

            return policy_obj, status_rule_list
        else:
            conv_utils.add_status_row('policy', [], policy_set_name,
                                      conv_const.STATUS_SKIPPED)
            return None, status_rule_list


    def convert_match_conditions_to_match(self, match, match_condition):
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
            match['rsp_hdrs'] = [hdrs]
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
                    match_criteria = "HDR_ENDS_WITH"
                elif match_condition.get("match_type") == "CONTAINS" or match_condition.get("match_type") == "REGEX":
                    match_criteria = "HDR_CONTAINS"
                request_uri['match_criteria'] = match_criteria
            match["path"] = request_uri
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
                elif match_condition.get("match_type") == "CONTAINS" or match_condition.get("match_type") == "REGEX":
                    match_criteria = "HDR_CONTAINS"
                hdrs["match_criteria"] = match_criteria
            if match_condition.get("header_name"):
                hdrs["hdr"] = match_condition.get("header_name")
            match['hdrs'] = [hdrs]
        if match_condition.get("type") == "LBHttpRequestMethodCondition":
            method = dict(methods=["HTTP_METHOD_" + match_condition.get("method")], match_criteria="IS_IN")
            match["method"] = method
        if match_condition.get("type") == "LBHttpRequestUriArgumentsCondition":
            query = dict(match_str=[match_condition.get("uri_arguments")],
                         match_case="SENSITIVE" if match_condition.get("case_sensitive") else "INSENSITIVE",
                         match_criteria="QUERY_MATCH_CONTAINS")
            match["query"] = query
        if match_condition.get("type") == "LBHttpRequestVersionCondition":
            version = dict(versions=["ONE_ONE" if match_condition.get("version") == "HTTP_VERSION_1_1" else "ONE_ZERO"],
                           match_criteria="IS_IN")
            match["version"] = version
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
                elif match_condition.get("match_type") == "CONTAINS" or match_condition.get("match_type") == "REGEX":
                    match_criteria = "HDR_CONTAINS"
                cookie["match_criteria"] = match_criteria
            match["cookie"] = cookie
        if match_condition.get("type") == "LBIpHeaderCondition":
            if match_condition.get("source_address"):
                client_ip = {
                    "match_criteria": "IS_IN",
                    "addrs": [{"addr": match_condition.get("source_address"), "type": "V4"}]
                }
                match['client_ip'] = client_ip
            elif match_condition.get("group_path"):
                # TODO Need to discuss
                type = match_condition.get("type")
        return match

    def convert_actions_to_avi_actions(self, rule_dict, actions, prefix, cloud_name):
        rule_dict['hdr_action'] = []
        for action in actions:
            if action["type"] == "LBVariablePersistenceLearnAction" or action[
                'type'] == 'LBVariablePersistenceOnAction':
                # Gr: Create a new Pool with the persistent profile and same members and context switch
                if self.lb_vs_config.get('pool_path'):
                    pool_ref = self.lb_vs_config.get('pool_path')
                    pool_name = pool_ref.split('/')[-1]
                    if prefix:
                        pool_name = prefix + '-' + pool_name
                    for pool in self.alb_config['Pool']:
                        if pool.get('name') == pool_name:
                            new_pool = copy.deepcopy(pool)
                            new_pool['name'] = '%s-%s' % (pool_name, final.PLACE_HOLDER_STR)
                            if prefix:
                                persistence_name = prefix + '-' + action.get('persistence_profile_path').split('/')[
                                    -1]
                            else:
                                persistence_name = action.get('persistence_profile_path').split('/')[-1]
                            new_pool[
                                'persistence_profile_ref'] = '/api/applicationpersistenceprofile/?tenant=admin&name=' + persistence_name
                            self.alb_config['Pool'].append(new_pool)
                            rule_dict['switching_action'] = {'action': 'HTTP_SWITCHING_SELECT_POOL',
                                                             "pool_ref": conv_utils.get_object_ref(
                                                                 new_pool['name'], 'pool', tenant="admin",
                                                                 cloud_name=cloud_name)}
            if action["type"] == "LBHttpRequestUriRewriteAction":
                rule_dict['rewrite_url_action'] = {}
                path = {"type": "URI_PARAM_TYPE_TOKENIZED",
                        "tokens": [{'type': 'URI_TOKEN_TYPE_STRING', 'str_value': action["uri"]}]}
                rule_dict['rewrite_url_action']['path'] = path
                if action.get("uri_arguments", None):
                    query = {'keep_query': True, 'add_string': action.get("uri_arguments", None)}
                    rule_dict['rewrite_url_action']['query'] = query
            if action['type'] == "LBHttpRequestHeaderRewriteAction":
                hdr_action = {'action': 'HTTP_REPLACE_HDR', 'hdr':
                    {'name': action.get("header_name"), 'value': {'val': action.get("header_value")}}}
                rule_dict['hdr_action'].append(hdr_action)
            if action['type'] == "LBHttpRequestHeaderDeleteAction":
                hdr_action = {'action': 'HTTP_REMOVE_HDR', 'hdr': {'name': action.get("header_name")}}
                rule_dict['hdr_action'].append(hdr_action)
            if action["type"] == "LBHttpResponseHeaderRewriteAction":
                hdr_action = {'action': 'HTTP_REPLACE_HDR', 'hdr':
                    {'name': action.get("header_name"), 'value': {'val': action.get("header_value")}}}
                rule_dict['hdr_action'].append(hdr_action)
            if action["type"] == "LBHttpResponseHeaderDeleteAction":
                hdr_action = {'action': 'HTTP_REMOVE_HDR', 'hdr':
                    {'name': action.get("header_name")}}
                rule_dict['hdr_action'].append(hdr_action)
            if action["type"] == "LBSelectPoolAction":
                pool_ref = action.get('pool_id')
                pool_name = pool_ref.split('/')[-1]
                if prefix:
                    pool_name = prefix + '-' + pool_name
                rule_dict['switching_action'] = {'action': 'HTTP_SWITCHING_SELECT_POOL',
                                                 "pool_ref": conv_utils.get_object_ref(
                                                     pool_name, 'pool', tenant="admin", cloud_name=cloud_name)}
            if action["type"] == "LBConnectionDropAction":
                rule_dict['action'] = {'action': 'HTTP_SECURITY_ACTION_CLOSE_CONN'}
            if action["type"] == "LBHttpRedirectAction" and action.get("redirect_url").__contains__("http"):
                redirect_url = action.get("redirect_url")
                host_protocol = redirect_url.split("://")

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
            if action['type'] == "LBHttpRejectAction":
                # TODO need to discuss
                continue
                security_policy_counter = security_policy_counter + 1
                rule_dict = dict(name="Rule {}".format(security_policy_counter),
                                 index=security_policy_counter,
                                 enable=True)
                rule_dict['action'] = {'action': 'HTTP_SECURITY_ACTION_SEND_RESPONSE',
                                       'status_code': 'HTTP_LOCAL_RESPONSE_STATUS_CODE_{}'.format(
                                           action.get("reply_status"))}
                match_conditions = policy.get("match_conditions")
                match = {}
                for match_condition in match_conditions:
                    match = self.convert_match_conditions_to_match(match, match_condition)
                if match: rule_dict["match"] = match
                httppolicyset['http_security_policy']['rules'].append(rule_dict)

        if not rule_dict['hdr_action']:
            rule_dict.pop('hdr_action')
        return rule_dict

