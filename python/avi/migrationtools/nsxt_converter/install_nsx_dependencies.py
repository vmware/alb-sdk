#!/usr/bin/env python3

import sys
from subprocess import PIPE, Popen

try:
    cmd = '$(which python3) -m pip install git+https://github.com/vmware/vsphere-automation-sdk-python.git'
    with Popen(cmd, stdout=PIPE, bufsize=1, universal_newlines=True, shell=True) as p:
        for line in p.stdout:
            print(line, end='')
    if p.returncode != 0:
        print("\033[91m" + "Error in installing dependencies" + "\033[0m")
        sys.exit(1)
except Exception as e:
    print("\033[91m" + "Error in installing dependencies. Reason: {}".format(e) + "\033[0m")
    sys.exit(1)
