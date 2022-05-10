from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util, profiles_converter, conversion_util


<<<<<<< HEAD
def update_alb_type(lb_pl, alb_pl, prefix):
    if lb_pl['algorithm'] == 'ROUND_ROBIN':
=======

def update_alb_type(lb_pl, alb_pl,prefix):

    if lb_pl['algorithm']=='ROUND_ROBIN':
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_ROUND_ROBIN'
    elif lb_pl['algorithm'] == 'LEAST_CONNECTION':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_LEAST_CONNECTION'
    elif lb_pl['algorithm'] == 'IP_HASH':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS'
<<<<<<< HEAD
    alb_pl['min_servers_up'] = lb_pl.get('min_active_members')
    alb_pl['max_concurrent_connections'] = lb_pl.get('max_concurrent_connections_per_server')
=======
    alb_pl['min_servers_up']=lb_pl.get('min_active_members')
    alb_pl['max_concurrent_connections']=lb_pl.get('max_concurrent_connections_per_server')
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675

    alb_pl['servers'] = dict(
        ip=dict(

        ))
    if lb_pl.get('members'):
        for member in lb_pl.get('members'):
<<<<<<< HEAD
            alb_pl['servers']['enabled'] = member.get('admin_state')
            alb_pl['servers']['ip']['addr'] = member.get('ip_address')
            alb_pl['servers']['ip']['type'] = 'V4'
            alb_pl['servers']['port'] = member.get('port')
            alb_pl['servers']['ratio'] = member.get('weight')
            alb_pl['servers']['description'] = member.get('display_name')
    # todo for snat_translation to preserve_client_ip in application profile

    alb_pl['conn_pool_properties'] = dict(
=======
            alb_pl['servers']['enabled']=member.get('admin_state')
            alb_pl['servers']['ip']['addr']=member.get('ip_address')
            alb_pl['servers']['ip']['type']='V4'
            alb_pl['servers']['port']=member.get('port')
            alb_pl['servers']['ratio']=member.get('weight')
            alb_pl['servers']['description']=member.get('display_name')
    #todo for snat_translation to preserve_client_ip in application profile


    alb_pl['ConnPoolProperties']=dict(
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        upstream_connpool_server_max_cache=lb_pl.get('tcp_multiplexing_number')

    )
    if lb_pl.get('member_group'):
        alb_pl['nsx_membergroup'] = dict(
            nsx_securitygroup=lb_pl['member_group']['group_path']
        )

<<<<<<< HEAD
        if lb_pl['member_group']['port']:
            alb_pl['default_server_port'] = lb_pl['member_group']['port']
    alb_pl['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')
    if lb_pl.get('active_monitor_paths'):
        tenant, name = conversion_util.get_tenant_ref(lb_pl.get('active_monitor_paths')[0])
        alb_pl['health_monitor_ref'] = conversion_util.get_object_ref(name, 'healthmonitor', prefix)


def convert(alb_config, nsx_lb_config, cloud_name, prefix):
    alb_config['Pool'] = list()
    for lb_pl in nsx_lb_config['LbPools']:
        if prefix:
            name = '%s-%s' % (prefix, lb_pl['display_name'])
        else:
            name = lb_pl['display_name']
        alb_pl = dict(
            name=name
        )
        update_alb_type(lb_pl, alb_pl, prefix)
=======
        if(lb_pl['member_group']['port']):
            alb_pl['default_server_port']=lb_pl['member_group']['port']
    alb_pl['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')
    if lb_pl.get('active_monitor_paths'):
        tenant,name=conversion_util.get_tenant_ref(lb_pl.get('active_monitor_paths')[0])
        alb_pl['health_monitor_ref'] = conversion_util.get_object_ref(name,'healthmonitor',prefix)


def convert(alb_config, nsx_lb_config,cloud_name,prefix):
    alb_config['Pool'] = list()
    for lb_pl in nsx_lb_config['LbPools']:
        if prefix:
            name='%s-%s' % (prefix,lb_pl['display_name'])
        else :
            name=lb_pl['display_name']
        alb_pl=dict(
                name=name
        )
        update_alb_type(lb_pl, alb_pl,prefix)
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        alb_pl['cloud_ref'] = conversion_util.get_object_ref(cloud_name, 'cloud')

        alb_config['Pool'].append(alb_pl)
