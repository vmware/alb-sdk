// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMetricsHeaders inventory metrics headers
// swagger:model InventoryMetricsHeaders
type InventoryMetricsHeaders struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Statistics *InventoryMetricStatistics `json:"statistics,omitempty"`
}
