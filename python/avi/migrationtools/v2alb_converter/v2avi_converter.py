import argparse
import copy
import glob
import json
import logging
import os
import sys
from datetime import datetime

from avi.migrationtools import avi_rest_lib
from avi.migrationtools.avi_converter import AviConverter
from avi.migrationtools.v2alb_converter import v2avi_config_converter
from avi.migrationtools.v2alb_converter.certificate_plugin import CertificatePlugin
from avi.migrationtools.v2alb_converter.config_collector.export_config import (
    ConfigCollector,
)
from avi.migrationtools.v2alb_converter.v2avi_utils import NsxvUtil

LOG = logging.getLogger(__name__)
ARG_CHOICES = {"option": ["cli-upload", "auto-upload"]}


class Namespace:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


class NsxvConverter(AviConverter):
    def __init__(self, args):
        """

        :param args:
        """
        self.nsxv_ip = args.nsxv_ip
        self.nsxv_user = args.nsxv_user
        self.nsxv_password = args.nsxv_password
        self.nsxv_port = args.nsxv_port
        self.prefix = args.prefix
        self.controller_ip = args.alb_controller_ip
        self.user = args.alb_controller_user
        self.password = args.alb_controller_password
        self.tenant = args.alb_controller_tenant
        self.t_host = args.t_host
        self.t_user = args.t_user
        self.t_pw = args.t_pass
        self.t_port = args.t_port
        self.controller_version = args.alb_controller_version
        self.output_file_path = (
            args.output_file_path if args.output_file_path else "output"
        )
        self.option = args.option
        self.ssh_root_password = args.ssh_root_password
        self.object_merge_check = args.object_merge
        self.exported_config_path = args.exported_config_path
        self.byot_file = args.byot
        self.not_in_use = args.not_in_use
        self.vs_filter = args.vs_filter
        self.vs_level_status = args.vs_level_status

    def convert_vlb_config(self, args):

        try:
            if not os.path.exists(self.output_file_path):
                os.mkdir(self.output_file_path)

            output_dir = os.path.normpath(self.output_file_path)
            self.init_logger_path()
            is_download_from_host = False
            args_copy = copy.deepcopy(args)
            vars(args_copy).pop("nsxv_password")
            vars(args_copy).pop("alb_controller_password")
            output_path = None
            LOG.info("Migration Tool started")
            if self.nsxv_ip:
                output_path = (
                    output_dir + os.path.sep + self.nsxv_ip + os.path.sep + "output"
                )
                if not os.path.exists(output_path):
                    os.makedirs(output_path)
                input_path = (
                    output_dir + os.path.sep + self.nsxv_ip + os.path.sep + "input_config"
                )
                if not os.path.exists(input_path):
                    os.makedirs(input_path)

                is_download_from_host = True

            else:
                LOG.debug("Input configuration provided")
                output_path = output_dir + os.path.sep + "config-output"
                if not os.path.exists(output_path):
                    os.makedirs(output_path)
                input_path = self.exported_config_path

            if is_download_from_host:
                LOG.debug("Copying files from host")
                print("Copying Files from Host...")

                args = Namespace(
                    nsxv_ip=self.nsxv_ip,
                    nsxv_user=self.nsxv_user,
                    nsxv_password=self.nsxv_password,
                    nsxv_port=self.nsxv_port,
                    t_host=self.t_host,
                    t_user=self.t_user,
                    t_pass=self.t_pw,
                    t_port=self.t_port,
                    output_dir_path=output_dir,
                )
                export_config = ConfigCollector(args)
                export_config.export_v_t_config()
                LOG.debug("Copied input files")

            vedge_lb_config = {}
            v_edges_path = glob.glob(
                "{}/{}/{}".format(input_path, "v-config", "edge-*.json")
            )

            for file_name in v_edges_path:
                with open(file_name) as v_file:
                    edge_data = json.load(v_file)

                    edge_id = file_name.split("/")[-1].split(".json")[0]
                    vedge_lb_config[edge_id] = edge_data

            edge_to_tier1 = {}
            edge_to_tier_path = input_path + "/" + "t-config/" + "edge_to_tier1.json"

            if self.byot_file:
                LOG.info("Fetching edge to tier mapping from given BYOT file")
                with open(self.byot_file) as f:
                    edge_to_tier1 = json.load(f)

            elif os.path.exists(edge_to_tier_path):

                with open(edge_to_tier_path) as f:
                    edge_to_tier1 = json.load(f)

            else:
                LOG.info("Neither byot nor edge to tier mapping present")
                print("please provide edge to tier mapping")

            nsxv_util = NsxvUtil(
                self.nsxv_ip,
                self.nsxv_user,
                self.nsxv_password,
                input_path,
                self.t_host,
                self.t_user,
                self.t_pw,
                self.t_port,
                c_user=self.user,
                c_ip=self.controller_ip,
                c_pw=self.password,
                c_vr=self.controller_version,
            )

            v_edge_mapping_dict = nsxv_util.set_details_for_edge(edge_to_tier1)

            cert_plugin = CertificatePlugin(input_path, self.tenant)
            certificate_data, edge_cert_dict = cert_plugin.xlate()

            if not vedge_lb_config:
                LOG.warning("Not found NSXV configuration file")
                print("Not found NSXV configuration file")
                return

            alb_config = v2avi_config_converter.convert(
                nsxv_util,
                vedge_lb_config,
                input_path,
                output_path,
                self.tenant,
                self.prefix,
                self.object_merge_check,
                v_edge_mapping_dict,
                certificate_data,
                edge_cert_dict,
                vs_level_status=self.vs_level_status,
                not_in_use=self.not_in_use,
            )

            alb_config = self.process_for_utils(
                alb_config, skip_ref_objects=["cloud_ref", "tenant_ref"]
            )

            if self.option == "auto-upload":
                LOG.info("Uploading config to controller")
                self.upload_config_to_controller(alb_config)

        except Exception as e:
            LOG.debug(f"Error in migrating LB config. Message: {e}")
            print("\033[91m" + "Error in migrating LB config. Message: ", str(e) +"\033[0m")

    def upload_config_to_controller(self, alb_config):

        try:
            avi_rest_lib.upload_config_to_controller(
                alb_config,
                self.controller_ip,
                self.user,
                self.password,
                self.tenant,
                self.controller_version,
            )
        except Exception as e:
            print(
                "Exception occurred while uploading config to controller."
                "Reason: {}".format(
                    str(e)
                )
            )
            sys.exit(1)


