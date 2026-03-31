// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PersistenceHandleInternal persistence handle internal
// swagger:model PersistenceHandleInternal
type PersistenceHandleInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AgingMode *int32 `json:"aging_mode"`

	// Object sync hub version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HubVersion *uint64 `json:"hub_version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	KeyType *int32 `json:"key_type"`

	// Object sync local version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalVersion *uint64 `json:"local_version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCreateSrvNull *uint32 `json:"num_create_srv_null,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDeleteNonexistent *uint32 `json:"num_delete_nonexistent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLocalCreateRaces *uint32 `json:"num_local_create_races,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMallocFailures *uint32 `json:"num_malloc_failures,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMallocFailuresDp *uint32 `json:"num_malloc_failures_dp,omitempty"`

	// Number of malloc failures received. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMallocFailuresReceive *uint64 `json:"num_malloc_failures_receive,omitempty"`

	// Number of pending distribute objects. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPendingDistribute *uint64 `json:"num_pending_distribute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisCreateRaces *uint32 `json:"num_redis_create_races,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisEolTruncateEvents *uint32 `json:"num_redis_eol_truncate_events,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisRecvd *uint32 `json:"num_redis_recvd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisSentAg *uint32 `json:"num_redis_sent_ag,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRedisSentDp *uint32 `json:"num_redis_sent_dp,omitempty"`

	//  Field introduced in 17.1.8,17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStartAgeingIgnored *uint32 `json:"num_start_ageing_ignored,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStartAgeingSrvNull *uint32 `json:"num_start_ageing_srv_null,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStartAgeingValNull *uint32 `json:"num_start_ageing_val_null,omitempty"`

	// Number of tomb stones. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTombstones *uint32 `json:"num_tombstones,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTooEarlyDelete *uint32 `json:"num_too_early_delete,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUnknownSrvFromRedis *uint32 `json:"num_unknown_srv_from_redis,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RedisSync *int32 `json:"redis_sync"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VsUUID *string `json:"vs_uuid"`
}
