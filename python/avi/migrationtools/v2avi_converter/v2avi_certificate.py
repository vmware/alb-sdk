
import os
from sys import path
from Crypto.PublicKey import RSA
import requests
import json
import sys
sys.path.insert(0,os.getcwd())
from certificate_plugin import CertificatePlugin
import logging
logger = logging.getLogger()
import base64
import ssl
import urllib.request
import json
import requests
from Crypto.Cipher import AES
#from Crypto.PublicKey import RSA
import ast
import base64
import argparse
from avi.migrationtools import avi_rest_lib



class V2ALB():
    def __init__(self,args):
        self.nsxv_ip = args.nsxv_host
        self.nsxv_user = args.nsxv_user
        self.nsxv_password = args.nsxv_pass
        self.controller_ip = args.controller_ip
        self.cntr_user = args.controller_user
        self.cntr_password = args.controller_pass
        self.controller_version = args.controller_version
        self.output_file_path = args.output_folder_path if args.output_folder_path \
            else 'output'
        self.cntr_tenant="admin"

    def convert_cert(self):

        if not os.path.exists(self.output_file_path):
            os.mkdir(self.output_file_path)
        output_dir = os.path.normpath(self.output_file_path)
        output_path = output_dir + os.path.sep + self.nsxv_ip + os.path.sep + "output"
        if not os.path.exists(output_path):
            os.makedirs(output_path)
        input_path = output_dir + os.path.sep + self.nsxv_ip + os.path.sep + "input"
        if not os.path.exists(input_path):
            os.makedirs(input_path)

        cert_dir = input_path + "/secrets"
        os.makedirs(cert_dir, 0o700, exist_ok=True)
        self.post_public_key(cert_dir)
        self.get_nsx_Cert(cert_dir)

        certi=CertificatePlugin(cert_dir)

        certificate_data=certi.xlate()

        migrated_cert_path = "%s/migrated_cert.json" % output_path
        with open(migrated_cert_path, "w", encoding='utf-8') as text_file:
            json.dump(certificate_data, text_file, indent=4)
        self.upload_config_to_controller(certificate_data)



    def get_nsx_Cert(self,cert_dir):
        global authorizationField

        cert_url="/api/2.0/services/truststore/v2tmigration/certificate"

        url = "https://" + self.nsxv_ip + cert_url

        response = requests.get(url, auth=(self.nsxv_user, self.nsxv_password), verify=False,
                              headers={'Accept': 'application/json'}, stream=True)

        cert_file="%s/cert.json" % cert_dir
        print('REST JSON %s is in file %s.' % (url, cert_file))
        with open(cert_file, 'w',encoding='utf-8') as newFile:
            json.dump(json.loads(response.text), newFile, indent=4)


    def upload_config_to_controller(self,alb_config):
            try:
                avi_rest_lib.upload_config_to_controller(
                    alb_config, self.controller_ip, self.cntr_user, self.cntr_password,
                    self.cntr_tenant, self.controller_version)
            except Exception as e:
                print("Exception occurred while uploading config to controller. Reason: {}".format(str(e)))
                sys.exit(1)


    def generate_rsa_key(self,target):
        # random_generator = Random.new().read
        privateKey = RSA.generate(1024)
        publicKey = privateKey.publickey()
        try:
            with open(target + '/privateKey.pem', 'w', encoding='utf-8') as private_file:
                private_file.write(str(privateKey.exportKey('PEM'), 'utf-8'))
            with open(target + '/publicKey.pem', 'w', encoding='utf-8') as public_file:
                public_file.write(str(publicKey.exportKey('PEM')))

        except Exception as e:
            logger.warning("Exception while writing private/public key to file: %s", e)

        return publicKey

    def post_public_key(self,target,authtoken=None):
        try:
            public_key = self.generate_rsa_key(target)
            public_key_utf8 = public_key.exportKey().decode('utf-8')
            post_body = "<v2tpublickey><publickey>" + public_key_utf8 + "</publickey></v2tpublickey>"
            post_public_key_url = "/api/2.0/services/truststore/v2tmigration/certificate/publickey"
            url = "https://" + self.nsxv_ip + post_public_key_url
            headers = {"Accept":"application/xml",
                    "Content-Type":"application/xml",
                    }
            if authtoken is None:

                r = requests.post(url, data=post_body, auth=(self.nsxv_user, self.nsxv_password), verify=False,
                                headers=headers, stream=True)
            else:
                headers_auth = {'Authorization': 'AUTHTOKEN %s' % authtoken}
                headers_auth.update(headers)
                r = requests.post(url, data=post_body, verify=False, headers=headers_auth, stream=True)
            if r.status_code != 201:
                logger.error("Unable to save public key on NSX V, response " +
                            "code: %s", r.status_code)
            else:
                print("Successfully saved public key on NSX V")


        except requests.exceptions.ConnectionError as e:
            logger.error("Connection error %s", e)
            report_error("Encountered a connection error. Please wait and retry config collection. " +
                        "Check logs for more details")



if __name__ == "__main__":


    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter)

    parser.add_argument(
        "--nsxv_host", help="v instance host ip" , required=True
    )

    parser.add_argument(
        "--nsxv_pass",
        help="v instance password",required=True
    )

    parser.add_argument(
        "--nsxv_user",
        help="v instance user name", required=True
    )

    parser.add_argument(
        "--controller_ip",
        help="Destination controller ip or fqdn for config upload",required=True
    )

    parser.add_argument(
        "--controller_version",
        help="Target Avi controller version",
        required=True)

    parser.add_argument(
        "--controller_pass",
        help="controller password",
        required=True
    )
    parser.add_argument(
        "--controller_user",
        help="controller user",
        required=True
    )
    parser.add_argument(
        "-o",
        "--output_folder_path",
        help="output folder path"
    )
    args = parser.parse_args()
    v2avi = V2ALB(args)
    v2avi.convert_cert()


