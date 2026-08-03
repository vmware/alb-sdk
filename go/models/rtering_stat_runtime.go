// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RteringStatRuntime rtering stat runtime
// swagger:model RteringStatRuntime
type RteringStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControlqRetries *uint32 `json:"controlq_retries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataqFails *uint32 `json:"dataq_fails,omitempty"`

	// Total number of times write to rte rings failed. Field introduced in 22.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DebugDropCount *uint64 `json:"debug_drop_count,omitempty"`

	// Total number of times CPU was yielded for writing to rte rings. Field introduced in 22.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxWriteEndYieldCount *uint64 `json:"max_write_end_yield_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Msg []string `json:"msg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MyRxqMore *uint32 `json:"my_rxq_more,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MyTxqMore *uint32 `json:"my_txq_more,omitempty"`

	// Total number of times 'latency_threshold' was breached during egress (per pkt). Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEgressLatencyExceededPkts *uint64 `json:"num_egress_latency_exceeded_pkts,omitempty"`

	// Total number of times 'latency_threshold' was breached during ingress (per pkt). Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIngressLatencyExceededPkts *uint64 `json:"num_ingress_latency_exceeded_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherRxqAlmostFull *uint32 `json:"other_rxq_almost_full,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherTxqAlmostFull *uint32 `json:"other_txq_almost_full,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbqFull *uint32 `json:"sb_q_full,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbqSent *uint32 `json:"sb_q_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
