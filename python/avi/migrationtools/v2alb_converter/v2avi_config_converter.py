import json
import logging
import os
import sys
import avi.migrationtools.v2alb_converter.converter_constants as conv_const
from avi.migrationtools.avi_orphan_object import wipe_out_not_in_use
from avi.migrationtools.v2alb_converter import conversion_util
from avi.migrationtools.v2alb_converter.conversion_util import NsxvConvUtil
from avi.migrationtools.v2alb_converter.monitor_converter import MonitorConfigConv
from avi.migrationtools.v2alb_converter.pool_converter import PoolConfigConv
from avi.migrationtools.v2alb_converter.profile_converter import ProfileConfigConv
from avi.migrationtools.v2alb_converter.vs_converter import VSConfigConv

sys.path.insert(0, os.getcwd())

conv_utils = NsxvConvUtil()

LOG = logging.getLogger(__name__)


merge_object_mapping = {
    "ssl_profile": {"no": 0},
    "app_profile": {"no": 0},
    "network_profile": {"no": 0},
    "app_per_profile": {"no": 0},
    "pki_profile": {"no": 0},
    "health_monitor": {"no": 0},
    "ssl_cert_key": {"no": 0},
    "ip_group": {"no": 0},
    "vs_ds": {"no": 0},
}


def convert(
    nsxv_util,
    vedge_lb_config,
    input_path,
    output_path,
    tenant,
    prefix,
    object_merge_check,
    v_edge_mapping_dict,
    mig_certificate_data,
    edge_cert_dict,
    vs_level_status=False,
    not_in_use=False,
):

    try:
        # load the yaml file attribute in nsxv_attributes.
        nsxv_attributes = conv_const.init()
        avi_config_dict = dict()  # Result Config
        sys_dict = {}
        edge_with_no_lb = []
        for edge_name, edge_config in vedge_lb_config.items():
            if edge_config.get("enabled") == False:
                skip_reason = "Load balancer is not enabled on edge"
                LOG.warning(
                    f"EDGE {edge_name} not migrated. Reason: {skip_reason}")
                edge_with_no_lb.append(edge_name)

        for edge in edge_with_no_lb:
            vedge_lb_config.pop(edge)


        contlr_licence_type = nsxv_util.get_controller_license_type()
        merge_object_type = [
            "ApplicationProfile",
            "NetworkProfile",
            "SSLProfile",
            "PKIProfile",
            "SSLKeyAndCertificate",
            "ApplicationPersistenceProfile",
            "HealthMonitor",
            "IpAddrGroup",
            "VSDataScriptSet",
        ]

        for key in merge_object_type:
            sys_dict[key] = []
            avi_config_dict[key] = []

        monitor_converter = MonitorConfigConv(
            nsxv_attributes, object_merge_check, merge_object_mapping, sys_dict
        )
        monitor_converter.convert(
            avi_config_dict, vedge_lb_config, prefix, tenant)

        pool_converter = PoolConfigConv(
            nsxv_util,
            nsxv_attributes,
            object_merge_check,
            merge_object_mapping,
            sys_dict,
            input_path,
        )
        pool_converter.convert(
            avi_config_dict, vedge_lb_config, prefix,
            tenant, contlr_licence_type
        )

        profile_converter = ProfileConfigConv(
            nsxv_attributes,
            object_merge_check,
            edge_cert_dict,
            merge_object_mapping,
            sys_dict,
            tenant,
        )
        profile_converter.convert(avi_config_dict, vedge_lb_config, prefix)

        vs_converter = VSConfigConv(
            nsxv_util,
            nsxv_attributes,
            prefix,
            object_merge_check,
            merge_object_mapping,
            sys_dict,
            input_path,
        )
        vs_converter.convert(
            avi_config_dict,
            vedge_lb_config,
            tenant,
            v_edge_mapping_dict,
            edge_cert_dict,
            contlr_licence_type,
        )

        if mig_certificate_data.get("SSLKeyAndCertificate"):
            avi_config_dict["SSLKeyAndCertificate"] = mig_certificate_data[
                "SSLKeyAndCertificate"
            ]

        conv_utils.remove_dup_of(avi_config_dict)

    except Exception as e:
        LOG.error(e)
        print("\033[91m" + "Error in migrating LB config. Message: ", str(e) + "\033[0m")
        LOG.error("Conversion error. Message: %s" % str(e), exc_info=True)

    # Add nsxv converter status report in xslx report
    conv_utils.add_complete_conv_status(
        output_path, avi_config_dict, "v2avi-report", vs_level_status
    )

    for key in avi_config_dict:
        if key != "META":
            if key == "VirtualService":
                if vs_level_status:
                    LOG.info(
                        "Total Objects of %s : %s (%s  migrated , %s full conversions)"
                        % (
                            key,
                            vs_converter.total_vs_count,
                            len(avi_config_dict[key]),
                            conversion_util.fully_migrated,
                        )
                    )
                    print(
                        "Total Objects of %s : %s (%s  migrated , %s full conversions)"
                        % (
                            key,
                            vs_converter.total_vs_count,
                            len(avi_config_dict[key]),
                            conversion_util.fully_migrated,
                        )
                    )
                else:
                    LOG.info(
                        "Total Objects of %s : %s (%s  migrated)"
                        % (key, vs_converter.total_vs_count, len(avi_config_dict[key]))
                    )
                    print(
                        "Total Objects of %s : %s (%s  migrated)"
                        % (key, vs_converter.total_vs_count, len(avi_config_dict[key]))
                    )

                continue
            # Added code to print merged count.
            elif object_merge_check and key == "SSLProfile":
                mergedfile = (
                    len(avi_config_dict[key]) -
                    profile_converter.ssl_profile_count
                )
                profile_merged_message = (
                    "Total Objects of %s : %s (%s/%s profile merged)"
                    % (
                        key,
                        len(avi_config_dict[key]),
                        abs(mergedfile),
                        profile_converter.ssl_profile_count,
                    )
                )
                LOG.info(profile_merged_message)
                print(profile_merged_message)
                continue
            elif object_merge_check and key == "HealthMonitor":
                mergedmon = len(
                    avi_config_dict[key]) - monitor_converter.monitor_count
                monitor_merged_message = (
                    "Total Objects of %s : %s (%s/%s monitor merged)"
                    % (
                        key,
                        len(avi_config_dict[key]),
                        abs(mergedmon),
                        monitor_converter.monitor_count,
                    )
                )
                LOG.info(monitor_merged_message)
                print(monitor_merged_message)
                continue
            elif object_merge_check and key == "ApplicationProfile":
                merged_app_pr = (
                    len(avi_config_dict[key]) - profile_converter.app_pr_count
                )
                app_profile_merged_message = (
                    "Total Objects of %s : %s (%s/%s profile merged)"
                    % (
                        key,
                        len(avi_config_dict[key]),
                        abs(merged_app_pr),
                        profile_converter.app_pr_count,
                    )
                )
                LOG.info(app_profile_merged_message)
                print(app_profile_merged_message)
                continue
            elif object_merge_check and key == "ApplicationPersistenceProfile":
                mergedfile = len(
                    avi_config_dict[key]) - profile_converter.app_per_count
                profile_merged_message = (
                    "Total Objects of %s : %s (%s/%s profile merged)"
                    % (
                        key,
                        len(avi_config_dict[key]),
                        abs(mergedfile),
                        profile_converter.app_per_count,
                    )
                )
                LOG.info(profile_merged_message)
                print(profile_merged_message)
                continue

            LOG.info(f"Total Objects of {key} : {len(avi_config_dict[key])}")
            print(f"Total Objects of {key} : {len(avi_config_dict[key])}")

    if not_in_use:
        avi_config_dict = wipe_out_not_in_use(avi_config_dict)

    output_config = output_path + os.path.sep + "avi_config.json"

    with open(output_config, "w", encoding="utf-8") as text_file:
        json.dump(avi_config_dict, text_file, indent=4)

    return avi_config_dict
