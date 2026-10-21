// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbTCPStats msg lb Tcp stats
// swagger:model MsgLbTcpStats
type MsgLbTCPStats struct {

	// Messages that reused an idle pooled server connection. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolHits *uint64 `json:"connpool_hits,omitempty"`

	// Messages that required a new TCP connection to the backend. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolMisses *uint64 `json:"connpool_misses,omitempty"`

	// Messages multiplexed onto a busy connection via round-robin. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolMux *uint64 `json:"connpool_mux,omitempty"`

	// Connections rejected at accept because this VS has no L4_REQ datascript configured for MsgLB message framing. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsRejectCount *uint64 `json:"ds_reject_count,omitempty"`

	// Total request bytes committed by clients on this VS. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytes *uint64 `json:"total_bytes,omitempty"`

	// ISO 8583 messages committed by clients on this VS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMessages *uint64 `json:"total_messages,omitempty"`

	// Messages with a transaction/session key for which the transaction hash returned an existing server affinity entry. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionHits *uint64 `json:"transaction_hits,omitempty"`

	// Messages with a transaction/session key where no transaction entry was found (LB fallthrough). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionMisses *uint64 `json:"transaction_misses,omitempty"`
}
