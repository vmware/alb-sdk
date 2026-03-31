// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthNPolicyStats auth n policy stats
// swagger:model AuthNPolicyStats
type AuthNPolicyStats struct {

	//  SAML Authentication policy rule statistics. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleStats []*RuleStats `json:"rule_stats,omitempty"`
}
