// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsHbStatEntry se vs hb stat entry
// swagger:model SeVsHbStatEntry
type SeVsHbStatEntry struct {

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AggregatableVss []*RepeatedStrings `json:"aggregatable_vss,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HasHbIssuesVss []*RepeatedStrings `json:"has_hb_issues_vss,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HighSelistVersionHonored *uint32 `json:"high_selist_version_honored,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LowSelistVersionIgnored *uint32 `json:"low_selist_version_ignored,omitempty"`

	// Number of flow processing CPU cores reported by the remote-SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCores *uint32 `json:"num_flow_cores,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeVsHbInPkt []*CountHistogramBar `json:"num_se_vs_hb_in_pkt,omitempty"`

	// Number of VSs for which local-SE is primary and remote-SE is secondary. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsLsePrimaryForRse *uint32 `json:"num_vs_lse_primary_for_rse,omitempty"`

	// Number of VSs for which local-SE is secondary and remote-SE is primary. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsLseSecForRse *uint32 `json:"num_vs_lse_sec_for_rse,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SameSelistVersionHonored *uint32 `json:"same_selist_version_honored,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SameSelistVersionIgnored *uint32 `json:"same_selist_version_ignored,omitempty"`

	// CPU load reported by the remote-SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeCPULoad *uint32 `json:"se_cpu_load,omitempty"`

	// State of SE-SE Heartbeat messaging with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbUp *bool `json:"se_hb_up,omitempty"`

	// SE-SE Heartbeat protocol version in use with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbVersion *uint32 `json:"se_hb_version,omitempty"`

	// Size of SE-SE HB Response messages window. Field introduced in 21.1.1, 20.1.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbWindowSize *uint32 `json:"se_hb_window_size,omitempty"`

	//  Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeLastHbIssueReportedAtJiffies *uint32 `json:"se_last_hb_issue_reported_at_jiffies,omitempty"`

	// Number of times SE-SE Heartbeat response messages had error. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbErrRsps *uint32 `json:"se_num_hb_err_rsps,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbIssuesReported *uint32 `json:"se_num_hb_issues_reported,omitempty"`

	// Number of times SE-SE HB request messages were not received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRqsLoss *uint32 `json:"se_num_hb_rqs_loss,omitempty"`

	// Number of SE-SE HB Request messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRqsRcvd *uint32 `json:"se_num_hb_rqs_rcvd,omitempty"`

	// Number of SE-SE HB Request messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRqsSent *uint32 `json:"se_num_hb_rqs_sent,omitempty"`

	// Number of times SE-SE HB response messages were not received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRspLoss *uint32 `json:"se_num_hb_rsp_loss,omitempty"`

	// Number of SE-SE HB Response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRspsRcvd *uint32 `json:"se_num_hb_rsps_rcvd,omitempty"`

	// Number of SE-SE HB Response messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRspsSent *uint32 `json:"se_num_hb_rsps_sent,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbV1RqsRcvd *uint32 `json:"se_num_hb_v1_rqs_rcvd,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbV1RqsSent *uint32 `json:"se_num_hb_v1_rqs_sent,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbV1RspsRcvd *uint32 `json:"se_num_hb_v1_rsps_rcvd,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbV1RspsSent *uint32 `json:"se_num_hb_v1_rsps_sent,omitempty"`

	// Number of errors in processing VS State Notificantion requests. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRqsErrors *uint32 `json:"se_num_vssn_rqs_errors,omitempty"`

	// Number of VS State Notificantion Requests received. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRqsRcvd *uint32 `json:"se_num_vssn_rqs_rcvd,omitempty"`

	// Number of VS State Notificantion Requests sent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRqsSent *uint32 `json:"se_num_vssn_rqs_sent,omitempty"`

	// Number of errors in processing VS State Notificantion responses. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRspsErrors *uint32 `json:"se_num_vssn_rsps_errors,omitempty"`

	// Number of VS State Notificantion Responses received. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRspsRcvd *uint32 `json:"se_num_vssn_rsps_rcvd,omitempty"`

	// Number of VS State Notificantion Responses sent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumVssnRspsSent *uint32 `json:"se_num_vssn_rsps_sent,omitempty"`

	// Packets per second load reported by the remote-SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePpsLoad *uint64 `json:"se_pps_load,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeReqMissingField *uint32 `json:"se_req_missing_field,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeReqShortVsUUIDAmbiguous *uint32 `json:"se_req_short_vs_uuid_ambiguous,omitempty"`

	//  Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeReqVsteNotFound *uint32 `json:"se_req_vste_not_found,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRspMissingField *uint32 `json:"se_rsp_missing_field,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRspShortVsUUIDAmbiguous *uint32 `json:"se_rsp_short_vs_uuid_ambiguous,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeShortPlUuidsLen *uint32 `json:"se_short_pl_uuids_len,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeShortVsUuidsLen *uint32 `json:"se_short_vs_uuids_len,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShortVsUUIDLenSent []*CountHistogramBar `json:"short_vs_uuid_len_sent,omitempty"`
}
