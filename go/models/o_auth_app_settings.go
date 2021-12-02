// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OAuthAppSettings o auth app settings
// swagger:model OAuthAppSettings
type OAuthAppSettings struct {

	// Application specific identifier. Field introduced in 21.1.3.
	// Required: true
	ClientID *string `json:"client_id"`

	// Application specific identifier secret. Field introduced in 21.1.3.
	// Required: true
	ClientSecret *string `json:"client_secret"`

	// OpenID Connect specific configuration. Field introduced in 21.1.3.
	OidcConfig *OIDCConfig `json:"oidc_config,omitempty"`

	// Scope specified to give limited access to the app. Field introduced in 21.1.3.
	Scopes []string `json:"scopes,omitempty"`
}
