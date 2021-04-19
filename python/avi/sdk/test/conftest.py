# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
Get the configuration from the config.yml file.
"""

def pytest_addoption(parser):
    parser.addoption("--config", action="store", help="config file")