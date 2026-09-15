// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbStats msg lb stats
// swagger:model MsgLbStats
type MsgLbStats struct {

	// Messages that reused an idle pooled server connection. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolHits *uint64 `json:"connpool_hits,omitempty"`

	// Messages that required a new TCP connection to the backend. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolMisses *uint64 `json:"connpool_misses,omitempty"`

	// Messages multiplexed onto a busy connection via round-robin. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolMux *uint64 `json:"connpool_mux,omitempty"`

	// Per-backend breakdown of message and byte counters. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*ServerMsgStats `json:"servers,omitempty"`

	// Total response bytes received from all backend servers. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytesRx *uint64 `json:"total_bytes_rx,omitempty"`

	// Total request bytes forwarded to all backend servers. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytesTx *uint64 `json:"total_bytes_tx,omitempty"`

	// Total ISO 8583 responses received from backend servers over this connection. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMessagesRx *uint64 `json:"total_messages_rx,omitempty"`

	// Total ISO 8583 messages committed to backend servers over this connection. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMessagesTx *uint64 `json:"total_messages_tx,omitempty"`

	// Messages with a transaction or session key for which the transaction hash returned an existing server affinity entry. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionHits *uint64 `json:"transaction_hits,omitempty"`

	// Messages with a transaction or session key where no transaction entry was found (LB fallthrough). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionMisses *uint64 `json:"transaction_misses,omitempty"`
}
