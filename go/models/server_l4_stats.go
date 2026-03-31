// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerL4Stats server l4 stats
// swagger:model ServerL4Stats
type ServerL4Stats struct {

	// This reflects available capacity of the servers as measured from SE as C_i - L_i. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvailableCapacity *uint64 `json:"available_capacity,omitempty"`

	// This reflects capacity of the servers as measured from SE as C_i. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Capacity *uint64 `json:"capacity,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteConns *uint64 `json:"complete_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDroppedAfterEst *uint64 `json:"conn_dropped_after_est,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDroppedBeforeEst *uint64 `json:"conn_dropped_before_est,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDroppedBeforeSynSent *uint64 `json:"conn_dropped_before_syn_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDuration *uint64 `json:"conn_duration,omitempty"`

	// Average connection establishment time on the server side. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionEstbTimeBe *uint64 `json:"connection_estb_time_be,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionSetupTime *uint64 `json:"connection_setup_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsDropped *uint64 `json:"connections_dropped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DupAckRetransmits *uint64 `json:"dup_ack_retransmits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErroredConnections *uint64 `json:"errored_connections,omitempty"`

	// This reflects capacity of the servers as measured from SE as C_i. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EstCapacity *uint64 `json:"est_capacity,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FinishedConns *uint64 `json:"finished_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthCheckFailures *uint64 `json:"health_check_failures,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthStatus *uint64 `json:"health_status,omitempty"`

	// Number of times load balancing failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCount *uint64 `json:"lb_fail_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LossyConnections *uint64 `json:"lossy_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LossyReq *uint64 `json:"lossy_req,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewEstablishedConns *uint64 `json:"new_established_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Number of times server side connection establishment time was breached. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConnEstTimeExceededFlowsBe *uint64 `json:"num_conn_est_time_exceeded_flows_be,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStateChanges *uint64 `json:"num_state_changes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpenConns *uint64 `json:"open_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OutOfOrders *uint64 `json:"out_of_orders,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rtt *uint64 `json:"rtt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RttValidConnections *uint64 `json:"rtt_valid_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytes *uint64 `json:"rx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesAbsolute *uint64 `json:"rx_bytes_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxGoodput *uint64 `json:"rx_goodput,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPkts *uint64 `json:"rx_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPktsAbsolute *uint64 `json:"rx_pkts_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxTCPResets *uint64 `json:"rx_tcp_resets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxZeroWindowSizeEvents *uint64 `json:"rx_zero_window_size_events,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SackRetransmits *uint64 `json:"sack_retransmits,omitempty"`

	// SCTP inits sent to the server. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpInitsSent *uint64 `json:"sctp_inits_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerCount *uint64 `json:"server_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerUptime *uint64 `json:"server_uptime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynsSent *uint64 `json:"syns_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimeoutRetransmits *uint64 `json:"timeout_retransmits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytes *uint64 `json:"tx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytesAbsolute *uint64 `json:"tx_bytes_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxGoodput *uint64 `json:"tx_goodput,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPkts *uint64 `json:"tx_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPktsAbsolute *uint64 `json:"tx_pkts_absolute,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxZeroWindowSizeEvents *uint64 `json:"tx_zero_window_size_events,omitempty"`
}
