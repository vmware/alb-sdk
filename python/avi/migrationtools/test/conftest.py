# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
Get the configuration from the config.yml file.
"""

def pytest_addoption(parser):
    parser.addoption("--config", action="store", help="Config file")
    parser.addoption ("--out", action="store", help="Output folder path")
    parser.addoption ("--docker_avi_version", action="store", help="Input AVI version for docker image")

def pytest_configure(config):
    global option
    option=config.option

