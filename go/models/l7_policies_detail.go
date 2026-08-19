// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L7PoliciesDetail l7 policies detail
// swagger:model L7PoliciesDetail
type L7PoliciesDetail struct {

	// Details for the bot detection policy applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BotDetectionPolicy *L7PolicyDetail `json:"bot_detection_policy,omitempty"`

	// Details for the CSRF protection policy applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CsrfPolicy *L7PolicyDetail `json:"csrf_policy,omitempty"`

	// Details for the HTTP request rules applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPRequestPolicy *L7PolicyDetail `json:"http_request_policy,omitempty"`

	// Details for the HTTP response rules applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPResponsePolicy *L7PolicyDetail `json:"http_response_policy,omitempty"`

	// Details for the HTTP security rules applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPSecurityPolicy *L7PolicyDetail `json:"http_security_policy,omitempty"`

	// Details for the single sign-on authentication and authorization rules applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SsoPolicy *L7PolicyDetail `json:"sso_policy,omitempty"`

	// Details for the WAF policy applied to this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafPolicy *L7PolicyDetail `json:"waf_policy,omitempty"`
}
