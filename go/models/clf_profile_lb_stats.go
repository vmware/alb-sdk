// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfProfileLbStats clf profile lb stats
// swagger:model ClfProfileLbStats
type ClfProfileLbStats struct {

	// Name of the ClfProfile these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileName *string `json:"clf_profile_name,omitempty"`

	// UUID of the ClfProfile these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileUUID *string `json:"clf_profile_uuid,omitempty"`

	// Per-ClfPool LB/capacity breakdown. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pools []*ClfPoolLbStats `json:"pools,omitempty"`

	// UUID of the Service Engine reporting these stats. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// UUID of the Virtual Service these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
