import json
import logging
import os
import sys

import pytest
import yaml
from avi.migrationtools.avi_migration_utils import get_count
from avi.migrationtools.avi_migration_utils import set_update_count
from avi.migrationtools.v2alb_converter.v2avi_converter import NsxvConverter
from avi.sdk.avi_api import ApiSession

LOG = logging.getLogger("v2alb_conversion")

exported_config_path = os.path.abspath(
    os.path.join(os.path.dirname(__file__), "TEST_config")
)
byot_path = os.path.abspath(
    os.path.join(os.path.dirname(__file__), "TEST_config/byot.json")
)


@pytest.fixture(scope="module")
def setup(get_args):
    v2avi_args = get_args

    config_file = v2avi_args.getoption("config_file")
    with open(config_file) as f:
        file_attribute = yaml.load(f, Loader=yaml.Loader)

    output_file = v2avi_args.getoption("output_file")

    setup = dict(
        nsxv_ip=file_attribute["nsxv_ip"],
        nsxv_user=file_attribute["nsxv_user"],
        nsxv_password=file_attribute["nsxv_password"],
        nsxv_port=file_attribute["nsxv_port"],
        t_host=file_attribute["nsxt_ip"],
        t_user=file_attribute["nsxt_user"],
        t_pw=file_attribute["nsxt_password"],
        t_port=443,
        ssh_root_password=file_attribute["ssh_root_password"],
        controller_ip=file_attribute["controller_ip"],
        user=file_attribute["controller_user"],
        password=file_attribute["controller_password"],
        controller_version=file_attribute["controller_version"],
        output_file_path=output_file,
        prefix="test-v",
        tenant=file_attribute["tenant"],
        not_in_use=False,
        object_merge_check=False,
        option="auto-upload",
        exported_config_path=exported_config_path,
        byot_dict=byot_path,
    )

    if not os.path.exists(setup.get("output_file_path")):
        os.mkdir(setup.get("output_file_path"))

    return setup


@pytest.fixture(scope="module")
def api(get_args):
    v2avi_args = get_args

    config_file = v2avi_args.getoption("config_file")
    with open(config_file) as f:
        file_attribute = yaml.load(f, Loader=yaml.Loader)

    api = ApiSession.get_session(
        username=file_attribute["controller_user"],
        controller_ip=file_attribute["controller_ip"],
        password=file_attribute["controller_password"],
        api_version=file_attribute["controller_version"],
        verify=False,
    )
    return api


@pytest.fixture(scope="module")
def init_logger_path(get_args):
    v2avi_args = get_args

    output_file_path = v2avi_args.getoption("output_file")
    LOG.setLevel(logging.DEBUG)
    print("Log File Location: %s" % output_file_path)
    formatter = "[%(asctime)s] %(levelname)s [%(funcName)s:%(lineno)d] %(message)s"
    logging.basicConfig(
        filename=os.path.join(output_file_path, "/v2alb_conversion.log"),
        level=logging.DEBUG,
        format=formatter,
    )


def get_converted_output_file(output_file):
    return f"{output_file}/config-output/avi_config.json"


def get_controller_license_type(api):
    """
    Returns AVI controller license type.
    """
    LOG.debug("__INIT__ Inside executing get_controller_license_type")
    # session = get_session(setup)
    response = api.get("systemconfiguration")
    config = json.loads(response.text)
    LOG.info(f"ALB Plugin : Licence Config : {config}")
    licence_type = None
    if "default_license_tier" in config:
        licence_type = config["default_license_tier"]
    LOG.info(f"ALB Plugin : Licence Type : {licence_type}")
    LOG.debug("__DONE__Executing get_controller_license_type is completed")
    return licence_type


def verify(condition, err_message):
    """
    :param condition: Condition to applya assert on it
    :param err_message: Error message if assert fails
    :return:
    """
    try:
        assert condition
    except AssertionError:
        LOG.error(err_message)
        sys.exit(err_message)


