def get_obj_url_uuid(path,unique_id):
    url = path + "-" +unique_id
    uuid = url.split('/')[-1]
    return url,uuid
def get_tenant_ref(name):
    tenant="admin"
    if name and name.startswith('/'):
        parts = name.split('/', 2)
        tenant = parts[1]
        if not parts[2]:
            LOG.warning('Invalid tenant ref : %s' % name)
    elif name and '/' in name:
        parts = name.split('/')
        # Changed the index to get the tenant and name in case of
        # prefixed name
        tenant = parts[-2]
    if tenant.lower() == 'common':
        tenant = 'admin'
    if '/' in name:
        name = name.split('/')[-1]
    if ' ' in tenant:
        tenant = tenant.split(' ')[-1]
    return tenant,name
def get_object_ref( object_name, object_type,
                        prefix=None,cloud_name='Default-cloud'):
    if prefix:
        object_name = prefix + '-' + object_name
    if object_type == 'tenant':
        ref = '/api/tenant/?name=%s' %(object_name)
    elif object_type == 'cloud':
        ref = '/api/%s/?tenant=admin&name=%s' % (object_type, object_name)
    elif object_type == 'vrfcontext':
        ref = '/api/%s/?tenant=admin&name=%s&cloud=%s' % (
            object_type, object_name, cloud_name)
    else:
        ref='/api/%s/?tenant=admin&name=%s' % (object_type,object_name )
    return ref
<<<<<<< HEAD







=======
>>>>>>> 5fb000a9b7a05505177061270c1bc49d9cb4e675
