// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerHMStatRuntime server h m stat runtime
// swagger:model ServerHMStatRuntime
type ServerHMStatRuntime struct {

	// State from control plane healthmonitor. Field introduced in 30.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbHmFailure *uint32 `json:"gslb_hm_failure,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbShardFailureTimestamp1 *TimeStamp `json:"gslb_shard_failure_timestamp_1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbShardFailureTimestamp2 *TimeStamp `json:"gslb_shard_failure_timestamp_2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbShardFailureTimestamp3 *TimeStamp `json:"gslb_shard_failure_timestamp_3,omitempty"`

	// State from the service engine running datapath health monitoring when health monitor shard is configured. Field introduced in 30.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbShardHmFailure *uint32 `json:"gslb_shard_hm_failure,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddr *IPAddr `json:"ip_addr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp1 *TimeStamp `json:"last_transition_timestamp_1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp2 *TimeStamp `json:"last_transition_timestamp_2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp3 *TimeStamp `json:"last_transition_timestamp_3,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerName *string `json:"server_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmRuntime []*ServerHealthMonitorRuntime `json:"shm_runtime,omitempty"`
}
