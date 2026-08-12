# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import json

# Module-level storage for config; set in pytest_configure when pytest runs.
# Used by test modules instead of deprecated pytest.config.getoption().
_config_file = None
_cfg = None

def pytest_addoption(parser):
    parser.addoption("--config", action="store", help="config file")

def pytest_configure(config):
    """Load --config file and store path and parsed JSON for test modules (pytest 8.x compatible)."""
    global _config_file, _cfg
    _config_file = config.getoption("--config", default=None)
    if _config_file:
        with open(_config_file) as f:
            _cfg = json.load(f)
