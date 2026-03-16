// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NatPolicyStats nat policy stats
// swagger:model NatPolicyStats
type NatPolicyStats struct {

	// Nat policy rules. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NatPolicy []*NatPolicyStat `json:"nat_policy,omitempty"`

	// Core id. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// SE uuid. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
