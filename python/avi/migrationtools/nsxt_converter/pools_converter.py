from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util, profiles_converter, conversion_util


def update_alb_type(lb_pl, alb_pl):

    if lb_pl['algorithm']=='ROUND_ROBIN':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_ROUND_ROBIN'
    elif lb_pl['algorithm']=='LEAST_CONNECTION':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_LEAST_CONNECTION'
    elif lb_pl['algorithm']== 'IP_HASH':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS'
    alb_pl['min_servers_up']=lb_pl.get('min_active_members')
    alb_pl['max_concurrent_connections']=lb_pl.get('max_concurrent_connections_per_server')
    alb_pl['health_monitor_refs']=lb_pl.get('active_monitor_paths')
    alb_pl['servers'] = dict(
        ip=dict(

            ))
    if(lb_pl.get('members')):
        for member in lb_pl.get('members'):
            alb_pl['servers']['enabled']=member['admin_state']
            alb_pl['servers']['ip']['addr']=member['ip_address']
            alb_pl['servers']['port']=member['port']
            alb_pl['servers']['ratio']=member['weight']
            alb_pl['servers']['description']=member['display_name']
    #todo for snat_translation to preserve_client_ip in application profile


    alb_pl['ConnPoolProperties']=dict(
        upstream_connpool_server_max_cache=lb_pl.get('tcp_multiplexing_number')

    )
    if(lb_pl.get('member_group')):
        alb_pl['nsx_membergroup']=dict(
            nsx_securitygroup=lb_pl['member_group']['group_path']
        )

        if(lb_pl['member_group']['port']):
            alb_pl['default_server_port']=lb_pl['member_group']['port']
    alb_pl['url'], alb_pl['uuid'] = conversion_util.get_obj_url_uuid(lb_pl.get('path'), lb_pl.get('unique_id'))
    tenant = conversion_util.get_tenant_ref(alb_pl.get('url'))
    alb_pl['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')


def convert(alb_config, nsx_lb_config,cloud_name):
    alb_config['Pool'] = list()
    for lb_pl in nsx_lb_config['LbPools']:
        alb_pl=dict(
            name=lb_pl['display_name']
        )
        update_alb_type(lb_pl, alb_pl)
        alb_pl['cloud_ref'] = conversion_util.get_object_ref(cloud_name, 'cloud')
        alb_config['Pool'].append(alb_pl)
