############################################################################
# ========================================================================
# Copyright 2022 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

import importlib
import os
import argparse
import urllib3
import sys

REQUIRED_FUNCTIONS = ['TestLogin', 'GetAvailableNetworksAndSubnets', 'GetIpamRecord',
                      'CreateIpamRecord', 'DeleteIpamRecord', 'UpdateIpamRecord']

REQUIRED_CLASSES = ['CustomIpamAuthenticationErrorException', 'CustomIpamRecordNotFoundException',
                    'CustomIpamNoFreeIpException', 'CustomIpamNotImplementedException',
                    'CustomIpamGeneralException']

parser = argparse.ArgumentParser(description="This script tests a custom IPAM script")
parser.add_argument('script_path', help='File path of the custom IPAM script')
args = parser.parse_args()

# Import script module using its path
mod_local_path = args.script_path
dir_name = os.path.dirname(mod_local_path)
sys.path.insert(0, dir_name)

mod_name = os.path.basename(mod_local_path).replace(".py", "")

script = importlib.import_module(mod_name)


def check_required_functions_and_classes(script_object):
    object_list = dir(script_object)
    missing_functions_list, missing_classes_list = [], []

    for required_function in REQUIRED_FUNCTIONS:
        if required_function not in object_list:
            missing_functions_list.append(required_function)

    for required_class in REQUIRED_CLASSES:
        if required_class not in object_list:
            missing_classes_list.append(required_class)

    if missing_functions_list:
        missing_functions = ', '.join(missing_functions_list)
        assert 0, "Required functions: " + missing_functions + " not present in the script"

    if missing_classes_list:
        missing_classes = ', '.join(missing_classes_list)
        assert 0, "Required classes: " + missing_classes + " not present in the script"


def get_nw_and_subnet_value(auth_params, allocation_type):
    """
    In case the user does not enter an input for nw_and_subnet_list (record_info),
    use the available GetAvailableNetworksAndSubnets function to fetch a value for nw_and_subnet_list .
    nw_and_subnet_list is required for UpdateIpamRecord.
    """
    nw_and_subnet = script.GetAvailableNetworksAndSubnets(auth_params, allocation_type)[0]
    nw_and_subnet = [tuple(i for i in nw_and_subnet.values())]
    return nw_and_subnet


def get_auth_params_from_user():
    auth_params = {}

    i = int(input("Enter the number of fields for auth_params: "))

    while i > 0:
        try:
            key, value = input("Enter field name and value (example input: username user1): ").split()
        except:
            print("Error! Enter input in the correct format")
            continue
        auth_params[key] = value
        i -= 1

    return auth_params


def get_record_params_from_user():
    record_id = input("Enter record id: ")
    fqdns = input("Enter list of fqdns (example input: fqdns1 fqdns2 fqdns3): ").split()
    allocation_type = input("Enter allocation type ('V4_ONLY', 'V6_ONLY ', or 'V4_V6'): ")
    preferred_ip = input("Enter preferred ip (*optional: press Enter to skip): ")
    preferred_ip6 = input("Enter preferred ip6 (*optional: press Enter to skip):: ")

    print("\n------Enter network and subnet list (*optional)-----\n")

    nw_and_subnet_list = []
    flag = input("Do you want to enter a list? (y/n): ").lower()
    while flag == 'y':
        required_input = input("Enter network, v4_subnet, v6_subnet\n"
                               "--Example: nw,v4,v6\n"
                               "--Example (no v4): nw,,v6\n"
                               "--Example (no v4 v6): nw,,\n"
                               "Enter the value: ")
        if len(required_input):
            required_tuple = tuple(i.strip() for i in required_input.split(","))
            nw_and_subnet_list.append(required_tuple)
            flag = input("Do you want to enter another? (y/n): ").lower()
        else:
            break

    record_info = {"id": record_id,
                   "fqdns": fqdns,
                   "allocation_type": allocation_type,
                   "preferred_ip": preferred_ip,
                   "preferred_ip6": preferred_ip6,
                   "nw_and_subnet_list": nw_and_subnet_list
                   }

    return record_info


def login(auth_params):
    try:
        check_login = script.TestLogin(auth_params)
        print("\n******TestLogin PASSED******")
        print("Function output: ", check_login)
    except Exception as e:
        print("\n******TestLogin FAILED******")
        print(str(e))


