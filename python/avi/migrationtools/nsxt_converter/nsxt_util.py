
from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util

class NSXUtil():

    nsx_api_client = None

    def __init__(self, nsx_un, nsx_pw, nsx_ip, nsx_port):
        self.nsx_api_client = nsx_client_util.create_nsx_policy_api_client(
            nsx_un, nsx_pw, nsx_ip, nsx_port, auth_type=nsx_client_util.SESSION_AUTH)

    def get_nsx_config(self):
        nsx_lb_config = dict()
        nsx_lb_config["LBServices"] = self.nsx_api_client.infra.LbServices.list().to_dict().get("results", [])
        nsx_lb_config["LbMonitorProfiles"] = self.nsx_api_client.infra.LbMonitorProfiles.list().to_dict().get("results", [])
        nsx_lb_config["LbPools"] = self.nsx_api_client.infra.LbPools.list().to_dict().get("results", [])
        nsx_lb_config["LbAppProfiles"] = self.nsx_api_client.infra.LbAppProfiles.list().to_dict().get("results", [])
        nsx_lb_config["LBVirtualServers"] = self.nsx_api_client.infra.LbVirtualServers.list().to_dict().get("results", [])

        return nsx_lb_config

if __name__ == "__main__":
    nsx_util = NSXUtil('admin', 'Admin!23Admin', '10.168.204.70', '443')
    nsx_lb_config = nsx_util.get_nsx_config()
    print(nsx_lb_config)
