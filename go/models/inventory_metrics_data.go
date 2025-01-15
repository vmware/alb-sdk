// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMetricsData inventory metrics data
// swagger:model InventoryMetricsData
type InventoryMetricsData struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Value *float64 `json:"value"`
}
