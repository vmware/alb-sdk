# NSX-T to AVI Migration Tool

[NSX-T to AVI Migration Tool](https://github.com/vmware/alb-sdk/releases/tag/22.1.1.post5)
is an Open-Source tool developed by the AVI Development team to help NSX-T users seamlessly migrate their Virtual Services to NSX Advanced Load Balancer (AVI), enabling them to get all the benefits that NSX Advanced Load Balancer can deliver, such as elastic load balancing, application security, autoscaling, container networking, and web application firewall.

The [How-to Guide](https://raw.githubusercontent.com/vmware/alb-sdk/eng/python/avi/migrationtools/nsxt_converter/NSX-T_to_Avi_Migration_Tool_-_How_To_Guide.pdf)
located in this repository will help you understand the basics about how Avi works, how it interacts with NSX-T, and how you can use this tool to migrate your Virtual Services to Avi.

### Usage Examples

- NSX-T to AVI Migration Tool help

    ```
    nsxt_converter.py -h

     usage: nsxt_converter.py [-h] [--ansible]
                         [--ansible_skip_types ANSIBLE_SKIP_TYPES]`
                         [--ansible_filter_types ANSIBLE_FILTER_TYPES]
                         -c ALB_CONTROLLER_IP
                         [--alb_controller_version ALB_CONTROLLER_VERSION]
                         --alb_controller_user ALB_CONTROLLER_USER
                         [--alb_controller_password ALB_CONTROLLER_PASSWORD]
                         [-t ALB_CONTROLLER_TENANT]
                         [--cloud_tenant CLOUD_TENANT]
                         [-i DEFAULT_PARAMS_FILE]
                         -n NSXT_IP
                         -u NSXT_USER
                         [-p NSXT_PASSWORD]
                         [-port NSXT_PORT]
                         [--ssh_root_password SSH_ROOT_PASSWORD]
                         [--not_in_use]
                         [--no_object_merge]
                         [-o OUTPUT_FILE_PATH]
                         [-O {cli-upload,auto-upload}]
                         [--patch PATCH]
                         [--prefix PREFIX]
                         [--segroup SEGROUP]
                         [--traffic_state]
                         [--vs_filter VS_FILTER]
                         [--vs_level_status]
                         [-s {enable,deactivate}]
    ```

- Usage

    ```
    Example to use -O or --option to auto upload config to controller after conversion:
        nsxt_converter.py --option auto-upload

    Example to use -s or --vs_state option:
        nsxt_converter.py -s enable
    Usecase: Default behaviour is VS state is disabled and traffic state is enabled after migration.
    'enable' value means VS will be migrated with enable state. Recommended for VSs with non shared vip's.
    Do not use IF LB configs are having shared VIP's. (Default 'traffic_state' is 'enable',
    recommended - traffic_state should be set to 'deactivate')
    'deactivate' value means VS will be migrated with inactive state. Recommended and default for VSs with shared vip's.
    (Default 'traffic_state' is 'enable', recommended - traffic_state should be kept as 'enable')

    Example to use --alb_controller_version option:
        nsxt_converter.py --alb_controller_version 21.1.4
    Usecase: To provide the version of controller for getting output in respective controller format.

    Example to use no object merge option:
        nsxt_converter.py --no_object_merge
    Usecase: When we don't need to merge two same object (based on their attribute values except name)

    Example to patch the config after conversion:
       nsxt_converter.py --patch test/patch.yaml where patch.yaml file contains
       <avi_object example Pool>:
        - match_name: <existing name example p1>
       patch:
        name: <changed name example coolpool>
    Usecase: Sample file test/patch.yaml

    Example to export a single VS:
         nsxt_converter.py --vs_filter test_vs

    Example to skip avi object during playbook creation
         nsxt_converter.py --ansible --ansible_skip_types DebugController
    Usecase:
         Comma separated list of Avi Object types to skip during conversion.
         Eg. DebugController, ServiceEngineGroup will skip debugcontroller and
         serviceengine objects

    Example to filter ansible object
         nsxt_converter.py --ansible --ansible_filter_types virtualservice, pool
    Usecase:
        Comma separated list of Avi Objects types to include during conversion.
        Eg. VirtualService , Pool will do ansible conversion only for
        Virtualservice and Pool objects

    Example to use ansible option:
        nsxt_converter.py --ansible
    Usecase: To generate the ansible playbook for the avi configuration
    which can be used for upload to controller

    Example to add the prefix to avi object name:
        nsxt_converter.py --prefix abc
    Usecase: When two configuration is to be uploaded to same controller then
     in order to differentiate between the objects that will be uploaded in
     second time.

    Example to use not_in_use option:
        nsxt_converter.py --not_in_use
    Usecase: Dangling object which are not referenced by any avi object will be removed

    Example to use vs level status option:
        nsxt_converter.py --vs_level_status
    Usecase: To get the vs level status for the avi objects in excel sheet

    Example to use segroup flag
        nsxt_converter.py --segroup segroup_name
    UseCase: To add / change segroup reference of vs

    Example to default param files
        nsxt_converter.py --default_params_file test/default_params.json
    UseCase: To set default parameters for migration. Sample file test/default_params.json
    1. "bgp_peer_configured_for_vlan": true/false
    2. "network_service": {
            "<tier1_name>-floating-ip": "<floating-ip>"
        }
    e.g 1. "bgp_peer_configured_for_vlan": true/false
        2. "network_service": {
            "PBOneArm-floating-ip": "<floating-ip>"
        }
    ```

- Arguments

  ```
  -h, --help            show this help message and exit
  --ansible             Flag for create ansible file
  --ansible_skip_types ANSIBLE_SKIP_TYPES
                        Comma separated list of Avi Object types to skip during conversion.
                          Eg. -s DebugController,ServiceEngineGroup will skip debugcontroller and serviceengine objects
  --ansible_filter_types ANSIBLE_FILTER_TYPES
                        Comma separated list of Avi Objects types to include during conversion.
                         Eg. -f VirtualService, Pool will do ansible conversion only for Virtualservice and Pool objects
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
  --cloud_tenant CLOUD_TENANT
                        tenant for cloud ref
  -i DEFAULT_PARAMS_FILE, --default_params_file DEFAULT_PARAMS_FILE
                        absolute path for nsx-t default params file
  -n NSXT_IP, --nsxt_ip NSXT_IP
                        Ip of NSX-T
  -u NSXT_USER, --nsxt_user NSXT_USER
                        NSX-T User name
  -p NSXT_PASSWORD, --nsxt_password NSXT_PASSWORD
                        NSX-T Password
  --nsxt_port NSXT_PORT
                        NSX-T Port
  --ssh_root_password SSH_ROOT_PASSWORD
                        ssh root  Password
  --not_in_use          Flag for skipping not in use object
  --no_object_merge     Flag for object merge
  -o OUTPUT_FILE_PATH, --output_file_path OUTPUT_FILE_PATH
                        Folder path for output files to be created in
  -O {cli-upload,auto-upload}, --option {cli-upload,auto-upload}
                        Upload option cli-upload generates Avi config file auto upload will upload config to controller
  --patch PATCH         Run config_patch please provide location of patch.yaml
  --prefix PREFIX       Prefix for objects
  --segroup SEGROUP     Update the available segroup ref with the custom ref
  --traffic_state       Traffic state on all migrated VS VIPs. The default is 'enable'.
  --vs_filter VS_FILTER
                        comma separated names of virtualservices.
                        Note: If patch data is supplied, vs_name should match the new name given in it
  --vs_level_status     Add columns of vs reference and overall skipped settings in status excel sheet
  -s {enable,deactivate}, --vs_state {enable,deactivate}
                        State of created VS. The default is 'deactivate'.
                        'enable' value means VS will be migrated with enable state. Recommended for VSs with non shared vip's. Do not use IF LB configs are having shared VIP's. (Default 'traffic_state' is 'enable', recommended - traffic_state should be set to 'deactivate')
                        'deactivate' value means VS will be migrated with inactive state. Recommended and default for VSs with shared vip's. (Default 'traffic_state' is 'enable', recommended - traffic_state should be kept as 'enable')
  ```
