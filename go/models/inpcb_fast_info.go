// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InpcbFastInfo inpcb fast info
// swagger:model InpcbFastInfo
type InpcbFastInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DebugFlags *uint64 `json:"debug_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpAckDelta *int64 `json:"inp_ack_delta,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpFastFlags *uint32 `json:"inp_fast_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpFastState *uint32 `json:"inp_fast_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpIdleTimeout *uint32 `json:"inp_idle_timeout,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpLastPktTick *uint32 `json:"inp_last_pkt_tick,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpNextSeq *uint32 `json:"inp_next_seq,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSeqDelta *int64 `json:"inp_seq_delta,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSnatFaddr *string `json:"inp_snat_faddr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSnatFport *uint32 `json:"inp_snat_fport,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSnatLaddr *string `json:"inp_snat_laddr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSnatLport *uint32 `json:"inp_snat_lport,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpStarttime *TimeStamp `json:"inp_starttime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpSynsSent *uint32 `json:"inp_syns_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpTimerShift *uint32 `json:"inp_timer_shift,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpTsOffset *uint32 `json:"inp_ts_offset,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpTsecr *uint32 `json:"inp_tsecr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxVnicHdl *uint32 `json:"tx_vnic_hdl,omitempty"`
}
