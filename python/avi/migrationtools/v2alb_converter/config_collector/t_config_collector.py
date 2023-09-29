import argparse
import json
import os
import requests
import logging
import copy


LOG = logging.getLogger(__name__)


def get_domain_id(nsxt_base_url, nsxt_session):
    # Get domain id from NSX-T
    domain_id = None
    response = nsxt_session.get(nsxt_base_url + "/policy/api/v1/infra/domains/", headers={}, data={}, verify=False)
    results = response.json()["results"]
    if results:
        domain_id = results[0]["id"]
    return domain_id


class NsxtExport:
    def __init__(self, args):
        """

        :param args:
        """
        self.t_host = args.t_host
        self.t_user = args.t_user
        self.t_pass = args.t_pass
        self.t_port = args.t_port

        self.config_folder = (
            args.output_dir_path if args.output_dir_path else "exported_config"
        )

        self.nsxt_base_url, self.nsxt_session = self.authenticate_nsxt()

        self.domain_id = get_domain_id(self.nsxt_base_url, self.nsxt_session)

    def export_t_config(self):   
        try:
            if not os.path.exists(self.config_folder):
                os.mkdir(self.config_folder)

            config_folder = os.path.normpath(self.config_folder)
            config_dir = config_folder + os.path.sep + "t-config"
            LOG.info(f"T config collector directory : {config_dir}")
            if not os.path.exists(config_dir):
                os.makedirs(config_dir)

            edge_to_tier_path = config_dir + os.path.sep + "edge_to_tier1.json"
            (
                edge_to_tier_maps,
                interface_dict,
            ) = self.get_edge_tier1_mapping_and_interface_dict()

            with open(edge_to_tier_path, "w", encoding="utf-8") as text_file:
                json.dump(edge_to_tier_maps, text_file, indent=4)

            interface_path = edge_to_tier_path = config_dir + os.path.sep + "interface.json"

            with open(interface_path, "w", encoding="utf-8") as text_file:
                json.dump(interface_dict, text_file, indent=4)

            # exporting segment data
            seg_config_path = config_dir + os.path.sep + "segment_config.json"
            seg_response = self.get(
                self.nsxt_session, self.nsxt_base_url + "/policy/api/v1/infra/segments"
            )
            segment_list = seg_response.json()["results"]
            with open(seg_config_path, "w", encoding="utf-8") as text_file:
                json.dump(segment_list, text_file, indent=4)

            ns_group_mapping = None
            nsgroup_file_path = self.config_folder + "/nsgroup_mapping.json"
            if os.path.exists(nsgroup_file_path):
                with open(nsgroup_file_path) as file:
                    ns_group_mapping = json.load(file)

            ns_group_mapping_copy = copy.deepcopy(ns_group_mapping)

            if ns_group_mapping:
                for nsgroup in ns_group_mapping.keys():
                    ns_path = self.get_existing_ns_group(nsgroup)
                    ns_group_mapping_copy[nsgroup] = ns_path

            with open(nsgroup_file_path, "w", encoding="utf-8") as text_file:
                json.dump(ns_group_mapping_copy, text_file, indent=4)
        except Exception as e:
            msg = f"Error while exporting nsx-t configuration . Message: {e}"
            print(msg)
            LOG.error(msg)
    
    def get(self, session, get_url, payload={}, verify=False):
        response = session.get(get_url, data=payload, verify=verify)
        return response

    def authenticate_nsxt(self):
        LOG.info("Authenticating Nsx-t")
        nsxt_base_url = f"https://{self.t_host}:{self.t_port}"
        nsxt_session = requests.Session()
        nsxt_session.auth = (self.t_user, self.t_pass)
        return nsxt_base_url, nsxt_session

    def get_edge_tier1_mapping_and_interface_dict(self):
        
        response = self.get(
            self.nsxt_session, self.nsxt_base_url + "/policy/api/v1/infra/tier-1s"
        )

        # Fetch all tier1's from nsx-t
        LOG.debug("Fetching tier1's from nsx-t instance")
        edge_tier1_mapping = dict()
        interface_dict = dict()

        # Get service interface of each tier1
        for tier1 in response.json()["results"]:
            tier_id = tier1["id"]
            ls_response1 = self.get(
                self.nsxt_session,
                self.nsxt_base_url
                + f"/policy/api/v1/infra/tier-1s/{tier_id}/locale-services",
            )
            ls_id = ls_response1.json()["results"][0]["id"]
            response = self.get(
                self.nsxt_session,
                self.nsxt_base_url + f"/policy/api/v1/infra/tier-1s/{tier_id}"
                f"/locale-services/{ls_id}/interfaces",
            )
            interface_dict[tier_id] = response.json().get("results", [])
            for interfaces in response.json().get("results", []):
                if interfaces and "tags" in interfaces:
                    tags_list = interfaces["tags"]
                    for tag in tags_list:
                        if tag["scope"] == "v_origin":
                            edge_name = tag["tag"].split("t1_esg_csp-")[-1]
                            edge_tier1_mapping[edge_name] = tier_id
                            LOG.debug(f"Edge to tier Mapping : {edge_name}-{tier_id}")

        return edge_tier1_mapping, interface_dict

    def get_existing_ns_group(self, ns_name):
        # Get existing ns group from NSX-T
        ns_path = ''
        try:
            headers = {"content-type": "application/json"}
            requests.packages.urllib3.disable_warnings()

            response = self.nsxt_session.get(
                self.nsxt_base_url + "/policy/api/v1/infra/domains/{}/groups/{}".format(self.domain_id, ns_name),
                headers=headers, verify=False)
            response = json.loads(response.text)
            ns_path = response["path"]
        except Exception:
            LOG.debug(f"Error in getting existing ns group for ns group {ns_name}")
        return ns_path


if __name__ == "__main__":
    HELP_STR = """
    Usage:

    Example to use -O or --option to auto upload config to controller after conversion:
        v2alb_converter.py --option auto-upload



    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter, description=HELP_STR
    )

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
    nsxt_export = NsxtExport(args)
    nsxt_export.export_t_config()
