// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JWTServerProfile j w t server profile
// swagger:model JWTServerProfile
type JWTServerProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Uniquely identifiable name of the Token Issuer. Field introduced in 20.1.3.
	// Required: true
	Issuer *string `json:"issuer"`

	// JWKS key set used for validating the JWT. Field introduced in 20.1.3.
	// Required: true
	JwksKeys *string `json:"jwks_keys"`

	// Name of the JWT Profile. Field introduced in 20.1.3.
	// Required: true
	Name *string `json:"name"`

	// UUID of the Tenant. It is a reference to an object of type Tenant. Field introduced in 20.1.3.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the JWTProfile. Field introduced in 20.1.3.
	UUID *string `json:"uuid,omitempty"`
}
