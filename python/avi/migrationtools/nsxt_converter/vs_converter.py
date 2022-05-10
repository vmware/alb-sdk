from avi.migrationtools.nsxt_converter import conversion_util


<<<<<<< HEAD
def update_alb_type(lb_vs, alb_vs, prefix):
    alb_vs['enabled'] = lb_vs.get('enabled')

    alb_vs['services'] = dict(
        port=lb_vs.get('ports')[0]
    )

    alb_vs['ssl_profile_ref'] = lb_vs.get('client_ssl_profile_binding')
    alb_vs['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')


def convert(alb_config, nsx_lb_config, cloud_name, prefix):
=======
def update_alb_type(lb_vs, alb_vs,prefix):

    alb_vs['enabled'] = lb_vs.get('enabled')

    alb_vs['services']=dict(
        port=lb_vs.get('ports')[0]
        )


    alb_vs['ssl_profile_ref']=lb_vs.get('client_ssl_profile_binding')
    alb_vs['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')



def convert(alb_config, nsx_lb_config,cloud_name,prefix):
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
    alb_config['VirtualService'] = list()
    alb_config['vsvip'] = list()
    for lb_vs in nsx_lb_config['LBVirtualServers']:
        if prefix:
<<<<<<< HEAD
            name = '%s-%s' % (prefix, lb_vs['display_name'])
        else:
            name = lb_vs['display_name']
        vsvip = dict(
=======
            name='%s-%s' % (prefix,lb_vs['display_name'])
        else :
            name=lb_vs['display_name']
        vsvip=dict(
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
            ip_address=dict(
                addr=lb_vs['ip_address'],
                type="V4"
            )
        )
        alb_vs = dict(
            name=name,

        )

<<<<<<< HEAD
        update_alb_type(lb_vs, alb_vs, prefix)
=======
        update_alb_type(lb_vs, alb_vs,prefix)
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
        alb_vs['cloud_ref'] = conversion_util.get_object_ref(cloud_name, 'cloud')
        alb_config['VirtualService'].append(alb_vs)
        alb_config['vsvip'].append(vsvip)
