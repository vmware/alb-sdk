// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAMDNSSubnetDomainList Ipam Dns subnet domain list
// swagger:model IpamDnsSubnetDomainList
type IPAMDNSSubnetDomainList struct {

	// List of networks, v4 subnets and v6 subnets. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllocNetworksAndSubnets []*CustomIPAMSubnet `json:"alloc_networks_and_subnets,omitempty"`

	// List of v4 and v6 subnets with ranges. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllocSubnetsAndRanges []*InfobloxSubnetRange `json:"alloc_subnets_and_ranges,omitempty"`

	// List of DNS records. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSRecords *IPAMDNSRecordInfo `json:"dns_records,omitempty"`

	// Domains List. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Domains []string `json:"domains,omitempty"`

	// Failure reason. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// Subnet List. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnets []*IPAddrPrefix `json:"subnets,omitempty"`

	// Domains List with visibility. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Zdomains []*DNSDomain `json:"zdomains,omitempty"`
}
