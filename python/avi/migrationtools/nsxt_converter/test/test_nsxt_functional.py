import os
import pytest
import yaml
import subprocess
from avi.migrationtools.nsxt_converter.nsxt_converter import NsxtConverter
from avi.migrationtools.nsxt_converter.test.utils.constants import *
from avi.migrationtools.nsxt_converter.test.utils.utils import verify, verify_traffic, verify_vs_is_up_on_nsxt, VSStateDown, setup_logging
from avi.sdk.avi_api import ApiSession
from string import Template
from retry import  retry

config_file = pytest.config.getoption('--config')
output_file = pytest.config.getoption('--out')

VS_LIST = [HTTP_SNAT]

with open(config_file) as f:
    file_attribute = yaml.load(f, Loader=yaml.Loader)

setup = dict(nsxt_ip=file_attribute['nsxt_ip'],
             nsxt_user=file_attribute['nsxt_user'],
             nsxt_password=file_attribute['nsxt_password'],
             ssh_root_password=file_attribute['ssh_root_password'],
             alb_controller_ip=file_attribute['alb_controller_ip'],
             alb_controller_user=file_attribute['alb_controller_user'],
             alb_controller_password=file_attribute['alb_controller_password'],
             alb_controller_version= file_attribute['alb_controller_version'],
             output_file_path = output_file,
             nsxt_port = 443,
             prefix = 'test-pre-',
             alb_controller_tenant = file_attribute['alb_controller_tenant'],
             not_in_use = False,
             ansible_skip_types = None,
             controller_version = None,
             ansible_filter_types = None,
             vs_level_status = True,
             option = 'auto-upload',
             ansible = True,
             object_merge_check = False,
             vs_state = 'deactivate',
             vs_filter = None,
             segroup = None,
             patch = os.path.abspath(os.path.join(os.path.dirname(__file__),
                                       'patch.yaml')),
             traffic_enabled = False,
             default_params_file = './default_params.json',
             cloud_tenant = 'admin'
        )

if not os.path.exists(setup.get("output_file_path")):
    os.mkdir(setup.get("output_file_path"))

filename=os.path.join(setup.get('output_file_path'), 't2alb_functional.log')
log = setup_logging(filename)

traffic_cmd = Template('python ../traffic_cutover.py -n $nsxt_ip -u admin -p $nsxt_password -c $controller --alb_controller_user admin ' \
              '--alb_controller_password $password --alb_controller_version $api_version --vs_filter $vs_filter -o %s' %(setup.get("output_file_path")))

rollback_cmd = Template('python ../rollback.py -n $nsxt_ip -u admin -p $nsxt_password -c $controller --alb_controller_user admin ' \
              '--alb_controller_password $password --alb_controller_version $api_version --vs_filter $vs_filter -o %s' %(setup.get("output_file_path")))


def get_session():
    api = ApiSession.get_session(username='admin',
        controller_ip=setup.get('alb_controller_ip'),
        password=setup.get('alb_controller_password'),
        api_version=setup.get('alb_controller_version'),
        verify=False)
    return api


@retry(VSStateDown,delay=5, tries=10)
def verify_vs_is_up(vs_name):
    api = get_session()
    resp= api.get('virtualservice-inventory?name={}'.format(vs_name))
    verify(resp.status_code == 200, 'Expected status code is 200 got {}'.format(resp.status_code))
    verify(resp.json()['count'] == 1, 'Expected count is 1 got {}'.format(resp.json()['count']))
    responce = resp.json()['results'][0]
    state = responce.get('runtime', {}).get('oper_status', {}).get('state')
    log.info("VS State {}".format(state))
    if state != "OPER_UP":
        raise VSStateDown("VS State is down")


class Namespace:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