if __name__ == "__main__":
    HELP_STR = """
    Usage:

    Example to use -O or --option to auto upload config to
    controller after conversion:
        v2alb_converter.py --option auto-upload
    """
    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR
    )
    parser.add_argument(
        "-c", "--alb_controller_ip", required=True,
        help="controller ip for auto upload"
    )
    parser.add_argument(
        "--alb_controller_version",
        required=True,
        help="Target Avi controller version",
        default="21.1.4",
    )
    parser.add_argument(
        "--alb_controller_user",
        required=True,
        help="controller username for auto upload",
    )
    parser.add_argument(
        "--alb_controller_password",
        required=True,
        help="controller password for auto upload. Input "
        "prompt will appear if no value provided",
    )
    parser.add_argument(
        "-t",
        "--alb_controller_tenant",
        help="tenant name for auto upload",
        default="admin",
    )

    parser.add_argument("-n", "--nsxv_ip", help="Ip of NSX-V Manager")
    parser.add_argument("-u", "--nsxv_user", help="NSX-V User name")
    parser.add_argument("-p", "--nsxv_password", help="NSX-V Password")
    parser.add_argument("-port", "--nsxv_port", default=443, help="NSX-V Port")
    parser.add_argument("--ssh_root_password", help="ssh root  Password")
  
    parser.add_argument("--t_host", help="Ip of NSX-t Manager")
    parser.add_argument("--t_user", help="NSX-T User name")
    parser.add_argument("--t_pass", help="NSX-T Password")
    parser.add_argument("--t_port", default=443, help="NSX-T Port")

    parser.add_argument(
        "-o",
        "--output_file_path",
        help="Folder path for output files to be created in",
    )
    parser.add_argument(
        "-O",
        "--option",
        choices=ARG_CHOICES["option"],
        help="Upload option cli-upload generates Avi config "
        + "file auto upload will upload config to "
        + "controller",
    )
    parser.add_argument(
        "--object_merge", help="flag for object merge check",
        action="store_true"
    )

    parser.add_argument("--prefix", help="Prefix for objects")

    parser.add_argument(
        "--exported_config_path",
        "-d",
        help="exported config folder location containing \
        both v config and t config",
    )
    parser.add_argument(
        "--not_in_use", help="flag to skip not in use", action="store_true"
    )
    parser.add_argument("--byot", help="edge to tier mapping byot file")
    parser.add_argument("--vs_filter", help="only migrate selected vs/s")
    parser.add_argument(
        "--vs_level_status",
        action="store_true",
        help="Add columns of vs reference and overall skipped "
        "settings in status excel sheet",
    )
    start = datetime.now()
    args = parser.parse_args()

    nsxv_converter = NsxvConverter(args)
    nsxv_converter.convert_vlb_config(args)
    end = datetime.now()
    print("The time of execution of above program is :", str(end - start))
