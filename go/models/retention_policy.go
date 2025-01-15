// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetentionPolicy retention policy
// swagger:model RetentionPolicy
type RetentionPolicy struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Enables the policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// History of previous runs. Field introduced in 31.1.1. Maximum of 10 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	History []*RetentionSummary `json:"history,omitempty"`

	// Name of the policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Policy specification. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Policy *PolicySpec `json:"policy"`

	// Details of most recent run. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Summary *RetentionSummary `json:"summary,omitempty"`

	// Tenant UUID associated with the Object. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID Identifier for the policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
