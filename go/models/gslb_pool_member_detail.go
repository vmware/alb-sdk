// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbPoolMemberDetail gslb pool member detail
// swagger:model GslbPoolMemberDetail
type GslbPoolMemberDetail struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDuration *uint64 `json:"conn_duration,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErroredConnections *uint64 `json:"errored_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FinishedConns *uint64 `json:"finished_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthCheckFailures *uint64 `json:"health_check_failures,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthStatus *uint64 `json:"health_status,omitempty"`

	// IP Address of the GSLB pool member. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// Number of times load balancing failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCount *uint64 `json:"lb_fail_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewEstablishedConns *uint64 `json:"new_established_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStateChanges *uint64 `json:"num_state_changes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpenConns *uint64 `json:"open_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Overrides the default ratio of 1.  Reduces the percentage the LB algorithm would pick the server in relation to its peers. Allowed values are 1-20. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ratio *uint32 `json:"ratio,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytes *uint64 `json:"rx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPkts *uint64 `json:"rx_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerUptime *uint64 `json:"server_uptime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytes *uint64 `json:"tx_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPkts *uint64 `json:"tx_pkts,omitempty"`
}
