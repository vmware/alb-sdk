// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRateLimitProfile Api rate limit profile
// swagger:model ApiRateLimitProfile
type APIRateLimitProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Description for the Api Rate Limit Profile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Activate/Deactivate the Api Rate Limit Profile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Name of the Api Rate Limit Profile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// List of the Rate Limiter configuration UUIDs. It is a reference to an object of type RateLimitConfiguration. Field introduced in 31.2.1. Minimum of 1 items required. Maximum of 100 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RateLimitConfigurationRefs []string `json:"rate_limit_configuration_refs,omitempty"`

	// Tenant ref for the Api Rate Limit Profile. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the Api Rate Limit Profile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
