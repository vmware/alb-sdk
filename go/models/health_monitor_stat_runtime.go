// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HealthMonitorStatRuntime health monitor stat runtime
// swagger:model HealthMonitorStatRuntime
type HealthMonitorStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp1 *TimeStamp `json:"last_transition_timestamp_1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp2 *TimeStamp `json:"last_transition_timestamp_2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTransitionTimestamp3 *TimeStamp `json:"last_transition_timestamp_3,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerHmStat []*ServerHMStatRuntime `json:"server_hm_stat,omitempty"`
}
