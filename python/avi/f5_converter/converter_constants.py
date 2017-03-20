import yaml
import os

DEFAULT_TIMEOUT = 16
DEFAULT_INTERVAL = 5
DEFAULT_TIME_UNTIL_UP = 1
PORT_START = 1
PORT_END = 65535
DEFAULT_PORT = 80
DEFAULT_FAILED_CHECKS = 1
DEFAULT_MAX_HEADER = 49152
BYTES_IN_KB = 1024
MIN_CACHE_OBJ_SIZE = 100
MAX_CACHE_OBJ_SIZE = 4194304
DEFAULT_CACHE_MAX_AGE = 600
DEFAULT_CACHE_MAX_ENTRIES = 0
DEFAULT_RECV_WIN = 64
MIN_RECV_WIN = 32
MAX_RECV_WIN = 65536
MIN_SYN_RETRANS = 3
MAX_SYN_RETRANS = 8
HTTPS_PORT = 443
FTP_PORT = 21
SMTP_PORT = 25
SNMP_PORT = 161
TELNET_PORT = 23
SNMP_TRAP_PORT = 162
SSH_PORT = 22
XFER_PORT = 82
PCSYNC_HTTPS_PORT = 8443
MACROMEDIA_FCS_PORT = 1935
SEC_IN_MIN = 60
MIN_IN_HR = 60
HR_IN_DAY = 24
SOURCE_ADDR_TIMEOUT = 180
MIN_SESSION_TIMEOUT = 60
MAX_SESSION_TIMEOUT = 1800
DEFAULT_CONTENT_TYPE = ['text/html', 'text/xml', 'text/plain', 'application/pdf', 'text/javascript', 'application/javascript', 'application/x-javascript', 'application/xml', 'text/css']

def init(version):
    """
    This function defines that to initialize constant from yaml file
    :return: None
    """
    global f5_command_status
    f5_command_status = yaml.safe_load(open(os.path.dirname(__file__)
                                                   + "/command_status.yaml"))
    if version == '10':
        return f5_command_status['VERSION_10']
    else:
        return f5_command_status['VERSION_11']
