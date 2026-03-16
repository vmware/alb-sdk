// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL4Stats vserver l4 stats
// swagger:model VserverL4Stats
type VserverL4Stats struct {

	// Number of bytes dropped by virtual service due to policy like l4 security  connection limits, rate limits. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesPolicyDrops *uint64 `json:"bytes_policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteConns *uint64 `json:"complete_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDroppedAfterEst *uint64 `json:"conn_dropped_after_est,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDroppedBeforeEst *uint64 `json:"conn_dropped_before_est,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDuration *uint64 `json:"conn_duration,omitempty"`

	// Number of times connection limit is reached. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionDroppedUserLimit *uint64 `json:"connection_dropped_user_limit,omitempty"`

	// Average connection establishment time on the client side. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionEstbTimeFe *uint64 `json:"connection_estb_time_fe,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsDropped *uint64 `json:"connections_dropped,omitempty"`

	// DoS attack  HTTP App Error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosAppError *uint64 `json:"dos_app_error,omitempty"`

	// DoS attack  Bad Rst Flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosBadRstFlood *uint64 `json:"dos_bad_rst_flood,omitempty"`

	// Connecitons considered as DoS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConn *uint64 `json:"dos_conn,omitempty"`

	// Connections dropped due to IP rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConnIPRlDrop *uint64 `json:"dos_conn_ip_rl_drop,omitempty"`

	// Connections dropped due to VS rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosConnRlDrop *uint64 `json:"dos_conn_rl_drop,omitempty"`

	// DoS attack  Fake Session. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosFakeSession *uint64 `json:"dos_fake_session,omitempty"`

	// DoS attack  HTTP Abort. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosHTTPAbort *uint64 `json:"dos_http_abort,omitempty"`

	// DoS attack  HTTP Error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosHTTPError *uint64 `json:"dos_http_error,omitempty"`

	// DoS attack  HTTP Timeout. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosHTTPTimeout *uint64 `json:"dos_http_timeout,omitempty"`

	// DoS attack  Malformed Packet Flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosMalformedFlood *uint64 `json:"dos_malformed_flood,omitempty"`

	// DoS attack  Non SYN packet flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosNonSynFlood *uint64 `json:"dos_non_syn_flood,omitempty"`

	// Requests considered as DoS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReq *uint64 `json:"dos_req,omitempty"`

	// Requests dropped due to custom rate limit. Field introduced in 17.2.13,18.1.3,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqCustomRlDrop *uint64 `json:"dos_req_custom_rl_drop,omitempty"`

	// Requests dropped due to header or cookie rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqHdrRlDrop *uint64 `json:"dos_req_hdr_rl_drop,omitempty"`

	// Requests dropped due to source IP rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPRlDrop *uint64 `json:"dos_req_ip_rl_drop,omitempty"`

	// Requests dropped due to source IP rate limit for bad requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPRlDropBad *uint64 `json:"dos_req_ip_rl_drop_bad,omitempty"`

	// Requests dropped due to bad IP rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPScanBadRlDrop *uint64 `json:"dos_req_ip_scan_bad_rl_drop,omitempty"`

	// Requests dropped due to unknown IP rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPScanUnknownRlDrop *uint64 `json:"dos_req_ip_scan_unknown_rl_drop,omitempty"`

	// Requeats dropped due to IP&URI rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPURIRlDrop *uint64 `json:"dos_req_ip_uri_rl_drop,omitempty"`

	// Requeats dropped due to IP&URI rate limit for bad requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqIPURIRlDropBad *uint64 `json:"dos_req_ip_uri_rl_drop_bad,omitempty"`

	// Requests dropped due to VS rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqRlDrop *uint64 `json:"dos_req_rl_drop,omitempty"`

	// Requests dropped due to URI rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIRlDrop *uint64 `json:"dos_req_uri_rl_drop,omitempty"`

	// Requests dropped due to URI rate limit for bad requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIRlDropBad *uint64 `json:"dos_req_uri_rl_drop_bad,omitempty"`

	// Requests dropped due to bad URI rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIScanBadRlDrop *uint64 `json:"dos_req_uri_scan_bad_rl_drop,omitempty"`

	// Requests dropped due to unknown URI rate limit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosReqURIScanUnknownRlDrop *uint64 `json:"dos_req_uri_scan_unknown_rl_drop,omitempty"`

	// DoS attack  RX bandwidth. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosRxBytes *uint64 `json:"dos_rx_bytes,omitempty"`

	// DoS attack  Slow Uri. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosSlowURI *uint64 `json:"dos_slow_uri,omitempty"`

	// DoS attack  Small Window Stress. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosSmallWindowStress *uint64 `json:"dos_small_window_stress,omitempty"`

	// DoS attack  HTTP SSL Error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosSslError *uint64 `json:"dos_ssl_error,omitempty"`

	// DoS attack  Syn Flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosSynFlood *uint64 `json:"dos_syn_flood,omitempty"`

	// Total request used for l7 dos normalization. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosTotalReq *uint64 `json:"dos_total_req,omitempty"`

	// DoS attack  TX bandwidth. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosTxBytes *uint64 `json:"dos_tx_bytes,omitempty"`

	// DoS attack  Zero Window Stress. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosZeroWindowStress *uint64 `json:"dos_zero_window_stress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DupAckRetransmits *uint64 `json:"dup_ack_retransmits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndToEndRtt *uint64 `json:"end_to_end_rtt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndToEndRttBucket1 *uint64 `json:"end_to_end_rtt_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndToEndRttBucket2 *uint64 `json:"end_to_end_rtt_bucket2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErroredConnections *uint64 `json:"errored_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FinishedConns *uint64 `json:"finished_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LossyConnections *uint64 `json:"lossy_connections,omitempty"`

	// Total request used for l7 dos normalization. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LossyReq *uint64 `json:"lossy_req,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewEstablishedConns *uint64 `json:"new_established_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Number of active SEs. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumActiveSe *uint64 `json:"num_active_se,omitempty"`

	// Number of times client side connection establishment time was breached. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConnEstTimeExceededFlowsFe *uint64 `json:"num_conn_est_time_exceeded_flows_fe,omitempty"`

	// Number of times 'latency_threshold' was breached during ingress. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIngressLatencyExceededFlows *uint64 `json:"num_ingress_latency_exceeded_flows,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpenConns *uint64 `json:"open_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OutOfOrders *uint64 `json:"out_of_orders,omitempty"`

	// Number of times bandwidth limit is reached. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketDroppedUserBandwidthLimit *uint64 `json:"packet_dropped_user_bandwidth_limit,omitempty"`

	// Number of pkts dropped by virtual service due to policy like l4 security  connection limits, rate limits. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PktsPolicyDrops *uint64 `json:"pkts_policy_drops,omitempty"`

	// Rate of total connections dropped due to VS policy per second. It includes drops due to rate limits, security policy drops, connection limits etc. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyDrops *uint64 `json:"policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RttValidConnections *uint64 `json:"rtt_valid_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytes *uint64 `json:"rx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesAbsolute *uint64 `json:"rx_bytes_absolute,omitempty"`

	// Number of bytes dropped by virtual service due to policy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesDropped *uint64 `json:"rx_bytes_dropped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPkts *uint64 `json:"rx_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPktsAbsolute *uint64 `json:"rx_pkts_absolute,omitempty"`

	// Number of packets dropped by virtual service. Include policy drops. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPktsDropped *uint64 `json:"rx_pkts_dropped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SackRetransmits *uint64 `json:"sack_retransmits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerFlowControl *uint64 `json:"server_flow_control,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Syns *uint64 `json:"syns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimeoutRetransmits *uint64 `json:"timeout_retransmits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytes *uint64 `json:"tx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytesAbsolute *uint64 `json:"tx_bytes_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPkts *uint64 `json:"tx_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPktsAbsolute *uint64 `json:"tx_pkts_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZeroWindowSizeEvents *uint64 `json:"zero_window_size_events,omitempty"`
}
