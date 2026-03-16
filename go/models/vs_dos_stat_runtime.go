// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsDosStatRuntime vs dos stat runtime
// swagger:model VsDosStatRuntime
type VsDosStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BadRstFlood *uint32 `json:"bad_rst_flood"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnIPRlActionDrops *uint64 `json:"conn_ip_rl_action_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnIPRlActionResets *uint64 `json:"conn_ip_rl_action_resets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnRlActionDrops *uint64 `json:"conn_rl_action_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnRlActionResets *uint64 `json:"conn_rl_action_resets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CpsLikelyDoserStats *CpsDoserStats `json:"cps_likely_doser_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CpsVlikelyDoserStats *CpsDoserStats `json:"cps_vlikely_doser_stats,omitempty"`

	// Number of queries from well-known source port with reply of size greater than 1500. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSAmplificationEgress *uint64 `json:"dns_amplification_egress,omitempty"`

	// Number of unsolicited DNS response, qualified as DNS reflection, received at the virtual service. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSAttackReflection *uint64 `json:"dns_attack_reflection,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DosAppError *uint32 `json:"dos_app_error"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConn *uint64 `json:"dos_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConnIPRlDrop *uint32 `json:"dos_conn_ip_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConnRlDrop *uint32 `json:"dos_conn_rl_drop,omitempty"`

	// Number of connections prematurely ended, qualified as denial of service attack. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosHTTPEnded *uint32 `json:"dos_http_ended,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DosHTTPError *uint32 `json:"dos_http_error"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DosHTTPTimeout *uint32 `json:"dos_http_timeout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReq *uint64 `json:"dos_req,omitempty"`

	//  Field introduced in 17.2.13,18.1.3,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqCustomRlDrop *uint32 `json:"dos_req_custom_rl_drop,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqHdrRlDrop *uint32 `json:"dos_req_hdr_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPRlDrop *uint32 `json:"dos_req_ip_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPRlDropBad *uint32 `json:"dos_req_ip_rl_drop_bad,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPScanBadRlDrop *uint32 `json:"dos_req_ip_scan_bad_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPScanUnknownRlDrop *uint32 `json:"dos_req_ip_scan_unknown_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPURIRlDrop *uint32 `json:"dos_req_ip_uri_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPURIRlDropBad *uint32 `json:"dos_req_ip_uri_rl_drop_bad,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqRlDrop *uint32 `json:"dos_req_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIRlDrop *uint32 `json:"dos_req_uri_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIRlDropBad *uint32 `json:"dos_req_uri_rl_drop_bad,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIScanBadRlDrop *uint32 `json:"dos_req_uri_scan_bad_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIScanUnknownRlDrop *uint32 `json:"dos_req_uri_scan_unknown_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosRxBytes *uint64 `json:"dos_rx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DosSslError *uint32 `json:"dos_ssl_error"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FakeSession *uint32 `json:"fake_session"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MalformedFlood *uint32 `json:"malformed_flood"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonSynFlood *uint32 `json:"non_syn_flood,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUntrackedCpsDosers *uint64 `json:"num_untracked_cps_dosers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyDropBytes *uint64 `json:"policy_drop_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyDropPkts *uint64 `json:"policy_drop_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyDrops *uint64 `json:"policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SlowURI *uint32 `json:"slow_uri,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallWindowStress *uint32 `json:"small_window_stress"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SynFlood *uint32 `json:"syn_flood"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ZeroWindowStress *uint32 `json:"zero_window_stress"`
}
