// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolServersEntry inventory map pool servers entry
// swagger:model InventoryMapPool.ServersEntry
type InventoryMapPoolServersEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *InventoryMapPoolServer `json:"value,omitempty"`
}
