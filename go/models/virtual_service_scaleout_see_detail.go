// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceScaleoutSeeDetail virtual service scaleout see detail
// swagger:model VirtualServiceScaleoutSeeDetail
type VirtualServiceScaleoutSeeDetail struct {

	// Number of VS flows terminated on local SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrNumLocalFlows *uint64 `json:"curr_num_local_flows,omitempty"`

	// Number of VS flows punted to remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrNumRemoteFlows *uint64 `json:"curr_num_remote_flows,omitempty"`

	// Number of Flow Entries created on local SE after receiving flow probe response from a remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowCreatedByProbeRsp *uint64 `json:"flow_created_by_probe_rsp,omitempty"`

	// Number of Flow Probe requests discarded due to flow-lookup miss. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRqsDiscardMiss *uint64 `json:"flow_probe_rqs_discard_miss,omitempty"`

	// Number of Flow Probe requests discarded as flow-entry was remote. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRqsDiscardNonLocal *uint64 `json:"flow_probe_rqs_discard_non_local,omitempty"`

	// Number of Flow Probe requests received from remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRqsRcvd *uint64 `json:"flow_probe_rqs_rcvd,omitempty"`

	// Number of Flow Probe requests sent to remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRqsSent *uint64 `json:"flow_probe_rqs_sent,omitempty"`

	// Number of Flow Probe responses received from remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRspsRcvd *uint64 `json:"flow_probe_rsps_rcvd,omitempty"`

	// Number of Flow Probe responses sent to remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbeRspsSent *uint64 `json:"flow_probe_rsps_sent,omitempty"`

	// If True, indicates Heartbeat messaging to this SE is currently not operational. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HasHbIssues *bool `json:"has_hb_issues,omitempty"`

	// IP Address of interface on which HeartBeat messaging is done. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddress *IPAddr `json:"ip_address,omitempty"`

	// Set to True if primary SE can dispatch new VS flows to the SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFlowDispatchable *bool `json:"is_flow_dispatchable,omitempty"`

	// Set to True if SE is the reporting SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLocal *bool `json:"is_local,omitempty"`

	// Set to True if SE is primary for the VS. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	// Number of server pools of the VS in oper_up state on the SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPoolsUp *int32 `json:"num_pools_up,omitempty"`

	// Cumulative number of VS flows that were punted to this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsFlows *uint64 `json:"num_vs_flows,omitempty"`

	// Number of Heartbeat Response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRqsRcvd *uint32 `json:"num_vs_hb_rqs_rcvd,omitempty"`

	// Number of HeartBeat request messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRqsSent *uint32 `json:"num_vs_hb_rqs_sent,omitempty"`

	// Number of HeartBeat response messages received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRspsRcvd *uint32 `json:"num_vs_hb_rsps_rcvd,omitempty"`

	// Number of Heartbeat Reponse messages sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsHbRspsSent *uint32 `json:"num_vs_hb_rsps_sent,omitempty"`

	// Amount of connections persistent state for the VS on the SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolObjCount *int32 `json:"pool_obj_count,omitempty"`

	// Status of Heartbeat messaging with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbUp *bool `json:"se_hb_up,omitempty"`

	// Version of Heartbeat protocol in use with this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHbVersion *uint32 `json:"se_hb_version,omitempty"`

	// CPU load on the SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeLoad *int64 `json:"se_load,omitempty"`

	// UUID of the SE to which VS is scaled out to. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Last selist version number received by the SE from controller. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelistVersion *uint32 `json:"selist_version,omitempty"`

	// Set to True if primary SE has reported to controller that the scaled out SE can accept VS traffic. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentScaleoutReady *bool `json:"sent_scaleout_ready,omitempty"`

	// Set to True if the VS is in oper_up state on the SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsOpUp *bool `json:"vs_op_up,omitempty"`

	// Number of times VS state changes on the remote SE were read. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsShStateChangeReads *uint32 `json:"vs_sh_state_change_reads,omitempty"`

	// Number of times errors encountered in pubslishing VS state. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsShStatePublishErrors *uint32 `json:"vs_sh_state_publish_errors,omitempty"`

	// Number of times VS state on local SE was published. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsShStatePublished *uint32 `json:"vs_sh_state_published,omitempty"`

	// Number of times error was encountered in reading VS shared state on a remote SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsShStateReadErrors *uint32 `json:"vs_sh_state_read_errors,omitempty"`

	// Bit-field. If non-zero indicates reason for SE to not accept VS traffic. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsTrafficDelayed *uint32 `json:"vs_traffic_delayed,omitempty"`

	// Number of times encountered errors in processing VS-state notification response from primary. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VssnErrorRsps *uint32 `json:"vssn_error_rsps,omitempty"`

	// VS state version number, last published by secondary SE, last read by primary SE. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VssnLastRev *uint32 `json:"vssn_last_rev,omitempty"`

	// Number of times successfully processed VS-state notification response from primary. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VssnSuccessRsps *uint32 `json:"vssn_success_rsps,omitempty"`
}
