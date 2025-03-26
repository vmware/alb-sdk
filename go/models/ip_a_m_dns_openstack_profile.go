// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAMDNSOpenstackProfile ipam Dns openstack profile
// swagger:model IpamDnsOpenstackProfile
type IPAMDNSOpenstackProfile struct {

	// Keystone's hostname or IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeystoneHost *string `json:"keystone_host,omitempty"`

	// The password Avi will use when authenticating to Keystone. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// Region name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Region *string `json:"region,omitempty"`

	// OpenStack tenant name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tenant *string `json:"tenant,omitempty"`

	// The username Avi will use when authenticating to Keystone. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`

	// Network to be used for VIP allocation. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipNetworkName *string `json:"vip_network_name,omitempty"`
}
