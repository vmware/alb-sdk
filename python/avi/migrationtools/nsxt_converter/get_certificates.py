# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import argparse
import parser
from requests.auth import HTTPBasicAuth

import requests
import pprint

pp = pprint.PrettyPrinter(indent=2)
def get_self_signed_certificate(args):
    '''

    :param args:
    :return:
    '''
    nsxt_user = args.nsxt_user
    nsxt_password = args.nsxt_password
    cert_name = args.cert_name

    print(nsxt_password,nsxt_user)
    base_url = "http://127.0.0.1:7440/nsxapi/api/v1/trust-management/certificates"
    headers = {
        'Content-Type': 'application/json',
        'x-nsx-username' : nsxt_user
    }

    auth = HTTPBasicAuth(nsxt_user, nsxt_password)

    certificate_id = None
    resp = requests.get(base_url, headers=headers, auth=auth)
    print(resp)
    if resp.status_code == 200:
        for certificate in resp.json()['results']:
            pp.pprint(certificate.get("display_name"))
            if certificate.get("display_name") == cert_name:
                certificate_id = certificate.get("id")
                pp.pprint(certificate_id)
                break

    data = {}
    if certificate_id:
        url = base_url + "/" + certificate_id + '/' + "?action=get_private"
        resp = requests.get(url, headers=headers, auth=auth)
        cert = resp.json()
        data["key"] = cert['pem_encoded']
        body = {
            "certificate" : cert['private_key']
        }
        data['certificate'] = body
        pp.pprint(data)
    return data


def main():
    HELP_STR = """
        Usage:
        python get_certificates.py -u admin -p Admin!23Admin -c test-cert
        """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR)
    parser.add_argument('-u', '--nsxt_user', required=True,
                        help='NSX-T User name')
    parser.add_argument('-p', '--nsxt_password', required=True,
                         help='NSX-T Password')
    parser.add_argument('-c', '--cert_name', required=True,
                        help='SSL Certificate name')
    args = parser.parse_args()
    print(args)
    get_self_signed_certificate(args)



if __name__ == '__main__':
    main()
