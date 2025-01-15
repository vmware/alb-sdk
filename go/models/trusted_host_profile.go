// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TrustedHostProfile trusted host profile
// swagger:model TrustedHostProfile
type TrustedHostProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// List of Host IP(v4/v6) addresses or FQDNs. Field introduced in 31.1.1. Minimum of 1 items required. Maximum of 20 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Hosts []*TrustedHost `json:"hosts,omitempty"`

	// TrustedHostProfile name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Tenant ref for trusted host profile. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// TrustedHostProfile UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
