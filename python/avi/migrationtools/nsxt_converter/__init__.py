# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import sys
from subprocess import PIPE, Popen

try:
    import com.vmware.nsx_policy.model_client as model_client
except:
    print("\033[91m" + "ERROR: NSX python sdk dependencies are required to be installed before executing this tool\n" + "\033[0m")
    print("\033[93m" + "Note: For installing dependencies later execute script install_nsx_dependencies.py" + "\033[0m")
    answer = input("\033[93m" + "Do you want to continue installing dependencies? [y/n]\n" + "\033[0m")
    if any(answer.lower() == f for f in ["yes", 'y', '1']):
        p = Popen('install_nsx_dependencies.py', stdout=PIPE, bufsize=1, universal_newlines=True, shell=True)
        stdout, stderr = p.communicate()
        if p.returncode != 0:
            print("\033[91m" + "Error while executing dependency script" + "\033[0m")
            sys.exit(1)
    else:
        sys.exit(1)
