// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceGroupStats gslb service group stats
// swagger:model GslbServiceGroupStats
type GslbServiceGroupStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BadConnections *uint64 `json:"bad_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentConnections *uint64 `json:"current_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailAddPending *uint32 `json:"lb_fail_add_pending,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailPersistentServerDown *uint32 `json:"lb_fail_persistent_server_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailPersistentServerInvalid *uint32 `json:"lb_fail_persistent_server_invalid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailServerDown *uint32 `json:"lb_fail_server_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolLoad *int32 `json:"pool_load,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalConnections *uint64 `json:"total_connections,omitempty"`
}
