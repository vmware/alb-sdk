from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util
def update_alb_type(lb_pr, alb_pr):
    if lb_pr['resource_type'] == 'LBHttpProfile':
        alb_pr['type'] = 'APPLICATION_PROFILE_TYPE_HTTP'

        alb_pr['http_profile'] = dict(
            xff_enabled=lb_pr.get('xForwardedFor'),
            http_to_https=lb_pr.get('httpRedirectToHttps'),
            keepalive_timeout=lb_pr.get('idle_timeout'),
            client_max_header_size=lb_pr['request_header_size'],
            client_max_body_size=lb_pr.get('requestBodySize')
        )
    elif lb_pr['resource_type'] == 'LBFastTcpProfile':
        alb_pr['profile']=dict(
            type = 'APPLICATION_PROFILE_TYPE_TCP',
            tcp_fast_path_profile=dict(
                session_idle_timeout=lb_pr['idle_timeout'])
        )

    elif lb_pr['resource_type'] == 'LBFastUdpProfile':
        alb_pr['profile'] = dict(
            type='APPLICATION_PROFILE_TYPE_UDP',
            udp_fast_path_profile=dict(
                session_idle_timeout=lb_pr['idle_timeout']

            )
        )

def convert(alb_config, nsx_lb_config):
    alb_config['ApplicationProfile'] = list()
    alb_config['NetworkProfile'] = list()
    for lb_pr in nsx_lb_config['LbAppProfiles']:
        alb_pr=dict(
            name=lb_pr['display_name']
        )
        update_alb_type(lb_pr, alb_pr)
        if lb_pr['resource_type'] == 'LBHttpProfile':
            alb_config['ApplicationProfile'].append(alb_pr)
        else:
            alb_config['NetworkProfile'].append(alb_pr)
