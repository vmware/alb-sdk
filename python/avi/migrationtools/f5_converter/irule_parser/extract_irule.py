import pyparsing as pp
import os

root_dir = os.path.dirname(os.path.abspath(__file__))

# Define grammar for LTM rule
rule_start = (
    pp.Literal("ltm")
    + pp.Literal("rule")
    + pp.Word(pp.printables + "/")("name")
    + pp.Literal("{")
)
rule_end = pp.Literal("}")
rule_content = pp.SkipTo(rule_end)("content")
rule_end = pp.OneOrMore('}')


ltm_rule = pp.Group(rule_start + rule_content + rule_end)

# Combine LTM rule and ignore sections into a main grammar
main_grammar = pp.OneOrMore(ltm_rule)

def extract_irule_from_config(bigip_conf):
    # Parse LTM rules from the configuration
    parsed_sections = main_grammar.searchString(bigip_conf)
    irule_config = []
    if not parsed_sections:
        print("No IRule configured ")
        return []
    for section in parsed_sections:
        for rule in section:
            irule_config.append(' '.join(rule))
    return irule_config

