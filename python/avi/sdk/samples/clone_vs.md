# README for clone_vs.py

## Usage

> clone_vs.py [-h] [-c CONTROLLER] [-u USER] [-p PASSWORD] [-x API_VERSION] [-dc DESTCONTROLLER] [-du DESTUSER] [-dp DESTPASSWORD] [-debug] [-dryrun] [-flags FLAGS] [-skp SSLKEYPASSPHRASES] [-t tenant] [-2t other_tenant] [-2c other_cloud] [-2v other_vrf] [-map MAPSERVERS] [-ppn POOLPLACEMENT] [-fc ref_list] object_type ...

Where `object_type` is `vs` (Virtual Service), `gs` (GSLB Service) or `generic` (any other simple object).

Use `clone_vs.py object_type -h` for more detailed help.

The script implements a class `AviClone` which can be used directly from another script for more advanced use cases if desired.

## Description

The clone_vs.py script allows the cloning of Virtual Services, Pools, Pool Groups and other objects.

The script intelligently handles recursively cloning referenced objects as needed. For example, when cloning a Virtual Service, the script will automatically clone referenced Pools, Pool Groups and other objects that are unique to the application.

The script also allows the cloning of objects into a different tenant, VRF and/or cloud than the source - the destination may also be on a different Avi Vantage controller.

It is also possible to create multiple clones of the source object by specifying multiple target object names.

## Object types

The script can clone a Virtual Service, handling the various changes needed due to differences between source and target clouds. See the *Examples* below for various scenarios that have been tested. When cloning a VS, the script can also modify VS parameters such as *ecmp_scaleout* (`-ecmp true|false`), *enable_rhi* (`-rhi true|false`) and VS/Pool placement networks that may need to change when cloning to a different cloud type.

The script can also clone a GSLB Service within the same Controller.

The script can generically clone any simple object using the `generic` action by specifying the type of object (e.g. applicationprofile, pool, healthmonitor).

When cloning Pools, it is possible to specify a mapping between server IPs in the source Pool and server IPs in the cloned Pool.

## Handling of re-usable objects

By default, re-usable child objects/profiles such as Application Profiles, Health Monitors, Persistence Profiles etc. are not cloned; the cloned object simply refers to the same child objects as the original.

When cloning to a different tenant or Controller, the default behaviour is as below:

* If a re-usable object was defined in the admin tenant, it is available for use in all tenants and will not be cloned by default.

* If a re-usable object was defined in the source (non-admin) tenant, the script will use an identically-named object in the target tenant if one is found. Otherwise, the object will be cloned.

The user can override the default behaviour and forcibly clone particular object types rather than attempting to re-use existing objects using the `forceclone` option. For example, to forcibly clone all health monitors, use the option `--forceclone pool-healthmonitor` or `-fc pool-healthmonitor`.

The full list of supported options is displayed in the help.

When cloning child objects, the script will try to preserve object names if possible but will generate a unique name by appending a numerical index if there is a naming conflict.

## Testing and troubleshooting: Debugging and dry-run

Use the `-debug` parameter to have the script output detailed steps as it performs its task. This can be particularly useful to understand how the script is handling re-usable objects, as well as providing some additional detail around some of the modifications being made to the cloned objects.

Use the `-dryrun` parameter to have the script perform the cloning operation and then pause to allow the user to inspect the cloned objects for correct operation. The script then cleans up by deleting all the objects that were cloned to restore the target system to its original state.

## Specifying the VIP for the target Virtual Service

When cloning a Virtual Service, the `-v` parameter must be supplied to specify the VIP for the target VS.

### Static VIP

Simply specify the VIP directly:

> -v 10.10.10.100

### Auto-allocated VIP by subnet

Specify the VIP as a subnet/mask. This must match an auto-allocation subnet in IPAM.

> -v 10.10.10.0/24

### Auto-allocated VIP in same allocation network as the source

If the source VIP was auto-allocated, the target can simply inherit the auto-allocation network:

> -v auto (or -v *)

(Note: On Linux/Unix/Mac systems, use the `auto` option as `*` would need to be escaped to prevent it being treated as a filename glob)

