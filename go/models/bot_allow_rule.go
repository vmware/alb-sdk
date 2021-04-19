// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotAllowRule bot allow rule
// swagger:model BotAllowRule
type BotAllowRule struct {

	// The action to take. Enum options - BYPASS, CONTINUE. Field introduced in 21.1.1.
	// Required: true
	Action *string `json:"action"`

	// The conditions to match, combined by logical AND. Field introduced in 21.1.1.
	Conditions []*MatchTarget `json:"conditions,omitempty"`
}
