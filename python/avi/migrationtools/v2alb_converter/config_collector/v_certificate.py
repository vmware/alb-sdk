
import json
import logging
import os

import requests
from Crypto.PublicKey import RSA

LOG = logging.getLogger(__name__)


class vCert:
    def __init__(self, nsxv_host, nsxv_user, nsxv_pass, input_path):

        self.nsxv_ip = nsxv_host
        self.nsxv_user = nsxv_user
        self.nsxv_password = nsxv_pass

        self.input_path = input_path

    def fetch_cert(self):
        try:
            LOG.info("IN Exporting Certificates from nsx-v")
            input_path = os.path.normpath(self.input_path)

            key_dir = input_path + "/secrets"
            os.makedirs(key_dir, 0o700, exist_ok=True)
            self.post_public_key(key_dir)
            self.get_nsx_Cert(input_path)
        except Exception as e:
            msg = f"Error while exporting nsx-v certificates . Message: {e}"
            LOG.error(msg)
            
    def get_nsx_Cert(self, cert_dir):
        global authorizationField

        cert_url = "/api/2.0/services/truststore/v2tmigration/certificate"

        url = "https://" + self.nsxv_ip + cert_url

        response = requests.get(
            url,
            auth=(self.nsxv_user, self.nsxv_password),
            verify=False,
            headers={"Accept": "application/json"},
            stream=True,
        )
        if response.status_code == 200:
            cert_file = "%s/cert.json" % cert_dir
            LOG.info(f"Certificate JSON {url} is in file {cert_file}.")
            with open(cert_file, "w", encoding="utf-8") as newFile:
                json.dump(json.loads(response.text), newFile, indent=4)

    def generate_rsa_key(self, target):
        # random_generator = Random.new().read
        privateKey = RSA.generate(1024)
        publicKey = privateKey.publickey()
        try:
            with open(
                target + "/privateKey.pem", "w", encoding="utf-8"
            ) as private_file:
                private_file.write(str(privateKey.exportKey("PEM"), "utf-8"))
            with open(target + "/publicKey.pem", "w", encoding="utf-8") as public_file:
                public_file.write(str(publicKey.exportKey("PEM")))

        except Exception as e:
            LOG.warning(
                "Exception while writing private/public key to file: %s", e)

        return publicKey

    def post_public_key(self, target, authtoken=None):
        try:
            public_key = self.generate_rsa_key(target)
            public_key_utf8 = public_key.exportKey().decode("utf-8")
            post_body = (
                "<v2tpublickey><publickey>"
                + public_key_utf8
                + "</publickey></v2tpublickey>"
            )
            post_public_key_url = (
                "/api/2.0/services/truststore/v2tmigration/certificate/publickey"
            )
            url = "https://" + self.nsxv_ip + post_public_key_url
            headers = {
                "Accept": "application/xml",
                "Content-Type": "application/xml",
            }
            if authtoken is None:

                r = requests.post(
                    url,
                    data=post_body,
                    auth=(self.nsxv_user, self.nsxv_password),
                    verify=False,
                    headers=headers,
                    stream=True,
                )
            else:
                headers_auth = {"Authorization": "AUTHTOKEN %s" % authtoken}
                headers_auth.update(headers)
                r = requests.post(
                    url, data=post_body, verify=False,
                    headers=headers_auth, stream=True
                )
            if r.status_code != 201:
                LOG.error(
                    "Unable to save public key on NSX V, response code: %s",
                    r.status_code,
                )
            else:
                LOG.info("Successfully saved public key on NSX V")

        except requests.exceptions.ConnectionError as e:
            LOG.error("Connection error %s", e)
            LOG.error(
                "Encountered a connection error." /
                "Please wait and retry config collection. "
                + "Check logs for more details"
            )
