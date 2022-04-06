// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetryPlacementParams retry placement params
// swagger:model RetryPlacementParams
type RetryPlacementParams struct {

	// Retry placement operations for all East-West services. Field introduced in 17.1.6,17.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AllEastWest *bool `json:"all_east_west,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Indicates the vip_id that needs placement retrial. Field introduced in 17.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	VipID *string `json:"vip_id"`
}
