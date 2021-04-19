// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SamlIdentityProviderSettings saml identity provider settings
// swagger:model SamlIdentityProviderSettings
type SamlIdentityProviderSettings struct {

	// SAML IDP metadata. Field introduced in 17.2.3.
	Metadata *string `json:"metadata,omitempty"`
}
