// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthTokenCreateResponse auth token create response
// swagger:model AuthTokenCreateResponse
type AuthTokenCreateResponse struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// ISO8601 expiry timestamp of the token. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpiresAt *string `json:"expires_at,omitempty"`

	// True if the token has no expiry and is treated as single-use (valid for one hour from creation). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SingleUse *bool `json:"single_use,omitempty"`

	// The generated token key (secret). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Token *string `json:"token,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the newly created auth token. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
