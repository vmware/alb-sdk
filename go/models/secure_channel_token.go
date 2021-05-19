// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecureChannelToken secure channel token
// swagger:model SecureChannelToken
type SecureChannelToken struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Expiry time for auth_token.
	ExpiryTime *float64 `json:"expiry_time,omitempty"`

	// Whether this auth_token is used by some node(SE/controller). Field introduced in 21.1.1.
	InUse *bool `json:"in_use,omitempty"`

	// Metadata associated with auth_token.
	Metadata []*SecureChannelMetadata `json:"metadata,omitempty"`

	// Auth_token used for SE/controller authorization.
	// Required: true
	Name *string `json:"name"`

	// Deprecated  Uuid of SE or controller who is using this auth_token. Field deprecated in 21.1.1.
	NodeUUID *string `json:"node_uuid,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Auth_token used for SE/controller authorization.
	UUID *string `json:"uuid,omitempty"`
}
