// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WAFLimits w a f limits
// swagger:model WAFLimits
type WAFLimits struct {

	// Number of WAF allowed Content Types. Field introduced in 21.1.3.
	NumAllowedContentTypes *int32 `json:"num_allowed_content_types,omitempty"`

	// Number of allowed request content type character sets in WAF. Field introduced in 22.1.1.
	NumAllowedRequestContentTypeCharsets *int32 `json:"num_allowed_request_content_type_charsets,omitempty"`

	// Number of rules used in WAF allowlist policy. Field introduced in 21.1.3.
	NumAllowlistPolicyRules *int32 `json:"num_allowlist_policy_rules,omitempty"`

	// Number of applications for which we use rules from sig provider. Field introduced in 21.1.3.
	NumApplications *int32 `json:"num_applications,omitempty"`

	// Number of datafiles used in WAF. Field introduced in 21.1.3.
	NumDataFiles *int32 `json:"num_data_files,omitempty"`

	// Number of pre, post CRS groups. Field introduced in 21.1.3.
	NumPrePostCrsGroups *int32 `json:"num_pre_post_crs_groups,omitempty"`

	// Number of total PSM groups in WAF. Field introduced in 21.1.3.
	NumPsmGroups *int32 `json:"num_psm_groups,omitempty"`

	// Number of match elements used in WAF PSM. Field introduced in 21.1.3.
	NumPsmMatchElements *int32 `json:"num_psm_match_elements,omitempty"`

	// Number of match rules per location. Field introduced in 21.1.3.
	NumPsmMatchRulesPerLoc *int32 `json:"num_psm_match_rules_per_loc,omitempty"`

	// Number of locations used in WAF PSM. Field introduced in 21.1.3.
	NumPsmTotalLocations *int32 `json:"num_psm_total_locations,omitempty"`

	// Number of restricted extensions in WAF. Field introduced in 21.1.3.
	NumRestrictedExtensions *int32 `json:"num_restricted_extensions,omitempty"`

	// Number of restricted HTTP headers in WAF. Field introduced in 21.1.3.
	NumRestrictedHeaders *int32 `json:"num_restricted_headers,omitempty"`

	// Number of tags for waf rule . Field introduced in 21.1.3.
	NumRuleTags *int32 `json:"num_rule_tags,omitempty"`

	// Number of rules as per modsec language. Field introduced in 21.1.3.
	NumRulesPerRulegroup *int32 `json:"num_rules_per_rulegroup,omitempty"`

	// Number of restricted static extensions in WAF. Field introduced in 21.1.3.
	NumStaticExtensions *int32 `json:"num_static_extensions,omitempty"`
}
