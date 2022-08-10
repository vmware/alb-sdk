# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import sys
import subprocess

try:
    import com.vmware.nsx_policy.model_client as model_client
except:
    print("\033[91m" + "ERROR: NSX python sdk dependencies are required to be installed before executing this tool\n" + "\033[0m")
    print("\033[93m" + "Note: For installing dependencies later execute script install_nsx_dependencies.py" + "\033[0m")
    answer = input("\033[93m" + "Do you want to continue installing dependencies? [y/n]\n" + "\033[0m")
    if any(answer.lower() == f for f in ["yes", 'y', '1']):
        subprocess.call(['install_nsx_dependencies.py'], shell=True)
    else:
        sys.exit(1)
