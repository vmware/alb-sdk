// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbContextServerEntry msg lb context server entry
// swagger:model MsgLbContextServerEntry
type MsgLbContextServerEntry struct {

	// Milliseconds since the request was forwarded to the server; 0 if not yet committed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AgeMs *uint64 `json:"age_ms,omitempty"`

	// How the server connection was acquired  0=new, 1=idle-reuse, 2=busy-round-robin. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnpoolDisposition *uint32 `json:"connpool_disposition,omitempty"`

	// Milliseconds since this binding last carried traffic in either direction; only maintained in passthrough (session_unbind_on_response == false) mode, 0 otherwise. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IdleMs *uint64 `json:"idle_ms,omitempty"`

	// Number of requests currently sharing this binding. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InFlightCount *uint64 `json:"in_flight_count,omitempty"`

	// True if this is a permanent STICKY-mode anchor binding (server affinity route, not a live in-flight request). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsAnchor *bool `json:"is_anchor,omitempty"`

	// True if this binding was created for a server-initiated message rather than a client request. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsSvrInitiated *bool `json:"is_svr_initiated,omitempty"`

	// Byte length of the request forwarded on this binding; 0 if not yet committed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqMsgLen *uint64 `json:"req_msg_len,omitempty"`

	// Byte length of the response matched to this binding; 0 if none received yet. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespMsgLen *uint64 `json:"resp_msg_len,omitempty"`

	// Backend server address, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIPPort *string `json:"server_ip_port,omitempty"`

	// Server-side datascript receive buffer write watermark -- bytes read from the backend socket and buffered for the current message. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrCurrOffset *uint64 `json:"svr_curr_offset,omitempty"`

	// Server-side datascript logical read watermark -- how far the running script has consumed from the buffered bytes. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrDsCurrOffset *uint64 `json:"svr_ds_curr_offset,omitempty"`

	// Server-side expected/collected message length for the message currently being framed; 0 if none in progress. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrMsgLen *uint64 `json:"svr_msg_len,omitempty"`

	// True if the server-side datascript has a complete framed message ready (avi.l4.collect() target reached). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrMsgPresent *bool `json:"svr_msg_present,omitempty"`

	// Requests currently pending a response on this server context (shared across all bindings to the same backend for this client). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrPendingReqCount *uint64 `json:"svr_pending_req_count,omitempty"`

	// Transaction hash lookup outcome for this binding  0=none, 1=hit, 2=miss. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionDisposition *uint32 `json:"transaction_disposition,omitempty"`

	// Transaction/session key for this binding, hex-encoded; empty if none was supplied. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionKeyHex *string `json:"transaction_key_hex,omitempty"`
}
