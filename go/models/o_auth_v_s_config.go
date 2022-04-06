// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OAuthVSConfig o auth v s config
// swagger:model OAuthVSConfig
type OAuthVSConfig struct {

	// HTTP cookie name for authorized session. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	CookieName *string `json:"cookie_name,omitempty"`

	// HTTP cookie timeout for authorized session. Allowed values are 1-1440. Field introduced in 21.1.3. Unit is MIN. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	CookieTimeout *int32 `json:"cookie_timeout,omitempty"`

	// Key to generate the cookie. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Key []*HTTPCookiePersistenceKey `json:"key,omitempty"`

	// Application and IDP settings for OAuth/OIDC. Field introduced in 21.1.3. Maximum of 1 items allowed. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	OauthSettings []*OAuthSettings `json:"oauth_settings,omitempty"`

	// Redirect URI specified in the request to Authorization Server. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	RedirectURI *string `json:"redirect_uri,omitempty"`
}
