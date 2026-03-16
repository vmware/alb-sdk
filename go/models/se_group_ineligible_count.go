// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeGroupIneligibleCount se group ineligible count
// swagger:model SeGroupIneligibleCount
type SeGroupIneligibleCount struct {

	// Count of placement ineligible VSs (VS cannot proceed with placement). Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIneligibleConsumers *uint32 `json:"num_ineligible_consumers,omitempty"`

	// Count of placement ineligible SEs (VSs cannot be placed on SE). Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIneligibleResources *uint32 `json:"num_ineligible_resources,omitempty"`

	// SE group UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
