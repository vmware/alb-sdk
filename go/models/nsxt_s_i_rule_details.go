// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtSIRuleDetails nsxt s i rule details
// swagger:model NsxtSIRuleDetails
type NsxtSIRuleDetails struct {

	// Rule Action. Field introduced in 21.1.3.
	Action *string `json:"action,omitempty"`

	// Destinatios excluded or not. Field introduced in 21.1.3.
	Destexclude *bool `json:"destexclude,omitempty"`

	// Destination of redirection rule. Field introduced in 21.1.3.
	Dests []string `json:"dests,omitempty"`

	// Rule Direction. Field introduced in 21.1.3.
	Direction *string `json:"direction,omitempty"`

	// Error message. Field introduced in 21.1.3.
	ErrorString *string `json:"error_string,omitempty"`

	// Pool name. Field introduced in 21.1.3.
	Pool *string `json:"pool,omitempty"`

	// ServiceEngineGroup name. Field introduced in 21.1.3.
	Segroup *string `json:"segroup,omitempty"`

	// Services of redirection rule. Field introduced in 21.1.3.
	Services []string `json:"services,omitempty"`

	// Sources of redirection rule. Field introduced in 21.1.3.
	Sources []string `json:"sources,omitempty"`
}
