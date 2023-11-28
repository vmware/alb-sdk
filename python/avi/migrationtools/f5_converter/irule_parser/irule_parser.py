import pyparsing as pp
import json
import yaml
import os

root_dir = os.path.dirname(os.path.abspath(__file__))

irule_name = 'irule_name'

def fill_template(template_path, values):
    with open(template_path, "r") as f:
        content = f.read()
        for key, value in values.items():
            content = content.replace(f"{{{{ {key} }}}}", str(value))
    return content


def parse_filled_yaml(filled_yaml_str):
    return yaml.safe_load(filled_yaml_str)


def process_rule(toks):
    return {'avi_config': {'http_request_policy': toks.when[0], 'name': toks.rule_name}, 'rule_name': toks.rule_name, 'type': 'HTTPPolicySet'}


def process_when(toks):
    statement = toks.statements[0]
    return statement


def process_respond_statement(toks):
    if toks.respond_code == "301":
        data = {"name": irule_name, "status_code": "HTTP_REDIRECT_STATUS_CODE_301"}
        filled_yaml_str = fill_template(root_dir + "/templates/redirect_rule.yml", data)
        data = parse_filled_yaml(filled_yaml_str)
        return data
    elif toks.respond_code == "302":
        data = {"name": irule_name, "status_code": "HTTP_REDIRECT_STATUS_CODE_302"}
        filled_yaml_str = fill_template(root_dir + "/templates/redirect_rule.yml", data)
        data = parse_filled_yaml(filled_yaml_str)
        return data
    return toks

def process_name(toks):
    global irule_name
    irule_name = toks[0].split("/")[-1]
    return irule_name


def process_switch_case(toks):
    if toks.match_str and toks.switch_action:
        if "redirect" not in toks.switch_action[0][0][0]:
            data = {
                "pool_name": toks.switch_action[0][0][1],
                "match_str": toks.match_str[0],
                "rule_name": irule_name,
            }
            filled_yaml_str = fill_template(
                root_dir + "/templates/switch_rule.yml", data
            )
            data = parse_filled_yaml(filled_yaml_str)
            return data
    return toks


def process_switch(toks):
    http_request_policy = {}
    http_request_policy["rules"] = []
    idx = 1
    match_list = []
    while idx <= len(toks.switch_cases):
        switch_case = toks.switch_cases[idx - 1]
        if isinstance(switch_case, str):
            match_list.append(switch_case)
            idx += 1
            continue
        match_list.extend(switch_case['match']['path']['match_str'])
        switch_case["index"] = idx
        http_request_policy["rules"].append(switch_case)
        idx += 1
    return http_request_policy

def process_header_statement(toks):
    http_request_policy = {}
    http_request_policy["rules"] = []
    rules = http_request_policy["rules"]
    rules.append({"header_action": toks['header_op']})
    return http_request_policy

def process_header_op(toks):
    data = {'header_name': toks.header_name[0], 'header_op': toks.op}
    filled_yaml_str = fill_template(root_dir+"/templates/header_op.yml", data)
    data = parse_filled_yaml(filled_yaml_str)
    data['action'] = 'HTTP_REMOVE_HDR' if data['action'] == 'remove' else 'HTTP_REPLACE_HDR'
    if 'header_val' in toks:
        data['hdr']['value'] = {}
        data['hdr']['value']['val'] = toks['header_val'][0]
    return data


# Basic Definitions
Keyword = pp.Word(pp.alphanums + "_")
Variable = pp.Combine(pp.Literal("$") + pp.Word(pp.alphanums + "_"))
FunctionNamespace = Keyword + pp.Literal("::")
FunctionContent = pp.Forward()
Scenario = pp.Literal("HTTP_REQUEST") | pp.Literal("CLIENT_ACCEPTED")


FunctionCallForward = pp.Forward()
FunctionCall = pp.nestedExpr("[", "]", content=FunctionContent)

Value = pp.Forward()

# Now, to handle the recursive nature, update the FunctionContent
FunctionContent << (
    FunctionNamespace + Keyword + Keyword
    | (FunctionNamespace + Keyword)
    | Keyword + Keyword + Value
    | Keyword + Value + Keyword
)

UnaryOperator = pp.Literal("not")
BinaryOperator = (
    pp.Literal("equals")
    | pp.Literal("starts_with")
    | pp.Literal("eq")
    | pp.Literal("contains")
)
LogicOperator = (
    pp.Literal("and") | pp.Literal("or") | pp.Literal("||") | pp.Literal("&&")
)

OpenParen = pp.Literal("(").suppress()
CloseParen = pp.Literal(")").suppress()
OpenBrace = pp.Literal("{").suppress()
CloseBrace = pp.Literal("}").suppress()
If_then = pp.Literal("then").suppress()
If_command = pp.Literal("if").suppress()

StringPart = (
    (~UnaryOperator + pp.Word(pp.alphanums + "_/.-:*")) | Variable | FunctionCall
)
String = pp.Literal('"').suppress() + pp.ZeroOrMore(StringPart) + pp.Literal('"').suppress()
Value << (StringPart | String)
RuleName = pp.Combine(pp.Char("/") + pp.Word(pp.alphanums + "_-./")).set_parse_action(process_name)
Number = pp.Word(pp.nums)
IpField = pp.Word(pp.nums, max=3)
IpAddr = pp.Combine(IpField + "." + IpField + "." + IpField + "." + IpField)


