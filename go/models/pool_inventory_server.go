// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolInventoryServer pool inventory server
// swagger:model PoolInventoryServer
type PoolInventoryServer struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *PoolInventoryServerConfig `json:"config,omitempty"`

	// Present when the 'health_score' resource is requested. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthScore *HealthScoreSummary `json:"health_score,omitempty"`

	// Present when the 'metrics' resource is requested. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Metrics *InventoryMetrics `json:"metrics,omitempty"`

	// URL of the pool this server belongs to. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolRef *string `json:"pool_ref,omitempty"`

	// Present when the 'runtime' resource is requested. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Runtime *PoolInventoryServerRuntime `json:"runtime,omitempty"`
}
