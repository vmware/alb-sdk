// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafApplicationSignatures waf application signatures
// swagger:model WafApplicationSignatures
type WafApplicationSignatures struct {

	// The external provide for the rules. It is a reference to an object of type WafApplicationSignatureProvider. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	ProviderRef *string `json:"provider_ref"`

	// A resolved version of the active application specific rules together with the overrides. Field introduced in 20.1.6. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ResolvedRules []*WafRule `json:"resolved_rules,omitempty"`

	// Override attributes of application signature rules. Field introduced in 20.1.6. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	RuleOverrides []*WafRuleOverrides `json:"rule_overrides,omitempty"`

	// This entry is deprecated. If you want to deactivate a certain rule, please use the rule_overrides field instead. Field deprecated in 20.1.6. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Rules []*WafRule `json:"rules,omitempty"`

	// The version in use of the provided ruleset. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	RulesetVersion *string `json:"ruleset_version,omitempty"`

	// List of applications for which we use the rules from the WafApplicationSignatureProvider. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SelectedApplications []string `json:"selected_applications,omitempty"`
}
