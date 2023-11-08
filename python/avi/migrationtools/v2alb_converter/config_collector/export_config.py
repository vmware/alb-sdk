import argparse
import os
import sys
import logging

from avi.migrationtools.v2alb_converter.config_collector.t_config_collector import (
    NsxtExport,
)
from avi.migrationtools.v2alb_converter.config_collector.v_config_collector import (
    NsxvExport,
)

sys.path.insert(0, os.getcwd())
LOG = logging.getLogger(__name__)

class Namespace:
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


class ConfigCollector:
    def __init__(self, args):
        """

        :param args:
        """
        self.v_host = args.nsxv_ip
        self.v_user = args.nsxv_user
        self.v_pass = args.nsxv_password
        self.v_port = args.nsxv_port

        self.t_host = args.t_host
        self.t_user = args.t_user
        self.t_pass = args.t_pass
        self.t_port = args.t_port

        self.config_folder = (
            args.output_dir_path if args.output_dir_path else "exported_config"
        )

    def export_v_t_config(self):

        if not os.path.exists(self.config_folder):
            os.mkdir(self.config_folder)

        config_folder = os.path.normpath(self.config_folder)

        config_dir = (
            config_folder + os.path.sep + self.v_host + os.path.sep + "input_config"
        )

        if not os.path.exists(config_dir):
            os.makedirs(config_dir)
        LOG.info("Exporting Config of V and T")
        args = Namespace(
            nsxv_ip=self.v_host,
            nsxv_user=self.v_user,
            nsxv_password=self.v_pass,
            nsxv_port=self.v_port,
            output_dir_path=config_dir,
        )
        v_collector = NsxvExport(args)
        v_collector.export_v_config()

        args = Namespace(
            t_host=self.t_host,
            t_user=self.t_user,
            t_pass=self.t_pass,
            t_port=self.t_port,
            output_dir_path=config_dir,
        )
        t_collector = NsxtExport(args)
        t_collector.export_t_config()


if __name__ == "__main__":
    HELP_STR = """
    Usage:


    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR
    )

    parser.add_argument("-n", "--nsxv_ip",
                        help="Ip of NSX-V Manager", required=True)
    parser.add_argument("-u", "--nsxv_user",
                        help="NSX-V User name", required=True)
    parser.add_argument("-p", "--nsxv_password", help="NSX-V Password")
    parser.add_argument("-port", "--nsxv_port", default=443, help="NSX-V Port")
    parser.add_argument("--ssh_root_password", help="ssh root  Password")

    parser.add_argument("--t_host", help="Ip of NSX-t Manager", required=True)
    parser.add_argument("--t_user", help="NSX-T User name", required=True)
    parser.add_argument("--t_pass", help="NSX-T Password")
    parser.add_argument("--t_port", default=443, help="NSX-T Port")

    parser.add_argument(
        "-o",
        "--output_dir_path",
        help="Folder path to store exported files",
    )

    args = parser.parse_args()
    nsxt_export = ConfigCollector(args)
    nsxt_export.export_v_t_config()
