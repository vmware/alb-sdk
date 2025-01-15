// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OperationsConfig operations config
// swagger:model OperationsConfig
type OperationsConfig struct {

	// Inventory op config. Field introduced in 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	InventoryConfig *InventoryConfig `json:"inventory_config,omitempty"`
}
