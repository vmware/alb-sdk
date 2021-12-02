// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OAuthSettings o auth settings
// swagger:model OAuthSettings
type OAuthSettings struct {

	// Application-specific OAuth config. Field introduced in 21.1.3.
	AppSettings *OAuthAppSettings `json:"app_settings,omitempty"`

	// Auth Profile to use for validating users. It is a reference to an object of type AuthProfile. Field introduced in 21.1.3.
	// Required: true
	AuthProfileRef *string `json:"auth_profile_ref"`

	// Resource Server OAuth config. Field introduced in 21.1.3.
	ResourceServer *OAuthResourceServer `json:"resource_server,omitempty"`
}
