// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPRequestPolicyStat HTTP request policy stat
// swagger:model HTTPRequestPolicyStat
type HTTPRequestPolicyStat struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleStats []*RuleStats `json:"rule_stats,omitempty"`
}
