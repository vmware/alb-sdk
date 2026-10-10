from avi.migrationtools.nsxt_converter import nsxt_client as nsx_client_util, profiles_converter
def update_alb_type(lb_pl, alb_pl):
    if lb_pl['algorithm']=='ROUND_ROBIN':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_ROUND_ROBIN'
    elif lb_pl['algorithm']=='LEAST_CONNECTION':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_LEAST_CONNECTION'
    elif lb_pl['algorithm']== 'IP_HASH':
        alb_pl['lb_algorithm'] = 'LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS'
    alb_pl['min_servers_up']=lb_pl['min_active_members']
    alb_pl['max_concurrent_connections']=lb_pl.get('max_concurrent_connections_per_server')
    alb_pl['health_monitor_refs']=lb_pl.get('active_monitor_paths')
    alb_pl['servers'] = dict(
        ip=dict(

            ))

    for member in lb_pl['members']:
        alb_pl['servers']['enabled']=member['admin_state']
        alb_pl['servers']['ip']['addr']=member['ip_address']
        alb_pl['servers']['port']=member['port']
        alb_pl['servers']['ratio']=member['weight']
        alb_pl['servers']['description']=member['display_name']



    alb_pl['ConnPoolProperties']=dict(
        upstream_connpool_server_max_cache=lb_pl['tcp_multiplexing_number']

    )



def convert(alb_config, nsx_lb_config):
    alb_config['Pool'] = list()
    for lb_pl in nsx_lb_config['LbPools']:
        alb_pl=dict(
            name=lb_pl['display_name']
        )
        update_alb_type(lb_pl, alb_pl)
        alb_config['Pool'].append(alb_pl)
