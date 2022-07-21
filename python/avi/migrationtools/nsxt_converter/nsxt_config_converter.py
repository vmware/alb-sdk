# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import json
import logging
import os
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.avi_orphan_object import wipe_out_not_in_use
from avi.migrationtools.nsxt_converter import conversion_util
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil
from avi.migrationtools.nsxt_converter.monitor_converter \
    import MonitorConfigConv
from avi.migrationtools.nsxt_converter.nsxt_util import NSXUtil
import os
import json
from avi.migrationtools.nsxt_converter.alb_converter import ALBConverter
import avi.migrationtools.nsxt_converter.converter_constants as conv_const

from avi.migrationtools.nsxt_converter.vs_converter import VsConfigConv
from avi.migrationtools.nsxt_converter.persistant_converter import PersistantProfileConfigConv

from avi.migrationtools.nsxt_converter.pools_converter import PoolConfigConv
from avi.migrationtools.nsxt_converter.profile_converter \
    import ProfileConfigConv
from avi.migrationtools.nsxt_converter.ssl_profile_converter \
    import SslProfileConfigConv

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()

merge_object_mapping = {
    'ssl_profile': {'no': 0},
    'app_profile': {'no': 0},
    'network_profile': {'no': 0},
    'app_per_profile': {'no': 0},
    'pki_profile': {'no': 0},
    'health_monitor': {'no': 0},
    'ssl_cert_key': {'no': 0},
    'ip_group': {'no': 0}
}


