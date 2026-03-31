// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudPlacementIneligible cloud placement ineligible
// swagger:model CloudPlacementIneligible
type CloudPlacementIneligible struct {

	// Ineligible VS and SE counts for each SE group. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupIneligibleCounts []*SeGroupIneligibleCount `json:"se_group_ineligible_counts,omitempty"`

	// Tenant UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	// Cloud UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
