// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPNetworkSubnet IP network subnet
// swagger:model IPNetworkSubnet
type IPNetworkSubnet struct {

	// IPv6 reserved range of IPs for VirtualService IP allocation with Infoblox as the IPAM provider. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IPV6Range *IPAddrRange `json:"ipv6_range,omitempty"`

	// Network for VirtualService IP allocation with Vantage as the IPAM provider. Network should be created before this is configured. It is a reference to an object of type Network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkRef *string `json:"network_ref,omitempty"`

	// IPv4 reserved range of IPs for VirtualService IP allocation with Infoblox as the IPAM provider. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Range *IPAddrRange `json:"range,omitempty"`

	// Subnet for VirtualService IP allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet *IPAddrPrefix `json:"subnet,omitempty"`

	// Subnet for VirtualService IPv6 allocation with Vantage or Infoblox as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Subnet6 *IPAddrPrefix `json:"subnet6,omitempty"`

	// Subnet UUID or Name or Prefix for VirtualService IPv6 allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Field introduced in 18.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Subnet6UUID *string `json:"subnet6_uuid,omitempty"`

	// Subnet UUID or Name or Prefix for VirtualService IP allocation with AWS or OpenStack as the IPAM provider. Only one of subnet or subnet_uuid configuration is allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SubnetUUID *string `json:"subnet_uuid,omitempty"`
}
