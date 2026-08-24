// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelMatch label match
// swagger:model LabelMatch
type LabelMatch struct {

	// Criterion to use for matching the labels. Enum options - IS_IN, IS_NOT_IN. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MatchCriteria *string `json:"match_criteria"`

	// Labels to be matched against the API endpoint labels. Field introduced in 32.1.4. Minimum of 1 items required. Maximum of 10 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Values []string `json:"values,omitempty"`
}
