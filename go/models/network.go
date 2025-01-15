// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Network network
// swagger:model Network
type Network struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Key/value network attributes. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Attrs []*KeyValue `json:"attrs,omitempty"`

	//  It is a reference to an object of type Cloud. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfiguredSubnets []*Subnet `json:"configured_subnets,omitempty"`

	// Select the IP address management scheme for this Network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DhcpEnabled *bool `json:"dhcp_enabled,omitempty"`

	// When selected, excludes all discovered subnets in this network from consideration for virtual service placement. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExcludeDiscoveredSubnets *bool `json:"exclude_discovered_subnets,omitempty"`

	// Enable IPv6 auto configuration. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6AutocfgEnabled *bool `json:"ip6_autocfg_enabled,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SyncedFromSe *bool `json:"synced_from_se,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VcenterDvs *bool `json:"vcenter_dvs,omitempty"`

	//  It is a reference to an object of type VIMgrNWRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	VimgrnwRef *string `json:"vimgrnw_ref,omitempty"`

	//  It is a reference to an object of type VrfContext. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfContextRef *string `json:"vrf_context_ref,omitempty"`
}
