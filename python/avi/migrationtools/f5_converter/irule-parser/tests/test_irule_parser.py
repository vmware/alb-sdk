import sys
sys.path.append('..')
import pytest
import irule_parser as ip
import json

def load_data(key):
    return json.load(open('test_data.json', 'r'))[key]

# Test Data
parser_test_data = load_data('irule')
functioncall_test_data = load_data('functioncall')
switch_test_data = load_data('switch')
switch_case_test_data = load_data('switchcase')
statement_test_data = load_data('statement')
when_test_data = load_data('when')
ifblock_test_data = load_data('ifblock')
basecondition_test_data = load_data('basecondition')
condition_test_data = load_data('condition')

@pytest.mark.parametrize("data", parser_test_data)
def test_parser(data):
    try:
        result = ip.parse_input(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", functioncall_test_data)
def test_parse_functioncall(data):
    try:
        result = ip.FunctionCall.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", switch_test_data)
def test_parse_switch(data):
    try:
        result = ip.Switch.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", switch_case_test_data)
def test_switch_case(data):
    try:
        result = ip.SwitchCase.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", statement_test_data)
def test_statement(data):
    try:
        result = ip.Statement.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", when_test_data)
def test_when_block(data):
    try:
        result = ip.WhenBlock.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", ifblock_test_data)
def test_if_block(data):
    try:
        result = ip.IfBlock.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", basecondition_test_data)
def test_base_condition(data):
    try:
        result = ip.base_condition.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")

@pytest.mark.parametrize("data", condition_test_data)
def test_condition(data):
    try:
        result = ip.Condition.parseString(data)
        assert result, f"Failed to parse: {data}"
    except Exception as e:
        pytest.fail(f"Error: {str(e)}")
