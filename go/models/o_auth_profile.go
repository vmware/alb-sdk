// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OAuthProfile o auth profile
// swagger:model OAuthProfile
type OAuthProfile struct {

	// URL of authorization server. Field introduced in 21.1.3.
	// Required: true
	AuthorizationEndpoint *string `json:"authorization_endpoint"`

	// URL of token introspection server. Field introduced in 21.1.3.
	IntrospectionEndpoint *string `json:"introspection_endpoint,omitempty"`

	// Uniquely identifiable name of the Token Issuer. Field introduced in 21.1.3.
	Issuer *string `json:"issuer,omitempty"`

	// Lifetime of the cached JWKS keys. Field introduced in 21.1.3.
	JwksTimeout *int32 `json:"jwks_timeout,omitempty"`

	// JWKS URL of the endpoint that hosts the public keys that can be used to verify any JWT issued by the authorization server. Field introduced in 21.1.3.
	JwksURI *string `json:"jwks_uri,omitempty"`

	// Buffering size for the responses from the OAUTH enpoints. Field introduced in 21.1.3.
	OauthRespBufferSz *int32 `json:"oauth_resp_buffer_sz,omitempty"`

	// Pool object to interface with Authorization Server endpoints. It is a reference to an object of type Pool. Field introduced in 21.1.3.
	PoolRef *string `json:"pool_ref,omitempty"`

	// URL of token exchange server. Field introduced in 21.1.3.
	// Required: true
	TokenEndpoint *string `json:"token_endpoint"`

	// URL of the Userinfo Endpoint. Field introduced in 21.1.3.
	UserinfoEndpoint *string `json:"userinfo_endpoint,omitempty"`
}
