# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
Get the configuration from the config.yml file.
"""
import pytest

v2avi_args = None


def pytest_addoption(parser):
    parser.addoption("--config_file", action="store", help="Config file")
    parser.addoption("--output_file", action="store", help="Output file")


@pytest.fixture(autouse=True, scope='session')
def get_args(pytestconfig):
    global v2avi_args
    v2avi_args = pytestconfig
    print(f"$$$$${v2avi_args.getoption('--config_file')}")
    return v2avi_args