def convert(nsx_lb_config, input_path, output_path, tenant, prefix,
            migrate_to, object_merge_check, controller_version, ssh_root_password, nsxt_util, migration_input_config=None,
            vs_state=False, vs_level_status=False, vrf=None,
            segroup=None, not_in_use=True, custom_mapping=None, traffic_enabled=False, cloud_tenant="admin",
            nsxt_ip=None, nsxt_passord=None):

    # load the yaml file attribute in nsxt_attributes.
    nsxt_attributes = conv_const.init()
    input_config = input_path + os.path.sep + "config.json"
    with open(input_config, "w", encoding='utf-8') as text_file:
        json.dump(nsx_lb_config, text_file, indent=4)

    avi_config_dict = dict()  # Result Config
    sys_dict = {}

    try:
        merge_object_type = ['ApplicationProfile', 'NetworkProfile',
                             'SSLProfile', 'PKIProfile', 'SSLKeyAndCertificate',
                             'ApplicationPersistenceProfile', 'HealthMonitor',
                             'IpAddrGroup']
        for key in merge_object_type:
            sys_dict[key] = []
            avi_config_dict[key] = []
        
        monitor_converter = MonitorConfigConv(nsxt_attributes, object_merge_check, merge_object_mapping, sys_dict)
        monitor_converter.convert(avi_config_dict, nsx_lb_config, prefix,tenant,custom_mapping)

        pool_converter = PoolConfigConv(nsxt_attributes, object_merge_check, merge_object_mapping, sys_dict)
        pool_converter.convert(avi_config_dict, nsx_lb_config, prefix, tenant)

        profile_converter = ProfileConfigConv(nsxt_attributes, object_merge_check, merge_object_mapping, sys_dict)
        profile_converter.convert(avi_config_dict, nsx_lb_config, prefix,tenant)

        ssl_profile_converter = SslProfileConfigConv(nsxt_attributes, object_merge_check, merge_object_mapping, sys_dict)
        ssl_profile_converter.convert(avi_config_dict, nsx_lb_config, prefix,tenant)

        persist_conv = PersistantProfileConfigConv(nsxt_attributes, object_merge_check, merge_object_mapping, sys_dict)
        persist_conv.convert(avi_config_dict, nsx_lb_config, prefix,tenant)

        vs_converter = VsConfigConv(nsxt_attributes,object_merge_check, merge_object_mapping,sys_dict,
                                    nsxt_ip, nsxt_passord)
        vs_converter.convert(avi_config_dict, nsx_lb_config, prefix,
                             tenant, vs_state, controller_version, traffic_enabled,
                             cloud_tenant, ssh_root_password, nsxt_util, migration_input_config,
                             vrf, segroup)
        conv_utils.remove_dup_of(avi_config_dict)
        # Validating the aviconfig after generation
        conv_utils.validation(avi_config_dict)
    except Exception as e:
        LOG.error(e)
        update_count('warning')
        LOG.error("Conversion error", exc_info=True)

    output_config = output_path + os.path.sep + "avi_config.json"
   # with open(output_config, "w", encoding='utf-8') as text_file:
       # json.dump(avi_config_dict, text_file, indent=4)

    # Add nsxt converter status report in xslx report
    conv_utils.add_complete_conv_status(
        output_path, avi_config_dict, "nsxt-report", vs_level_status)

    for key in avi_config_dict:
        if key != 'META':
            if key == 'VirtualService':
                if vs_level_status:
                    LOG.info('Total Objects of %s : %s (%s  migrated , %s full conversions)'
                             % (key,len(nsx_lb_config['LbVirtualServers']), len(avi_config_dict[key]),
                                conversion_util.fully_migrated))
                    print('Total Objects of %s : %s (%s  migrated , %s full conversions)' \
                          % (key, len(nsx_lb_config['LbVirtualServers']), len(avi_config_dict[key]),
                             conversion_util.fully_migrated))
                else:
                    LOG.info('Total Objects of %s : %s (%s  migrated)'
                             % (key, len(nsx_lb_config['LbVirtualServers']), len(avi_config_dict[key])))
                    print('Total Objects of %s : %s (%s  migrated)' \
                          % (key,len(nsx_lb_config['LbVirtualServers']),  len(avi_config_dict[key])))

                continue
            # Added code to print merged count.
            elif object_merge_check and key == 'SSLProfile':
                mergedfile = len(avi_config_dict[key]) - ssl_profile_converter.ssl_profile_count
                profile_merged_message = \
                    'Total Objects of %s : %s (%s/%s profile merged)' % \
                    (key, len(avi_config_dict[key]), abs(mergedfile),
                     ssl_profile_converter.ssl_profile_count)
                LOG.info(profile_merged_message)
                print(profile_merged_message)
                continue
            elif object_merge_check and key == 'HealthMonitor':
                mergedmon = len(avi_config_dict[key]) - monitor_converter.monitor_count
                monitor_merged_message = \
                    'Total Objects of %s : %s (%s/%s monitor merged)' % \
                    (key, len(avi_config_dict[key]), abs(mergedmon),
                     monitor_converter.monitor_count)
                LOG.info(monitor_merged_message)
                print(monitor_merged_message)
                continue
            elif object_merge_check and key == 'ApplicationProfile':
                merged_app_pr = len(avi_config_dict[key]) - profile_converter.app_pr_count
                app_profile_merged_message = \
                    'Total Objects of %s : %s (%s/%s profile merged)' % \
                    (key, len(avi_config_dict[key]), abs(merged_app_pr),
                     profile_converter.app_pr_count)
                LOG.info(app_profile_merged_message)
                print(app_profile_merged_message)
                continue
            elif object_merge_check and key == 'NetworkProfile':
                merged_np_pr = len(avi_config_dict[key]) - profile_converter.np_pr_count
                merged_message = \
                    'Total Objects of %s : %s (%s/%s profile merged)' % \
                    (key, len(avi_config_dict[key]), abs(merged_np_pr),
                     profile_converter.np_pr_count)
                LOG.info(merged_message)
                print(merged_message)
                continue
            elif object_merge_check and key == 'ApplicationPersistenceProfile':
                mergedfile = len(avi_config_dict[key]) - \
                             persist_conv.app_per_count
                profile_merged_message = \
                    'Total Objects of %s : %s (%s/%s profile merged)' % \
                    (key, len(avi_config_dict[key]), abs(mergedfile),
                     persist_conv.app_per_count)
                LOG.info(profile_merged_message)
                print(profile_merged_message)
                continue
            elif object_merge_check and key == 'PKIProfile':
                merged_pki_pr = len(avi_config_dict[key]) - (vs_converter.pki_count + monitor_converter.pki_count)
                merged_message = \
                    'Total Objects of %s : %s (%s/%s pki profile merged)' % \
                    (key, len(avi_config_dict[key]), abs(merged_pki_pr),
                     vs_converter.pki_count+monitor_converter.pki_count)
                LOG.info(merged_message)
                print(merged_message)
                continue
            elif object_merge_check and key == 'SSLKeyAndCertificate':
                mergedfile = len(avi_config_dict[key]) - \
                             (vs_converter.certkey_count + monitor_converter.certkey_count)
                certkey_merged_message = \
                    'Total Objects of %s : %s (%s/%s cert key merged)' % \
                    (key, len(avi_config_dict[key]), abs(mergedfile),
                     vs_converter.certkey_count)
                LOG.info(certkey_merged_message)
                print(certkey_merged_message)
                continue
            LOG.info('Total Objects of %s : %s' % (key, len(
                avi_config_dict[key])))
            print('Total Objects of %s : %s' % (key, len(
                avi_config_dict[key])))

    # Check if flag true then skip not in use object
    if not_in_use:
        avi_config_dict = wipe_out_not_in_use(avi_config_dict)
    with open(output_config, "w", encoding='utf-8') as text_file:
        json.dump(avi_config_dict, text_file, indent=4)
    if migrate_to == 'NSX':
        alb_converter = ALBConverter(output_config, output_path)
        alb_converter.convert()

    return avi_config_dict