def create_ipam_record(auth_params, record_info):
    try:
        check_create = script.CreateIpamRecord(auth_params, record_info)
        check_get = check_get_ipam_record(auth_params, record_info)

        # If GetIpamRecord is not implemented in the script
        if not check_get[0] and (type(check_get[1]) == script.CustomIpamNotImplementedException):
            print("Warning: GetIpamRecord not implemented, skipping additional check")
        else:
            assert check_get[0], str(check_get[1])  # Check if get returns True; print error in case of assertion error
            assert check_get[1] == check_create, "Error: GetIpamRecord didn't return the created record"

        print("\n******CreateIpamRecord PASSED******")
        print("Function output: ", check_create)
    except Exception as e:
        print("\n****** CreateIpamRecord FAILED******")
        print(str(e))


def check_get_ipam_record(auth_params, record_info):
    try:
        check_get_ipam_record = script.GetIpamRecord(auth_params, record_info)
        assert type(check_get_ipam_record) == dict, "Error: GetIpamRecord doesn't return a dictionary"
        return True, check_get_ipam_record
    except Exception as e:
        return False, e


def get_ipam_record(auth_params, record_info):
    check_get = check_get_ipam_record(auth_params, record_info)
    if check_get[0]:
        print("\n******GetIpamRecord PASSED******")
    else:
        print("\n******GetIpamRecord FAILED******")
        print(str(check_get[1]))


def get_available_networks_and_subnets(auth_params, ip_type):
    try:
        check_get_available_networks = script.GetAvailableNetworksAndSubnets(auth_params, ip_type)
        assert type(check_get_available_networks) == list, "\n******GetAvailableNetworksAndSubnets FAILED******"
        print("\n******GetAvailableNetworksAndSubnets PASSED******")
        print("Function output:", check_get_available_networks)
    except Exception as e:
        print("\n******GetAvailableNetworksAndSubnets FAILED******")
        print(str(e))


def update_ipam_record_menu(auth_params, record_info):
    record_info_new = record_info.copy()
    print("\n-----Update record-----")
    print("*****Editing*****")

    while True:
        choice = input(
            "Enter the field to update:\n1. id\n2. fqdns\n3. allocation_type\n4. preferred_ip\n5. preferred_ip6\n6. nw_and_subnet_list\n0. Finish Editing\n")
        if choice == '0':
            break
        elif choice == '1':
            record_info_new['id'] = input("Enter new id: ")
        elif choice == '2':
            record_info_new['fqdns'] = input("Enter new fqdns: ")
        elif choice == '3':
            record_info_new['allocation_type'] = input("Enter new allocation type: ")
        elif choice == '4':
            record_info_new['preferred_ip'] = input("Enter new preferred_ip: ")
        elif choice == '5':
            record_info_new['preferred_ip6'] = input("Enter new preferred_ip6: ")
        elif choice == '6':
            record_info_new['nw_and_subnet_list'] = input("Enter new nw_and_subnet_list: ")
        print("Value updated")

    update_ipam_record(auth_params, record_info_new, record_info)


def update_ipam_record(auth_params, new_record, old_record):
    """
    1. Run UpdateIpamRecord from the script
    2. Check if UpdateIpamRecord returns an output based on entered (updated) user input
    3. Check if GetIpamRecord returns the same output
    """

    try:
        # If no value provided for nw_and_subnet_list, get value from available networks
        if not len(old_record['nw_and_subnet_list']):
            old_record['nw_and_subnet_list'] = get_nw_and_subnet_value(auth_params, old_record['allocation_type'])

        if not len(new_record['nw_and_subnet_list']):
            new_record['nw_and_subnet_list'] = get_nw_and_subnet_value(auth_params, new_record['allocation_type'])

        check_update = script.UpdateIpamRecord(auth_params, new_record, old_record)
        assert type(check_update) == dict, "Error: UpdateIpamRecord doesn't return a dictionary"
        new_allocation_type = new_record['allocation_type']

        if new_allocation_type == 'V4_ONLY':
            assert 'v4_ip' in check_update, "Error: No v4_ip in updated record"
        elif new_allocation_type == 'V6_ONLY':
            assert 'v6_ip' in check_update, "Error:  No v6_ip in updated record"
        elif new_allocation_type == 'V4_V6':
            assert 'v4_ip' in check_update, "Error: No v4_ip in updated record"
            assert 'v6_ip' in check_update, "Error: No v6_ip in updated record"

        check_get = check_get_ipam_record(auth_params, new_record)

        # If GetIpamRecord is not implemented in the script
        if not check_get[0] and (type(check_get[1]) == script.CustomIpamNotImplementedException):
            print("Warning: GetIpamRecord not implemented, skipping additional check")
        else:
            assert check_get[0], str(check_get[1])  # Check if get returns True; print error in case of assertion error
            assert check_get[1] == check_update, "Error: GetIpamRecord didn't return the updated record"

        print("\n******UpdateIpamRecord PASSED******")
        print("Function output: ", check_update)
    except Exception as e:
        print("\n******UpdateIpamRecord FAILED******")
        print(str(e))