base_condition = pp.Group(
    pp.nested_expr(
        "[", "]", content=pp.Literal("class match") + Value + BinaryOperator + Keyword
    )
) | (StringPart + BinaryOperator + Value)

Condition = pp.Forward()

nested_condition = pp.Group(OpenParen + Condition + CloseParen)

unary_condition = pp.Group(UnaryOperator + (nested_condition | base_condition))

binary_condition = pp.Group(
    (nested_condition | unary_condition | base_condition) + LogicOperator + Condition
)

Condition << (base_condition | unary_condition | binary_condition | nested_condition)


Priority = pp.Literal("priority") + Number
Comment = (pp.Literal("#") + pp.restOfLine).suppress()

ComplexString = String | pp.Combine(String + Variable + String)
Expression = pp.Or([ComplexString, String, Variable, FunctionCall, LogicOperator])


Statement = pp.Forward()

# Switch case statement
SwitchCase = (
    (String | Keyword)("match_str")
    + (pp.Suppress("-") | pp.nestedExpr("{", "}", content=pp.OneOrMore(Statement)))("switch_action")
).set_parse_action(process_switch_case)
Switch = (
    pp.Literal("switch")
    + pp.Optional(pp.Literal("-glob"))
    + FunctionCall
    + pp.Literal("{")
    + pp.OneOrMore(SwitchCase)("switch_cases")
    + pp.Literal("}")
).set_parse_action(process_switch)

#IfBlockContent = pp.Forward()
# IfCase = (
#     pp.OneOrMore(OpenBrace | OpenParen)
#     + Condition
#     + pp.OneOrMore(If_then | CloseBrace | CloseParen)
# )('if_action')


IfCase = OpenBrace + Condition + CloseBrace + pp.Optional(If_then)


IfBlock = pp.Group(
    If_command
    + IfCase('if_cases')
    + OpenBrace
    + pp.OneOrMore(Statement)
    + CloseBrace
    )

#IfBlockContent << (IfBlock | Statement)

# String Map Statement
String_map = (
    pp.Group(FunctionContent)('action_function')
    + pp.Literal('[')
    + pp.Literal('string map')
    + pp.nestedExpr("{", "}", content=pp.OneOrMore(Statement))('action_map')
    + FunctionCall('action_source')
    + pp.Literal(']')
    )('string_map')

# Node Switch
Node = (
    pp.Literal('node')
    + IpAddr
    + pp.OneOrMore(':'| Number)
)('action_node')

# Pool Switch
Pool = (
    pp.Literal('pool')
    + Value
)('action_pool')

HeaderOp = (pp.Literal("remove")("op") + (String | StringPart)("header_name")
            | pp.Literal("insert")("op") + String("header_name") + String("header_val")).set_parse_action(process_header_op)

HeaderStatement = (pp.Literal("HTTP::header") + HeaderOp('header_op')).set_parse_action(process_header_statement)

RuleStatement = ((pp.Literal("HTTP::respond") + Number("respond_code") + Keyword + Expression).set_parse_action(process_respond_statement)
                 | (pp.Literal("HTTP::redirect") + String("redirect_url"))
                 | HeaderStatement)

# Statements inside a when block
SetStatement = pp.Group(pp.Literal("set") + Keyword + FunctionCall)

Statement << (RuleStatement
              | IfBlock
              | Switch
              | Comment
              | pp.Literal("drop")
              | pp.Literal("discard")
              | pp.Literal("return")
              | pp.Literal("reject")
              | pp.Literal("persist") + pp.Literal("none")
              | pp.Literal("log") + pp.Optional(StringPart) + String
              | SetStatement
              | pp.Group(pp.Literal("pool") + Value)
              | pp.Group(Variable + Expression)
              | pp.Group(Variable + Number + Keyword + Expression))

# Main when block
WhenBlock = (
    pp.Optional(Priority)
    + pp.Literal("when")
    + Scenario("scenario")
    + pp.Literal("{")
    + pp.OneOrMore(Statement)("statements")
    + pp.Literal("}")
).set_parse_action(process_when)

# Rule definition
Rule = (
    pp.Literal("ltm")
    + pp.Literal("rule")
    + RuleName("rule_name")
    + pp.Literal("{")
    + pp.ZeroOrMore(Comment)
    + pp.OneOrMore(WhenBlock)("when")
    + pp.Literal("}")
).set_parse_action(process_rule)


# Parsing the input
def parse_input(input_string):
    try:
        parsed_result = Rule.parseString(input_string)
        return parsed_result
    except:
        return {}

def parse_irule_for_f5_conv(f5_irule_data):
    irule_custom_config=[]
    for data in f5_irule_data:
        parsed_rule = parse_input(data)
        if "ParseResults" in str(parsed_rule[0]):
            continue
        if parsed_rule and type(parsed_rule[0])==dict:
            irule_custom_config.append(parsed_rule[0])
    return irule_custom_config


if __name__ == "__main__":
    file_path = root_dir + "/irules/bigip.conf"
    with open(file_path, "r") as file:
        f5_conf_details = file.read()

    result = parse_input(f5_conf_details)
    print("result", result)
    yaml.dump(result[0], open(root_dir + "/output.yml", "w"))

    header = "HTTP::header insert \"X-SOURCE\" \"Akamai\""
    res = HeaderStatement.parse_string(header)
    print(res)
    header = "HTTP::header remove Content-Length"
    res = HeaderStatement.parse_string(header)
    print(res)
