// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeThreshEventDetails se thresh event details
// swagger:model SeThreshEventDetails
type SeThreshEventDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	CurrValue *int64 `json:"curr_value"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Thresh *int64 `json:"thresh"`
}
