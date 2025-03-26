// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPClientAuthenticationParams HTTP client authentication params
// swagger:model HTTPClientAuthenticationParams
type HTTPClientAuthenticationParams struct {

	// Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthProfileRef *string `json:"auth_profile_ref,omitempty"`

	// Basic authentication realm to present to a user along with the prompt for credentials. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Realm *string `json:"realm,omitempty"`

	// Rrequest URI path when the authentication applies. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RequestURIPath *StringMatch `json:"request_uri_path,omitempty"`

	// type of client authentication. Enum options - HTTP_BASIC_AUTH. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`
}
