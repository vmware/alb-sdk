// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsVip vs vip
// swagger:model VsVip
type VsVip struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Select BGP peers, using peer label, for VsVip advertisement. Field introduced in 20.1.5. Maximum of 128 items allowed.
	BgpPeerLabels []string `json:"bgp_peer_labels,omitempty"`

	//  It is a reference to an object of type Cloud. Field introduced in 17.1.1.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Field introduced in 17.1.1. Maximum of 1000 items allowed. Allowed in Basic edition, Essentials edition, Enterprise edition.
	DNSInfo []*DNSInfo `json:"dns_info,omitempty"`

	// Force placement on all Service Engines in the Service Engine Group (Container clouds only). Field introduced in 17.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EastWestPlacement *bool `json:"east_west_placement,omitempty"`

	// Determines the set of IPAM networks to use for this VsVip. Selector type must be SELECTOR_IPAM and only one label is supported. Field introduced in 20.1.3.
	IPAMSelector *Selector `json:"ipam_selector,omitempty"`

	// Key value pairs for granular object access control. Also allows for classification and tagging of similar objects. Field deprecated in 20.1.5. Field introduced in 20.1.2. Maximum of 4 items allowed.
	Labels []*KeyValue `json:"labels,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// Name for the VsVip object. Field introduced in 17.1.1.
	// Required: true
	Name *string `json:"name"`

	//  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// This sets the placement scope of virtualservice to given tier1 logical router in Nsx-t. Field introduced in 20.1.1.
	Tier1Lr *string `json:"tier1_lr,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// This overrides the cloud level default and needs to match the SE Group value in which it will be used if the SE Group use_standard_alb value is set. This is only used when FIP is used for VS on Azure Cloud. Field introduced in 18.2.3. Allowed in Basic edition, Essentials edition, Enterprise edition.
	UseStandardAlb *bool `json:"use_standard_alb,omitempty"`

	// UUID of the VsVip object. Field introduced in 17.1.1.
	UUID *string `json:"uuid,omitempty"`

	// List of Virtual Service IPs and other shareable entities. Field introduced in 17.1.1.
	Vip []*Vip `json:"vip,omitempty"`

	// Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext. Field introduced in 17.1.1.
	VrfContextRef *string `json:"vrf_context_ref,omitempty"`

	// Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.
	VsvipCloudConfigCksum *string `json:"vsvip_cloud_config_cksum,omitempty"`
}
