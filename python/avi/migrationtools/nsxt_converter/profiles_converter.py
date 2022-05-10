from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util, conversion_util


def update_alb_type(lb_pr, alb_pr):
<<<<<<< HEAD
    alb_pr['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')
=======

    alb_pr['tenant_ref']=conversion_util.get_object_ref('admin','tenant')
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675

    if lb_pr['resource_type'] == 'LBHttpProfile':
        alb_pr['type'] = 'APPLICATION_PROFILE_TYPE_HTTP'

        alb_pr['http_profile'] = dict(
<<<<<<< HEAD
            xff_enabled=lb_pr.get('xForwardedFor', False),
            http_to_https=lb_pr.get('httpRedirectToHttps', False),
=======
            xff_enabled=lb_pr.get('xForwardedFor',False),
            http_to_https=lb_pr.get('httpRedirectToHttps',False),
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
            keepalive_timeout=lb_pr.get('idle_timeout'),
            client_max_header_size=lb_pr.get('request_header_size'),
            client_max_body_size=lb_pr.get('requestBodySize')
        )
    elif lb_pr['resource_type'] == 'LBFastTcpProfile':
        alb_pr['profile'] = dict(
            type='APPLICATION_PROFILE_TYPE_TCP',
            tcp_fast_path_profile=dict(
                session_idle_timeout=lb_pr.get('idle_timeout'))
        )

    elif lb_pr['resource_type'] == 'LBFastUdpProfile':
        alb_pr['profile'] = dict(
            type='APPLICATION_PROFILE_TYPE_UDP',
            udp_fast_path_profile=dict(
                session_idle_timeout=lb_pr.get('idle_timeout')

            )
        )

<<<<<<< HEAD

def convert(alb_config, nsx_lb_config, cloud_name, prefix):
=======
def convert(alb_config, nsx_lb_config,cloud_name,prefix):
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
    alb_config['ApplicationProfile'] = list()
    alb_config['NetworkProfile'] = list()
    for lb_pr in nsx_lb_config['LbAppProfiles']:
        if prefix:
<<<<<<< HEAD
            name = '%s-%s' % (prefix, lb_pr.get('display_name'))
        else:
            name = lb_pr.get('display_name')
        alb_pr = dict(
            name=name
=======
            name='%s-%s' % (prefix,lb_pr.get('display_name'))
        else :
            name=lb_pr.get('display_name')
        alb_pr=dict(
                name=name
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        )
        update_alb_type(lb_pr, alb_pr)
        if lb_pr['resource_type'] == 'LBHttpProfile':
            alb_config['ApplicationProfile'].append(alb_pr)

        else:
            alb_config['NetworkProfile'].append(alb_pr)
