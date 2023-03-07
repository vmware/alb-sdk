# Description

The clone_vs.py script allows the cloning of Virtual Services, Pools, Pool Groups and other objects.

The script intelligently handles recursively cloning referenced objects as needed. For example, when cloning a Virtual Service, the script will automatically clone referenced Pools, Pool Groups and other objects that are unique to the application.

The script also allows the cloning of objects into a different tenant and/or cloud than the source - the destination may also be on a different Avi Vantage controller.

## Handling of re-usable objects

By default, re-usable child objects/profiles such as Application Profiles, Health Monitors, Persistence Profiles etc. are not cloned; the cloned object simply refers to the same child objects as the original.

When cloning to a different tenant or Controller, the default behaviour is as below:

* If a re-usable object was defined in the admin tenant, it is available for use in all tenants and will not be cloned by default.

* If a re-usable object was defined in the source (non-admin) tenant, the script will use an identically-named object in the target tenant if one is found. Otherwise, the object will be cloned.

The user can override the default behaviour and forcibly clone particular object types rather than attempting to re-use existing objects using the `forceclone` option. For example, to forcibly clone all health monitors, use the option `--forceclone pool-healthmonitor` or `-fc pool-healthmonitor`.

The full list of supported options is displayed in the help.

When cloning child objects, the script will try to preserve object names if possible but will generate a unique name by appending a numerical index if there is a naming conflict.

## Examples

### Cloning a VS and its child objects within a tenant

> clone_vs.py -c controller.acme.com vs example cloned-example -v 10.10.10.2

### Cloning a VS and its child objects within a tenant to a different Service Engine Group

> clone_vs.py -c controller.acme.com vs example cloned-example -v 10.10.10.2 -g Target-SEG

### Cloning a VS and its child objects to a different tenant

> clone_vs.py -c controller.acme.com -t tenant1 -2t tenant2 vs example cloned-example -v 10.10.10.2

### Cloning a VS and child objects to a different VRF

Note: The target cloud must be specified even if it is the same cloud as the source cloud.

> clone_vs.py -c controller.acme.com -2c Second-Cloud -2v targetvrf vs example cloned-example -v 10.10.10.2

### Cloning a VS and child objects to an NSX-T Cloud using overlay networking

Note: The -2v parameter is used but the target tier1_LR is specified rather than a VRF.

> clone_vs.py -c controller.acme.com -2c NSX-T-Cloud -2v /infra/tier-1s/my-t1 vs example cloned-example -v 10.10.10.2

### Cloning a VS and child objects to an NSX-T Cloud using VLAN-backed networking

VS Placement network and subnet is specified here.

Note: Pools will require manual placement network configuration.

> clone_vs.py -c controller.acme.com -2c NSX-T-Cloud vs example cloned-example -v 10.10.10.2 -vsp example-network/10.10.10.0/24

### Cloning a VS and child objects between overlay and VLAN-backed NSX-T Clouds

The `-ecmp false` flag is required as this would be enabled in the source cloud but not required in the destination cloud.

Note: Pools will require manual placement network configuration after cloning.

> clone_vs.py -c controller.acme.com -2c NSX-T-Cloud vs example cloned-example -ecmp false -v 10.10.10.2 -vsp example-network/10.10.10.0/24

### Cloning a VS and child objects between two Azure clouds

Note: Azure subnet name (subnet_uuid) must be specified, e.g. vip-subnet.

> clone_vs.py -c controller.acme.com -2c Azure-Cloud-USEast2 vs example cloned-example -v 172.27.33.0/24/vip-subnet

### Cloning a VS and child objects to a different tenant and cloud with auto-allocation of VIP

> clone_vs.py -c controller.acme.com -t tenant1 -2t tenant2 -2c Second-Cloud vs example cloned-example-v 10.10.10.0/24

### Cloning a VS but forcing health monitors and application profiles to be cloned rather than re-used in the cloned VS

> clone_vs.py -c controller.acme.com vs example cloned-example -fc pool-healthmonitor,vs-appprofile

### Cloning an Application Profile to a different tenant on a different controller

> clone_vs.py -c controller1.acme.com -dc controller2.acme.com -t tenant1 -2t tenant2 -2c Default-Cloud generic health-monitor cloned-health-monitor

### Cloning a GSLB Service within a tenant

> clone_vs.py -c controller.acme.com gs example cloned-example -dn cloned-example.gslb.acme.com

### Cloning a GSLB Service to a different tenant with auto-assignment of FQDN based on new service name and domain from source service

> clone_vs.py -c controller.acme.com -t tenant1 -2t tenant2 gs example cloned-example -dn auto

### Cloning a VS to a different controller with an AWS cloud, specifying auto-allocation for VIPs by subnet in 3 AZs

> clone_vs.py -c controller1.acme.com -dc controller2.acme.com -t tenant -2t tenant -2c AWS-Cloud vs example cloned-example -v 10.0.0.0/24,10.1.0.0/24,10.2.0.0/24

