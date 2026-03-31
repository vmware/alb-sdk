// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4PolicySetStats l4 policy set stats
// swagger:model L4PolicySetStats
type L4PolicySetStats struct {

	// Statistics for an L4PolicySet. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4PolicySetStat []*L4PolicySetStat `json:"l4_policy_set_stat,omitempty"`

	// CPU core-id of a specific se_dp process or aggregate for SE. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	// Statistics for L4PolicySet(s) for this SE. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}
