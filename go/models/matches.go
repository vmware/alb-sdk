// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Matches matches
// swagger:model Matches
type Matches struct {

	// Matches in signature rule. Field introduced in 21.1.1.
	MatchElement *string `json:"match_element,omitempty"`

	// Match value in signature rule. Field introduced in 21.1.1.
	MatchValue *string `json:"match_value,omitempty"`
}
