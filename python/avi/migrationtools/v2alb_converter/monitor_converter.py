import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.v2alb_converter.conversion_util import NsxvConvUtil
from avi.migrationtools.avi_migration_utils import update_count

conv_utils = NsxvConvUtil()
common_mig_util = MigrationUtil()
LOG = logging.getLogger(__name__)

MONITOR_ID_NAME_MAPS = {}


class MonitorConfigConv:

    BASE_URL = "/api/healthmonitor/"

    def __init__(
        self,
        nsxv_monitor_attributes,
        object_merge_check,
        merge_object_mapping,
        sys_dict,
    ):
        """
        inint of monitor converter
        """
        self.SUPPORTED_MONITOR_TYPE_DICT = {
            "http": "HEALTH_MONITOR_HTTP",
            "https": "HEALTH_MONITOR_HTTPS",
            "tcp": "HEALTH_MONITOR_TCP",
            "udp": "HEALTH_MONITOR_UDP",
            "icmp": "HEALTH_MONITOR_PING",
        }
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.monitor_count = 0
        self.supported_attributes = nsxv_monitor_attributes[
            "Monitor_Supported_Attributes"
        ]
        self.http_attr = nsxv_monitor_attributes["Monitor_http_attr"]
        self.https_attr = nsxv_monitor_attributes["Monitor_https_attr"]
        self.tcp_attr = nsxv_monitor_attributes["Monitor_tcp_attr"]
        self.udp_attr = nsxv_monitor_attributes["Monitor_udp_attr"]
        self.ping_attr = nsxv_monitor_attributes["Monitor_ping_attr"]

    def convert(self, avi_config_dict, vedge_lb_config, prefix, tenant):
        avi_config_dict["HealthMonitor"] = list()
        progressbar_count = 0
        total_obj_count = conv_utils.get_total_objects_count_in_v(
            vedge_lb_config, "monitor"
        )

        print("\nConverting Monitor ...")
        LOG.info("[MONITOR] Converting Profiles...")
        converted_objs = []
        for edge_name, edge_config in vedge_lb_config.items():
            if not edge_config.get("monitor") or len(edge_config.get("monitor")) == 0:
                LOG.warning(
                    f"EDGE {edge_name} does not contain health monitors ")
                continue

            monitor_config = edge_config.get("monitor")
            MONITOR_ID_NAME_MAPS[edge_name] = {}
            for v_hm in monitor_config:
                try:
                    progressbar_count += 1
                    msg = "Health Monitor conversion started..."
                    hm_name = v_hm.get("name")
                    LOG.info('[MONITOR] Migration started for HM {}'.format(hm_name))
                    hm_id = v_hm.get("monitorId")
                    name = f"{edge_name}-{hm_name}"

                    monitor_type = v_hm.get("type")
                    skipped = [
                        key for key in v_hm.keys() if key not in self.supported_attributes
                    ]
                    na_list = []
                    indirect = []
                    u_ignore = []
                    if prefix:
                        name = f"{prefix}-{name}"
                    MONITOR_ID_NAME_MAPS[edge_name][hm_id] = name
                    # Receive timeout should be <= send interval
                    send_interval = int(v_hm.get("interval"))
                    receive_timeout = int(v_hm.get("timeout"))
                    if receive_timeout > send_interval:
                        receive_timeout = send_interval

                    alb_hm = dict(
                        name=name,
                        failed_checks=v_hm.get("maxRetries"),
                        send_interval=send_interval,
                        receive_timeout=receive_timeout,
                        successful_checks=v_hm.get("rise_count", 1),
                        type=self.SUPPORTED_MONITOR_TYPE_DICT.get(monitor_type),
                    )
                    alb_hm["tenant_ref"] = conv_utils.get_object_ref(
                        tenant, "tenant")
                    LOG.debug('[MONITOR] Monitor type {}'.format(monitor_type))
                    if monitor_type == "http":
                        self.convert_http(v_hm, alb_hm, skipped)
                    elif monitor_type == "https":
                        self.convert_https(v_hm, alb_hm, skipped)
                    elif monitor_type == "icmp":
                        self.convert_icmp(v_hm, alb_hm, skipped)
                    elif monitor_type == "tcp":
                        self.convert_tcp(v_hm, alb_hm, skipped)
                    elif monitor_type == "udp":
                        self.convert_udp(v_hm, alb_hm, skipped)
                    else:
                        skip_mesg = "Monitor SKIPPED: {} {} Reason : mssql and ldap are not supported ".format(
                            edge_name,
                            hm_name,
                        )
                        LOG.warning(skip_mesg)
                        conv_utils.add_status_row(
                            "monitor", monitor_type, hm_name, "SKIPPED", skip_mesg
                        )
                        conv_utils.print_progress_bar(
                            progressbar_count,
                            total_obj_count,
                            msg,
                            prefix="Progress",
                            suffix="",
                        )
                        continue

                    conv_status = conv_utils.get_conv_status(
                        [], indirect, {}, monitor_config, u_ignore, na_list
                    )
                    if self.object_merge_check:
                        LOG.info('[MONITOR] Checking for duplicates objects {}'.format(hm_name))
                        common_mig_util.update_skip_duplicates(
                            alb_hm,
                            avi_config_dict["HealthMonitor"],
                            "health_monitor",
                            converted_objs,
                            name,
                            None,
                            self.merge_object_mapping,
                            monitor_type,
                            prefix,
                            self.sys_dict["HealthMonitor"],
                        )
                        self.monitor_count += 1

                    else:
                        avi_config_dict["HealthMonitor"].append(alb_hm)

                    conv_utils.add_conv_status(
                        "monitor",
                        monitor_type,
                        v_hm.get("name"),
                        conv_status,
                        [{"health_monitor": alb_hm}],
                    )
                    LOG.info('[MONITOR] Conversion status  {}'.format(conv_status))
                    conv_utils.print_progress_bar(
                        progressbar_count,
                        total_obj_count,
                        msg,
                        prefix="Progress",
                        suffix="",
                    )
                    LOG.info('[MONITOR] Migration completed for HM {}'.format(hm_name))
                    
                except Exception as e:
                    update_count('error')
                    LOG.error("[MONITOR] Failed to convert Monitor: %s. Message: %s" % (hm_name, e), exc_info=True)
                    conv_utils.add_status_row('monitor', None, hm_name, 'ERROR')

    def convert_http(self, v_monitor, alb_hm, skipped):

        method = v_monitor.get("method", "GET")
        url = v_monitor.get("url")
        expected = v_monitor.get("expected")

        alb_hm["http_monitor"] = dict(
            http_request=" ".join([method, url]),
            http_response_code=["HTTP_2XX"],
        )
        if expected:
            alb_hm["http_monitor"]["http_response"] = expected
        skipped = [key for key in skipped if key not in self.http_attr]

    def convert_https(self, v_monitor, alb_hm, skipped):
        method = v_monitor.get("method", "GET")
        url = v_monitor.get("url")
        expected = v_monitor.get("expected")

        alb_hm["https_monitor"] = dict(
            http_request=" ".join([method, url]),
            http_response_code=["HTTP_2XX"],
        )
        if expected:
            alb_hm["https_monitor"]["http_response"] = expected

        # attaching system default ssl profile to https type monitor

        alb_hm["https_monitor"].update(
            {
                "ssl_attributes": {
                    "ssl_profile_ref": "/api/sslprofile/?tenant=%s&name=%s"
                    % ("admin", "System-Standard")
                }
            }
        )
        skipped = [key for key in skipped if key not in self.https_attr]

    def convert_tcp(self, v_monitor, alb_hm, skipped):

        send_request = v_monitor.get("send", None)
        receive_response = v_monitor.get("receive", None)

        alb_hm["tcp_monitor"] = dict(
            tcp_request=send_request, tcp_response=receive_response
        )
        skipped = [key for key in skipped if key not in self.tcp_attr]

    def convert_udp(self, v_monitor, alb_hm, skipped):
        request = v_monitor.get("send", None)
        response = v_monitor.get("receive", None)
        if response == "none":
            response = None
        udp_monitor = {"udp_request": request, "udp_response": response}
        alb_hm["udp_monitor"] = udp_monitor
        skipped = [key for key in skipped if key not in self.udp_attr]

    def convert_icmp(self, v_monitor, alb_hm, skipped):
        alb_hm["type"] = "HEALTH_MONITOR_PING"
        if self.ping_attr:
            skipped = [key for key in skipped if key not in self.ping_attr]
