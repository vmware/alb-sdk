// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4ConnectionPolicyStat l4 connection policy stat
// swagger:model L4ConnectionPolicyStat
type L4ConnectionPolicyStat struct {

	// Statistics for the L4 Connection Policy. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleStats []*RuleStats `json:"rule_stats,omitempty"`
}
