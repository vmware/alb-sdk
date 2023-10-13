import argparse
import json
import os
import sys
import logging
import requests
from avi.migrationtools.v2alb_converter.config_collector.v_certificate import vCert

LOG = logging.getLogger(__name__)

class NsxvExport:
    def __init__(self, args):
        """

        :param args:
        """
        self.v_host = args.nsxv_ip
        self.v_user = args.nsxv_user
        self.v_pass = args.nsxv_password
        self.v_port = args.nsxv_port

        self.config_folder = (
            args.output_dir_path if args.output_dir_path else "exported_config"
        )

        # self.nsxt_base_url, self.nsxt_session = self.authenticate_nsxt()

    def export_v_config(self):
        try:
            if not os.path.exists(self.config_folder):
                os.mkdir(self.config_folder)

            config_folder = os.path.normpath(self.config_folder)
            v_config_dir = config_folder + os.path.sep + "v-config"
            if not os.path.exists(v_config_dir):
                os.makedirs(v_config_dir)
            LOG.info(f"V config collector directory : {v_config_dir}")
            lb_edge_config_path = v_config_dir + os.path.sep + "config.json"
            nsxv_config = self.get_nsxv_Edges(v_config_dir)
            with open(lb_edge_config_path, "w", encoding="utf-8") as text_file:
                json.dump(nsxv_config, text_file, indent=4)

            # Fetch data for pool with groupingObjectId/groupingObjectName
            LOG.info("Fetch data for pool with groupingObjectId/groupingObjectName")
            nsgroup_mapping = dict()
            for edge in nsxv_config.keys():
                if "pool" in nsxv_config[edge]:
                    for v_pool in nsxv_config[edge]["pool"]:
                        v_pool_members = v_pool.get("member")
                        if v_pool_members:
                            for member in v_pool_members:
                                if "groupingObjectId" in member:
                                    nsgroup_mapping[member["groupingObjectId"]] = ""
                                elif "groupingObjectName" in member:
                                    nsgroup_mapping[member["groupingObjectName"]] = ""

            nsgroup_mapping_file_path = config_folder + os.path.sep + "nsgroup_mapping.json"
            with open(nsgroup_mapping_file_path, "w", encoding="utf-8") as file:
                json.dump(nsgroup_mapping, file, indent=4)

            # exporting certificates from nsxv
            v_cert = vCert(self.v_host, self.v_user, self.v_pass, v_config_dir)
            v_cert.fetch_cert()
        except Exception as e:
            msg = f"Error while exporting nsx-v configuration . Message: {e}"
            print(msg)
            LOG.error(msg)

    def get_nsxv_Edges(self, config_dir):
        LOG.info("exporting nsx-v edges")
        edge_url = "/api/4.0/edges"
        url = "https://" + self.v_host + edge_url
        response = requests.get(
            url,
            auth=(self.v_user, self.v_pass),
            verify=False,
            headers={"Accept": "application/json"},
            stream=True,
        )
       
        nsxv_config = dict()
        config = json.loads(response.text)
        if not config["edgePage"].get("data"):
            msg = "No nsxv edges present on NSX-V instance."
            LOG.error(msg)
            print(msg)
            sys.exit(1)
          
        for edge in config["edgePage"].get("data"):
            nsxv_edge_id = edge.get("objectId")
            lb_url = f"{url}/{nsxv_edge_id}/loadbalancer/config"
            edge_path = f"{config_dir}/{nsxv_edge_id}.json"
            lb_res = requests.get(
                lb_url,
                auth=(self.v_user, self.v_pass),
                verify=False,
                headers={"Accept": "application/json"},
                stream=True,
            )

            edge_config = json.loads(lb_res.text)
            with open(edge_path, "w", encoding="utf-8") as path:
                json.dump(edge_config, path, indent=4)

            nsxv_config[nsxv_edge_id] = edge_config

        return nsxv_config

    def get(self, session, get_url, payload={}, verify=False):
        response = session.get(get_url, data=payload, verify=verify)
        return response


if __name__ == "__main__":
    HELP_STR = """
    Usage:

    Example to use -O or --option to auto upload config to controller after conversion:
        v2alb_converter.py --option auto-upload



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

    parser.add_argument(
        "-o",
        "--output_dir_path",
        help="Folder path to store exported files",
    )

    args = parser.parse_args()
    nsxv_export = NsxvExport(args)
    nsxv_export.export_v_config()
