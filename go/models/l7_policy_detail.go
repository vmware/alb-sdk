// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L7PolicyDetail l7 policy detail
// swagger:model L7PolicyDetail
type L7PolicyDetail struct {

	// The Bot Detection Policy this detail describes. It is a reference to an object of type BotDetectionPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BotDetectionPolicyRef *string `json:"bot_detection_policy_ref,omitempty"`

	// The CSRF Policy this detail describes. It is a reference to an object of type CSRFPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CsrfPolicyRef *string `json:"csrf_policy_ref,omitempty"`

	// Number of label-checking rules in this policy that are turned on. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnabledLabelMatchedRuleCount *uint32 `json:"enabled_label_matched_rule_count,omitempty"`

	// Number of rules in this policy that are turned on. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnabledRuleCount *uint32 `json:"enabled_rule_count,omitempty"`

	// The HTTP Policy Set this detail describes. It is a reference to an object of type HTTPPolicySet. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPPolicySetRef *string `json:"http_policy_set_ref,omitempty"`

	// Number of rules in this policy that check for a WAAP label. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelMatchedRuleCount *uint32 `json:"label_matched_rule_count,omitempty"`

	// Total number of rules in this policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleCount *uint32 `json:"rule_count,omitempty"`

	// The SSO Policy this detail describes. It is a reference to an object of type SSOPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SsoPolicyRef *string `json:"sso_policy_ref,omitempty"`

	// The WAF Policy this detail describes. It is a reference to an object of type WafPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafPolicyRef *string `json:"waf_policy_ref,omitempty"`
}
