// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewActionLocation virtual service overview action location
// swagger:model VirtualServiceOverviewActionLocation
type VirtualServiceOverviewActionLocation struct {

	// The API Policy that contains this rule. It is a reference to an object of type ApiPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicyRef *string `json:"api_policy_ref,omitempty"`

	// The Bot Detection Policy that contains this rule. It is a reference to an object of type BotDetectionPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BotDetectionPolicyRef *string `json:"bot_detection_policy_ref,omitempty"`

	// The CSRF Policy that contains this rule. It is a reference to an object of type CSRFPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CsrfPolicyRef *string `json:"csrf_policy_ref,omitempty"`

	// Whether the rule itself is turned on. A disabled rule still shows up here, but has no effect until it's enabled. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// The HTTP Policy Set that contains this rule. It is a reference to an object of type HTTPPolicySet. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPPolicySetRef *string `json:"http_policy_set_ref,omitempty"`

	// Position of this rule within its policy's rule list. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleIndex *uint32 `json:"rule_index,omitempty"`

	// Name of the rule. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleName *string `json:"rule_name,omitempty"`

	// The type of policy this reference points to. Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY, MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE, MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Scope *string `json:"scope,omitempty"`

	// The SSO Policy that contains this rule. It is a reference to an object of type SSOPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SsoPolicyRef *string `json:"sso_policy_ref,omitempty"`

	// The WAF Policy that contains this rule. It is a reference to an object of type WafPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafPolicyRef *string `json:"waf_policy_ref,omitempty"`
}
