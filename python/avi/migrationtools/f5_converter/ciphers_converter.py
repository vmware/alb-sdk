import logging

import paramiko
from avi.migrationtools.f5_converter.conversion_util import F5Util

LOG = logging.getLogger(__name__)


class CiphersConfigConv:
    '''
    class for ciphers conversion
    '''

    def __init__(
        self,
        f5_host_ip,
        f5_ssh_password,
        f5_ssh_user,
        controller_ip,
        user,
        password,
        f5_version,
    ):
        ''' '''
        self.f5_host_ip = f5_host_ip
        self.f5_ssh_password = f5_ssh_password
        self.f5_ssh_user = f5_ssh_user
        self.controller_ip = controller_ip
        self.user = user
        self.password = password
        self.f5_version = f5_version
        self.conversion_util = F5Util()

    def migrate_ciphers_and_cipher_group(
        self, f5_config, f5_cipher_group_config, f5_version
    ):

        migrated_ciphers_dict = dict()
        migrated_ciphers_group_dict = dict()

        f5_ssh_client = paramiko.SSHClient()
        f5_ssh_client.load_system_host_keys()
        f5_ssh_client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        try:
            f5_ssh_client.connect(
                self.f5_host_ip,
                username='root',
                password=self.f5_ssh_password,
                allow_agent=False,
                look_for_keys=False,
            )
        except:
            LOG.warning('Ciphers Migration : F5 session not created')
            return {}, {}

        avi_ssh_client = paramiko.SSHClient()
        avi_ssh_client.load_system_host_keys()
        avi_ssh_client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        try:
            avi_ssh_client.connect(
                self.controller_ip,
                username=self.user,
                password=self.password,
                allow_agent=False,
                look_for_keys=False,
            )
        except:
            LOG.warning('Ciphers Migration : Avi session not created')
            return {}, {}
        migrated_ciphers_dict = self.convert_f5_ciphers(
            f5_config, f5_version, f5_ssh_client, avi_ssh_client
        )
        if f5_cipher_group_config:
            migrated_ciphers_group_dict = self.migrate_cipher_group(
                f5_config, f5_cipher_group_config, f5_ssh_client, avi_ssh_client
            )

        return migrated_ciphers_dict, migrated_ciphers_group_dict

    def convert_f5_ciphers(self, f5_config, f5_version, f5_ssh_client, avi_ssh_client):
        '''
        This method migrate ciphers from f5 to AVI
        :param f5_config:
        :return migrated ciphers dict
        '''
        profile_config = f5_config.get('profile', {})
        migrated_ciphers = dict()
        f5_cipher = list()

        for key in profile_config:
            profile = profile_config[key]
            profile_type, name = key.split(' ')

            if f5_version in [10]:
                if profile_type in ('clientssl', 'serverssl'):
                    ciphers = profile.get('ciphers', 'none')
                    if ciphers not in ['none']:
                        f5_cipher.append(ciphers)

            elif profile_type in ('client-ssl', 'server-ssl'):
                ciphers = profile.get('ciphers', 'none')
                if ciphers not in ['none']:
                    f5_cipher.append(ciphers)

        ciphers_id_dict = self.get_f5_ciphers_id(f5_cipher, f5_ssh_client)
        for cipher_key in ciphers_id_dict.keys():
            mig_cipher_dict = self.get_avi_supported_cipher_list(
                ciphers_id_dict, cipher_key, avi_ssh_client
            )
            migrated_ciphers[cipher_key] = mig_cipher_dict

        return migrated_ciphers

    def get_f5_ciphers_id(self, ciphers_list, f5_ssh_client):

        f5_ciphers_dict = dict()
        for cipher in ciphers_list:
            if cipher == 'none':
                continue

            command = 'tmm --clientciphers %s' % cipher
            stdin, stdout, stderr = f5_ssh_client.exec_command(command)
            output = stdout.readlines()
            err = stderr.read().decode()
            cipher_id_list = [(int)(line.split()[1]) for line in output[1:]]
            cipher_id_list = self.convert_hex_in_openssl_notation(
                cipher_id_list)
            cipher_str_list = [line.split()[2] for line in output[1:]]

            f5_ciphers_dict[cipher] = dict(
                cipher_id_list=cipher_id_list, cipher_str_list=cipher_str_list
            )
        return f5_ciphers_dict

    def get_avi_supported_cipher_list(self, f5_cipher_dict, cipher_key, avi_ssh_client):

        cipher_id_list = f5_cipher_dict[cipher_key]['cipher_id_list']
        cipher_str_list = f5_cipher_dict[cipher_key]['cipher_str_list']

        avi_cipher = set()
        unsupported_ciphers = set()
        mig_ciphers_dict = dict()
        for ind, cipher_id in enumerate(cipher_id_list):
            if cipher_str_list[ind] in avi_cipher:
                continue
            cmd = 'openssl ciphers -V -v ALL | grep %s' % cipher_id
            stdin, stdout, stderr = avi_ssh_client.exec_command(cmd)
            output = stdout.readlines()
            output_size = len(output)
            if output_size > 0:
                avi_cipher.add(cipher_str_list[ind])
            else:
                unsupported_ciphers.add(cipher_str_list[ind])

        mig_ciphers_dict = dict(
            mig_cipher=':'.join(str(ci) for ci in avi_cipher),
            unsupported_ciphers=':'.join(str(un_ci) for un_ci in unsupported_ciphers) if unsupported_ciphers else None,
        )
        return mig_ciphers_dict

    def migrate_cipher_group(
        self, f5_config_dict, cipher_config_dict, f5_ssh_client, avi_ssh_client
    ):
        cipher_group = dict()
        profile_config = f5_config_dict.get('profile', {})
        f5_cipher_group_dict = f5_config_dict.get('cipher', {})
        cipher_gr_config = cipher_config_dict.get('cipher', {})
        f5_cipher_group_dict.update(cipher_gr_config)

        for key in profile_config:
            profile = profile_config[key]
            profile_type, name = key.split(' ')
            if profile_type in ('client-ssl', 'server-ssl'):
                cipher_gr_name = profile.get('cipher-group', 'none')
                cipher_gr_name = self.conversion_util.get_tenant_ref(cipher_gr_name)[
                    1]

                if cipher_gr_name not in ['none']:
                    c_group_conf = [
                        f5_cipher_group_dict[cg_key]
                        for cg_key in f5_cipher_group_dict
                        if cg_key.split(' ')[0] == 'group'
                        and self.conversion_util.get_tenant_ref(cg_key.split(' ')[1])[1]
                        == cipher_gr_name
                    ]
                    cipher_group[cipher_gr_name] = c_group_conf[0]

        return self.convert_cipher_group(
            cipher_group, f5_cipher_group_dict, f5_ssh_client, avi_ssh_client
        )

    def convert_cipher_group(
        self, cipher_gr_dict, f5_cipher_group_dict, f5_ssh_client, avi_ssh_client
    ):
        migrated_cipher_group = dict()
        for cg_key in cipher_gr_dict:
            cg_config = cipher_gr_dict.get(cg_key)
            allowed_ciphers_list = list()
            excluded_cipher_list = list()
            required_ciphers_list = list()

            for allowed_cipher_name in cg_config.get('allow', {}):
                rule_ciphers = [
                    f5_cipher_group_dict[ci_rule_key].get('cipher')
                    for ci_rule_key in f5_cipher_group_dict
                    if ci_rule_key.split(' ')[0] == 'rule'
                    and ci_rule_key.split(' ')[1] == allowed_cipher_name
                ]
                if rule_ciphers:
                    allowed_ciphers_list.append(rule_ciphers[0])
            allowed_ciphers_list = [
                ':'.join(str(ci) for ci in allowed_ciphers_list)]
            allowed_ci_gr_dict = self.get_f5_ciphers_id(
                allowed_ciphers_list, f5_ssh_client
            )
            allowed_ci_gr_dict = {
                cg_key: allowed_ci_gr_dict.get(allowed_ciphers_list[0])
            }

            for required_cipher_name in cg_config.get('require', {}):
                rule_ciphers = [
                    f5_cipher_group_dict[ci_rule_key].get('cipher')
                    for ci_rule_key in f5_cipher_group_dict
                    if ci_rule_key.split(' ')[0] == 'rule'
                    and ci_rule_key.split(' ')[1] == required_cipher_name
                ]
                if rule_ciphers:
                    required_ciphers_list.append(rule_ciphers[0])

            if required_ciphers_list:
                required_ciphers_list = [
                    ':'.join(str(ci) for ci in required_ciphers_list)
                ]
                required_ci_gr_dict = self.get_f5_ciphers_id(
                    required_ciphers_list, f5_ssh_client
                )
                required_ci_gr_dict = {
                    cg_key: required_ci_gr_dict.get(required_ciphers_list[0])
                }

                allowed_ci_gr_dict[cg_key]['cipher_id_list'] = list(
                    set(allowed_ci_gr_dict[cg_key]['cipher_id_list'])
                    & set(required_ci_gr_dict[cg_key]['cipher_id_list'])
                )
                allowed_ci_gr_dict[cg_key]['cipher_str_list'] = list(
                    set(allowed_ci_gr_dict[cg_key]['cipher_str_list'])
                    & set(required_ci_gr_dict[cg_key]['cipher_str_list'])
                )

            for excluded_cipher_name in cg_config.get('exclude', {}):
                rule_ciphers = [
                    f5_cipher_group_dict[ci_rule_key].get('cipher')
                    for ci_rule_key in f5_cipher_group_dict
                    if ci_rule_key.split(' ')[0] == 'rule'
                    and ci_rule_key.split(' ')[1] == excluded_cipher_name
                ]
                if rule_ciphers:
                    excluded_cipher_list.append(rule_ciphers[0])

            if excluded_cipher_list:
                excluded_cipher_list = [
                    ':'.join(str(ci) for ci in excluded_cipher_list)
                ]
                excluded_ci_gr_dict = self.get_f5_ciphers_id(
                    excluded_cipher_list, f5_ssh_client
                )
                excluded_ci_gr_dict = {
                    cg_key: excluded_ci_gr_dict.get(excluded_cipher_list[0])
                }

                allowed_ci_gr_dict[cg_key]['cipher_id_list'] = list(
                    set(allowed_ci_gr_dict[cg_key]['cipher_id_list'])
                    ^ set(excluded_ci_gr_dict[cg_key]['cipher_id_list'])
                )
                allowed_ci_gr_dict[cg_key]['cipher_str_list'] = list(
                    set(allowed_ci_gr_dict[cg_key]['cipher_str_list'])
                    ^ set(excluded_ci_gr_dict[cg_key]['cipher_str_list'])
                )

            mig_ciphers_dict = self.get_avi_supported_cipher_list(
                allowed_ci_gr_dict, cg_key, avi_ssh_client
            )
            migrated_cipher_group[cg_key] = mig_ciphers_dict
        return migrated_cipher_group

    def convert_hex_in_openssl_notation(self, hex_list):

        updated_hex_list = list()
        for value in hex_list:
            hex_value = '0x' + hex(value)[2:].upper()
            if len(hex_value) == 4:
                updated_hex_list.append('0x00,%s' % hex_value)
            else:
                updated_hex_list.append(
                    '{},0x{}'.format(hex_value[:4], hex_value[4:]))
        return updated_hex_list
