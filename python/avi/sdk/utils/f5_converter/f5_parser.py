from pyparsing import *
import logging

LOG = logging.getLogger("converter-log")


def generate_grammar_v11():
    # define data types that might be in the values
    unquoted_string = Word(alphanums+"!#$%&'()*+,-./:;<=>?@[\]^_`|~")
    quoted_string = quotedString.setParseAction(removeQuotes)
    ltm = Keyword("ltm")
    apm = Keyword("apm")
    auth = Keyword("auth")
    net = Keyword("net")
    sys = Keyword("sys")
    and_kw = Keyword("and")
    empty_object = Keyword("{ }")

    common = Suppress("/Common/")
    comment = Suppress("#") + Suppress(restOfLine)
    BS, LBRACE, RBRACE = map(Suppress, " {}")
    SOL = LineStart().suppress()
    reserved_words = (ltm | apm | auth | net | sys).suppress()

    ignore = (common | comment)

    entity_type = SOL.suppress()+Optional(reserved_words).\
        suppress() + unquoted_string
    data = (unquoted_string | quoted_string)

    # define structures
    value = Forward()
    value_object = Forward()

    property_name = Word(alphanums+"_-.:/")
    f5_property = dictOf(property_name, Optional(value, default=None))
    properties = Dict(f5_property)
    entity_details = (originalTextFor(ZeroOrMore(unquoted_string)))
    entity = Group(entity_type+Group(entity_details +
                                     LBRACE + (f5_property | BS) + RBRACE))
    entities = OneOrMore(entity)

    value_object << ((LBRACE + properties + RBRACE) | empty_object)
    value << (value_object | originalTextFor(data + OneOrMore(and_kw+data)) |
              data)

    data_set = entities.ignore(ignore)
    return data_set


def generate_grammar_v10():
    # define data types that might be in the values
    unquoted_string = Word(alphanums+"!#$%&'()*+,-./:;<=>?@[\]^_`|~")
    quoted_string = quotedString.setParseAction(removeQuotes)
    ltm = Keyword("ltm")
    apm = Keyword("apm")
    auth = Keyword("auth")
    net = Keyword("net")
    sys = Keyword("sys")
    opt_kw = Keyword("options")
    monitor_kw = Keyword("monitor")
    profiles_kw = Keyword("profiles")
    session_kw = Keyword("session")
    mode_kw = Keyword("mode")
    lb_method_kw = Keyword("lb method")
    v_addr_kw = Keyword("virtual address")
    empty_object = Keyword("{ }")

    common = Suppress("/Common/")
    comment = Suppress("#") + Suppress(restOfLine)
    BS, LBRACE, RBRACE = map(Suppress, " {}")
    LBRACE_KW = Keyword("{")
    EOL = LineEnd().suppress()
    SOL = LineStart().suppress()
    reserved_words = (ltm | apm | auth | net | sys).suppress()

    ignore = (common | comment)

    entity_type = SOL.suppress()+Optional(reserved_words).\
        suppress() + (v_addr_kw | unquoted_string)
    data = (unquoted_string | quoted_string)

    key_exceptions = (opt_kw | profiles_kw | monitor_kw |
                      session_kw | mode_kw | lb_method_kw)

    # define structures
    value = Forward()
    value_object = Forward()
    multi_word_key = originalTextFor(OneOrMore((~key_exceptions)+data+(~EOL)))
    property_name = (data+EOL | key_exceptions | multi_word_key)
    f5_property = dictOf(property_name, Optional(value, default=None))
    properties = Dict(f5_property)
    entity_details = (originalTextFor(ZeroOrMore(unquoted_string)))
    entity = Group(entity_type+Group(
        entity_details + LBRACE + (f5_property | BS) + RBRACE))
    entities = OneOrMore(entity)

    value_object << ((LBRACE + properties + RBRACE) | empty_object)
    value << (value_object | originalTextFor(data + restOfLine + (~LBRACE_KW)) |
              data)

    data_set = entities.ignore(ignore)
    return data_set


def parse_config(source_str, version=11):
    grammar = get_grammar_by_version(version)
    result = []
    last_end = 0
    skipped = ""
    source_str = source_str.replace("\t", "    ")
    for tokens, start, end in grammar.scanString(source_str):
        result = result+tokens.asList()
        if last_end != 0:
            skipped = skipped+source_str[last_end:start]
        last_end = end
    LOG.debug("Parsing complete...")
    LOG.info("Parse Unmatched String: "+skipped.replace("\n\n", ""))
    result_dict = convert_to_dict(result)
    return result_dict


def get_grammar_by_version(version):
    grammar = None
    if int(version) == 10:
        grammar = generate_grammar_v10()
    elif int(version) == 11:
        grammar = generate_grammar_v11()
    return grammar


def convert_to_dict(result):
    result_dict = {}
    for item in result:
        # determine the key and value to be inserted into the dict
        key = None
        if isinstance(item, list):
            try:
                key = item[0].replace("/Common/", "")
                if isinstance(item[1], list):
                    dict_val = convert_to_dict(item)
                    if result_dict.get(key, None):
                        result_dict[key].update(dict_val)
                    else:
                        result_dict[key] = dict_val
                else:
                    if isinstance(item[1], str):
                        result_dict[key] = item[1].replace("/Common/", "")
                    else:
                        result_dict[key] = item[1]
            except IndexError:
                dict_val = None
                # determine whether to insert the value into the key or to
                # merge the value with existing values at this key
                if key:
                    if key in result_dict:
                        if isinstance(result_dict[key], list):
                            result_dict[key].append(dict_val)
                        else:
                            old = result_dict[key]
                            new = [old]
                            new.append(dict_val.replace("/Common/", ""))
                            result_dict[key] = new
                    else:
                        result_dict[key] = dict_val
    return result_dict
