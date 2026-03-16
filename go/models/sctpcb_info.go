// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SctpcbInfo sctpcb info
// swagger:model SctpcbInfo
type SctpcbInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxInitTimes *uint32 `json:"max_init_times,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxOpenStreamsIntome *uint32 `json:"max_open_streams_intome,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSendTime *uint32 `json:"max_send_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpFlags *uint32 `json:"sctp_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpSackFreq *uint32 `json:"sctp_sack_freq,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpState *uint32 `json:"sctp_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpStateName *string `json:"sctp_state_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpSwsReceiver *uint32 `json:"sctp_sws_receiver,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpSwsSender *uint32 `json:"sctp_sws_sender,omitempty"`
}
