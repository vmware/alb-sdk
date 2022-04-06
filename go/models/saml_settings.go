// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SamlSettings saml settings
// swagger:model SamlSettings
type SamlSettings struct {

	// Configure remote Identity provider settings. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Idp *SamlIdentityProviderSettings `json:"idp,omitempty"`

	// Configure service provider settings for the Controller. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Sp *SamlServiceProviderSettings `json:"sp"`
}
