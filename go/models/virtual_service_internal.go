// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceInternal virtual service internal
// swagger:model VirtualServiceInternal
type VirtualServiceInternal struct {

	// Bytes dropped when bps threshold breached. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BpsBytesDrop *int64 `json:"bps_bytes_drop,omitempty"`

	// Connections dropped when bps threshold breached. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BpsSynDrops *int64 `json:"bps_syn_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChildVs []string `json:"child_vs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Corelbentry []*CoreLbEntry `json:"corelbentry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CorelbentryRo []*CoreLbEntry `json:"corelbentry_ro,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentOpenConns *int64 `json:"current_open_conns,omitempty"`

	// SNAT IP entries associated with linked data-scripts. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsSnatIPEntry []*DsSnatIPEntry `json:"ds_snat_ip_entry,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsUuidsLen *uint32 `json:"ds_uuids_len,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EverPlaced *bool `json:"ever_placed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqCredit *uint32 `json:"fq_credit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqDeadline *uint32 `json:"fq_deadline,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqDelayFairness *bool `json:"fq_delay_fairness,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqOverflows *uint64 `json:"fq_overflows,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqRecovered *uint64 `json:"fq_recovered,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqStored *uint32 `json:"fq_stored,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqWeight *uint32 `json:"fq_weight,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FqWeightChangeDrops *uint64 `json:"fq_weight_change_drops,omitempty"`

	// Number of times Secondary SE selection did not find HB state. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbStateMissing *uint64 `json:"hb_state_missing,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidHbReplies *uint32 `json:"invalid_hb_replies,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L7HasRedirect *bool `json:"l7_has_redirect,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ListeningSockets []*ListeningSocket `json:"listening_sockets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxBadRpsCip *uint32 `json:"max_bad_rps_cip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxBadRpsCipURI *uint32 `json:"max_bad_rps_cip_uri,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxBadRpsURI *uint32 `json:"max_bad_rps_uri,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxNumPoolsUpSeUUID *string `json:"max_num_pools_up_se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxRpsUnknownCip *uint32 `json:"max_rps_unknown_cip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxStateSeUUID *string `json:"max_state_se_uuid,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NegativeOpenConns *uint64 `json:"negative_open_conns,omitempty"`

	// NTLM app detection stats. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmStats *NtlmStatsInternal `json:"ntlm_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumActiveSes *uint32 `json:"num_active_ses,omitempty"`

	// Number of child VS created in SE for parent VS. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChildVsCreated *uint32 `json:"num_child_vs_created,omitempty"`

	// Number of times server side connection establishment time was breached. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConnEstTimeExceededFlowsBe *uint64 `json:"num_conn_est_time_exceeded_flows_be,omitempty"`

	// Number of times client side connection establishment time was breached. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConnEstTimeExceededFlowsFe *uint64 `json:"num_conn_est_time_exceeded_flows_fe,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSum *uint32 `json:"num_flow_cores_sum,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSumChangesAccepted *uint32 `json:"num_flow_cores_sum_changes_accepted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCoresSumChangesAll *uint32 `json:"num_flow_cores_sum_changes_all,omitempty"`

	// Number of times 'latency_threshold' was breached during ingress. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIngressLatencyExceededFlows *uint64 `json:"num_ingress_latency_exceeded_flows,omitempty"`

	// Deprecated in 22.1.1. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIngressLatencyExceededPkts *uint64 `json:"num_ingress_latency_exceeded_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPools *uint32 `json:"num_pools,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPoolsUp *int32 `json:"num_pools_up,omitempty"`

	// Number of packets for which the proxy processing time was breached. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumProxyTimeExceededPkts *uint64 `json:"num_proxy_time_exceeded_pkts,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OneHopDsUuidsLen *uint32 `json:"one_hop_ds_uuids_len,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OneHopDsUuidsLenSeUUID *string `json:"one_hop_ds_uuids_len_se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementCore []int64 `json:"placement_core,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Refcnts *VirtualServiceRefCnt `json:"refcnts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Selbchentry []*SeLbChEntry `json:"selbchentry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Selbentry []*SeLbEntry `json:"selbentry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbentryRo []*SeLbEntry `json:"selbentry_ro,omitempty"`

	// VS Scaleout Ready status from the SE. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentScaleoutReady *bool `json:"sent_scaleout_ready,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sestatuslist []*SestatusInternal `json:"sestatuslist,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssl *SSLStatsInternal `json:"ssl,omitempty"`

	// Indicates deployment without Tunnel End Points (TEPs) in NSX-T environment. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tepless *bool `json:"tepless,omitempty"`

	// Number of child VS exists for parent VS. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalChildVs *uint32 `json:"total_child_vs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vcpus *uint32 `json:"vcpus,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipMasklen *int32 `json:"vip_masklen,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualserviceConfig *VirtualService `json:"virtualservice_config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualserviceRuntime *VirtualServiceRuntime `json:"virtualservice_runtime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsAllSeBpsL4 *int64 `json:"vs_all_se_bps_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsBpsLimitDropL4 *int64 `json:"vs_bps_limit_drop_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsConnLimitDropL4 *int32 `json:"vs_conn_limit_drop_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsConnPoolType *string `json:"vs_conn_pool_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsCurrBpsL4 *int64 `json:"vs_curr_bps_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsCurrOutstandingConnsL4 *int32 `json:"vs_curr_outstanding_conns_l4,omitempty"`

	// Datascript-sets linked to the VS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsDatascriptsets []*VsDss `json:"vs_datascriptsets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsIsStandby *int32 `json:"vs_is_standby,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsMasterAutogw *int32 `json:"vs_master_autogw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsMasterStatIndexL4 *int32 `json:"vs_master_stat_index_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsMaxBpsL4 *int64 `json:"vs_max_bps_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsMaxOutstandingConnsL4 *int32 `json:"vs_max_outstanding_conns_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsStatIndexL4 *int32 `json:"vs_stat_index_l4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsTableEntryType *string `json:"vs_table_entry_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VserverRtmFlagsL4 *int32 `json:"vserver_rtm_flags_l4,omitempty"`
}
