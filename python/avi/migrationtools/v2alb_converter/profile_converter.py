import logging

from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.v2alb_converter.conversion_util import NsxvConvUtil
from avi.migrationtools.avi_migration_utils import update_count

common_mig_util = MigrationUtil()
conv_utils = NsxvConvUtil()
LOG = logging.getLogger(__name__)


class ProfileConfigConv:

    BASE_URL = "/api/profile/"
    APPLICATION_PROFILES_OBJ_MAPS_DICT = {}
    PKI_PROFILE_OBJ_DICT = {}

    def __init__(
        self,
        nsxv_attributes,
        object_merge_check,
        mig_cert_dict,
        merge_object_mapping,
        sys_dict,
        tenant,
    ):
        """
        inint of profile converter
        """
        self.ssl_profile_count = 0
        self.app_pr_count = 0
        self.app_per_count = 0
        self.object_merge_check = object_merge_check
        self.mig_cert_dict = mig_cert_dict
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.tenant = tenant
        self.app_supported_attributes = nsxv_attributes.get("Application_Profile_supported_attr")

    def convert(self, avi_config_dict, vedge_lb_config, prefix):
        avi_config_dict["ApplicationProfile"] = list()
        avi_config_dict["ApplicationPersistenceProfile"] = list()
        avi_config_dict["SSLProfile"] = list()
        avi_config_dict["PKIProfile"] = list()

        total_obj_count = conv_utils.get_total_objects_count_in_v(
            vedge_lb_config, "applicationProfile"
        )
        print("\nConverting Profiles ...")
        LOG.info("[APPLICATION-PROFILE] Converting Profiles...")
        progressbar_count = 0
        converted_objs = []
        for edge_name, edge_config in vedge_lb_config.items():
            if (
                not edge_config.get("applicationProfile")
                or len(edge_config.get("applicationProfile")) == 0
            ):
                LOG.warning(f"EDGE {edge_name} does not contain profiles ")
                continue

            v_app_profile_config = edge_config.get("applicationProfile")
            self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name] = dict()
            self.PKI_PROFILE_OBJ_DICT[edge_name] = dict()

            for v_ap in v_app_profile_config:
                try:
                    skipped = []
                    na_list = []
                    indirect = []
                    u_ignore = []
                    msg = "Profile conversion started..."
                    ignore_for_defaults = {}
                    progressbar_count += 1
                    v_ap_name = v_ap.get("name")
                    ap_id = v_ap.get("applicationProfileId")
                    name = f"{edge_name}-{v_ap_name}"
                    LOG.info('[ApplicationProfile] Migration started '
                             'for Application profile {}'.format(v_ap_name))
                    self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id] = dict(
                    )
                    if prefix:
                        name = f"{prefix}-{name}"

                    alb_pr = dict(
                        name=name,
                        xff_enabled=v_ap.get("insertXForwardedFor"),
                    )
                    alb_pr["tenant_ref"] = conv_utils.get_object_ref(
                        self.tenant, "tenant")

                    ap_prof_type = None
                    v_ap_template = v_ap.get("template").lower()

                    if (
                        v_ap_template in ["http", "https"]
                        and v_ap.get("sslPassthrough") == True
                    ):
                        ap_prof_type = "APPLICATION_PROFILE_TYPE_L4"
                    elif (
                        v_ap_template in ["http", "https"]
                        and v_ap.get("sslPassthrough") == False
                    ):
                        ap_prof_type = "APPLICATION_PROFILE_TYPE_HTTP"
                    elif v_ap_template in ["tcp", "udp"]:
                        ap_prof_type = "APPLICATION_PROFILE_TYPE_L4"
                    elif v_ap.get("sslPassthrough"):
                        ap_prof_type = "APPLICATION_PROFILE_TYPE_SSL"

                    LOG.debug('[ApplicationProfile] Application profile type {}'.format(ap_prof_type))
                    
                    alb_pr["type"] = ap_prof_type
                    if ap_prof_type == "APPLICATION_PROFILE_TYPE_HTTP":
                        self.convert_http(alb_pr, v_ap)

                    if "persistence" in v_ap.keys():

                        LOG.info(
                            "Translating Persistence Profile %s for %s.",
                            v_ap.get("name"),
                            edge_name,
                        )
                        avi_persis_prof = self.generate_persistence_profile(
                            v_ap, avi_config_dict, ap_prof_type
                        )
                        if avi_persis_prof:
                            avi_persis_prof["name"] = self.generate_name_for_profiles(
                                edge_name, v_ap_name, "persistence", prefix
                            )
                            avi_persis_prof["tenant_ref"] = conv_utils.get_object_ref(
                                self.tenant, "tenant"
                            )

                            if self.object_merge_check:

                                common_mig_util.update_skip_duplicates(
                                    avi_persis_prof,
                                    avi_config_dict["ApplicationPersistenceProfile"],
                                    "app_per_profile",
                                    converted_objs,
                                    avi_persis_prof["name"],
                                    None,
                                    self.merge_object_mapping,
                                    avi_persis_prof["persistence_type"],
                                    prefix,
                                    self.sys_dict["ApplicationPersistenceProfile"],
                                )
                                self.app_per_count += 1
                            else:
                                avi_config_dict["ApplicationPersistenceProfile"].append(
                                    avi_persis_prof
                                )

                            self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id][
                                "persis_prof"
                            ] = avi_persis_prof["name"]
                            
                            LOG.info(f'[ApplicationProfile] Persistence  profile created with name :  {avi_persis_prof["name"]}')

                    if "clientSsl" in v_ap.keys():

                        LOG.info(
                            "Translating Client  Ssl Profile %s for %s.",
                            v_ap.get("name"),
                            edge_name,
                        )
                        
                        client_ssl_profile = self._convert_client_ssl_profile(
                            v_ap, alb_pr, ap_id, edge_name
                        )
                        if client_ssl_profile:
                            client_ssl_profile["name"] = self.generate_name_for_profiles(
                                edge_name, v_ap_name, "client-ssl", prefix
                            )
                            client_ssl_profile["tenant_ref"] = conv_utils.get_object_ref(
                                self.tenant, "tenant"
                            )

                            if self.object_merge_check:
                                common_mig_util.update_skip_duplicates(
                                    client_ssl_profile,
                                    avi_config_dict["SSLProfile"],
                                    "ssl_profile",
                                    converted_objs,
                                    client_ssl_profile["name"],
                                    None,
                                    self.merge_object_mapping,
                                    "client-ssl",
                                    prefix,
                                    self.sys_dict["SSLProfile"],
                                )
                                self.ssl_profile_count += 1
                            else:
                                avi_config_dict["SSLProfile"].append(
                                    client_ssl_profile)

                            self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id][
                                "client_ssl"
                            ] = client_ssl_profile["name"]
                            
                            LOG.info(f'[ApplicationProfile] Client Ssl  profile created with name :  {client_ssl_profile["name"]}')


                    if "serverSsl" in v_ap.keys():
                        
                        LOG.info(
                            "Translating Server  Ssl Profile %s for %s.",
                            v_ap.get("name"),
                            edge_name,
                        )
                        server_ssl_profile = self._convert_server_ssl_profile(
                            v_ap, alb_pr, ap_id, edge_name
                        )
                        if server_ssl_profile:
                            server_ssl_profile["name"] = self.generate_name_for_profiles(
                                edge_name, v_ap_name, "server-ssl", prefix
                            )
                            server_ssl_profile["tenant_ref"] = conv_utils.get_object_ref(
                                self.tenant, "tenant"
                            )

                            if self.object_merge_check:
                                common_mig_util.update_skip_duplicates(
                                    server_ssl_profile,
                                    avi_config_dict["SSLProfile"],
                                    "ssl_profile",
                                    converted_objs,
                                    server_ssl_profile["name"],
                                    None,
                                    self.merge_object_mapping,
                                    "server-ssl",
                                    prefix,
                                    self.sys_dict["SSLProfile"],
                                )
                                self.ssl_profile_count += 1
                            else:
                                avi_config_dict["SSLProfile"].append(
                                    server_ssl_profile)

                            self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id][
                                "server_ssl"
                            ] = server_ssl_profile["name"]
                            
                            LOG.info(f'[ApplicationProfile] Server ssl  profile created with name :  {server_ssl_profile["name"]}')

                    # pki profile object

                    if self.PKI_PROFILE_OBJ_DICT[edge_name].get(
                        ap_id
                    ) and self.PKI_PROFILE_OBJ_DICT[edge_name][ap_id].get(
                        "client-ssl-pki_obj"
                    ):
                        ssl_type = "client-ssl"
                        pki_obj = self.PKI_PROFILE_OBJ_DICT[edge_name][ap_id].get(
                            "client-ssl-pki_obj"
                        )
                        self.populate_pki_profile(
                            pki_obj,
                            ssl_type,
                            edge_name,
                            alb_pr,
                            v_ap,
                            avi_config_dict,
                            converted_objs,
                            prefix,
                        )

                        v_ssl = v_ap.get("clientSsl")
                        ssl_client_certificate_mode = None
                        if v_ssl.get("clientAuth") == "required":
                            ssl_client_certificate_mode = "SSL_CLIENT_CERTIFICATE_REQUIRE"
                        elif v_ssl.get("clientAuth") == "ignore":
                            ssl_client_certificate_mode = "SSL_CLIENT_CERTIFICATE_NONE"

                        self.set_certificate_mode(
                            alb_pr, ssl_client_certificate_mode)

                    if self.PKI_PROFILE_OBJ_DICT[edge_name].get(
                        ap_id
                    ) and self.PKI_PROFILE_OBJ_DICT[edge_name][ap_id].get(
                        "server-ssl-pki_obj"
                    ):
                        ssl_type = "server-ssl"
                        pki_obj = self.PKI_PROFILE_OBJ_DICT[edge_name][ap_id].get(
                            "server-ssl-pki_obj"
                        )
                        self.populate_pki_profile(
                            pki_obj,
                            ssl_type,
                            edge_name,
                            alb_pr,
                            v_ap,
                            avi_config_dict,
                            converted_objs,
                            prefix,
                        )

                    if self.object_merge_check:
                        common_mig_util.update_skip_duplicates(
                            alb_pr,
                            avi_config_dict["ApplicationProfile"],
                            "app_profile",
                            converted_objs,
                            name,
                            None,
                            self.merge_object_mapping,
                            ap_prof_type,
                            prefix,
                            self.sys_dict["ApplicationProfile"],
                        )
                        self.app_pr_count += 1
                    else:
                        avi_config_dict["ApplicationProfile"].append(alb_pr)

                    self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id][
                        "app_name"
                    ] = name
   
                    conv_utils.print_progress_bar(
                        progressbar_count,
                        total_obj_count,
                        msg,
                        prefix="Progress",
                        suffix="",
                    )
                    skipped = [
                        key for key in v_ap.keys() if key not in self.app_supported_attributes
                    ]
                    conv_status = conv_utils.get_conv_status(
                        skipped,
                        indirect,
                        ignore_for_defaults,
                        alb_pr,
                        u_ignore,
                        na_list,
                    )
                    LOG.debug(f"Conversion status {conv_status}")
                    conv_utils.add_conv_status(
                        "applicationprofile", v_ap_template,
                        v_ap.get("name"),
                        conv_status, [{"application_profile": alb_pr}]
                    )
                    LOG.info(f'[ApplicationProfile] Migration completed for profile : {v_ap_name}')
                except Exception as e:
                    update_count('error')
                    LOG.error(
                        "[APPLICATIONPROFILE] Failed to convert\
                        Application profile: %s. Message: %s" % (v_ap_name, e), exc_info=True)
                    conv_utils.add_status_row(
                        'applicationprofile', v_ap_template, v_ap_name, 'ERROR')

    def generate_persistence_profile(self, v_ap, avi_config, app_prof_type):
        """Generating persistence profile"""

        
        persistence = v_ap.get("persistence")
        if persistence is not None:
            LOG.debug(
                "IN abstract_persistence_profile for app prof "
                "{} for method {}".format(app_prof_type, persistence["method"])
            )
            if app_prof_type == "APPLICATION_PROFILE_TYPE_L4" and (
                persistence["method"] in ["cookie", "ssl_sessionid"]
            ):

                skip_msg = (
                    "Persistence profile type not supported:\
                Only client-ip persistence is applicable for Layer-4 virtual service. "
                    "Persistence profile {} of type {} will be skipped".format(
                        v_ap.get("name"), persistence["method"]
                    )
                )
                LOG.warning(skip_msg)

            elif persistence["method"] == "sourceip":
                return self._convert_sourceip_persistence_profile(persistence, v_ap)
            elif persistence["method"] == "cookie":
                return self._convert_cookie_persistence_profile(persistence, v_ap)
            elif persistence["method"] == "ssl_sessionid":
                return self._to_tls_persistence_profile(persistence, v_ap)
            elif persistence["method"] == "msrdp":

                skip_msg = (
                    "AVI does not support msrdp persistence and so this "
                    "persistence profile will be skipped"
                )
                LOG.warning(skip_msg)
                return None
        return None

    def _convert_sourceip_persistence_profile(self, persistence, v_ap):
        """compose SourceIP persistence profile"""

        LOG.info("Translating SourceIP persistence profile configuration for %s .",
                             v_ap.get('name'))
       
        avi_sourceip_persistence_profile = dict()
        avi_sourceip_persistence_profile[
            "persistence_type"
        ] = "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS"

        if persistence.get("expire"):
            timeout = int(persistence.get("expire"))
            ip_persistence_profile = dict()
            ip_persistence_profile["ip_persistent_timeout"] = (
                timeout if timeout <= 720 else 720
            )
            avi_sourceip_persistence_profile[
                "ip_persistence_profile"
            ] = ip_persistence_profile

        return avi_sourceip_persistence_profile

    def _convert_cookie_persistence_profile(self, persistence, v_ap):
        """compose Cookie persistence profile"""
        
        LOG.info("Translating Cookie persistence profile configuration for %s .",
                             v_ap.get('name'))
       
        avi_cookie_persistence_profile = dict()
        avi_cookie_persistence_profile[
            "persistence_type"
        ] = "PERSISTENCE_TYPE_HTTP_COOKIE"
        avi_cookie_persistence_profile["http_cookie_persistence_profile"] = {
            "cookie_name": persistence.get("cookieName")
        }

        if persistence.get("expire"):
            avi_cookie_persistence_profile["http_cookie_persistence_profile"].update(
                {"timeout": int(persistence.get("expire"))}
            )

        return avi_cookie_persistence_profile
    
    def _to_tls_persistence_profile(self, persistence, v_ap):
        """compose TLS persistence profile"""
        LOG.info("Translating  TLS persistence profile configuration for %s .",
                             v_ap.get('name'))
       
        tls_persistence_profile = dict()
        
        tls_persistence_profile['persistence_type'] = 'PERSISTENCE_TYPE_TLS'
        if persistence.get('cookieName') is not None:
            tls_persistence_profile['hdr_persistence_profile'] = {
                "prst_hdr_name": persistence.get('cookieName')
            }

        return tls_persistence_profile

    def _convert_client_ssl_profile(self, v_ap, avi_ap, app_prof_id, edge_id):
        """calculate client ssl profile"""
        LOG.debug(
                "IN client ssl profile  for app prof {}"
                .format(v_ap.get("template"))
            )
        ssl_type = "client-ssl"
        v_client_ssl = v_ap.get("clientSsl")
        if (
            str(v_ap.get("sslPassthrough", "false")).lower() == "false"
            and v_client_ssl is not None
        ):
            client_ssl_profile = self._generate_ssl_profile(
                v_client_ssl, avi_ap, ssl_type, v_ap, edge_id
            )
            return client_ssl_profile
        return None

    def _convert_server_ssl_profile(self, v_ap, avi_ap, app_id, edge_id):
        """calculate server ssl profile"""
        v_server_ssl = v_ap.get("serverSsl")
        ssl_type = "server-ssl"
        if (
            str(v_ap.get("sslPassthrough", "false")).lower() == "false"
            and v_server_ssl is not None
        ):
            t_server_ssl_profile = self._generate_ssl_profile(
                v_server_ssl, avi_ap, ssl_type, v_ap, edge_id
            )
            return t_server_ssl_profile
        return None

    def _generate_ssl_profile(self, v_ssl, avi_ap_obj, ssl_type, v_ap, edge_id):
        LOG.debug("Populating ssl profile")
        avi_ssl_profile = dict()
        app_prof_id = v_ap.get("applicationProfileId")
        ssl_profile_name = (
            "client_ssl_profile" if ssl_type == "client-ssl" else "server_ssl_profile"
        )
        ssl_profile_name = "{}-{}".format(avi_ap_obj.get("name"),
                                          ssl_profile_name)
        avi_ssl_profile["name"] = ssl_profile_name
        avi_ssl_profile["accepted_versions"] = [{"type": "SSL_VERSION_TLS1_2"}]
        avi_ssl_profile["accepted_ciphers"] = v_ssl.get("ciphers")

        ssl_key_and_cert_refs = []
        key_and_cert_url = None
        if v_ssl.get("serviceCertificate"):
            for service_cert in v_ssl["serviceCertificate"]:
                service_cert_id = service_cert

                key_and_cert_url = self.get_service_cert_obj_ref(
                    edge_id, service_cert_id
                )
                if key_and_cert_url:
                    ssl_key_and_cert_refs.append(key_and_cert_url)
                
        if ssl_key_and_cert_refs:
            if ssl_type == "client-ssl":
                self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_id][app_prof_id].update(
                    {"VS_SSL_KEY_AND_CERT_REFS": ssl_key_and_cert_refs}
                )
                LOG.debug(f"VS ssl key and cert refs : {ssl_key_and_cert_refs}")
            elif (
                ssl_type == "server-ssl"
                and str(v_ap.get("serverSslEnabled", "false")).lower() == "true"
            ):
                self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_id][app_prof_id].update(
                    {"POOL_SSL_KEY_AND_CERT_REFS": ssl_key_and_cert_refs}
                )
                LOG.debug(f"pool ssl key and cert refs : {ssl_key_and_cert_refs}")
        ca_cert_list = []
        crl_cert_list = []
        # If ca_cert is true create separate sslkeyandcert
        if v_ssl.get("caCertificate"):
            if isinstance(v_ssl.get("caCertificate"), str):
                ca_cert_list = [v_ssl.get("caCertificate")]
            elif isinstance(v_ssl.get("caCertificate"), list):
                ca_cert_list = v_ssl.get("caCertificate")

        if ca_cert_list or crl_cert_list:
            self.create_and_set_ref_of_ca_crl_cert(
                v_ap, avi_ap_obj, ssl_type, v_ssl, edge_id
            )

        return avi_ssl_profile

    def create_and_set_ref_of_ca_crl_cert(
        self, v_ap, avi_app_obj, ssl_type, v_ssl, edge_id
    ):

        app_id = v_ap.get("applicationProfileId")
        self.PKI_PROFILE_OBJ_DICT[edge_id][app_id] = dict()
        pki_profile_name = f"{avi_app_obj.get('name')}-pki-profile"
        ca_cert_list = []
        crl_cert_list = []
        if isinstance(v_ssl.get("caCertificate"), str):
            ca_cert_list = [v_ssl.get("caCertificate")]
        elif isinstance(v_ssl.get("caCertificate"), list):
            ca_cert_list = v_ssl.get("caCertificate")

        if isinstance(v_ssl.get("crlCertificate"), str):
            crl_cert_list = [v_ssl.get("crlCertificate")]
        elif isinstance(v_ssl.get("crlCertificate"), list):
            crl_cert_list = v_ssl.get("crlCertificate")

        if ca_cert_list or crl_cert_list:
            LOG.debug(f"ca cert present {ca_cert_list}")
            pki_obj = self.create_pki_profile(
                ca_cert_list, crl_cert_list, edge_id)
            if pki_obj:
                pki_obj["name"] = pki_profile_name
                pki_obj["tenant_ref"] = conv_utils.get_object_ref(
                    self.tenant, "tenant")
                self.PKI_PROFILE_OBJ_DICT[edge_id][app_id][
                    f"{ssl_type}-pki_obj"
                ] = pki_obj
                LOG.debug(f"PKI profile created {pki_profile_name}")

    def create_pki_profile(self, ca_cert_list, crl_cert_list, edge_name):
        LOG.info("Translating PKI PROFILE")
        pki_obj = dict()
        ca, crl = self.get_cert_obj(
            ca_cert_list, crl_cert_list, self.mig_cert_dict, edge_name
        )
        if ca:
            pki_obj["ca_certs"] = ca
        else:
            return None
        pki_obj["crl_check"] = False
        return pki_obj

    def get_cert_obj(self, ca_cert_list, crl_cert_list, mig_cert_dict, edge_name):
        ca = []
        crl = []
        for ca_cert in ca_cert_list:
            if mig_cert_dict.get(edge_name) and mig_cert_dict[edge_name].get(ca_cert):
                ca.append(mig_cert_dict[edge_name][ca_cert].get("certificate"))
        for crl_cert in crl_cert_list:
            if mig_cert_dict.get(edge_name) and mig_cert_dict[edge_name].get(crl_cert):
                crl.append(mig_cert_dict[edge_name]
                           [crl_cert].get("certificate"))
        return ca, crl

    def set_certificate_mode(self, avi_app_obj, certificate_mode):
        LOG.debug(f"attaching ssl client certificate mode to app profile : {certificate_mode}")
        if "http_profile" in avi_app_obj.keys():
            avi_app_obj["http_profile"][
                "ssl_client_certificate_mode"
            ] = certificate_mode
        else:
            avi_app_obj.update(
                {"http_profile": {"ssl_client_certificate_mode": certificate_mode}}
            )

    def get_service_cert_obj_ref(self, edge_id, cert_id):
        LOG.debug("IN getting service cert object ref")
        if self.mig_cert_dict.get(edge_id) and self.mig_cert_dict[edge_id].get(cert_id):
            mig_cert_name = self.mig_cert_dict[edge_id][cert_id].get("name")
            cert_url = conv_utils.get_object_ref(
                mig_cert_name, "sslkeyandcertificate", tenant=self.tenant
            )

            return cert_url

    def set_pki_profile(self, alb_pr, pki_profile_name):
        """
        attach pki profile ref to app profile obj
        """

        LOG.debug("Attaching Pki Profile ref  %s to app profile %s",
                  pki_profile_name, alb_pr.get("name"))
        pki_profile_ref = conv_utils.get_object_ref(
            pki_profile_name, "pkiprofile", tenant=self.tenant
        )
        if "http_profile" in alb_pr.keys():
            alb_pr["http_profile"]["pki_profile_ref"] = pki_profile_ref
        else:
            alb_pr["http_profile"]["pki_profile_ref"] = pki_profile_ref

    def generate_name_for_profiles(
        self, edge_name, app_prof_name, profile_suffix, prefix
    ):

        prof_name = f"{edge_name}-{app_prof_name}-{profile_suffix}-profile"
        if prefix:
            prof_name = f"{prefix}-{prof_name}"
        LOG.info(f"Generated Name for {profile_suffix} Profile : {prof_name}.")
        return prof_name

    def get_avi_app_prof_obj_from_v_prof_id(self, edge_id, v_app_id, avi_config):
        avi_app_name = self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_id][v_app_id].get(
            "app_name"
        )
        if avi_app_name:
            avi_app_obj = [
                ap_prof
                for ap_prof in avi_config["ApplicationProfile"]
                if ap_prof.get("name") == avi_app_name
            ]
            return avi_app_obj[0]
        return None

    def convert_http(self, alb_pr, lb_pr):
        alb_pr["http_profile"] = dict(
            xff_enabled=lb_pr.get("insertXForwardedFor", False),
        )

    def get_total_profiles_count_in_v(self, v_edge_config):
        total_prof = 0
        for edge_name, edge_config in v_edge_config.items():
            total_prof += edge_config.get("applicationProfile")
        

    def populate_pki_profile(
        self,
        pki_obj,
        ssl_type,
        edge_name,
        alb_pr,
        v_ap,
        avi_config_dict,
        converted_objs,
        prefix,
    ):
        ap_id = v_ap.get("applicationProfileId")
        pki_profile_name = pki_obj.get("name")

        if self.object_merge_check:
            common_mig_util.update_skip_duplicates(
                pki_obj,
                avi_config_dict["PKIProfile"],
                "pki_profile",
                converted_objs,
                pki_profile_name,
                None,
                self.merge_object_mapping,
                ssl_type,
                prefix,
                self.sys_dict["PKIProfile"],
            )

        else:
            avi_config_dict["PKIProfile"].append(pki_obj)

        if self.object_merge_check:
            pki_profile_name = self.merge_object_mapping["pki_profile"].get(
                pki_profile_name
            )

        self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id][
            "pki_prof"
        ] = pki_profile_name
        
        LOG.debug(f"Ssl type : {ssl_type}")
        if ssl_type == "client-ssl":
            client_auth = v_ap.get("clientSsl").get("clientAuth")
            LOG.debug(f"Client Auth : {client_auth}")
            if client_auth == "required":
                self.set_pki_profile(alb_pr, pki_profile_name)

        elif ssl_type == "server-ssl":
            server_auth = v_ap.get("serverSsl").get("serverAuth", "false")
            server_ssl_enabled = v_ap.get("serverSslEnabled", "false")
            LOG.debug(f"server ssl enabled: {server_ssl_enabled}\
                and server_auth : {server_auth}")
            if str(server_ssl_enabled).lower() == "true" and str(server_auth).lower() == "true":
                LOG.debug(f"Pool pki profile name {pki_profile_name}")
                self.APPLICATION_PROFILES_OBJ_MAPS_DICT[edge_name][ap_id].update(
                    {"pool_pki_profile_id": pki_profile_name}
                )
