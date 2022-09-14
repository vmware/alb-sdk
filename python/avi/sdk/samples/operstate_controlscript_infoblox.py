
############################################################################
# ========================================================================
# Copyright 2022 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

"""
This control script is executed on the Avi Controller every time there is a 
VIP_UP or a VIP_DOWN event.
"""
#!/usr/bin/python
import sys
import os
import json
import time
from avi.sdk.avi_api import ApiSession
import requests
requests.packages.urllib3.disable_warnings()

# To have cloud level isolation for this control script, 
# set this field with required cloud uuid else set this value None.
cloud_uuid = None

def ParseAviParams(argv):
    """
    Return alert parameters.
    """
    if len(argv) != 2:
        return
    alert_params = json.loads(argv[1])
    return alert_params


def get_api_token():
    """
    Return API token
    """
    return os.environ.get("API_TOKEN")


def getAviApiSession():
    """
    Create session to avi controller
    """
    token = os.environ.get("API_TOKEN")
    user = os.environ.get("USER")
    api_version = os.environ.get("VERSION", "21.1.4")
    tenant = os.environ.get("TENANT", "admin")
    api = ApiSession.get_session(
        os.environ.get("DOCKER_GATEWAY"), user, token=token, tenant=tenant, api_version=api_version
    )
    return api


def get_auth_params():
    """
    Return authentication parameters.
    """
    auth_params = {}
    auth_params["server"] = "0.0.0.0"
    auth_params["username"] = "xxxx"
    auth_params["password"] = "xxx"
    auth_params["wapi_version"] = "v2.0"
    auth_params["dns_view"] = "default"
    return auth_params


def register_dns_records(fqdns, vip4, vip6):
    """
    Register all DNS records for a given vip4 or vip6.
    """
    print("%s ======register_dns_records======" % time.ctime())
    auth_params = get_auth_params()

    # Step 1: Get all the records reference
    for fqdn in fqdns:
        payload = ''
        if vip4:
            payload = '{"ipv4addrs+": [{"ipv4addr": "' + vip4 + '"}], "configure_for_dns": true, "view": "' + auth_params["dns_view"] + '"}'
        if vip6:
            payload = '{"ipv6addrs+": [{"ipv6addr": "' + vip6 + '"}], "configure_for_dns": true, "view": "' + auth_params["dns_view"] + '"}'
        if vip4 and vip6:
            payload = '{"ipv4addrs+": [{"ipv4addr": "' + vip4 + '"}], "ipv6addrs+": [{"ipv6addr": "' + vip6 + '"}], "configure_for_dns": true,  "view": "' + auth_params["dns_view"] + '"}'
        
        rest_url = "https://" + auth_params["server"] + "/wapi/" + auth_params["wapi_version"] + "/record:host?name=" + fqdn
        try:
            r = requests.get(url=rest_url, auth=(auth_params["username"], auth_params["password"]),
                verify=False, timeout=30 )
            if r.status_code != 200:
                print("%s record[%s] not found"%(time.ctime(), fqdn))
                return
            print("%s Fetch record[%s] status[%s]"%(time.ctime(), fqdn, r.status_code))
            resp_json_ref = r.json()

            # Step2: Register dns records for vip4 and vip6
            put_rest_url = ("https://" + auth_params["server"] + "/wapi/"+ auth_params["wapi_version"]
                + "/" + resp_json_ref[0]["_ref"])
            r = requests.put(url=put_rest_url, auth=(auth_params["username"], auth_params["password"]),
                verify=False, data=payload)
            r_json = r.json()
            if r.status_code == 200:
                print("%s Register DNS record[%s] for vip4[%s] and vip6[%s] success"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6))
            # If vip4 or vip6 already exists, set 'configure_for_dns' flag to true
            elif r.text and ('is already in ipv4addrs' or 'is already in ipv6addrs') in r_json['text']:
                payload = '{"name": "' + resp_json_ref[0]["name"] +'", "configure_for_dns": true, "view": "' + auth_params["dns_view"] + '"}'
                r = requests.put(url=put_rest_url, auth=(auth_params["username"], auth_params["password"]),
                        verify=False, data=payload)
                if r.status_code == 200:
                    print("%s Register DNS record[%s] for vip4[%s] and vip6[%s] success"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6))
            else:
                err_msg = r_json['text'] if r.text else r.status_code
                print("%s Error Registering DNS record[%s] for vip4[%s] and vip6[%s], err[%s]"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6, err_msg))
        except Exception as e:
            print("%s Error registering DNS records err[%s]" % (time.ctime(), str(e)))


