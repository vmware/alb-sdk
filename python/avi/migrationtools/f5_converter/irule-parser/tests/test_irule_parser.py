import sys
sys.path.append('..')
import pytest
import irule_parser as ip
import json

def load_data(key):
    return json.load(open('test_data.json', 'r'))[key]


class TestIruleParser:
    # Test Data
    parser_test_data = load_data('irule')
    functioncall_test_data = load_data('functioncall')
    switch_test_data = load_data('switch')
    switch_case_test_data = load_data('switchcase')
    statement_test_data = load_data('statement')
    comment_statement_test_data = load_data('commentstatement')
    when_test_data = load_data('when')
    ifblock_test_data = load_data('ifblock')
    basecondition_test_data = load_data('basecondition')
    condition_test_data = load_data('condition')
    header_statement_test_data = load_data('header_statement')
    @pytest.mark.parametrize("data", parser_test_data)
    def test_parser(self, data):
        try:
            result = ip.parse_input(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", functioncall_test_data)
    def test_parse_functioncall(self, data):
        try:
            result = ip.FunctionCall.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", switch_test_data)
    def test_parse_switch(self, data):
        try:
            result = ip.Switch.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", switch_case_test_data)
    def test_switch_case(self, data):
        try:
            result = ip.SwitchCase.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", statement_test_data)
    def test_statement(self, data):
        try:
            result = ip.Statement.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", comment_statement_test_data)
    def test_comment_statement(self, data):
        try:
            result = ip.Statement.parseString(data)
            assert not result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", when_test_data)
    def test_when_block(self, data):
        try:
            result = ip.WhenBlock.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", ifblock_test_data)
    def test_if_block(self, data):
        try:
            result = ip.IfBlock.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", basecondition_test_data)
    def test_base_condition(self, data):
        try:
            result = ip.base_condition.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", condition_test_data)
    def test_condition(self, data):
        try:
            result = ip.Condition.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", header_statement_test_data)
    def test_header_statement(self, data):
        try:
            result = ip.HeaderStatement.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

def load_generation_test_data(key):
    with open('test_generation_data.json', 'r') as f:
        data = json.load(f)
    return data[key]
class TestAviConfigGeneration:
    header_update_test_data = load_generation_test_data('header_update')


    @pytest.mark.parametrize("data", header_update_test_data)
    def test_header_update_generation(self, data):
        # Call the function or method you're testing with the data
        result = ip.Rule.parse_string(data['irule'])[0]
        print(result)
        expected_outcome = json.loads(data['avi_config'])

        # Use an assertion to verify the expected outcome
        assert result == expected_outcome, f"Expected {expected_outcome}, but got {result}"
