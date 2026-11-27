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

	// Failed attempts to forward a message  no server available, binding setup failure, immediate backend connect failure, or datascript error. A retried request can be counted more than once. Field introduced in 32.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FwdFailures *uint64 `json:"fwd_failures,omitempty"`

	// Times received bytes were discarded unforwarded because the peer closed mid-message or the datascript collect timeout expired. Field introduced in 32.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PartialMsgDrops *uint64 `json:"partial_msg_drops,omitempty"`

	// Server responses discarded because their transaction key matched no outstanding request. Field introduced in 32.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RspKeyMissDrops *uint64 `json:"rsp_key_miss_drops,omitempty"`

	// Server responses discarded for a reason other than a key mismatch  no request binding, request not forwarded, or client already closed. Field introduced in 32.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RspOtherDrops *uint64 `json:"rsp_other_drops,omitempty"`

	// Total request bytes committed by clients on this VS. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytes *uint64 `json:"total_bytes,omitempty"`

	// ISO 8583 messages committed by clients on this VS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMessages *uint64 `json:"total_messages,omitempty"`

	// Messages with a transaction/session key for which the transaction hash returned an existing server affinity entry. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionHits *uint64 `json:"transaction_hits,omitempty"`

	// Messages with a transaction/session key where no transaction entry was found (LB fallthrough). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionMisses *uint64 `json:"transaction_misses,omitempty"`
}
