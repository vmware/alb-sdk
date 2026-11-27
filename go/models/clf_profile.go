// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfProfile clf profile
// swagger:model ClfProfile
type ClfProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of pools associated with this profile (1 to 8). Each pool must have a unique priority value. The controller rejects profiles where two pools share the same priority (HTTP 400). Field introduced in 32.1.5. Minimum of 1 items required. Maximum of 8 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfPools []*ClfPool `json:"clf_pools,omitempty"`

	// Human-readable description for this CLF profile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Enable or disable log delivery for this profile without disturbing pool state, health monitors, or VirtualService/DataScriptSet bindings. When false, datascript log forwarding is a silent no-op for every VS attached via this profile; delivery resumes immediately when set back to true. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// The name of the CLF profile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Reference to the tenant that owns this CLF profile. It is a reference to an object of type Tenant. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// When true, log forwarding traffic for this profile is sent through the Service Engine management interface in the management VRF instead of the data interfaces in the profile's VRF context. Health monitors cannot be configured on any pool of a profile with this knob enabled, and the knob cannot be enabled while any pool has health monitors; remove them first. Cannot be changed after the profile is created. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseManagement *bool `json:"use_management,omitempty"`

	// UUID of the CLF profile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Virtual Routing Context for this profile's collector pools. Only Virtual Services in the same Virtual Routing Context can use this profile. Cannot be changed once set. It is a reference to an object of type VrfContext. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VrfContextRef *string `json:"vrf_context_ref"`
}
