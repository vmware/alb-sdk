// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SocketInfo socket info
// swagger:model SocketInfo
type SocketInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoError *uint32 `json:"so_error,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoFibnum *uint32 `json:"so_fibnum,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoGencnt *uint64 `json:"so_gencnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoIncqlen *uint32 `json:"so_incqlen,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoLinger *uint32 `json:"so_linger,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoOobmark *uint32 `json:"so_oobmark,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoOptions *uint32 `json:"so_options,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoPcb *uint64 `json:"so_pcb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoProto *uint64 `json:"so_proto,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoQlen *uint32 `json:"so_qlen,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoQlimit *uint32 `json:"so_qlimit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoQstate *uint32 `json:"so_qstate,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoRcv *SocketBufferInfo `json:"so_rcv,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoRefCount *uint32 `json:"so_ref_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoSnd *SocketBufferInfo `json:"so_snd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoStarttime *TimeStamp `json:"so_starttime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoState *uint32 `json:"so_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoType *uint32 `json:"so_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrDbgFlags *uint64 `json:"so_usr_dbg_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrFlags *uint32 `json:"so_usr_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrL7Handle *uint64 `json:"so_usr_l7_handle,omitempty"`

	//  Enum options - L4_PROXY, L7_PROXY, HM_ICMP, HM_TCP, HM_UDP, L4_DNS, L4_RTMON, L4_SIP, SCTP_PROXY, HM_SCTP. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrProxy *string `json:"so_usr_proxy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrServicePort *uint32 `json:"so_usr_service_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoUsrVserver *string `json:"so_usr_vserver,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoVnet *uint64 `json:"so_vnet,omitempty"`
}