### As above but also with elastic IP allocation

> clone_vs.py -c controller1.acme.com -dc controller2.acme.com -t tenant -2t tenant -2c AWS-Cloud vs example cloned-example -v 10.0.0.0/24,10.1.0.0/24,10.2.0.0/24;auto,auto,auto

### Cloning a VS with a static IPv4 and IPv6 address

> clone_vs.py -c controller1.acme.com vs example cloned-example -v 10.0.0.10 -v6 fd00:dead:beef:bad:f00d::10

### Cloning a VS with a new auto-allocation for IPv4 and IPv6

> clone_vs.py -c controller1.acme.com vs example cloned-example -v 10.0.0.0/16 -v6 fd00:dead:beef:bad:f00d::/64

## SSL Certificate handling

SSLKeyAndCertificate objects that contain a private key secured by a passphrase will not clone successfully by default. The user must provide the required passphrase in order to clone such objects. This is achieved using the option `-skp certname1,passphrase1;certname2,passphrase2`. When cloning certificates with a passphrase set, the passphrase will be looked up against the name of the SSLKeyAndCertificate object in this list.

If the passphrase is omitted for a certificate or * is specified, the user will be prompted to enter the passphrase by the script.

### Cloning a Virtual Service specifying SSL key passphrases

In this example, the user will be prompted to enter the passphrase for the certificate object called "MyCert1". The passphrase for the certificate called "MyCert2" is explicitly given as "mysecretphrase".

> clone_vs.py -c controller1.acme.com -skp MyCert1,*;MyCert2,mysecretphrase vs example cloned-example



## WAF Policy handling

The cloning of WAF Policies requires some special consideration depending on the use case.

### Cloning a Virtual Service using a shared WAF Policy

This scenario applies when the cloned VS is on the same Controller and in the same tenant (or the WAF Policy is in the admin tenant). The default operation of the script supports this scenario. WAF Policy referenced by a Virtual Service will not be cloned by default when cloning a VS within the same Controller.

This will result in a failure if the WAF Policy is configured for PSM learning as this is not supported for shared WAF Policies - for this scenario, clone the WAF Policy as per the below.

If cloning a Virtual Service between Controllers or to a different tenant, the default operation will clone the referenced WAF Policy. For this scenario check the caveats below.

### Cloning a Virtual Service using a cloned WAF Policy

A WAF Policy and its referenced PSM groups can be forced cloned using the -fc flag. This supports the scenarios where the cloned VS should have its own WAF Policy rather than sharing the same WAF policy (including the case where learning is enabled).

In this case, if learning is enabled in the source WAF Policy, it will remain enabled in the cloned WAF Policy resulting in indepdent learning for the cloned VS.

The below example clones a VS and forces cloning of the WAF Policy and any PSM groups also.

> clone_vs.py -c controller1.acme.com -fc vs-wafpolicy,positive-security-model vs example cloned-example -v *

### Disabling learning in the cloned WAF Policy

It may desirable to disable learning for the cloned WAF Policy and its referenced PSM groups, for example if the source Virtual Service was used for learning and the cloned Virtual Service will be an instance of the same application, but independent learning is not desired. This can be achieved with the option  `-flag disablelearning`:

> clone_vs.py -c controller1.acme.com -fc vs-wafpolicy,positive-security-model -flag disablelearning vs example cloned-example -v *

This flag can also be used when cloning a WAF Policy individually:

> clone_vs.py -c controller1.acme.com -fc positive-security-model -flag disablelearning generic wafpolicy example cloned-example

## Cross-Version support

By default, the API version is automatically determined based on the minimum of the software versions of the source and destination Controllers. It is also possible to specify the specific API version to be used with the -x parameter.

## Known limitations and caveats

* Depending on the version of Avi Vantage and configuration, it may be possible for a VS in a non-admin tenant to reference and use SSL certificates in the admin tenant. However by default, this script will instead clone certificates to the target tenant.

This behaviour can be enabled with the option `-flag adminssl`

* Cloning a VS to a cloud of a different type to the source cloud is more likely to fail as it may reference shared objects which do not make sense in the destination cloud.

* Cloning a GSLB Service to a different Controller is not possible

Changelog:

2.0.0:

* Moved usage examples into this file and added a changelog
* Refactored code and removed compatibility support for pre-17.1 VirtualService structure
* Added support for cloning to/from NSX-T Cloud (both Overlay and VLAN-backed)
* Added support for specifying VS Placement network
* Added support for enabling/disabling scaleout_ecmp and enable_rhi flags in target VS
* Enhancements for cross-cloud and cross-VRF cloning to cater for more scenarios
* Moved several function parameters to instance variables
* Removed specific option for cloning pools - pools can now be cloned using the "generic" option
* Added enhanced support for cloning of WAF Policies
* Added support for cloning SSLKeyAndCertificate objects that have passphrases protecting the private key
