import sys
sys.path.append('..')
import pytest
import irule_parser as ip
import extract_irule as ep
import json

def load_data(key):
    return json.load(open('test_data.json', 'r'))[key]

def load_f5_conf_file():
    with open('f5_data.conf', "r") as file:
        return file.read()
        
class TestIruleParser:
    # Test Data
    parser_test_data = load_data('irule')
    parser_test_data_fail = load_data('irule_fail')
    functioncall_test_data = load_data('functioncall')
    switch_test_data = load_data('switch')
    switch_test_data_fail = load_data('switch_fail')
    switch_case_test_data = load_data('switchcase')
    switch_case_test_data_fail = load_data('switchcase_fail')
    statement_test_data = load_data('statement')
    statement_test_data_fail = load_data('statement_fail')
    comment_statement_test_data = load_data('commentstatement')
    when_test_data = load_data('when')
    when_test_data_fail = load_data('when_fail')
    ifblock_test_data = load_data('ifblock')
    ifblock_test_data_fail = load_data('ifblock_fail')
    ifcase_test_data = load_data('ifcase')
    ifcase_test_data_fail = load_data('ifcase_fail')
    stringmap_test_data = load_data('stringmap')
    stringmap_test_data_fail = load_data('stringmap_fail')
    poolswitch_test_data = load_data('poolswitch')
    poolswitch_test_data_fail = load_data('poolswitch_fail')
    nodeswitch_test_data = load_data('nodeswitch')
    nodeswitch_test_data_fail = load_data('nodeswitch_fail')
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

    @pytest.mark.parametrize("data", parser_test_data_fail)
    def test_fail_parser(self, data):
        try:
            result = ip.parse_input(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

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

    @pytest.mark.parametrize("data", switch_test_data_fail)
    def test_fail_parse_switch(self, data):
        try:
            result = ip.Switch.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", switch_case_test_data)
    def test_switch_case(self, data):
        try:
            result = ip.SwitchCase.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", switch_case_test_data_fail)
    def test_fail_parse_switch(self, data):
        try:
            result = ip.SwitchCase.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", statement_test_data)
    def test_statement(self, data):
        try:
            result = ip.Statement.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", statement_test_data_fail)
    def test_fail_statement(self, data):
        try:
            result = ip.Statement.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

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

    @pytest.mark.parametrize("data", when_test_data_fail)
    def test_fail_when_block(self, data):
        try:
            result = ip.WhenBlock.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", ifblock_test_data)
    def test_if_block(self, data):
        try:
            result = ip.IfBlock.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", ifblock_test_data_fail)
    def test_fail_if_block(self, data):
        try:
            result = ip.IfBlock.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", ifcase_test_data)
    def test_if_case(self, data):
        try:
            result = ip.IfCase.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", ifcase_test_data_fail)
    def test_fail_if_case(self, data):
        try:
            result = ip.IfCase.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", stringmap_test_data)
    def test_stringmap(self, data):
        try:
            result = ip.String_map.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", stringmap_test_data_fail)
    def test_fail_stringmap(self, data):
        try:
            result = ip.String_map.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", poolswitch_test_data)
    def test_poolswitch(self, data):
        try:
            result = ip.Pool.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", poolswitch_test_data_fail)
    def test_fail_poolswitch(self, data):
        try:
            result = ip.Pool.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

    @pytest.mark.parametrize("data", nodeswitch_test_data)
    def test_nodeswitch(self, data):
        try:
            result = ip.Node.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            pytest.fail(f"Error: {str(e)}")

    @pytest.mark.parametrize("data", nodeswitch_test_data_fail)
    def test_fail_nodeswitch(self, data):
        try:
            result = ip.Node.parseString(data)
            assert result, f"Failed to parse: {data}"
        except Exception as e:
            assert True

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
    redirect_test_data = load_generation_test_data('redirect')
    content_switch_test_data = load_generation_test_data('content_switch')


    @pytest.mark.parametrize("data", header_update_test_data)
    def test_header_update_generation(self, data):
        # Call the function or method you're testing with the data
        result = ip.Rule.parse_string(data['irule'])[0]
        print(result)
        expected_outcome = json.loads(data['avi_config'])

        # Use an assertion to verify the expected outcome
        assert result == expected_outcome, f"Expected {expected_outcome}, but got {result}"

    @pytest.mark.parametrize("data", redirect_test_data)
    def test_redirect_generation(self, data):
        # Call the function or method you're testing with the data
        result = ip.Rule.parse_string(data['irule'])[0]
        print(result)
        expected_outcome = json.loads(data['avi_config'])

        # Use an assertion to verify the expected outcome
        assert result == expected_outcome, f"Expected {expected_outcome}, but got {result}"

    @pytest.mark.parametrize("data", content_switch_test_data)
    def test_content_switch_generation(self, data):
        # Call the function or method you're testing with the data
        result = ip.Rule.parse_string(data['irule'])[0]
        print(result)
        expected_outcome = json.loads(data['avi_config'])

        # Use an assertion to verify the expected outcome
        assert result == expected_outcome, f"Expected {expected_outcome}, but got {result}"

class TestIruleExport:
    def test_extract_irule_from_f5_conf(self):
        #call the function to export irule data from f5 configuration
        bigip_conf = load_f5_conf_file()
        f5_irule_data = ep.extract_irule_from_config(bigip_conf)
        assert f5_irule_data, "failed to export"
        