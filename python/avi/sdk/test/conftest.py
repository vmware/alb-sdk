# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

"""
Get the configuration from the config file.
"""

import json
import pytest

# Module-level storage for config; set in pytest_configure when pytest runs.
# Used by test modules instead of deprecated pytest.config.getoption().
config_file = None
cfg = None


def pytest_addoption(parser):
    parser.addoption("--config", action="store", help="Path to config file")


def pytest_configure(config):
    """Load --config file and store path and parsed JSON for test modules (pytest 8.x compatible)."""
    global config_file, cfg
    config_file = config.getoption("--config", default=None)
    if config_file:
        with open(config_file) as f:
            cfg = json.load(f)

    # Validation: If mandatory config is missing, stop pytest immediately
    if cfg is None:
        pytest.exit("Missing or invalid --config file. Use: pytest --config=path.json")
