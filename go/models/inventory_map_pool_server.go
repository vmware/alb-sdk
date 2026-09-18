// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolServer inventory map pool server
// swagger:model InventoryMapPoolServer
type InventoryMapPoolServer struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *InventoryMapPoolServerConfig `json:"config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthScore *HealthScoreSummary `json:"health_score,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Runtime *InventoryMapPoolServerRuntime `json:"runtime,omitempty"`
}
