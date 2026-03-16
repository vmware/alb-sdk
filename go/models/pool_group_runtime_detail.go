// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolGroupRuntimeDetail pool group runtime detail
// swagger:model PoolGroupRuntimeDetail
type PoolGroupRuntimeDetail struct {

	// Current pool name which is acting as primary. By default higher priority pool acts as primary. Field introduced in 20.1.7, 21.1.2, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentPrimaryPool *string `json:"current_primary_pool,omitempty"`

	// Name of the pool that was primary before switchover to current primary. Field introduced in 20.1.7, 21.1.2, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastPrimaryPool *string `json:"last_primary_pool,omitempty"`

	// Time when primary pool switchover happened since it was down. Field introduced in 20.1.7, 21.1.2, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastPrimaryPoolSwitchoverTime *TimeStamp `json:"last_primary_pool_switchover_time,omitempty"`

	// Number of connection dropped during switchover. Field introduced in 20.1.7, 21.1.2, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConnDropsDuringPoolSwitchover *uint64 `json:"num_conn_drops_during_pool_switchover,omitempty"`

	// Switchover from Primary/Secondary or Secondary/Primary pool is in progress. Field introduced in 20.1.7, 21.1.2, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrimaryPoolSwitchoverInProgress *bool `json:"primary_pool_switchover_in_progress,omitempty"`

	// SE uuid. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
