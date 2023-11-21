import copy
import logging

import netaddr
from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.v2alb_converter.conversion_util import NsxvConvUtil
from avi.migrationtools.v2alb_converter.pool_converter import PoolConfigConv
from avi.migrationtools.v2alb_converter.profile_converter import ProfileConfigConv
from avi.migrationtools.avi_migration_utils import update_count


LOG = logging.getLogger(__name__)

conv_utils = NsxvConvUtil()

common_mig_util = MigrationUtil()


class VSConfigConv:

    BASE_URL = "/api/profile/"
    VS_ID_NAME_MAPS = {}
    vs_vip_obj_dict = {}
    tier1_path_url = "/infra/tier-1s/"

    def __init__(
        self,
        nsxv_util,
        nsxv_attributes,
        prefix,
        object_merge_check,
        merge_object_mapping,
        sys_dict,
        input_path,
    ):
        """
        inint of virtual converter
        """
        self.prefix = prefix
        self.total_vs_count = 0
        self.nsxv_attributes = nsxv_attributes
        self.vs_supported_attr = nsxv_attributes.get("VS_supported_attr")
        self.vs_na_list = nsxv_attributes.get("VS_na_list")
        self.nsxv_util = nsxv_util
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.input_path = input_path

    def convert(
        self,
        avi_config_dict,
        vedge_lb_config,
        tenant,
        v_edge_mapping_dict,
        mig_cert_dict,
        license_type="BASIC",
    ):
        pool_utils = PoolConfigConv(
            self.nsxv_util,
            self.nsxv_attributes,
            self.object_merge_check,
            self.merge_object_mapping,
            self.sys_dict,
            self.input_path,
        )
        prof_utils = ProfileConfigConv(
            self.nsxv_attributes,
            self.object_merge_check,
            mig_cert_dict,
            self.merge_object_mapping,
            self.sys_dict,
            tenant,
        )
        avi_config_dict["VirtualService"] = list()
        avi_config_dict["VsVip"] = list()
        converted_objs = []
        progressbar_count = 0
        self.total_vs_count = conv_utils.get_total_objects_count_in_v(
            vedge_lb_config, "virtualServer"
        )
        print("\nConverting VS ...")
        LOG.info("[VIRTUAL SERVICE] Converting VS...")
        msg = "Virtual service conversion started..."
        for edge_name, edge_config in vedge_lb_config.items():
            if (
                not edge_config.get("virtualServer")
                or len(edge_config.get("virtualServer")) == 0
            ):
                LOG.warning(
                    f"EDGE {edge_name} does not contain virtual service ")
                continue

            v_virtual_server_configs = edge_config.get("virtualServer")
            self.VS_ID_NAME_MAPS[edge_name] = {}
            self.vs_vip_obj_dict[edge_name] = {}

            tier1_lr = None
            cloud_name = "Default-Cloud"
            if v_edge_mapping_dict.get(edge_name):
                tier1_lr = v_edge_mapping_dict.get(edge_name)["tier1_lr"]
                cloud_name = v_edge_mapping_dict.get(edge_name)["Cloud"]

                LOG.debug(f"Mapping from edge to tier1 mapping file. Tier1: {tier1_lr} and "
                          f"Cloud {cloud_name}")
            for v_vs in v_virtual_server_configs:
                try:
                    progressbar_count += 1
                    v_vs_name = v_vs.get("name")
                    vs_id = v_vs.get("virtualServerId")
                    vs_name = f"{edge_name}-{v_vs_name}"

                    if cloud_name == "Cloud Not Found":
                        skip_mesg = (
                            "VS SKIPPED: {} {} Reason : Cloud not configured ".format(
                                edge_name,
                                v_vs_name,
                            )
                        )
                        LOG.warning(skip_mesg)
                        conv_utils.add_status_row(
                            "virtualservice", None, v_vs_name, "SKIPPED", skip_mesg
                        )
                        conv_utils.print_progress_bar(
                            progressbar_count,
                            self.total_vs_count,
                            msg,
                            prefix="Progress",
                            suffix="",
                        )

                        continue

                    if self.prefix:
                        vs_name = f"{self.prefix}-{vs_name}"
                    skipped = [
                        key for key in v_vs.keys() if key not in self.vs_supported_attr
                    ]
                    na_list = [key for key in v_vs.keys()
                               if key in self.vs_na_list]

                    protocol = v_vs.get("protocol")
                    port = v_vs.get("port")
                    performance_limits = dict(
                        max_concurrent_connections=v_vs.get("connectionLimit")
                    )

                    services = []
                    # services = [
                    #     dict(
                    #         enable_ssl=False,
                    #         port=port.split(",")[0],
                    #     )
                    # ]

                    # if len(port.split()) > 1:
                    #     services[0]["port_range_end"] = port.split(",")[-1]

                    port_list = port.split(",")
                    for port in port_list:
                        service = dict()
                        service["enable_ssl"] = False
                        port_split = port.split("-")
                        if len(port_split) == 1:
                            service["port"] = int(port)
                        else:
                            service["port"] = int(port_split[0])
                            service["port_range_end"] = int(port_split[-1])
                        services.append(service)

                    pool_id = v_vs.get("defaultPoolId")
                    v_prof_id = v_vs.get("applicationProfileId")

                    avi_vs = dict(
                        name=vs_name,
                        enabled=False,
                        performance_limits=performance_limits,
                        services=services,
                        cloud_ref=conv_utils.get_object_ref(cloud_name, "cloud"),
                        traffic_enabled=True,
                    )
                    avi_vs["tenant_ref"] = conv_utils.get_object_ref(
                        tenant, "tenant")
                    # Create vs-vip and set ip-address
                    if v_vs.get("ipAddress") not in self.vs_vip_obj_dict.keys():
                        avi_vsvip_obj = self.create_vsvip(v_vs, edge_name)
                        avi_vsvip_obj["cloud_ref"] = avi_vs.get("cloud_ref")
                        avi_vsvip_obj["tenant_ref"] = conv_utils.get_object_ref(
                            tenant, "tenant"
                        )
                        avi_config_dict["VsVip"].append(avi_vsvip_obj)
                    if tier1_lr:
                        avi_vsvip_obj["tier1_lr"] = tier1_lr
                    vsvip_name = self.vs_vip_obj_dict.get(v_vs.get("ipAddress"))
                    vsvip_ref = conv_utils.get_object_ref(
                        vsvip_name, "vsvip", tenant=tenant, cloud_name=cloud_name
                    )
                    avi_vs["vsvip_ref"] = vsvip_ref
                    LOG.debug(f"vsvip object configured for vs {v_vs_name}: {avi_vsvip_obj}")

                    # Set rate profile
                    # Note: Only allowed in AVI enterprise
                    if license_type.upper() != "BASIC":
                        connections_rate_limit = self.set_rate_profile(v_vs)
                        if connections_rate_limit:
                            LOG.debug(f"Connection rate limit set to {connections_rate_limit} for vs {vs_id}")
                            avi_vs["connections_rate_limit"] = connections_rate_limit
                    else:
                        na_list.append("connectionRateLimit")

                    if v_prof_id:
                        client_ssl_name = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id].\
                            get("client_ssl")
                        server_ssl_name = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id].\
                            get("server_ssl")
                        LOG.debug(f"client and server ssl names for vs {v_vs_name}: {client_ssl_name}, {server_ssl_name}")

                    ssl_key_cert_refs = []

                    avi_app_obj = None
                    if v_prof_id and prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT.get(edge_name):
                        avi_app_name = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id].get("app_name")

                        if avi_app_name:
                            if self.object_merge_check:
                                avi_app_name = self.merge_object_mapping["app_profile"].get(avi_app_name)

                            avi_app_obj = conv_utils.get_avi_obj_from_name(avi_app_name, avi_config_dict,
                                                                           "ApplicationProfile")

                            acc_enabled = v_vs.get("accelerationEnabled")
                            app_prof_type = avi_app_obj.get("type")
                            network_profile_name = self.get_network_profile(app_prof_type, v_vs, acc_enabled)

                            avi_vs["network_profile_ref"] = conv_utils.get_object_ref(network_profile_name,
                                                                                      "networkprofile", tenant=tenant)

                            avi_app_name = avi_app_obj.get("name")
                            avi_vs["application_profile_ref"] = conv_utils.\
                                get_object_ref(avi_app_name, "applicationprofile", tenant=tenant)

                            if app_prof_type != "APPLICATION_PROFILE_TYPE_L4":
                                avi_vs["services"][0]["enable_ssl"] = True

                            # set ssl_key_cert_refs to vs
                            vs_ssl_key_cert_ref = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id].\
                                get("VS_SSL_KEY_AND_CERT_REFS")
                            if vs_ssl_key_cert_ref:
                                avi_vs["ssl_key_and_certificate_refs"] = vs_ssl_key_cert_ref

                    # adding ssl profile ref to vs
                    if client_ssl_name:
                        if self.object_merge_check:
                            client_ssl_name = self.merge_object_mapping["ssl_profile"].get(client_ssl_name)

                        avi_vs["ssl_profile_ref"] = conv_utils.get_object_ref(client_ssl_name, "sslprofile", tenant=tenant)
                        LOG.debug(f"Added ssl profile ref for vs {v_vs_name}")

                    # Add pool reference for VS and Update Pool with profile references
                    if pool_id:
                        avi_pool_name = pool_utils.get_mig_pool_name_by_v_pool_id(edge_name, pool_id)

                        if avi_pool_name:
                            LOG.debug(f"Pool found for vs {v_vs_name}. Pool name: {avi_pool_name}")
                            v_pool_obj = [
                                v_pool
                                for v_pool in edge_config.get("pool")
                                if pool_id == v_pool.get("poolId")
                            ]
                            v_pool_obj = v_pool_obj[0]

                            # update vs with pool ref
                            avi_vs["pool_ref"] = conv_utils.get_object_ref(
                                avi_pool_name, "pool", tenant=tenant, cloud_name=cloud_name
                            )
                            LOG.debug(f"Added pool profile ref for vs {v_vs_name}")

                            avi_pool_obj = [
                                pool
                                for pool in avi_config_dict["Pool"]
                                if pool.get("name") == avi_pool_name
                            ]
                            # set ssl profile ref to pool
                            if server_ssl_name:
                                if self.object_merge_check:
                                    server_ssl_name = self.merge_object_mapping[
                                        "ssl_profile"
                                    ].get(server_ssl_name)

                                pool_ssl_ref = conv_utils.get_object_ref(
                                    server_ssl_name, "sslprofile", tenant=tenant
                                )
                                self.attach_ssl_to_pool(
                                    pool_ssl_ref, avi_pool_name, avi_pool_obj[0]
                                )
                                LOG.debug(f"Attached server ssl profile to pool {avi_pool_name} for vs {v_vs_name}")

                            # attach pool with persistence prof ref
                            if v_prof_id and prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT.get(edge_name):
                                avi_persis_name = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id]\
                                    .get("persis_prof")

                            if avi_persis_name:
                                if self.object_merge_check:
                                    avi_persis_name = self.merge_object_mapping[
                                        "app_per_profile"
                                    ].get(avi_persis_name)

                                avi_pool_obj[0]["application_persistence_profile_ref"] = \
                                    conv_utils.get_object_ref(avi_persis_name, "applicationpersistenceprofile",
                                                              tenant=tenant)
                                LOG.debug(f"Attached application persistence profile to pool {avi_pool_name} for vs "
                                          f"{v_vs_name}")

                            # attach ssl key and cert ref to pool
                            if v_prof_id:
                                pool_ssl_key_cert_ref = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id]\
                                    .get("POOL_SSL_KEY_AND_CERT_REFS")
                                if pool_ssl_key_cert_ref:
                                    avi_pool_obj[0]["ssl_key_and_certificate_refs"] = pool_ssl_key_cert_ref
                                    LOG.debug(f"Attached ssl key and cert profile to pool {avi_pool_name} for vs "
                                              f"{v_vs_name}")

                            # attach tier_lr ref to pool
                            if tier1_lr:
                                avi_pool_obj[0]["tier1_lr"] = tier1_lr
                                LOG.debug(f"Attached tier1 lr to pool {avi_pool_name} for vs {v_vs_name}")
                            # attach cloud ref to pool
                            if cloud_name:
                                avi_pool_obj[0]["cloud_ref"] = avi_vs.get("cloud_ref")
                                LOG.debug(f"Attached cloud ref to pool {avi_pool_name} for vs {v_vs_name}")

                            #  Set Pki profile for pool
                            if v_prof_id and prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT.get(edge_name):
                                pki_prof_name = prof_utils.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][v_prof_id].\
                                    get("pool_pki_profile_id")

                            if pki_prof_name:
                                avi_pool_obj[0]["pki_profile_ref"] = conv_utils.get_object_ref(pki_prof_name,
                                                                                               "pkiprofile", tenant=tenant)
                                LOG.debug(f"Attached pki profile to pool {avi_pool_name} for vs {v_vs_name}")

                            if v_pool_obj.get("transparent"):
                                if avi_app_obj:
                                    profile_name = avi_app_obj.get("name")
                                    profile_type = avi_app_obj.get("type")
                                    if avi_vs["application_profile_ref"]:
                                        vs_app_name = self.update_app_with_snat(profile_name, profile_type,
                                                                                avi_config_dict["ApplicationProfile"])
                                        LOG.debug(f"Updated app with snat for transparent pool {avi_pool_name} for "
                                                  f"vs {v_vs_name}")
                                        if vs_app_name != profile_name:
                                            avi_vs["application_profile_ref"] = conv_utils.\
                                                get_object_ref(vs_app_name, "applicationprofile", tenant=tenant)
                                            LOG.debug(f"Attached application profile to vs {v_vs_name}")

                    avi_config_dict["VirtualService"].append(avi_vs)
                    indirect = []
                    u_ignore = []
                    ignore_for_defaults = {}
                    conv_status = conv_utils.get_conv_status(
                        skipped,
                        indirect,
                        ignore_for_defaults,
                        v_virtual_server_configs,
                        u_ignore,
                        na_list,
                    )
                    conv_utils.add_conv_status(
                        "virtualservice", None, v_vs.get(
                            "name"), conv_status, avi_vs
                    )
                    conv_utils.print_progress_bar(
                        progressbar_count,
                        self.total_vs_count,
                        msg,
                        prefix="Progress",
                        suffix="",
                    )
                except Exception as e:
                    update_count('error')
                    LOG.error("[VIRTUAL SERVICE] Failed to convert virtual service: %s. Message: %s" %
                              (v_vs_name, e), exc_info=True)
                    conv_utils.add_status_row('virtualservice', None, v_vs_name, 'ERROR')

    def create_vsvip(self, v_vs, edge_id):

        vs_vip = None
        if v_vs:
            ip_address = v_vs.get("ipAddress")
            ip_type = "V6" if netaddr.valid_ipv6(ip_address) else "V4"
            ip_address_key = "ip_address"
            if ip_type == "V6":
                ip_address_key = "ip6_address"
            vs_vip_id = conv_utils.generate_id_for_converted_objects(edge_id, v_vs.get("name"), "vsvip", self.prefix)

            if ip_address and ip_address not in self.vs_vip_obj_dict.keys():
                vs_vip = {
                    "id": vs_vip_id,
                    "name": vs_vip_id,
                    "vip": [
                        {
                            "vip_id": 0,
                            ip_address_key: {"addr": ip_address, "type": ip_type},
                        }
                    ],
                }

            LOG.debug(f"Generated vsvip object for vs {v_vs.get('name')}: {vs_vip}")
            self.vs_vip_obj_dict[ip_address] = vs_vip_id
        return vs_vip

    def get_network_profile(self, app_prof_type, v_vs, acc_enabled):
        # Set network profile type - attach system default network profiles only
        network_profile_name = "System-TCP-Proxy"

        if acc_enabled is True and app_prof_type == "APPLICATION_PROFILE_TYPE_L4":
            if v_vs.get("protocol").upper() == "TCP":
                network_profile_name = "System-TCP-Fast-Path"
            if v_vs.get("protocol").upper() == "UDP":
                network_profile_name = "System-UDP-Fast-Path"
        else:
            if v_vs.get("protocol").upper() == "UDP":
                network_profile_name = "System-UDP-Proxy"
        LOG.debug(f"Network profile name for vs {v_vs.get('name')}: {network_profile_name}")
        return network_profile_name

    def attach_ssl_to_pool(self, pool_ssl_ref, avi_pool_name, avi_pool_obj):

        avi_pool_obj["ssl_profile_ref"] = pool_ssl_ref

    def create_pki_profile(self, mig_cert_dict, ca_cert, crl_cert, edge_name):
        pki_obj = dict()

        ca, crl = self.get_cert_obj(ca_cert, crl_cert, mig_cert_dict, edge_name)
        if ca:
            pki_obj["ca_certs"] = [ca]
        else:
            return None
        pki_obj["crl_check"] = False
        LOG.debug("Pki profile object created")
        return pki_obj

    def get_cert_obj(self, ca_cert, crl_cert, mig_cert_dict, edge_name):
        ca = None
        crl = None
        if ca_cert:
            if mig_cert_dict.get(edge_name) and mig_cert_dict[edge_name].get(ca_cert):
                ca = mig_cert_dict[edge_name][ca_cert].get("certificate")
        if crl_cert:
            if mig_cert_dict.get(edge_name) and mig_cert_dict[edge_name].get(crl_cert):
                crl = mig_cert_dict[edge_name][crl_cert].get("certificate")

        return ca, crl

    def update_app_with_snat(self, profile_name, profile_type, alb_app_config):

        app_prof_obj = [obj for obj in alb_app_config if obj["name"] == profile_name]

        cme = True
        if profile_type == "APPLICATION_PROFILE_TYPE_HTTP":
            cme = app_prof_obj[0]["http_profile"].get("connection_multiplexing_enabled", False)

        app_name = profile_name
        if app_prof_obj and not cme:
            # Check if already cloned profile present
            app_prof_cmd = [obj for obj in alb_app_config if obj["name"] == "%s-cmd" % profile_name]

            if app_prof_cmd:
                app_name = app_prof_cmd[0]["name"]
            else:
                app_prof_cmd = copy.deepcopy(app_prof_obj[0])
                app_prof_cmd["name"] = "%s-cmd" % app_prof_cmd["name"]
                if "http_profile" in app_prof_cmd:
                    app_prof_cmd["http_profile"]["connection_multiplexing_enabled"] = False
                    app_prof_cmd["preserve_client_ip"] = True
                alb_app_config.append(app_prof_cmd)
                app_name = app_prof_cmd["name"]
                LOG.debug(f"Updated con mux and preserve client ip properties for profile {profile_name}")

        return app_name

    def set_rate_profile(self, v_vs):

        connections_rate_limit = None
        if v_vs.get("connectionRateLimit") and int(v_vs.get("connectionRateLimit")) != 0:
            conn_rate_limit = int(v_vs.get("connectionRateLimit"))
            connections_rate_limit = {
                "rate_limiter": {"count": conn_rate_limit, "period": 1},
                "action": {"type": "RL_ACTION_DROP_CONN"},
            }
        LOG.debug(f"Connection rate limit for vs {v_vs.get('name')}: {connections_rate_limit}")
        return connections_rate_limit
