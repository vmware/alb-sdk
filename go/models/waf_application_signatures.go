// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafApplicationSignatures waf application signatures
// swagger:model WafApplicationSignatures
type WafApplicationSignatures struct {

	// WAF mode for the application specific rules. This can be either detection, enforcement or evaluation. If this is not set, the WAF Policy mode is used. This only takes effect if the policy allows mode delegation. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT, WAF_MODE_EVALUATION. Field introduced in 32.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mode *string `json:"mode,omitempty"`

	// The external provide for the rules. It is a reference to an object of type WafApplicationSignatureProvider. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProviderRef *string `json:"provider_ref"`

	// Override attributes of application signature rules. Field introduced in 20.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleOverrides []*WafRuleOverrides `json:"rule_overrides,omitempty"`

	// The version in use of the provided ruleset. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	RulesetVersion *string `json:"ruleset_version,omitempty"`

	// List of applications for which we use the rules from the WafApplicationSignatureProvider. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelectedApplications []string `json:"selected_applications,omitempty"`
}
