// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SestatusInternal sestatus internal
// swagger:model SestatusInternal
type SestatusInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminDown *int32 `json:"admin_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deprecated1 *string `json:"deprecated1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deprecated2 *int32 `json:"deprecated2,omitempty"`

	// Heartbeat messaging is currently not operational. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HasHbIssues *bool `json:"has_hb_issues,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InternalMac *string `json:"internal_mac,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InternalVnic *int32 `json:"internal_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFlowDispatchable *int32 `json:"is_flow_dispatchable,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsInVsc *uint32 `json:"is_in_vsc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLocal *int32 `json:"is_local,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *int32 `json:"is_primary,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsUp *int32 `json:"is_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCores *uint32 `json:"num_flow_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRecvd *uint32 `json:"num_hb_recvd,omitempty"`

	// Number of Heartbeat Response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRqsRcvd *uint32 `json:"num_hb_rqs_rcvd,omitempty"`

	// Number of Heartbeat Request messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRqsSent *uint32 `json:"num_hb_rqs_sent,omitempty"`

	// Number of Heartbeat Response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRspsRcvd *uint32 `json:"num_hb_rsps_rcvd,omitempty"`

	// Number of Heartbeat Reponse messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRspsSent *uint32 `json:"num_hb_rsps_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPoolsUp *int32 `json:"num_pools_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OutsideMac *string `json:"outside_mac,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OutsideVnic *int32 `json:"outside_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolObjCount *int32 `json:"pool_obj_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHmErrRsps *int32 `json:"se_hm_err_rsps,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHmRqsLoss *int32 `json:"se_hm_rqs_loss,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHmRspLoss *int32 `json:"se_hm_rsp_loss,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeLoad *int64 `json:"se_load,omitempty"`

	// Number of times HB Failures with this SE were reported to Controller. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbIssuesReported *uint32 `json:"se_num_hb_issues_reported,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecIdx *uint32 `json:"sec_idx,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelistVersion *uint64 `json:"selist_version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentScaleoutReady *int32 `json:"sent_scaleout_ready,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *bool `json:"state,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TooEarlyForHbIssues *bool `json:"too_early_for_hb_issues,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsBps *int64 `json:"vs_bps,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsStatIndex *int32 `json:"vs_stat_index,omitempty"`
}
