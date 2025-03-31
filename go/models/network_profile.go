// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkProfile network profile
// swagger:model NetworkProfile
type NetworkProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// When enabled, Avi mirrors all TCP fastpath connections to standby. Applicable only in Legacy HA Mode. Field introduced in 18.1.3,18.2.1. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false) edition.
	ConnectionMirror *bool `json:"connection_mirror,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// The name of the network profile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Profile *NetworkProfileUnion `json:"profile"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the network profile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
