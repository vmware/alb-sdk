// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RoutingServiceRuntime routing service runtime
// swagger:model RoutingServiceRuntime
type RoutingServiceRuntime struct {

	// Advertise reachability of backend server networks via ADC through BGP for default gateway feature. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdvertiseBackendNetworks *bool `json:"advertise_backend_networks,omitempty"`

	// Indicates if auto gateway is enabled in routing service. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableAutoGateway *bool `json:"enable_auto_gateway,omitempty"`

	// Service Engine acts as Default Gateway for this service. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableRouting *bool `json:"enable_routing,omitempty"`

	// Enable VIP on all interfaces of this service. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableVipOnAllInterfaces *bool `json:"enable_vip_on_all_interfaces,omitempty"`

	// Use Virtual MAC address for interfaces on which floating interface IPs are placed. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableVMAC *bool `json:"enable_vmac,omitempty"`

	// Floating Interface IPs for the RoutingService. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FloatingIntfIP []*IPAddr `json:"floating_intf_ip,omitempty"`

	// Floating Interface IP6 list for the RoutingService. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FloatingIntfIp6Addresses []*IPAddr `json:"floating_intf_ip6_addresses,omitempty"`

	// Floating Interface IP6 SE2 list for the RoutingService. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FloatingIntfIp6Se2Addresses []*IPAddr `json:"floating_intf_ip6_se_2_addresses,omitempty"`

	// Floating Interface IPs SE2 for the RoutingService. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FloatingIntfIPSe2 []*IPAddr `json:"floating_intf_ip_se_2,omitempty"`

	// Ip forwarding. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPForwarding *bool `json:"ip_forwarding,omitempty"`

	// NAT policy for outbound NAT functionality. This is done in post-routing. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NatPolicyUUID *string `json:"nat_policy_uuid,omitempty"`

	// Routing is done via linux ipstack. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoutingByLinuxIpstack *bool `json:"routing_by_linux_ipstack,omitempty"`
}