def deregister_dns_records(fqdns, vip4, vip6):
    """
    De-register all DNS records for a given vip4 or vip6.
    """
    print("%s ======deregister_dns_records======" % time.ctime())
    auth_params = get_auth_params()

    # Step 1: Get all the records reference for vip4 and vip6.
    for fqdn in fqdns:
        payload = ''
        if vip4:
            payload = '{"ipv4addrs-": [{"ipv4addr": "' + vip4 + '"}]}'
        if vip6:
            payload = '{"ipv6addrs-": [{"ipv6addr": "' + vip6 + '"}]}'
        if vip4 and vip6:
            payload = '{"ipv4addrs-": [{"ipv4addr": "' + vip4 + '"}], "ipv6addrs-": [{"ipv6addr": "' + vip6 + '"}]}'
        rest_url = "https://" + auth_params["server"] + "/wapi/" + auth_params["wapi_version"] + "/record:host?name=" + fqdn
        try:
            r = requests.get(url=rest_url, auth=(auth_params["username"], auth_params["password"]),
                verify=False, timeout=30)
            if r.status_code != 200:
                print("%s records for vip4[%s] and vip6[%s] not found"%(time.ctime(), vip4, vip6))
                return
            print("%s Fetch records for vip4[%s] and vip6[%s] status[%s]"%(time.ctime(), vip4, vip6, r.status_code))
            resp_json_ref = r.json()

            # Step2: De-register dns records for vip4 and vip6
            put_rest_url = ( "https://" + auth_params["server"] + "/wapi/" + auth_params["wapi_version"]
                + "/" + resp_json_ref[0]["_ref"])
            r = requests.put(url=put_rest_url, auth=(auth_params["username"], auth_params["password"]),
                verify=False, data=payload)
            r_json = r.json()
            if r.status_code == 200:
                print("%s De-register DNS record[%s] for vip4[%s] and vip6[%s] success"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6))
            # For last IP of the record, disable 'configure_for_dns' flag
            elif r.text and 'record requires at least one IP address' in r_json['text']:
                payload = '{"name": "' + resp_json_ref[0]["name"] +'", "configure_for_dns": false}'
                r = requests.put(url=put_rest_url, auth=(auth_params["username"], auth_params["password"]),
                    verify=False, data=payload)
                if r.status_code == 200:
                    print("%s De-register DNS record[%s] for vip4[%s] and vip6[%s] success"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6))
            else:
                err_msg = r_json['text'] if r.text else r.status_code
                print("%s Error de-registering DNS record[%s] for vip4[%s] and vip6[%s], err[%s]"% (time.ctime(), resp_json_ref[0]["name"], vip4, vip6, err_msg))
        except Exception as e:
            print("%s Error de-registering DNS records err[%s]" % (time.ctime(), str(e)))


