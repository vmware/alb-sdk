// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolNetworksEntry inventory map pool networks entry
// swagger:model InventoryMapPool.NetworksEntry
type InventoryMapPoolNetworksEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *InventoryMapPoolNetworkServers `json:"value,omitempty"`
}