### Specifying public/elastic/floating IP for clouds that support this (e.g. public clouds, OpenStack)

Separate the public/floating IP using a `;`. A static public/floating IP can be specified explicitly, or to auto-allocate a public IP, use the `auto` keyword:

> -v 10.10.10.0/24;203.0.113.100
> -v 10.10.10.0/24;auto

### Avi Internal IPAM

When using Avi Internal IPAM for auto-allocation, it may be necessary in some clouds (e.g. NSX-T Cloud) to supply the `-int` parameter to ensure the VsVip is populated with all the correct fields. Other clouds (e.g. vCenter Cloud) are more forgiving and generally work without specifying this parameter if there is only a single IPAM subnet specified.

## Special flags

The optional `-flags` parameter is used to invoke workarounds or special handling in certain uncommon use cases/scenarios. Multiple flags can be specified (comma-separated). Current flags are:

|Flag|Meaning|
---|---|
disablelearning|Disables WAF learning in a cloned WAF Policy and/or PSM Group.
dep20|Removes deprecated HTTP/2 support flag from Application Profile. Use when cloning from pre-20.1 to post-20.1.
adminssl|Indicates that the target Controller supports the ability for a non-admin tenant to use an SSL certificate in the admin tenant and that cloning the certificate to the non-admin tenant is not desired.
reuseds|Indicates that DataScripts can be re-used rather than cloned.

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

This requires specifying the placement network of both VsVip (using the `-vpn` parameter) and Pool(s) (using the `-ppn` parameter).

For example, consider a Virtual Service that makes use of a Pool Group with two Pools. The first Pool has members in the subnet 10.10.20.0/24, the second Pool has members in the subnet 10.20.20.0/24.

The desired Pool placement is to place the first Pool directly in the network `pool-network-1` which is directly conected to subnet 10.10.20.0/24, and to place the second Pool in the network `pool-network-2` (subnet 10.10.30.0/24) which has reachability to subnet 10.20.20.0/24 via a static route.

The script matches the members of each Pool against the Pool placement list and selects the appropriate placement networks for each Pool.

> clone_vs.py -c controller.acme.com -2c NSX-T-Cloud -ppn 10.10.20.0/24,pool-network-1/10.10.20.0/24;10.20.20.0/24,pool-network-2/10.10.30.0/24 vs example cloned-example -v 10.10.10.2 -vpn example-network/10.10.10.0/24

Note: In the simple case where a single Pool placement network is needed, just specify a wildcard match with e.g. `-ppn 0.0.0.0/0,pool-network/10.10.20.0/24`.

### Cloning a VS and child objects between overlay and VLAN-backed NSX-T Clouds

The `-ecmp false` flag is required here as this would be enabled in the source cloud but not required in the destination cloud.

> clone_vs.py -c controller.acme.com -2c NSX-T-Cloud -ppn 10.10.20.0/24,pool-network-1/10.10.20.0/24 vs example cloned-example -ecmp false -v 10.10.10.2 -vpn example-network/10.10.10.0/24

### Cloning a VS and child objects between two Azure clouds

Note: Azure subnet name (subnet_uuid) must be specified, e.g. vip-subnet.

> clone_vs.py -c controller.acme.com -2c Azure-Cloud-USEast2 vs example cloned-example -v 172.27.33.0/24/vip-subnet

### Cloning a VS and child objects to a different tenant and cloud with auto-allocation of VIP

> clone_vs.py -c controller.acme.com -t tenant1 -2t tenant2 -2c Second-Cloud vs example cloned-example-v 10.10.10.0/24

### Cloning a VS but forcing health monitors and application profiles to be cloned rather than re-used in the cloned VS

> clone_vs.py -c controller.acme.com vs example cloned-example -fc pool-healthmonitor,vs-appprofile

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

### Cloning a GSLB Service within a tenant

> clone_vs.py -c controller.acme.com gs example cloned-example -dn cloned-example.gslb.acme.com

### Cloning a Health Monitor to a different tenant on a different controller

> clone_vs.py -c controller1.acme.com -dc controller2.acme.com -t tenant1 -2t tenant2 -2c Default-Cloud generic healthmonitor example-health-monitor cloned-health-monitor

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

