// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPool inventory map pool
// swagger:model InventoryMapPool
type InventoryMapPool struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Alert *AlertSummary `json:"alert,omitempty"`

	// Only url/uuid/name are populated. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *PoolConfig `json:"config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthScore *HealthScoreSummary `json:"health_score,omitempty"`

	// Network name -> server keys (ip port) reachable through it. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networks map[string]InventoryMapPoolNetworkServers `json:"networks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Runtime *PoolRuntimeSummary `json:"runtime,omitempty"`

	// Server key (ip port) -> server detail. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers map[string]InventoryMapPoolServer `json:"servers,omitempty"`
}
