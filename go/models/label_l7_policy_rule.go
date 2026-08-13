// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelL7PolicyRule label l7 policy rule
// swagger:model LabelL7PolicyRule
type LabelL7PolicyRule struct {

	// The matched SSOPolicy authentication rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_AUTHPROFILE — the same scope authorization_rule uses; this field is what actually tells them apart. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthenticationRule *AuthenticationRule `json:"authentication_rule,omitempty"`

	// The matched SSOPolicy authorization rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_AUTHPROFILE — the same scope authentication_rule uses; this field is what actually tells them apart. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthorizationRule *AuthorizationRule `json:"authorization_rule,omitempty"`

	// The matched BotDetectionPolicy allow-list rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BotRule *BotAllowRule `json:"bot_rule,omitempty"`

	// The matched CSRFPolicy rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_CSRFPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CsrfRule *CSRFRule `json:"csrf_rule,omitempty"`

	// The matched HTTPRequestPolicy rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPRequestRule *HTTPRequestRule `json:"http_request_rule,omitempty"`

	// The matched HTTPResponsePolicy rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPResponseRule *HTTPResponseRule `json:"http_response_rule,omitempty"`

	// The matched HTTPSecurityPolicy rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPSecurityRule *HTTPSecurityRule `json:"http_security_rule,omitempty"`

	// The matched WafPolicy allow-list rule, verbatim. Set when scope is MATCH_ACTION_SCOPE_WAFPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRule *WafPolicyAllowlistRule `json:"waf_rule,omitempty"`
}