def Nsxt_conv(nsxt_ip=None, nsxt_user=None, nsxt_password=None, ssh_root_password=None,
              controller_ip=None, password=None, user=None,alb_controller_version=None,output_file_path = None,
              nsxt_port = 443, prefix = None, tenant = 'admin', not_in_use = True, ansible_skip_types = None,
              controller_version = None, ansible_filter_types = None, vs_level_status = False,
              option = None, ansible = False, object_merge_check = True,
              vs_state = None, vs_filter = None, segroup = None, patch = None,
              traffic_enabled = False, default_params_file = None, cloud_tenant = 'admin'
              ):
    args = Namespace(nsxt_ip=nsxt_ip, nsxt_user=nsxt_user, nsxt_password=nsxt_password, ssh_root_password=ssh_root_password,
                     alb_controller_ip=controller_ip, alb_controller_password=password, alb_controller_user=user, alb_controller_version=alb_controller_version,
                     output_file_path=output_file_path, nsxt_port=nsxt_port, prefix=prefix, alb_controller_tenant=tenant,
                     not_in_use=not_in_use, ansible_skip_types=ansible_skip_types, controller_version=controller_version,
                     ansible_filter_types=ansible_filter_types, vs_level_status=vs_level_status,
                     option=option, ansible=ansible, no_object_merge=object_merge_check,
                     vs_state=vs_state, vs_filter=vs_filter, segroup=segroup, patch=patch,
                     traffic_enabled=traffic_enabled, default_params_file=default_params_file, cloud_tenant=cloud_tenant
                     )
    nsxt_converter = NsxtConverter(args)
    nsxt_converter.conver_lb_config(args)