def update_dns_records(vip_status, vs_uuid, vip4, vip6, session):
    """
    Function to register or de-register dnsrecords according to the vip status.
    """
    print("%s ======update_dns_records======" % time.ctime())
    rsp = session.get("virtualservice/%s" % vs_uuid)
    if rsp.status_code != 200:
        print("%s Virtual Service[%s] not found" % (time.ctime(), vs_uuid))
        return
    vs_data_dict = json.loads(rsp.content)
    vs_vip_ref = vs_data_dict.get("vsvip_ref", None)
    if not vs_vip_ref:
        print("%s VSVIP not found"%time.ctime())
        return
    vs_vip_uuid = vs_vip_ref.split("/")[-1]
    rsp = session.get("vsvip/%s" % vs_vip_uuid)
    if rsp.status_code != 200:
        print("%s VSVIP[%s] not found" % (time.ctime(), vs_vip_uuid))
        return
    vs_vip_dict = json.loads(rsp.content)
    if cloud_uuid:
        rsp = session.get("cloud/%s" % cloud_uuid)
        if rsp.status_code != 200:
            print("%s Configured cloud[%s] not found, ignoring this alert action." % (time.ctime(), cloud_uuid))
            return
        vs_vip_cloud_ref = vs_vip_dict.get("cloud_ref", None)
        vsvip_cloud_uuid = vs_vip_cloud_ref.split("/")[-1]
        if vsvip_cloud_uuid != cloud_uuid:
            print("%s VSVIP[%s] doesn't belong to configured cloud_uuid[%s], ignoring this alert action."%(time.ctime(), vs_vip_uuid, cloud_uuid))
            return
    fqdns = []
    dns_info = vs_vip_dict.get("dns_info", None)
    if not dns_info:
        print("no dns_info")
        return
    for fqdn in dns_info:
        fqdns.append(fqdn["fqdn"].split("/")[-1])
    print("%s fqdns[%s]"%(time.ctime(), fqdns))
    if not fqdns:
        print("%s no dns_info"%time.ctime())
        return
    if vip_status == "VIP_UP":
        register_dns_records(fqdns, vip4, vip6)
    if vip_status == "VIP_DOWN":
        # If current oper_status of the VIP is OPER_UP, ignore this alert action.
        vips = vs_vip_dict.get("vip", None)
        if not vips:
            print("no vips")
            return
        vip_id = None
        for vip in vips:
            if "ip_address" in vip and vip["ip_address"]["addr"] == vip4:
                vip_id = vip["vip_id"]
                break
        if not vip_id:
            print("no vip with %s ip_addres"%vip4)
            return
        rsp = session.get("virtualservice/%s/runtime" % vs_uuid)
        if rsp.status_code != 200:
            print("%s VS[%s] runtime not found" % (time.ctime(), vs_uuid))
            return
        vs_vip_rt_dict = json.loads(rsp.content)
        vip_summary = vs_vip_rt_dict.get("vip_summary", None)
        if not vip_summary:
            print("no vip_summary")
            return 
        for vip_sum in vip_summary:
            if vip_sum["vip_id"] == vip_id:
                if vip_sum["oper_status"]["state"] == "OPER_UP":
                    print("%s Current state of VIP is not VIP_DOWN, ignoring this alert action"%time.ctime())
                    return
                else:
                    break
        deregister_dns_records(fqdns, vip4, vip6)


if __name__ == "__main__":
    alert_params = ParseAviParams(sys.argv)
    vip_status = None
    vip = None
    vs_uuid = None
    for event in alert_params.get("events", []):
        vip_status = event["event_id"]
        print("%s vip_status = %s\n" % (time.ctime(), vip_status))
        vs_name = event["event_details"]["se_hm_vs_details"]["virtual_service"].split("/")[-1]
        vs_uuid = event["obj_uuid"]
        vip = vip6 = None
        if "vip_address" in event["event_details"]["se_hm_vs_details"]:
            vip4 = event["event_details"]["se_hm_vs_details"]["vip_address"]["addr"]
        if "vip6_address" in event["event_details"]["se_hm_vs_details"]:
            vip6 = event["event_details"]["se_hm_vs_details"]["vip6_address"]["addr"]
        print("%s VS name[%s], vip4[%s], vip6[%s]\n" % (time.ctime(), vs_name, vip4, vip6))
    session = getAviApiSession()
    update_dns_records(vip_status, vs_uuid, vip4, vip6, session)
