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

	// Allowed signing algorithms when the matched JWK omits the 'alg' field (RFC 7517 §4.4). If the JWK carries 'alg', that value always wins and this list is ignored. An empty list rejects all such tokens (secure default). Only applicable when JWT Profile type is CLIENT_AUTH. Enum options - JWS_ALG_RS256, JWS_ALG_RS384, JWS_ALG_RS512, JWS_ALG_PS256, JWS_ALG_PS384, JWS_ALG_PS512, JWS_ALG_ES256, JWS_ALG_ES384, JWS_ALG_ES512. Field introduced in 32.1.4. Maximum of 9 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllowedAlgorithms []string `json:"allowed_algorithms,omitempty"`

	// JWT Auth configuration for profile_type CONTROLLER_INTERNAL_AUTH. Field introduced in 20.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerInternalAuth *ControllerInternalAuth `json:"controller_internal_auth,omitempty"`

	// This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 20.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFederated *bool `json:"is_federated,omitempty"`

	// Uniquely identifiable name of the Token Issuer, only allowed with profile_type CLIENT_AUTH. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Issuer *string `json:"issuer,omitempty"`

	// JWKS key set used for validating the JWT, only allowed with profile_type CLIENT_AUTH. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwksKeys *string `json:"jwks_keys,omitempty"`

	// Type of JWT Server profile which defines the usage type. Enum options - CLIENT_AUTH, CONTROLLER_INTERNAL_AUTH. Field introduced in 20.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtProfileType *string `json:"jwt_profile_type,omitempty"`

	// Name of the JWT Profile. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// OAuth 2.0 Protected Resource Metadata configuration (RFC 9728). Only applicable when jwt_profile_type is CLIENT_AUTH. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProtectedResourceConfig *JWTProtectedResourceConfig `json:"protected_resource_config,omitempty"`

	// UUID of the Tenant. It is a reference to an object of type Tenant. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the JWTProfile. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
