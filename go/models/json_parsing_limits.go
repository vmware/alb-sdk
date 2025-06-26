// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JSONParsingLimits Json parsing limits
// swagger:model JsonParsingLimits
type JSONParsingLimits struct {

	// Maximum nesting level of a json document. 0 means no restriction. Allowed values are 0-256. Special values are 0- Do not apply this restriction.. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxNestingLevel *uint32 `json:"max_nesting_level,omitempty"`

	// Maximum number of elements in an array or object. 0 means no restriction. Allowed values are 0-1048576. Special values are 0- Do not apply this restriction.. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxSubelements *uint32 `json:"max_subelements,omitempty"`

	// Maximum number of all elements in the whole document. 0 means no restriction. Allowed values are 0-1048576. Special values are 0- Do not apply this restriction.. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxTotalElements *uint32 `json:"max_total_elements,omitempty"`

	// Maximum length of a single value (string). 0 means no restriction. Allowed values are 0-1048576. Special values are 0- Do not apply this restriction.. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxValueLength *uint32 `json:"max_value_length,omitempty"`
}
