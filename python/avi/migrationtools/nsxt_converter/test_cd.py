
from avi.migrationtools.nsxt_converter import v_client

if __name__ == '__main__':
    client = v_client.VCClient('10.206.102.240', 'rest',
                      'Administrator@vsphere.local', 'Admin!23', 'E3:73:FA:B3:8D:81:6E:F2:2A:93:5C:E6:15:04:12:B3:8D:AD:98:5A:30:B0:39:32:A1:72:E9:00:71:94:30:6E')

    url = "/4.0/edges/%s/interfaces" % ('edge-2')
    response = client.get(endpoint=url)
    if response:
        print(response.json())
    # print (client)