In this case, if learning is enabled in the source WAF Policy, it will remain enabled in the cloned WAF Policy resulting in independent learning for the cloned VS.

The below example clones a VS and forces cloning of the WAF Policy and any PSM groups also.

> clone_vs.py -c controller1.acme.com -fc vs-wafpolicy,positive-security-model vs example cloned-example -v auto

### Disabling learning in the cloned WAF Policy

It may desirable to disable learning for the cloned WAF Policy and its referenced PSM groups, for example if the source Virtual Service was used for learning and the cloned Virtual Service will be an instance of the same application, but independent learning is not desired. This can be achieved with the option  `-flags disablelearning`:

> clone_vs.py -c controller1.acme.com -fc vs-wafpolicy,positive-security-model -flags disablelearning vs example cloned-example -v auto

This flag can also be used when cloning a WAF Policy individually:

> clone_vs.py -c controller1.acme.com -fc positive-security-model -flags disablelearning generic wafpolicy example cloned-example

## Handling of SNI and EVH Parent/Child Virtual Services

The script supports cloning of Parent and Child Virtual Hosting VSs (both EVH and SNI). During cloning, it is possible to change both the Virtual Hosting type (EVH vs. SNI). It is also possible to clone a parent VS to be a child VS and to clone a child VS to be either a parent VS or a normal VS.

### Cloning an SNI/EVH Child VS (same parent VS, different child FQDN)

> clone_vs.py -c controller.acme.com vs example cloned-example -dn cloned-example.acme.com

### Cloning an SNI/EVH Child VS (different parent VS, keeping same child FQDN)

> clone_vs.py -c controller.acme.com vs example cloned-example -np other-parent-vs

Note: When cloning a child VS to a different Controller, Cloud or tenant, you must always specify the new parent VS name

### Cloning an SNI Child VS to an EVH Child VS

> clone_vs.py -c controller.acme.com vs example cloned-example -np other-parent-vs -vh evh_child

Note: "other-parent-vs" must be an EVH Parent VS. The SNI hostname from the source VS will be mapped to EVH host matching rules in the cloned VS.

### Cloning an EVH Child VS to an SNI Child VS

> clone_vs.py -c controller.acme.com vs example cloned-example -np other-parent-vs -vh sni_child

Note: "other-parent-vs" must be an SNI Parent VS. The EVH hostname from the first matching rule in the source VS will be mapped to the SNI hostname in the cloned VS. Other matching criteria from the source VS will be discarded.

### Cloning a child VS to a new SNI parent VS

> clone_vs.py -c controller.acme.com vs example cloned-example -vh sni_parent

Note: If the source VS is an SNI child, the cloned VS will inherit its SSL profile and certificates and the services will be configured for port 443 (SSL). If the source VS is an EVH child, the cloned VS is created as a non-SSL VS using port 80 (no SSL).

### Cloning a child VS to a new standalone VS

> clone_vs.py -c controller.acme.com vs example cloned-example -vh no_vh -mv example-vsvip

Note: A VsVip ("example-vsvip" in this example) must be manually created in advance. If the source VS is an SNI child, the cloned VS will inherit its SSL profile and certificates and the services will be configured for port 443 (SSL). If the source VS is an EVH child, the cloned VS is created as a non-SSL VS using port 80 (no SSL).

## Cross-Version support

By default, the API version is automatically determined based on the minimum of the software versions of the source and destination Controllers. It is also possible to specify the specific API version to be used with the -x parameter.

## Known limitations and caveats

* Cloning a VS to a cloud of a different type than the source cloud is more likely to fail as it may reference shared objects or specific configuration options that do not make sense or that are not supported in the destination cloud.

* Cloning a GSLB Service to a different Controller is not possible

Note: This script is provided only as an example of using the Python SDK to deliver advanced functionality. It is not a formally-supported tool.

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

2.0.1:

* Added support for SNI/EVH Parent/Child migration scenarios

2.0.2:

* Added support for flexibly handling specification of pool placement networks for cloned pools

2.0.3:

* Added some additional reference handling for less-common DataScript and WAF Profile configurations