def Nsxv_conv(
    nsxv_ip=None,
    nsxv_user=None,
    nsxv_password=None,
    nsxv_port=None,
    prefix=None,
    controller_ip=None,
    user=None,
    password=None,
    tenant="admin",
    t_host=None,
    t_user=None,
    t_pw=None,
    t_port=443,
    controller_version=None,
    output_file_path=None,
    option=None,
    ssh_root_password=None,
    object_merge_check=False,
    exported_config_path=None,
    byot_dict=None,
    vs_filter=None,
    vs_level_status=None,
    not_in_use=False,
):

    args = Namespace(
        nsxv_ip=nsxv_ip,
        nsxv_user=nsxv_user,
        nsxv_password=nsxv_password,
        nsxv_port=nsxv_port,
        prefix=prefix,
        alb_controller_ip=controller_ip,
        alb_controller_user=user,
        alb_controller_password=password,
        alb_controller_tenant=tenant,
        t_host=t_host,
        t_user=t_user,
        t_pass=t_pw,
        t_port=t_port,
        alb_controller_version=controller_version,
        output_file_path=output_file_path,
        option=option,
        ssh_root_password=ssh_root_password,
        object_merge=object_merge_check,
        exported_config_path=exported_config_path,
        byot=byot_dict,
        vs_filter=vs_filter,
        vs_level_status=vs_level_status,
        not_in_use=not_in_use,
    )
    nsxv_converter = NsxvConverter(args)
    nsxv_converter.convert_vlb_config(args)


class Namespace:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


