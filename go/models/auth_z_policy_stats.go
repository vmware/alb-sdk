// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthZPolicyStats auth z policy stats
// swagger:model AuthZPolicyStats
type AuthZPolicyStats struct {

	// SAML Authorization policy rule statistics. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleStats []*RuleStats `json:"rule_stats,omitempty"`
}
