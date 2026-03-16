// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CltrackHandleInternal cltrack handle internal
// swagger:model CltrackHandleInternal
type CltrackHandleInternal struct {

	// Object sync hub version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HubVersion *uint64 `json:"hub_version,omitempty"`

	// Object sync local version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalVersion *uint64 `json:"local_version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLocalCreateRaces *uint32 `json:"num_local_create_races,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMallocFailures *uint32 `json:"num_malloc_failures,omitempty"`

	// Number of pending distribute objects. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPendingDistribute *uint64 `json:"num_pending_distribute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisCreateRaces *uint32 `json:"num_redis_create_races,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStartAgeingIgnored *uint32 `json:"num_start_ageing_ignored,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStartAgeingValNull *uint32 `json:"num_start_ageing_val_null,omitempty"`
}
