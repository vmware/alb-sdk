// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OauthLog oauth log
// swagger:model OauthLog
type OauthLog struct {

	// Authentication policy rule match. Field introduced in 21.1.3.
	AuthnRuleMatch *AuthnRuleMatch `json:"authn_rule_match,omitempty"`

	// Authorization policy rule match. Field introduced in 21.1.3.
	AuthzRuleMatch *AuthzRuleMatch `json:"authz_rule_match,omitempty"`

	// OAuth SessionCookie expired. Field introduced in 21.1.3.
	IsSessionCookieExpired *bool `json:"is_session_cookie_expired,omitempty"`

	// Subrequest info related to fetching jwks keys from jwks uri endpoint. Field introduced in 21.1.3.
	JwksSubrequest *OauthSubRequestLog `json:"jwks_subrequest,omitempty"`

	// OAuth state. Enum options - OAUTH_STATE_CLIENT_IDP_HANDSHAKE_REDIRECT, OAUTH_STATE_CLIENT_IDP_HANDSHAKE_FAIL, OAUTH_STATE_TOKEN_EXCHANGE_REQUEST, OAUTH_STATE_TOKEN_EXCHANGE_RESPONSE, OAUTH_STATE_TOKEN_INTROSPECTION_REQUEST, OAUTH_STATE_TOKEN_INTROSPECTION_RESPONSE, OAUTH_STATE_REFRESH_TOKEN_REQUEST, OAUTH_STATE_REFRESH_TOKEN_RESPONSE, OAUTH_STATE_JWKS_URI_REQUEST, OAUTH_STATE_JWKS_URI_RESPONSE, OAUTH_STATE_USERINFO_REQUEST, OAUTH_STATE_USERINFO_RESPONSE. Field introduced in 21.1.3.
	OauthState *string `json:"oauth_state,omitempty"`

	// OAuth request State to avoid CSRF atatcks. Field introduced in 21.1.3.
	State *string `json:"state,omitempty"`

	// Subrequest info related to the code exchange flow. Field introduced in 21.1.3.
	TokenExchangeSubrequest *OauthSubRequestLog `json:"token_exchange_subrequest,omitempty"`

	// Subrequest info related to Token Introspection. Field introduced in 21.1.3.
	TokenIntrospectionSubrequest *OauthSubRequestLog `json:"token_introspection_subrequest,omitempty"`

	// Subrequest info related to refresh access Token flow. Field introduced in 21.1.3.
	TokenRefreshSubrequest *OauthSubRequestLog `json:"token_refresh_subrequest,omitempty"`
}
