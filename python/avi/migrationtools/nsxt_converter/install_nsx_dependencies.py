#!/usr/bin/env python3

import os
import subprocess

try:
    whl_file_path = os.getcwd() + "/avi/migrationtools/lib/*.whl"
    subprocess.call(['$(echo | which python) -m pip install {}'.format(whl_file_path)], shell=True)
except Exception as e:
    print("\033[91m" + "Error in installing dependency. Reason: {}".format(e) + "\033[0m")