class TestNSXTConverter:

    @pytest.fixture
    def cleanup(self):
        import avi.migrationtools.nsxt_converter.conversion_util as conv
        import shutil
        conv.csv_writer_dict_list = list()
        if os.path.exists(output_file):
            for each_file in os.listdir(output_file):
                file_path = os.path.join(output_file, each_file)
                try:
                    if os.path.isfile(file_path):
                        if file_path.endswith('.log'):
                            open('converter.log', 'w').close()
                            open('t2alb_functional.log', 'w').close()
                        else:
                            os.unlink(file_path)
                    elif os.path.isdir(file_path):
                        shutil.rmtree(file_path)
                except Exception as e:
                    log.error(e)
                    raise e

    def test_upload_vs_on_the_controller(self, cleanup):
        log.info("NSXT Config download and migration is in process.")
        Nsxt_conv(nsxt_ip=setup.get('nsxt_ip'),
                  nsxt_user=setup.get('nsxt_user'),
                  nsxt_password=setup.get('nsxt_password'),
                  controller_ip=setup.get('alb_controller_ip'),
                  user=setup.get('alb_controller_user'),
                  alb_controller_version=setup.get('alb_controller_version'),
                  password=setup.get('alb_controller_password'),
                  tenant = setup.get('alb_controller_tenant'),
                  output_file_path = setup.get('output_file_path'),
                  option='auto-upload',
                  default_params_file=setup.get('default_params_file'),
                  vs_filter=setup.get('vs_filter'))
        log.info("NSXT Config migration done.")

    def test_verify_se_group_created_for_no_snat(self):
        api = get_session()
        resp = api.get('virtualservice?name=%s' %(HTTP_NO_SNAT_VS))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')
        name = '%s-PreserveClientIP' %(setup.get('nsxt_ip'))
        resp = api.get('serviceenginegroup?name=%s' %(name))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')

    def test_verify_pool_have_ns_group_ref_for_no_snat(self):
        api = get_session()
        resp = api.get('pool?name=%s' %(HTTPS_NO_SNAT_POOL))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')
        responce = resp.json()['results'][0]
        assert responce['nsx_securitygroup'] != 0

    def test_verify_network_service_created_for_no_snat(self):
        api = get_session()
        name = '%s-PreserveClientIP-ns' %(setup.get('nsxt_ip'))
        resp = api.get('networkservice?name=%s' %(name))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')

    @pytest.mark.parametrize('vs_name', VS_LIST)
    def test_verify_e2e_traffic_working_on_nsxt_and_avi_controller(self, vs_name):
        log.info('Collecting VIP info of {}'.format(vs_name))
        api = get_session()
        resp = api.get('vsvip?name=%s-vsvip' %(vs_name))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')

        response = resp.json()['results'][0]
        vip = response['vip'][0]
        ip_address = vip.get('ip_address').get('addr')

        # Verify VS is enabled and traffic is disabled
        log.info('Collecting VS info of {}'.format(vs_name))
        api = get_session()
        resp = api.get('virtualservice?name=%s' % (vs_name))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')
        response =  resp.json()['results'][0]
        verify(response.get('enabled') == True, f"Expected vs enabled state true got {response.get('enabled')}")
        verify(not response.get('traffic_enabled'), f"Expected traffic enabled false got {response.get('traffic_enabled')}")
        port = response['services'][0]['port']

        network_profile = response.get('network_profile_ref')
        network_profile = network_profile.split('api/')[-1]
        resp = api.get(network_profile)
        verify(resp.status_code == 200, f"Expected status code is 200 got {resp.status_code}")
        response = resp.json()
        type = response.get('profile', {}).get('type')
        log.info('VS network profile type : {}'.format(type))
        # Verify traffic working on nsxt
        if type in TCP_PROFILE_TYPES:
            if port == 443:
                req = '-k https://%s:%s' %(ip_address, port)
            else:
                req = 'http://%s:%s'  %(ip_address, port)
            tag = 'tcp_traffic'
        else:
            req = ip_address
            tag = 'udp_traffic'

        log.info('Verifying traffic on nsxt')
        res = verify_traffic(req ,tag)
        verify(res.returncode == 0, f"Verify traffic return {res.returncode}, traffic on nsxt failed")

        log.info('Verifying vs {} is UP'.format(vs_name))
        verify_vs_is_up(vs_name)

        log.info('Executing traffic cutover from nsxt')
        cmd = traffic_cmd.substitute(nsxt_ip=setup.get('nsxt_ip'), nsxt_password=setup.get('nsxt_password'), controller=setup.get('alb_controller_ip'), password=setup.get('alb_controller_password'), api_version=setup.get('alb_controller_version'), vs_filter=vs_name)
        res = subprocess.run(cmd, shell=True, capture_output=True)
        verify(res.returncode == 0, f"Traffic cutover failed : {res.stderr}")

        log.info('Verifying vs and traffic are enabled.')
        resp = api.get('virtualservice?name=%s' % (vs_name))
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")
        verify(resp.status_code == 200, f'Expected status code is 200 got {resp.status_code}')
        response = resp.json()['results'][0]
        verify(response.get('enabled') == True, f"Expected vs enabled state true got {response.get('enabled')}")
        verify(response.get('traffic_enabled') == True, f"Expected traffic_enabled true got {response.get('traffic_enabled')}")

        log.info('Verifying traffic on the controller')
        res = verify_traffic(req, tag)
        verify(res.returncode == 0, f"Traffic verification on the controller failed. {res.stderr}")

        # Verify traffic logs on the avi controller
        url = '/analytics/logs?type=1&virtualservice=%s&udf=true&nf=true' %(vs_name)
        api = get_session()
        resp = api.get(url)
        verify(resp.status_code == 200, f"Expected status code is 200 got {resp.status_code}")
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")

        log.info('Performing rollback on traffic.')
        cmd = rollback_cmd.substitute(nsxt_ip=setup.get('nsxt_ip'), nsxt_password=setup.get('nsxt_password'),
                                     controller=setup.get('alb_controller_ip'),
                                     password=setup.get('alb_controller_password'),
                                     api_version=setup.get('alb_controller_version'), vs_filter=vs_name)
        res = subprocess.run(cmd, shell=True, capture_output=True)
        verify(res.returncode == 0, f"Rollback failed : {res.stderr}")

        log.info('Verify traffic is disabled on the controller')
        resp = api.get('virtualservice?name=%s' % (vs_name))
        verify(resp.status_code == 200, f"Expected status code is 200 got {resp.status_code}")
        verify(resp.json()['count'] == 1, f"Expected count is 1 got {resp.json()['count']}")

        response = resp.json()['results'][0]
        verify(not response.get('enabled'), f"Expected vs state false got {response.get('enabled')}")
        verify(not response.get('traffic_enabled'), f"Expected traffic enabled false got {response.get('traffic_enabled')}")

        log.info('Verify VS is UP on nsxt.')
        state = verify_vs_is_up_on_nsxt(nsxt_ip=setup.get('nsxt_ip'), nsxt_un=setup.get('nsxt_user'),
                          nsxt_pw=setup.get('nsxt_password'), vs_name=vs_name)
        verify(state == True, "VS is not UP on the nsxt")

        log.info('Verify traffic on nsxt after rollback.')
        res = verify_traffic(req, tag)
        verify(res.returncode == 0, f"Traffic verification on the nsxt failed : {res.stderr}")
