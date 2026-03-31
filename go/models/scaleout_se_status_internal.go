// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ScaleoutSeStatusInternal scaleout se status internal
// swagger:model ScaleoutSeStatusInternal
type ScaleoutSeStatusInternal struct {

	// Set to True if primary SE is currently experiencing errors in HeartBeat messaging with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HasHbIssues *bool `json:"has_hb_issues,omitempty"`

	// IP Address of interface on which HeartBeat messaging is done. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddress *IPAddr `json:"ip_address,omitempty"`

	// Set to 1 if primary SE can dispatch new VS flows to the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFlowDispatchable *bool `json:"is_flow_dispatchable,omitempty"`

	// Set to 1 if SE is the reporting SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLocal *bool `json:"is_local,omitempty"`

	// Set to 1 if SE is primary for the VS. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	// Set to 1 if SE is in oper_up state. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsUp *bool `json:"is_up,omitempty"`

	// Number of CPU cores on the SE that are processing VS flows. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSum *uint32 `json:"num_flow_cores_sum,omitempty"`

	// Number of times primary SE accepted change to flow-processing CPU cores on the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSumChangesAccepted *uint32 `json:"num_flow_cores_sum_changes_accepted,omitempty"`

	// Total Number of times SE reported change to number of flow-processing CPU cores. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSumChangesAll *uint32 `json:"num_flow_cores_sum_changes_all,omitempty"`

	// Number of server pools of the VS in oper_up state on the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPoolsUp *int32 `json:"num_pools_up,omitempty"`

	// Number of VS flows forwarded by primary SE to the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsFlows *uint64 `json:"num_vs_flows,omitempty"`

	// Number of HeartBeat request messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRqsSent *uint32 `json:"num_vs_hb_rqs_sent,omitempty"`

	// Number of HeartBeat response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRspsRcvd *uint32 `json:"num_vs_hb_rsps_rcvd,omitempty"`

	// Amount of connections persistent state for the VS on the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolObjCount *int32 `json:"pool_obj_count,omitempty"`

	// Status of Heartbeat messaging with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbUp *bool `json:"se_hb_up,omitempty"`

	// Version of Heartbeat protocol in use with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbVersion *uint32 `json:"se_hb_version,omitempty"`

	// CPU load on the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeLoad *int64 `json:"se_load,omitempty"`

	// UUID of the SE to which VS is scaled out to. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Set to 1 if primary SE has reported to controller that the scaled out SE can accept VS traffic. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentScaleoutReady *bool `json:"sent_scaleout_ready,omitempty"`

	// Traffic received by the SE for the VS flows in bits-per-sec. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsBps *int64 `json:"vs_bps,omitempty"`

	// Set to True if the VS is in oper_up state on the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsOpUp *bool `json:"vs_op_up,omitempty"`
}
