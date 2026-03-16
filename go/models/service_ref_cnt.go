// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceRefCnt service ref cnt
// swagger:model ServiceRefCnt
type ServiceRefCnt struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableSsl *int32 `json:"enable_ssl,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProtocolType *string `json:"protocol_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtmRefcnt *int32 `json:"rtm_refcnt,omitempty"`
}
