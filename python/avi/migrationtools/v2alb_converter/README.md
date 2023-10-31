# NSX-V to ALB Migration Tool

[NSX-V to Advanced Load Balancer (ALB) Migration Tool](https://github.com/vmware/alb-sdk/releases/tag/22.1.5)
is an Open-Source tool developed to help NSX-V users seamlessly migrate their Virtual Services to NSX Advanced Load Balancer (AVI), enabling them to get all the benefits that NSX Advanced Load Balancer can deliver, such as elastic load balancing, application security, autoscaling, container networking, and web application firewall.

It is a Python Package that can converts NSX-V configurations into Advanced Load Balancer (ALB) Configurations.

### Usage Examples

- NSX-V to ALB Migration Tool help

    ```
    v2avi_converter.py [-h] 

    usage: v2avi_converter.py [-h] 
                        -c ALB_CONTROLLER_IP
                        --alb_controller_version ALB_CONTROLLER_VERSION
                        --alb_controller_user ALB_CONTROLLER_USER
                        --alb_controller_password ALB_CONTROLLER_PASSWORD
                        [-t ALB_CONTROLLER_TENANT]
                        [-n NSXV_IP]
                        [-u NSXV_USER]
                        [-p NSXV_PASSWORD]
                        [-port NSXV_PORT]
                        [--ssh_root_password SSH_ROOT_PASSWORD]
                        [--t_host T_HOST]
                        [--t_user T_USER]
                        [--t_pass T_PASS]
                        [--t_port T_PORT]
                        [-o OUTPUT_FILE_PATH]
                        [-O {cli-upload,auto-upload}]
                        [--object_merge] [--prefix PREFIX]
                        [--exported_config_path EXPORTED_CONFIG_PATH]
                        [--not_in_use]
                        [--byot BYOT]
                        [--vs_filter VS_FILTER]
                        [--vs_level_status]
    ```

- Usage

    ```
    Example to use -O or --option to auto upload config to controller after conversion:
        v2avi_converter.py --option auto-upload

    Example to use --alb_controller_version option:
        v2avi_converter.py --alb_controller_version 21.1.4
    Usecase: To provide the version of controller for getting output in respective controller format.

    Example to export a single VS:
         v2avi_converter.py --vs_filter test_vs

    Example to add the prefix to avi object name:
        v2avi_converter.py --prefix abc
    Usecase: When two configuration is to be uploaded to same controller then 
             in order to differentiate between the objects that will be uploaded in 
             second time.

    Example to use not_in_use option:
        v2avi_converter.py --not_in_use
    Usecase: Dangling object which are not referenced by any avi object will be removed

    Example to use vs level status option:
        v2avi_converter.py --vs_level_status
    Usecase: To get the vs level status for the avi objects in excel sheet

    Example to default param files
        v2avi_converter.py --byot test/TEST_config/byot.json
    UseCase: To specify the egde to tier1 mapping for migration. Sample file test/TEST_config/byot.json
        "<edge-name>": "<tier1-name>"
         e.g { 
                "edge-1": "t1_1",
                "edge-2": "t1_2"
         }
    ```

- Arguments

  ```
  -h, --help            show this help message and exit
  -c ALB_CONTROLLER_IP, --alb_controller_ip ALB_CONTROLLER_IP
                        controller ip for auto upload
  --alb_controller_version ALB_CONTROLLER_VERSION
                        Target Avi controller version
  --alb_controller_user ALB_CONTROLLER_USER
                        controller username for auto upload
  --alb_controller_password ALB_CONTROLLER_PASSWORD
                        controller password for auto upload. Input prompt will appear if no value provided
  -t ALB_CONTROLLER_TENANT, --alb_controller_tenant ALB_CONTROLLER_TENANT
                        tenant name for auto upload
  -n NSXV_IP, --nsxv_ip NSXV_IP
                        Ip of NSX-V Manager
  -u NSXV_USER, --nsxv_user NSXV_USER
                        NSX-V User name
  -p NSXV_PASSWORD, --nsxv_password NSXV_PASSWORD
                        NSX-V Password
  -port NSXV_PORT, --nsxv_port NSXV_PORT
                        NSX-V Port
  --ssh_root_password SSH_ROOT_PASSWORD
                        ssh root  Password
  --t_host T_HOST       Ip of NSX-t Manager
  --t_user T_USER       NSX-T User name
  --t_pass T_PASS       NSX-T Password
  --t_port T_PORT       NSX-T Port
  -o OUTPUT_FILE_PATH, --output_file_path OUTPUT_FILE_PATH
                        Folder path for output files to be created in
  -O {cli-upload,auto-upload}, --option {cli-upload,auto-upload}
                        Upload option cli-upload generates Avi config file auto upload will upload config to controller
  --object_merge        flag for object merge check
  --prefix PREFIX       Prefix for objects
  --exported_config_path EXPORTED_CONFIG_PATH, -d EXPORTED_CONFIG_PATH
                        exported config folder location containing         both v config and t config
  --not_in_use          flag to skip not in use
  --byot BYOT           edge to tier mapping byot file
  --vs_filter VS_FILTER
                        only migrate selected vs/s
  --vs_level_status     Add columns of vs reference and overall skipped settings in status excel sheet
  ```
