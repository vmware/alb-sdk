import com.vmware.nsx_policy.model_client as model_client

from avi.migrationtools.nsxt_converter import conversion_util


def get_alb_response_codes(response_codes):
    if not response_codes:
        return None
    HttpResponseCode = model_client.ALBHealthMonitorHttp
    codes = list()
    for code in response_codes:
        if code < 200:
            if HttpResponseCode.HTTP_RESPONSE_CODE_1XX not in codes:
                codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_1XX)
        elif code > 199 and code < 300:
            if HttpResponseCode.HTTP_RESPONSE_CODE_2XX not in codes:
                codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_2XX)
        elif code > 299 and code < 400:
            if HttpResponseCode.HTTP_RESPONSE_CODE_3XX not in codes:
                codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_3XX)
        elif code > 399 and code < 500:
            if HttpResponseCode.HTTP_RESPONSE_CODE_4XX not in codes:
                codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_4XX)
        elif code > 499 and code < 600:
            if HttpResponseCode.HTTP_RESPONSE_CODE_5XX not in codes:
                codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_5XX)
    return codes


def update_alb_type(lb_hm, alb_hm):
    if lb_hm['resource_type'] == 'LBHttpMonitorProfile':
        alb_hm['type'] = 'HEALTH_MONITOR_HTTP'
        alb_hm['http_monitor'] = dict(
            http_request=lb_hm.get('request_url'),
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=get_alb_response_codes(lb_hm.get('response_status_codes')),
        )
    elif lb_hm['resource_type'] == 'LBHttpsMonitorProfile':
        alb_hm['type'] = 'HEALTH_MONITOR_HTTPS'
        alb_hm['https_monitor'] = dict(
            http_request=lb_hm.get('request_url'),
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=get_alb_response_codes(lb_hm.get('response_status_codes')),
        )
    elif lb_hm['resource_type'] == 'LBIcmpMonitorProfile':
        alb_hm['type'] = 'HEALTH_MONITOR_PING'
    elif lb_hm['resource_type'] == 'LBTcpMonitorProfile':
        alb_hm['type'] = 'HEALTH_MONITOR_TCP'
    elif lb_hm['resource_type'] == 'LbUdpMonitorProfile':
        alb_hm['type'] = 'HEALTH_MONITOR_UDP'

    alb_hm['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')

<<<<<<< HEAD

def convert(alb_config, nsx_lb_config, cloud_name, prefix):
=======
def convert(alb_config, nsx_lb_config,cloud_name,prefix):
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
    alb_config['HealthMonitor'] = list()

    for lb_hm in nsx_lb_config['LbMonitorProfiles']:
        if lb_hm['resource_type'] == 'LBPassiveMonitorProfile':
            continue
        if prefix:
<<<<<<< HEAD
            name = '%s-%s' % (prefix, lb_hm['display_name'])
        else:
            name = lb_hm.get('display_name')
=======
            name='%s-%s' % (prefix,lb_hm['display_name'])
        else :
            name=lb_hm.get('display_name')
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        alb_hm = dict(
            name=name,
            failed_checks=lb_hm.get('fall_count'),
            receive_timeout=lb_hm.get('timeout'),
            send_interval=lb_hm.get('interval'),
            monitor_port=lb_hm.get('monitor_port', None),
        )
        update_alb_type(lb_hm, alb_hm)
        alb_config['HealthMonitor'].append(alb_hm)
