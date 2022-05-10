# !/usr/bin/env python3

from avi.migrationtools.nsxt_converter import nsxt_config_converter
import argparse


def conver_lb_config(args):
    output_file_path = args.output_file_path if args.output_file_path else 'output'
    nsxt_config_converter.convert(args.nsxt_ip, args.nsxt_user, args.nsxt_passord, args.nsxt_port, output_file_path,args.cloud_name,args.prefix)




if __name__ == "__main__":

    HELP_STR = """
    Usage:
    python nsxt_converter.py -n 192.168.100.101 -u admin -p password 
    """

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter,
        description=HELP_STR)

    parser.add_argument('-n', '--nsxt_ip', required=True,
                        help='Ip of NSXT')
    parser.add_argument('-u', '--nsxt_user', required=True,
                        help='NSX-T User name')
    parser.add_argument('-p', '--nsxt_passord', required=True,
                        help='NSX-T Password')
    parser.add_argument('-port', '--nsxt_port', default=443,
                        help='NSX-T Port')
    parser.add_argument('-o', '--output_file_path',
                        help='Folder path for output files to be created in',
                        )
    parser.add_argument('--vrf',
                        help='Update the available vrf ref with the custom vrf'
                             'reference')
    parser.add_argument('--cloud_name', required=True,help='cloud name for auto upload')
    parser.add_argument('--prefix' ,help='Prefix for objects')
    args = parser.parse_args()
    conver_lb_config(args)

