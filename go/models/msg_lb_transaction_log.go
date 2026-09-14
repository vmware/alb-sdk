// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbTransactionLog msg lb transaction log
// swagger:model MsgLbTransactionLog
type MsgLbTransactionLog struct {

	// Server-connection pool acquisition outcome for this request  0=new, 1=idle-reuse, 2=busy-round-robin. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolDisposition *uint32 `json:"connpool_disposition,omitempty"`

	// Request-to-response latency in microseconds. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LatencyUs *uint64 `json:"latency_us,omitempty"`

	// Byte length of the request forwarded to the server. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqMsgLen *uint64 `json:"req_msg_len,omitempty"`

	// Byte length of the response received from the server. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespMsgLen *uint64 `json:"resp_msg_len,omitempty"`

	// Backend server address in 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIP *string `json:"server_ip,omitempty"`

	// Transaction hash lookup outcome for this request  0=none, 1=hit, 2=miss. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionDisposition *uint32 `json:"transaction_disposition,omitempty"`

	// Hex-encoded transaction/session key for this message, or 'none' if no key was supplied. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionKey *string `json:"transaction_key,omitempty"`
}
