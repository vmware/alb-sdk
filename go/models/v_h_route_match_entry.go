// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VHRouteMatchEntry v h route match entry
// swagger:model VHRouteMatchEntry
type VHRouteMatchEntry struct {

	// Name of ApiPolicy if source is APIPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicyName *string `json:"api_policy_name,omitempty"`

	// Name of the child VS this route targets. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChildVsName *string `json:"child_vs_name,omitempty"`

	// UUID of the child VS this route targets. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChildVsUUID *string `json:"child_vs_uuid,omitempty"`

	// Host/domain for this VH route match. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Host *string `json:"host,omitempty"`

	// Match criteria (BEGINS_WITH, EQUALS, CONTAINS, etc.). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchCriteria *string `json:"match_criteria,omitempty"`

	// Type of match (PATH, METHOD, HEADER, etc.). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchType *string `json:"match_type,omitempty"`

	// Match value (e.g., path, method, header value). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchValue *string `json:"match_value,omitempty"`

	// Name of the VH match rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleName *string `json:"rule_name,omitempty"`

	// Source of this route  MANUAL or APIPOLICY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Source *string `json:"source,omitempty"`
}
