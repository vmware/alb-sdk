// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolNetworkServers inventory map pool network servers
// swagger:model InventoryMapPoolNetworkServers
type InventoryMapPoolNetworkServers struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerKeys []string `json:"server_keys,omitempty"`
}
