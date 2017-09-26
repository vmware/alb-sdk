""" SSL Conversion Goes here """
import os
import logging
from avi.migrationtools.ace_converter.ace_constants import\
        DEFAULT_FAILED_CHECKS, DEFAULT_INTERVAL, DEFAULT_TIMEOUT
from avi.migrationtools.ace_converter.ace_utils import update_excel

#logging init
LOG = logging.getLogger(__name__)

class SSLConverter(object):
    """ SSL Converter Class """
    def __init__(self, parsed, tenant_ref, common_utils, in_path):
        self.parsed = parsed
        self.tenant_ref = tenant_ref
        self.common_utils = common_utils
        self.in_path = in_path

    def upload_file(self, file_path):
        """
        Reads the given file and returns the UTF-8 string
        :param file_path: Path of file to read
        :return: UTF-8 string read from file
        """

        file_str = None
        if '/Common/' in file_path:
            file_path = file_path.replace('/Common/', '')
        try:
            with open(file_path, "r") as file_obj:
                file_str = file_obj.read()
                file_str = file_str.decode("utf-8")
        except UnicodeDecodeError:
            try:
                file_str = file_str.decode('latin-1')
            except:
                LOG.error("Error to read file %s" % file_path, exc_info=True)
        except:
            LOG.error("Error to read file %s" % file_path, exc_info=True)
        return file_str

    def get_key_cert_obj(self, name, key_file_name, cert_file_name, input_dir):
        """
        :param name:name of ssl cert.
        :param key_file_name:  key file (ie.pem)
        :param cert_file_name: certificate file name
        :param input_dir: input directory for certificate file name
        :return: returns dict of ssl object
        """
        folder_path = input_dir + os.path.sep
        key = self.upload_file(folder_path + key_file_name)
        cert = self.upload_file(folder_path + cert_file_name)
        ssl_kc_obj = None
        if key and cert:
            cert = {"certificate": cert}
            ssl_kc_obj = {
                'name': name,
                'key': key,
                'certificate': cert,
                'key_passphrase': ''
            }
        return ssl_kc_obj



    def ssl_key_and_cert(self):
        key_list = list()
        for ssl in self.parsed.get('ssl-proxy', '') :
            key = None
            cert = None
            name = ssl['name']
            key_and_cert = None
            for val in ssl['desc']:
                if val.get('key', ''):
                    key_file = val['key']
                    key_loc = '%s/%s' % (self.in_path, val['key'])
                    if not os.path.isfile(key_loc):
                        key_loc = None
                if val.get('cert', ''):
                    cert_file = val['cert']
                    cert_loc = '%s/%s' % (self.in_path, val['cert'])
                    if not os.path.isfile(cert_loc):
                        cert_loc = None
            if key_loc and cert_loc:
                key_and_cert = self.get_key_cert_obj(name, key_file, cert_file,
                                                     self.in_path)
            else:
                key, cert = self.common_utils.create_self_signed_cert()
            if key and cert and name:
                key_and_cert = {
                    "type": "SSL_CERTIFICATE_TYPE_VIRTUALSERVICE",
                    "certificate": {
                        "certificate": cert
                    },
                    "tenant_ref": self.tenant_ref,
                    "name": name,
                    "key": key
                }
            if key_and_cert:
                key_list.append(key_and_cert)    
        return key_list
    def ssl_profile(self): 
        ssl_profile_list = list()
        for ssl in self.parsed.get('ssl-proxy', ''):
            temp_ssl_profile  = dict()
            temp_ssl_profile = {
                "accepted_ciphers": "DEFAULT:+SHA:+3DES:+kEDH", 
                "name": ssl['name'], 
                "accepted_versions": [
                    {
                        "type": "SSL_VERSION_TLS1"
                    }, 
                    {
                        "type": "SSL_VERSION_TLS1_1"
                    }, 
                    {
                        "type": "SSL_VERSION_TLS1_2"
                    }
                ], 
                "tenant_ref": self.tenant_ref, 
                "send_close_notify": False
            }
            ssl_profile_list.append(temp_ssl_profile)
        return ssl_profile_list
