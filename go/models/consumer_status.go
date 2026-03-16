// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsumerStatus consumer status
// swagger:model ConsumerStatus
type ConsumerStatus struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeAssigned *int32 `json:"num_se_assigned,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeRequested *int32 `json:"num_se_requested,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCode *uint64 `json:"reason_code,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCodeString *string `json:"reason_code_string,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resources []*ResourceStatus `json:"resources,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	//  Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING, OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING, OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Timestamp this status was computed for the Consumer. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimeStamp *TimeStamp `json:"time_stamp,omitempty"`

	// Trace ID to keep track of ConsumerStatus version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TraceID *uint64 `json:"trace_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipPlacementResolutionInfo *VipPlacementResolutionInfo `json:"vip_placement_resolution_info,omitempty"`
}
