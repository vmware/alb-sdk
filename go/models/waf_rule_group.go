// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafRuleGroup waf rule group
// swagger:model WafRuleGroup
type WafRuleGroup struct {

	// Enable or disable WAF Rule Group. Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Enable *bool `json:"enable"`

	// Exclude list for the WAF rule group. The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria. If there are multiple excludelist entries, it will be 'logical or' of them. Field introduced in 17.2.1. Maximum of 64 items allowed. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ExcludeList []*WafExcludeListEntry `json:"exclude_list,omitempty"`

	// When set to 'true', any rule in this group will not cause 'deny' or 'redirect' actions to run, even if WAF Policy is set to enforcement mode. The behavior would be as if this rule operated in detection mode regardless of WAF Policy setting. Field deprecated in 18.1.5. Field introduced in 18.1.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ForceDetection *bool `json:"force_detection,omitempty"`

	//  Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Index *int32 `json:"index"`

	//  Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Rules as per Modsec language. Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Rules []*WafRule `json:"rules,omitempty"`
}
