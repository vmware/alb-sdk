
def update_alb_type(lb_vs, alb_vs):
    alb_vs['enabled'] = lb_vs['enabled']
    alb_vs['vip']=lb_vs.get('ip_address')
    alb_vs['services']=dict(
        port=lb_vs['ports'][0]
        )
    alb_vs['pool_ref']=lb_vs['pool_path']
    alb_vs['application_profile_ref']=lb_vs['application_profile_path']
    alb_vs['ssl_profile_ref']=lb_vs.get('client_ssl_profile_binding')

def convert(alb_config, nsx_lb_config):
    alb_config['VirtualService'] = list()

    for lb_vs in nsx_lb_config['LBVirtualServers']:
        alb_vs = dict(
            name=lb_vs['display_name'],

        )

        update_alb_type(lb_vs, alb_vs)

        alb_config['VirtualService'].append(alb_vs)
