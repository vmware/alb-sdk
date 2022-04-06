// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthenticationPolicy authentication policy
// swagger:model AuthenticationPolicy
type AuthenticationPolicy struct {

	// Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AuthProfileRef *string `json:"auth_profile_ref,omitempty"`

	// Add rules to apply auth profile to specific targets. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AuthnRules []*AuthenticationRule `json:"authn_rules,omitempty"`

	// HTTP cookie name for authenticated session. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CookieName *string `json:"cookie_name,omitempty"`

	// Cookie timeout in minutes. Allowed values are 1-1440. Field deprecated in 18.2.3. Field introduced in 18.2.1. Unit is MIN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CookieTimeout *int32 `json:"cookie_timeout,omitempty"`

	// Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DefaultAuthProfileRef *string `json:"default_auth_profile_ref,omitempty"`

	// Globally unique entityID for this node. Entity ID on the IDP should match this. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EntityID *string `json:"entity_id,omitempty"`

	// Key to generate the cookie. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Key []*HTTPCookiePersistenceKey `json:"key,omitempty"`

	// Single Signon URL to be programmed on the IDP. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SingleSignonURL *string `json:"single_signon_url,omitempty"`

	// SAML SP metadata. Field deprecated in 18.2.3. Field introduced in 18.2.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	SpMetadata *string `json:"sp_metadata,omitempty"`
}