class TestV2AVIConverter:

    ORPHAN_POOL = "edge-test-orphan_pool"
    POOL_WITH_HTTP_HEADER_ALGO = "edge-test-pool_with_httpheader_algo"
    POOL_CONFIGURED_WITH_TRANSPARENT_MODE = "edge-test-pool_configured_with_transparent"
    CMD_APP_PROFILE = "edge-test-app_profile_with_xff-cmd"
    MSSQL_MONITOR = "edge-test-mssql_monitor"
    POOL_WITHOUT_HM = "edge-test-pool_without_hm"
    APP_PROF_WITH_SSLPASSTHROUGH_ENABLE = (
        "edge-test-https_ssl_pass_through_enable_src_ip"
    )
    HTTP_APP_PROF_WITH_SSL_PASSTHROUGH_DISABLED = (
        "edge-test-http_app_pr_with_sslpassthrough_disabled"
    )
    TCP_APP_PROF_SOURCE_IP = "edge-test-tcp_src_ip"
    HTTPS_PROF_WITH_SERVER_SSL = "edge-test-https_app_with_server_ssl"
    HTTPS_WITH_SERVER_AUTH = "edge-test-app_with_server_auth"
    HTTPS_HM = "edge-test-https1"
    HTTP_HM = "edge-test-http1"
    TCP_HM = "edge-test-tcp1"
    HTTPS_POOL = "edge-test-pool-https"
    HTTPS_APP_PROFILE_WITH_CLIENT_SSL = "edge-test-https_with_client_ssl"

    VS_WITH_TCP_AND_ACCELERATION = "edge-test-vs-tcp-with-acceleration"
    VS_WITH_UDP_AND_ACCELERATION = "edge-test-vs-udp-with-acceleration"
    VS_WITH_HTTP_AND_ACCELERATION_DISABLED = (
        "edge-test-vs-http-with-acceleration-disabled"
    )

    VS_HTTPS_SSL_PASSTHROUGH = "edge-test-vs-https-with-ssl-passthrough"
    VS_HTTPS_WITH_CLIENT_AND_SERVER_SSL_ENABLED = (
        "edge-test-vs-https-with-client-and-server-ssl-enabled"
    )
    VS_HTTPS_WITH_SSL_PASSTHROUGH_ACCELERATION_AND_CLIENT_SSL = (
        "edge-test-vs-https-with-ssl-passthrough-acceleration-and-client-ssl"
    )
    APP_WITH_CLIENT_AUTH_REQUIRED = "edge-test-app_with_client_auth_required"
    APP_CLIENT_SSL_WITH_AUTH_IGNORE = "edge-test-https_with_client_ssl"
    VS_WITH_CONNECTION_RATE_LIMIT = "edge-test-vs-connection-rate-limit"
    VS_WITH_PORT_RANGE = "edge-test-vs-with-port-range"
    VS_WITH_IP_ADDRESS = "edge-test-vs-with-ip-address"
    VS_WITH_APPLICATION_RULE = "edge-test-vs-with-application-rule"
    VS_WITH_POOL_HAVING_NSGROUP = "edge-test-vs-with-pool-having-nsgroup"

    def test_upload_vs_on_the_controller(self, setup):
        set_update_count()
        Nsxv_conv(
            controller_ip=setup.get("controller_ip"),
            user=setup.get("user"),
            password=setup.get("password"),
            tenant=setup.get("tenant"),
            t_host=setup.get("t_host"),
            t_user=setup.get("t_user"),
            t_pw=setup.get("t_pw"),
            t_port=setup.get("t_port"),
            controller_version=setup.get("controller_version"),
            output_file_path=setup.get("output_file_path"),
            option="auto-upload",
            ssh_root_password=setup.get("ssh_root_password"),
            object_merge_check=setup.get("object_merge_check"),
            exported_config_path=setup.get("exported_config_path"),
            byot_dict=setup.get("byot_dict"),
            not_in_use=setup.get("not_in_use"),
        )

        assert get_count("error") == 0

    def test_pool_config(self, api):
        """
        Validate pool configuration
        """

        pool_name = self.HTTPS_POOL
        resp = api.get("pool?name=%s" % (pool_name))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        avi_pool_config = resp.json().get("results")[0]

        assert avi_pool_config.get(
            "lb_algorithm") == "LB_ALGORITHM_ROUND_ROBIN"
        assert avi_pool_config.get(
            "max_concurrent_connections_per_server") == 100

        assert avi_pool_config.get("health_monitor_refs")
        # validate count of health monitor should be one only
        assert len(avi_pool_config.get("health_monitor_refs")) == 1

        assert avi_pool_config.get(
            "servers")[0]["ip"]["addr"] == "192.168.100.10"
        assert avi_pool_config.get("servers")[0]["enabled"]
        assert avi_pool_config.get("servers")[0]["port"] == 443
        LOG.info("%s is migrated successfully" % pool_name)

    def test_pool_without_healthmonitor_object(self, api):

        # Pool Without HealthMonitor object

        resp = api.get("pool?name=%s" % (self.POOL_WITHOUT_HM))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        avi_pool_config = resp.json().get("results")[0]
        LOG.info(f"{self.POOL_WITHOUT_HM} data  {avi_pool_config}")
        assert not avi_pool_config.get("health_monitor_paths")
        assert avi_pool_config.get(
            "lb_algorithm") == "LB_ALGORITHM_ROUND_ROBIN"

        LOG.info("%s is migrated successfully", self.POOL_WITHOUT_HM)

    def test_pool_configured_with_transparent_mode(self, setup):

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_pool_config = mig_config.get("Pool")
        conv_profile_config = mig_config.get("ApplicationProfile")

        pool_obj = [
            pool
            for pool in conv_pool_config
            if pool.get("name") == self.POOL_CONFIGURED_WITH_TRANSPARENT_MODE
        ]
        app_obj = [
            app
            for app in conv_profile_config
            if app.get("name") == self.CMD_APP_PROFILE
        ]

        assert pool_obj
        assert app_obj

        app_obj = app_obj[0]

        assert app_obj.get("type") == "APPLICATION_PROFILE_TYPE_HTTP"
        assert app_obj.get("http_profile")
        assert app_obj["http_profile"].get(
            "connection_multiplexing_enabled") == False

        assert app_obj.get("preserve_client_ip") == True

    def test_pool_configured_with_algo_http_header(self, api):
        """
        Validate that pool is set with lb_algorithm_consistent_hash_hdr field .
        """

        resp = api.get("pool?name=%s" % (self.POOL_WITH_HTTP_HEADER_ALGO))

        avi_lincense = get_controller_license_type(api)
        if avi_lincense == "ENTERPRISE":

            verify(
                resp.json()["count"] == 1,
                f"Expected count is 1 got {resp.json()['count']}",
            )
            verify(
                resp.status_code == 200,
                f"Expected status code is 200 got {resp.status_code}",
            )

            avi_pool_config = resp.json().get("results")[0]

            assert avi_pool_config.get(
                "lb_algorithm") == "LB_ALGORITHM_CONSISTENT_HASH"
            assert (
                avi_pool_config.get("lb_algorithm_hash")
                == "LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_HEADER"
            )
            assert (
                avi_pool_config.get(
                    "lb_algorithm_consistent_hash_hdr") == "testheader"
            )

        else:
            # Algo http header not supported in basic license tier
            verify(
                resp.json()["count"] == 0,
                f"Expected count is 0 got {resp.json()['count']}",
            )
            verify(
                resp.status_code == 200,
                f"Expected status code is 200 got {resp.status_code}",
            )

    def test_orphan_pool_object(self, api):

        # Orphan pool object should not be migrate
        resp = api.get("pool?name=%s" % (self.ORPHAN_POOL))
        verify(
            resp.json()[
                "count"] == 0, f"Expected count is 0 got {resp.json()['count']}"
        )

    def test_pool_configured_with_both_member_ip_and_group(self, api):

        pool_name = "edge-test-pool-31"
        resp = api.get("pool?name=%s" % (pool_name))
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        pool_response = resp.json().get("results")[0]
        assert pool_response
        assert pool_response.get("nsx_securitygroup")
        assert "/infra/domains/default/groups/pool-1" in pool_response.get(
            "nsx_securitygroup"
        )

    def test_https_hm_config(self, setup):
        """
        Validate https heath monitor configuration
        """

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_hm = mig_config.get("HealthMonitor")
        hm_config = [hm for hm in conv_hm if hm.get("name") == self.HTTPS_HM]

        assert hm_config
        hm_config = hm_config[0]

        LOG.info(f" {self.HTTPS_HM} dat {hm_config}  ")

        assert hm_config.get("type") == "HEALTH_MONITOR_HTTPS"
        assert hm_config.get("send_interval") == 5
        assert hm_config.get("receive_timeout") == 5
        assert (hm_config.get("https_monitor")).get("http_request") == "GET /"
        assert hm_config.get("failed_checks") == 3
        assert (hm_config.get("https_monitor")).get("ssl_attributes")
        assert ((hm_config.get("https_monitor")).get("ssl_attributes")).get(
            "ssl_profile_ref"
        ) == "/api/sslprofile/?tenant=admin&name=System-Standard"
        LOG.info(
            "Health Monitor %s"
            " of Type HTTPS is migrates successfully" % self.HTTPS_HM
        )

    def test_http_hm_config(self, api):
        """
        Validate http health monitor configuration
        """

        resp = api.get("healthmonitor?name=%s" % (self.HTTP_HM))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        hm_config = resp.json().get("results")[0]

        assert hm_config.get("type") == "HEALTH_MONITOR_HTTP"
        assert hm_config.get("send_interval") == 5
        assert hm_config.get("receive_timeout") == 5
        assert hm_config.get("failed_checks") == 3

        LOG.info(
            "Health Monitor %s "
            " of Type HTTPS is migrates successfully" % self.HTTP_HM
        )

    def test_tcp_hm_config(self, api):
        """
        Validate tcp health monitor configuration
        """
        obj_name = self.TCP_HM
        resp = api.get("healthmonitor?name=%s" % (obj_name))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        tcp_hm_config = resp.json().get("results")[0]

        LOG.info("Health Monitor of Type TCP " "data {}".format(tcp_hm_config))

        assert tcp_hm_config.get("type") == "HEALTH_MONITOR_TCP"
        LOG.info(
            "Health Monitor %s  " "of Type TCP is migrates successfully" % obj_name
        )

    def test_mssql_monitor(self, api):
        # tool will skip mssql monitor as it is not supported by avi
        resp = api.get("healthmonitor?name=%s" % (self.MSSQL_MONITOR))
        verify(
            resp.json()[
                "count"] == 0, f"Expected count is 0 got {resp.json()['count']}"
        )

    # def test_ldap_monitor(self):
    #     # tool will skip ldap  monitor as it is not supported by avi
    #     assert True

    def test_http_app_profile_with_sslPassthrough_enabled(self, api):

        # Application profile HTTPS having sslPassthrough == True
        resp = api.get(
            "applicationprofile?name=%s" % (
                self.APP_PROF_WITH_SSLPASSTHROUGH_ENABLE)
        )
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        app_config = resp.json().get("results")[0]

        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_L4"

    def test_http_and_https_profile_without_sslPassthrough(self, setup):

        https_prof_name = "edge-test-app_profile_with_xff"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_app_prof = mig_config.get("ApplicationProfile")
        http_app_obj = [
            prof
            for prof in conv_app_prof
            if prof.get("name") == self.HTTP_APP_PROF_WITH_SSL_PASSTHROUGH_DISABLED
        ]
        https_app_obj = [
            prof for prof in conv_app_prof if prof.get("name") == https_prof_name
        ]

        assert http_app_obj
        assert https_app_obj

        assert https_app_obj[0].get("type") == "APPLICATION_PROFILE_TYPE_HTTP"
        assert http_app_obj[0].get("type") == "APPLICATION_PROFILE_TYPE_HTTP"

    def test_tcp_app_profile_with_source_ip_persistence(self, api):

        # Application profile having type is TCP and persistence
        # profile as source IP

        LOG.info(f"validating {self.TCP_APP_PROF_SOURCE_IP}")
        resp = api.get("applicationprofile?name=%s" %
                       (self.TCP_APP_PROF_SOURCE_IP))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        app_config = resp.json().get("results")[0]

        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_L4"

        LOG.info(f"{self.TCP_APP_PROF_SOURCE_IP} data {app_config}")

        LOG.info(f"{self.TCP_APP_PROF_SOURCE_IP} is migrated successfully")

        # Respective persistence profile of type client IP address

        persis_prof = f"{self.TCP_APP_PROF_SOURCE_IP}-persistence-profile"
        resp = api.get("applicationpersistenceprofile?name=%s" % (persis_prof))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        persis_config = resp.json().get("results")[0]

        LOG.info(f"{persis_prof} data {persis_config}")
        assert (
            persis_config.get("persistence_type")
            == "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS"
        )

        LOG.info(f"{persis_prof} is " "migrated successfully")

    def test_http_app_profile_with_server_ssl(self, setup):
        """
        validate http app profile configured with server ssl
        """

        LOG.info(f"validating {self.HTTPS_PROF_WITH_SERVER_SSL}")

        ssl_prof_name = f"{self.HTTPS_PROF_WITH_SERVER_SSL}-server-ssl-profile"

        pool_obj_name = "edge-test-pool_without_hm"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_ssl = mig_config.get("SSLProfile")
        ssl_obj = [ssl for ssl in conv_ssl if ssl.get("name") == ssl_prof_name]

        assert ssl_obj

        conv_pools = mig_config.get("Pool")
        pool_obj = [pool for pool in conv_pools if pool.get(
            "name") == pool_obj_name]

        assert pool_obj
        pool_obj = pool_obj[0]

        assert (
            pool_obj["ssl_profile_ref"]
            == f"/api/sslprofile/?tenant=admin&name={ssl_prof_name}"
        )

    def test_http_app_profile_with_client_ssl(self, setup):
        """
        Validate that ssl profile object should get created in avi
        and ssl profile ref should be set in referenced virtual service .
        """

        ssl_prof_name = "edge-test-https_with_client_ssl-client-ssl-profile"

        vs_obj_name = "edge-test-vs_with_client_ssl_prof"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_ssl = mig_config.get("SSLProfile")
        ssl_obj = [ssl for ssl in conv_ssl if ssl.get("name") == ssl_prof_name]

        assert ssl_obj

        conv_vs = mig_config.get("VirtualService")
        vs_obj = [vs for vs in conv_vs if vs.get("name") == vs_obj_name]

        assert vs_obj
        vs_obj = vs_obj[0]

        assert (
            vs_obj["ssl_profile_ref"]
            == "/api/sslprofile/?tenant=admin&name=%s" % ssl_prof_name
        )

    def test_app_with_client_auth_required(self, setup):
        """
        Validate that pki profile object should get created in avi
        and pki profile ref should be set in  application profile
        with ssl_client_certificate_mode set .
        """

        pki_obj_name = f"{self.APP_WITH_CLIENT_AUTH_REQUIRED}-pki-profile"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_pki = mig_config.get("PKIProfile")
        pki_obj = [pki for pki in conv_pki if pki.get("name") == pki_obj_name]

        assert pki_obj

        conv_app = mig_config.get("ApplicationProfile")
        app_obj = [
            app
            for app in conv_app
            if app.get("name") == self.APP_WITH_CLIENT_AUTH_REQUIRED
        ]

        assert app_obj

        assert (
            app_obj[0]["http_profile"].get("ssl_client_certificate_mode")
            == "SSL_CLIENT_CERTIFICATE_REQUIRE"
        )
        assert (
            app_obj[0]["http_profile"].get("pki_profile_ref")
            == "/api/pkiprofile/?tenant=admin&name=edge-test-app_with_client_auth_required-pki-profile"
        )

    def test_app_pr_with_client_ssl_configured_with_service_cert(self, setup):
        """
        Validate that ssl_key_and_certificate_ref is set in referenced virtual service in avi.
        """
        client_ssl_name = "edge-test-https_with_client_ssl-client-ssl-profile"
        vs_name = "edge-test-vs_with_client_ssl_prof"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_vs = mig_config.get("VirtualService")
        vs_obj = [vs for vs in conv_vs if vs.get("name") == vs_name]

        assert vs_obj

        assert vs_obj[0].get("ssl_key_and_certificate_refs")

        assert (
            vs_obj[0].get("ssl_profile_ref")
            == f"/api/sslprofile/?tenant=admin&name={client_ssl_name}"
        )

    def test_client_ssl_configured_with_ca_certificate(self, api, setup):
        """
        Validate that pki profile should get created with attached ca crl certs in avi
        and pki profile reference should be attached to application profile  resource in avi.
        """

        pki_name = f"{self.APP_WITH_CLIENT_AUTH_REQUIRED}-pki-profile"
        resp = api.get("pkiprofile?name=%s" % (pki_name))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_pkis = mig_config.get("PKIProfile")
        pki_obj = [pki for pki in conv_pkis if pki.get("name") == pki_name]

        assert pki_obj

        assert pki_obj[0].get("ca_certs")

        conv_apps = mig_config.get("ApplicationProfile")
        app_obj = [
            app
            for app in conv_apps
            if app.get("name") == self.APP_WITH_CLIENT_AUTH_REQUIRED
        ]

        assert app_obj
        assert app_obj[0].get("http_profile")
        assert (
            app_obj[0]["http_profile"].get("pki_profile_ref")
            == f"/api/pkiprofile/?tenant=admin&name={pki_name}"
        )

    def test_client_ssl_configured_client_auth_ignore(self, setup):
        """
        Application  profile  resource in avi with ssl_client_certificate_mode as SSL_CLIENT_CERTIFICATE_NONE
        """

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_apps = mig_config.get("ApplicationProfile")
        app_obj = [
            app
            for app in conv_apps
            if app.get("name") == self.APP_CLIENT_SSL_WITH_AUTH_IGNORE
        ]

        assert app_obj
        assert app_obj[0].get("http_profile")
        assert (
            app_obj[0]["http_profile"].get("ssl_client_certificate_mode")
            == "SSL_CLIENT_CERTIFICATE_NONE"
        )

    def test_app_pr_with_server_ssl_configured_with_service_cert(self, setup):
        """
        Validate that ssl_key_and_certificate_ref is set in referenced pool in avi.
        """
        server_ssl_name = f"{self.HTTPS_PROF_WITH_SERVER_SSL}-server-ssl-profile"
        pool_name = "edge-test-pool_without_hm"

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_pools = mig_config.get("Pool")
        pool_obj = [pool for pool in conv_pools if pool.get(
            "name") == pool_name]

        assert pool_obj

        assert pool_obj[0].get("ssl_key_and_certificate_refs")

        assert (
            pool_obj[0].get("ssl_profile_ref")
            == f"/api/sslprofile/?tenant=admin&name={server_ssl_name}"
        )

    def test_server_ssl_configured_with_ca_certificate(self, api, setup):
        """
        Validate that pki profile should get created with attached ca crl certs in avi
        and pki profile reference should be attached to pool resource in avi.
        """

        pki_name = f"{self.HTTPS_WITH_SERVER_AUTH}-pki-profile"
        resp = api.get("pkiprofile?name=%s" % (pki_name))
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )

        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        conv_pkis = mig_config.get("PKIProfile")
        pki_obj = [pki for pki in conv_pkis if pki.get("name") == pki_name]

        assert pki_obj

        assert pki_obj[0].get("ca_certs")

        pool_name = "edge-test-pool_attached_with_vs_serverssl_app"
        conv_pools = mig_config.get("Pool")
        pool_obj = [pool for pool in conv_pools if pool.get(
            "name") == pool_name]

        assert pool_obj
        assert (
            pool_obj[0].get("pki_profile_ref")
            == f"/api/pkiprofile/?tenant=admin&name={pki_name}"
        )

    def test_max_object_length(self, setup):
        converted_output_file = get_converted_output_file(
            setup.get("output_file_path"))
        with open(converted_output_file) as json_file:
            mig_config = json.load(json_file)

        for key in mig_config:
            for obj in mig_config[key]:
                print(obj.get("name"))
                assert len(obj.get("name")) <= 255

    def test_verify_vs_with_tcp_protocol_and_acceleration(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_WITH_TCP_AND_ACCELERATION)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert (
            vs_obj
        ), f"Virtual Object not found for vs {self.VS_WITH_TCP_AND_ACCELERATION}"

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]

        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-tcp-31"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_L4"

        network_profile_ref = vs_obj["network_profile_ref"]
        assert (
            network_profile_ref is not None
        ), "Expected network_profile_ref value not set"
        network_profile_ref_url = network_profile_ref.split("/api/")[-1]

        network_profile_resp = api.get(network_profile_ref_url)
        network_prof_config = network_profile_resp.json()
        verify(
            network_prof_config is not None,
            "network profile is set to None which is not expected",
        )
        assert (
            network_prof_config.get("profile").get("type")
            == "PROTOCOL_TYPE_TCP_FAST_PATH"
        ), (
            f"Expected network profile not set. "
            f"Expected: PROTOCOL_TYPE_TCP_FAST_PATH, "
            f"got {network_prof_config.get('profile').get('type')}"
        )

    def test_verify_vs_with_udp_protocol_and_acceleration_disabled(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_WITH_UDP_AND_ACCELERATION)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert (
            vs_obj
        ), f"Virtual Object not found for vs {self.VS_WITH_UDP_AND_ACCELERATION}"

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]
        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-udp-32"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_L4"

        network_profile_ref = vs_obj["network_profile_ref"]
        assert (
            network_profile_ref is not None
        ), "Expected network_profile_ref value not set"
        network_profile_ref_url = network_profile_ref.split("/api/")[-1]

        network_profile_resp = api.get(network_profile_ref_url)
        network_prof_config = network_profile_resp.json()
        verify(
            network_prof_config is not None,
            "network profile is set to None which is not expected",
        )
        assert (
            network_prof_config.get("profile").get("type")
            == "PROTOCOL_TYPE_UDP_FAST_PATH"
        ), (
            f"Expected network profile not set. "
            f"Expected: PROTOCOL_TYPE_UDP_FAST_PATH, "
            f"got {network_prof_config.get('profile').get('type')}"
        )

    def test_verify_vs_with_http_protocol_and_acceleration_disabled(self, api):
        resp = api.get(
            "virtualservice?name=%s" % self.VS_WITH_HTTP_AND_ACCELERATION_DISABLED
        )
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert vs_obj

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]
        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-http-33"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_HTTP"

    def test_verify_vs_with_https_and_ssl_passthrough_enabled(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_HTTPS_SSL_PASSTHROUGH)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert vs_obj

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]

        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-http-34"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_L4"

        network_profile_ref = vs_obj["network_profile_ref"]
        assert (
            network_profile_ref is not None
        ), "Expected network_profile_ref value not set"
        network_profile_ref_url = network_profile_ref.split("/api/")[-1]

        network_profile_resp = api.get(network_profile_ref_url)
        network_prof_config = network_profile_resp.json()
        verify(
            network_prof_config is not None,
            "network profile is set to None which is not expected",
        )
        assert (
            network_prof_config.get("profile").get(
                "type") == "PROTOCOL_TYPE_TCP_PROXY"
        ), (
            f"Expected network profile not set. "
            f"Expected: PROTOCOL_TYPE_TCP_PROXY, "
            f"got {network_prof_config.get('profile').get('type')}"
        )

    def test_verify_vs_with_client_and_server_ssl_enabled(self, api):
        resp = api.get(
            "virtualservice?name=%s" % self.VS_HTTPS_WITH_CLIENT_AND_SERVER_SSL_ENABLED
        )
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert vs_obj

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]

        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-http-35"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_HTTP"

        network_profile_ref = vs_obj["network_profile_ref"]
        assert (
            network_profile_ref is not None
        ), "Expected network_profile_ref value not set"
        network_profile_ref_url = network_profile_ref.split("/api/")[-1]

        network_profile_resp = api.get(network_profile_ref_url)
        network_prof_config = network_profile_resp.json()
        verify(
            network_prof_config is not None,
            "network profile is set to None which is not expected",
        )
        assert (
            network_prof_config.get("profile").get(
                "type") == "PROTOCOL_TYPE_TCP_PROXY"
        ), (
            f"Expected network profile not set. "
            f"Expected: PROTOCOL_TYPE_TCP_PROXY, "
            f"got {network_prof_config.get('profile').get('type')}"
        )

    def test_verify_vs_with_ssl_passthrough_and_acceleration_and_client_ssl_enabled(
        self, api
    ):
        resp = api.get(
            "virtualservice?name=%s"
            % self.VS_HTTPS_WITH_SSL_PASSTHROUGH_ACCELERATION_AND_CLIENT_SSL
        )
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_obj = resp.json().get("results")[0]
        assert vs_obj

        application_profile_ref = vs_obj["application_profile_ref"]
        assert (
            application_profile_ref is not None
        ), "Expected application_profile_ref value not set"
        application_profile_ref_url = application_profile_ref.split(
            "/api/")[-1]

        resp = api.get(application_profile_ref_url)
        verify(resp.json() is not None,
               f"Expected count is 1 got {resp.json()}")
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        app_config = resp.json()
        assert (
            app_config is not None
        ), "Application profile is set to None which is not expected"
        assert app_config.get("name") == "edge-test-app-http-36"
        assert app_config.get("type") == "APPLICATION_PROFILE_TYPE_HTTP"

        network_profile_ref = vs_obj["network_profile_ref"]
        assert (
            network_profile_ref is not None
        ), "Expected network_profile_ref value not set"
        network_profile_ref_url = network_profile_ref.split("/api/")[-1]

        network_profile_resp = api.get(network_profile_ref_url)
        network_prof_config = network_profile_resp.json()
        verify(
            network_prof_config is not None,
            "network profile is set to None which is not expected",
        )
        assert (
            network_prof_config.get("profile").get(
                "type") == "PROTOCOL_TYPE_TCP_PROXY"
        ), (
            f"Expected network profile not set. "
            f"Expected: PROTOCOL_TYPE_TCP_PROXY, "
            f"got {network_prof_config.get('profile').get('type')}"
        )

    def test_vs_with_connection_rate_limit(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_WITH_CONNECTION_RATE_LIMIT)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        response = resp.json()["results"][0]
        """
        e.g rate profile
        connections_rate_limit = {
            "rate_limiter": {
                "count": conn_rate_limit,
                "period": 1
            },
            "action": {
                "type": "RL_ACTION_DROP_CONN"
            }
        }
        """
        rate_limiter_count = int(
            response["connections_rate_limit"]["rate_limiter"]["count"]
        )
        verify(
            rate_limiter_count == 123,
            f"Expected connection rate limit not set. Expected 100 but found {rate_limiter_count}",
        )

        rate_limit_action = response["connections_rate_limit"]["action"]["type"]
        verify(
            rate_limit_action == "RL_ACTION_DROP_CONN",
            f"Expected connection rate limit not set. Expected RL_ACTION_DROP_CONN but found {rate_limit_action}",
        )

    def test_vs_with_port_range(self, api):
        resp = api.get("virtualservice?name=%s" % self.VS_WITH_PORT_RANGE)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        response = resp.json()["results"][0]
        """
        e.g port range
        "services": [
            {
            "enable_ssl": false,
            "port_range_end": 8080,
            "port": 8080
            }
        ]
        """

        port1 = int(response["services"][0]["port"])
        port2 = int(response["services"][1]["port"])
        port2_range = int(response["services"][1]["port_range_end"])
        verify(port1 == 9000,
               f"Expected port not set. Expected 9000 but found {port1}")
        verify(port2 == 9010,
               f"Expected port not set. Expected 9010 but found {port2}")
        verify(
            port2_range == 9020,
            f"Expected port range not set. Expected 9020 but found {port2_range}",
        )

    def test_vs_ip_address(self, api):
        resp = api.get("virtualservice?name=%s" % self.VS_WITH_IP_ADDRESS)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_response = resp.json()["results"][0]
        assert vs_response

        vs_vip_ref = vs_response["vsvip_ref"]
        assert vs_vip_ref is not None, "Expected vsvip value not set"
        vs_vip_ref_url = vs_vip_ref.split("/api/")[-1]

        resp = api.get(vs_vip_ref_url)
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vip_response = resp.json()
        print(vip_response)
        assert vip_response
        """
        e.g vip profile
        "vip": [{
            "ip_address": {
            "addr": "<>",
            "type": "<>"
            }
        }]
        """

        ip_address = vip_response["vip"][0]["ip_address"]["addr"]
        ip_type = vip_response["vip"][0]["ip_address"]["type"]
        verify(
            ip_address == "10.176.64.159",
            f"Expected ipAddress not set. "
            f"Expected 10.176.64.159 but found {ip_address}",
        )
        verify(
            ip_type == "V4",
            f"Expected ipAddress type not set. Expected V4 but found {ip_type}",
        )

    def test_vs_with_application_rule_configured(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_WITH_APPLICATION_RULE)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_response = resp.json()["results"][0]
        assert vs_response

    def test_vs_with_pool_and_ns_group(self, api):
        resp = api.get("virtualservice?name=%s" %
                       self.VS_WITH_POOL_HAVING_NSGROUP)
        verify(
            resp.json()[
                "count"] == 1, f"Expected count is 1 got {resp.json()['count']}"
        )
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        vs_response = resp.json()["results"][0]
        assert vs_response

        pool_ref = vs_response["pool_ref"]
        assert pool_ref is not None, "Expected pool ref value not set"
        pool_ref_url = pool_ref.split("/api/")[-1]
        resp = api.get(pool_ref_url)
        verify(
            resp.status_code == 200,
            f"Expected status code is 200 got {resp.status_code}",
        )
        pool_response = resp.json()
        assert pool_response
        assert "/infra/domains/default/groups/pool-1" in pool_response.get(
            "nsx_securitygroup"
        )
