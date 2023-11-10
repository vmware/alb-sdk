import pyparsing as pp
import json
import yaml
import os

root_dir = os.path.dirname(os.path.abspath(__file__))
irule_name = "name"


def fill_template(template_path, values):
    with open(template_path, "r") as f:
        content = f.read()
        for key, value in values.items():
            content = content.replace(f"{{{{ {key} }}}}", str(value))
    return content


def parse_filled_yaml(filled_yaml_str):
    return yaml.safe_load(filled_yaml_str)


# Load the YAML template and replace placeholders
# Parse the filled YAML string


def process_rule(toks):
    return toks.when[0]


def process_when(toks):
    print(toks.statements)
    statement = toks.statements[0]
    data = {"name": irule_name}
    if isinstance(statement, dict) and "index" in statement:
        filled_yaml_str = fill_template(root_dir + "/templates/redirect.yml", data)
        data = parse_filled_yaml(filled_yaml_str)
        data[0]["avi_config"]["http_request_policy"] = {}
        data[0]["avi_config"]["http_request_policy"]["rules"] = statement
        return data
    return statement


def process_respond_statement(toks):
    print(toks.respond_code)
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
    if toks.name:
        global irule_name
        irule_name = toks.name.split("/")[-1]


def process_switch_case(toks):
    if toks.match_str and toks.switch_action:
        if "redirect" not in toks.switch_action[0][0][0]:
            data = {
                "pool_name": toks.switch_action[0][0][1],
                "match_str": toks.match_str[0][1],
                "rule_name": irule_name,
            }
            filled_yaml_str = fill_template(
                root_dir + "/templates/switch_rule.yml", data
            )
            data = parse_filled_yaml(filled_yaml_str)
            return data
    return toks


def process_switch(toks):
    with open(root_dir + "/templates/switch.yml", "r") as f:
        content = f.read()
        data = yaml.safe_load(content)
        data[0]["avi_config"]["http_request_policy"] = {}
        http_request_policy = data[0]["avi_config"]["http_request_policy"]
        http_request_policy["rules"] = []
        for idx, switch_case in enumerate(toks.switch_cases, 1):
            switch_case["index"] = idx
            http_request_policy["rules"].append(switch_case)
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

StringPart = (
    (~UnaryOperator + pp.Word(pp.alphanums + "_/.-:*")) | Variable | FunctionCall
)
String = pp.Group(pp.Literal('"') + pp.ZeroOrMore(StringPart) + pp.Literal('"'))
Value << (StringPart | String)
RuleName = pp.Combine(pp.Char("/") + pp.Word(pp.alphanums + "_-./")).set_parse_action(
    process_name
)
Number = pp.Word(pp.nums)


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
Comment = pp.Group(pp.Literal("#") + pp.restOfLine)

ComplexString = String | pp.Combine(String + Variable + String)
Expression = pp.Or([ComplexString, String, Variable, FunctionCall, LogicOperator])


Statement = pp.Forward()

# Switch case statement
SwitchCase = (
    (String | Keyword)("match_str")
    + (pp.Suppress("-") | pp.nestedExpr("{", "}", content=pp.OneOrMore(Statement)))(
        "switch_action"
    )
).set_parse_action(process_switch_case)
Switch = (
    pp.Literal("switch")
    + pp.Optional(pp.Literal("-glob"))
    + FunctionCall
    + pp.Literal("{")
    + pp.OneOrMore(SwitchCase)("switch_cases")
    + pp.Literal("}")
).set_parse_action(process_switch)

IfBlockContent = pp.Forward()
IfBlock = pp.Group(
    pp.Literal("if")
    + OpenBrace
    + Condition
    + CloseBrace
    + pp.Literal("{")
    + pp.OneOrMore(IfBlockContent | Statement)
    + pp.Literal("}")
)
IfBlockContent << (IfBlock | Statement)

# Statements inside a when block
SetStatement = pp.Group(pp.Literal("set") + Keyword + FunctionCall)
Statement << (
    (
        pp.Literal("HTTP::respond") + Number("respond_code") + Keyword + Expression
    ).set_parse_action(process_respond_statement)
    | pp.Group(pp.Literal("HTTP::redirect") + String)
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
    | pp.Group(Variable + Number + Keyword + Expression)
)

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
    + RuleName("name")
    + pp.Literal("{")
    + pp.ZeroOrMore(Comment)
    + pp.OneOrMore(WhenBlock)("when")
    + pp.Literal("}")
).set_parse_action(process_rule)


# Parsing the input
def parse_input(input_string):
    parsed_result = Rule.parseString(input_string)
    return parsed_result


if __name__ == "__main__":
    file_path = root_dir + "/irules/bigip.conf"
    with open(file_path, "r") as file:
        f5_conf_details = file.read()

    result = parse_input(f5_conf_details)
    print("result", result)
    yaml.dump(result[0], open(root_dir + "/output.yml", "w"))
