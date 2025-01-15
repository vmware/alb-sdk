// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HdrMatch hdr match
// swagger:model HdrMatch
type HdrMatch struct {

	// Name of the HTTP header whose value is to be matched. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Hdr *string `json:"hdr"`

	// Case sensitivity to use for the match. Enum options - SENSITIVE, INSENSITIVE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchCase *string `json:"match_case,omitempty"`

	// Criterion to use for matching headers in the HTTP request. Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH, HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MatchCriteria *string `json:"match_criteria"`

	// UUID of the *string group(s). It is a reference to an object of type StringGroup. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StringGroupRefs []string `json:"string_group_refs,omitempty"`

	// String values to match in the HTTP header. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value []string `json:"value,omitempty"`
}
