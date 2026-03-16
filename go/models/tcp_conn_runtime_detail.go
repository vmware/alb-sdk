// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPConnRuntimeDetail Tcp conn runtime detail
// swagger:model TcpConnRuntimeDetail
type TCPConnRuntimeDetail struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnDetail []*DetailedConnEntry `json:"conn_detail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
