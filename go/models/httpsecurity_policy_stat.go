// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HttpsecurityPolicyStat httpsecurity policy stat
// swagger:model HTTPSecurityPolicyStat
type HttpsecurityPolicyStat struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RuleStats []*RuleStats `json:"rule_stats,omitempty"`
}