def delete_ipam_record(auth_params, record_info):
    try:
        check_delete = script.DeleteIpamRecord(auth_params, record_info)
        check_get = check_get_ipam_record(auth_params, record_info)
        assert not check_get[0], "Error: GetIpamRecord still returns the record. It did not get deleted"  # If delete succeeds, Get should return False
        print("\n******DeleteIpamRecord PASSED******")
        print("Function output:", check_delete)
    except Exception as e:
        print("\n******DeleteIpamRecord FAILED******")
        print(str(e))


def main():
    urllib3.disable_warnings()

    check_required_functions_and_classes(script)
    auth_params = get_auth_params_from_user()

    while True:
        user_input = int(input(
            "\n0. Exit\n1. Test Login\n2. Test GetIpamRecord\n3. Test GetAvailableNetworksAndSubnets\n4. Test CreateIpamRecord\n5. Test UpdateIpamRecord\n6. Test DeleteIpamRecord\n7. Test all\n\n"))

        if user_input == 0:
            break
        elif user_input == 1:
            print("------Testing TestLogin------")
            login(auth_params)

        elif user_input == 2:
            print("------Testing GetIpamRecord------")

            record_id = input("Enter record id: ")
            record_info = {"id": record_id}

            get_ipam_record(auth_params, record_info)

        elif user_input == 3:
            print("------Testing GetAvailableNetworksAndSubnets------")
            ip_type = input("Enter ip type ('V4_ONLY', 'V6_ONLY ', or 'V4_V6'): ")
            get_available_networks_and_subnets(auth_params, ip_type)

        elif user_input == 4:
            print("------Testing CreateIpamRecord------")
            print("------Enter record info------")
            record_info = get_record_params_from_user()
            create_ipam_record(auth_params, record_info)

        elif user_input == 5:
            print("------Testing UpdateIpamRecord------")
            print("------Enter old record info:------")
            record_info = get_record_params_from_user()

            update_ipam_record_menu(auth_params, record_info)

        elif user_input == 6:
            print("------Testing DeleteIpamRecord------")
            record_id = input("Enter record id: ")
            record_fqdns = input("Enter fqdns: ")

            record_info = {"id": record_id, "fqdns": record_fqdns}

            delete_ipam_record(auth_params, record_info)

        else:
            print("------Testing All------")
            record_info = {"id": "test123",
                           "allocation_type": "V4_ONLY",
                           "nw_and_subnet_list": []}

            # 1. Test login
            login(auth_params)

            # 2. Test GetIpamRecord
            get_ipam_record(auth_params, record_info)

            # 3. Test GetAvailableNetworksAndSubnets
            get_available_networks_and_subnets(auth_params, record_info['allocation_type'])

            # 4. Test CreateIpamRecord
            create_ipam_record(auth_params, record_info)

            # 5. Test UpdateIpamRecord (Convert allocation type from V4_ONLY to V6_ONLY)
            record_info_new = record_info.copy()
            record_info_new["allocation_type"] = 'V6_ONLY'

            update_ipam_record(auth_params, record_info_new, record_info)

            # 6. Test DeleteIpamRecord
            delete_ipam_record(auth_params, record_info)


if __name__ == '__main__':
    main()
