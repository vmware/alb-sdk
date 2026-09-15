// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbContextEntry msg lb context entry
// swagger:model MsgLbContextEntry
type MsgLbContextEntry struct {

	// Client address, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIPPort *string `json:"client_ip_port,omitempty"`

	// Configured per-client-per-server TCP connection cap; 0 means unlimited. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnCap *uint64 `json:"conn_cap,omitempty"`

	// Client-side datascript receive buffer write watermark -- bytes read from the client socket and buffered for the current message. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrOffset *uint64 `json:"curr_offset,omitempty"`

	// Client-side datascript logical read watermark -- how far the running script has consumed from the buffered bytes. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsCurrOffset *uint64 `json:"ds_curr_offset,omitempty"`

	// Client-side expected/collected message length for the message currently being framed; 0 if none in progress. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgLen *uint64 `json:"msg_len,omitempty"`

	// True if the client-side datascript has a complete framed message ready (avi.l4.collect() target reached). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgPresent *bool `json:"msg_present,omitempty"`

	// Requests currently pending a response across all servers for this client. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PendingReqCount *uint64 `json:"pending_req_count,omitempty"`

	// Configured per-request response-wait timeout for this client. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTimeoutMs *uint64 `json:"req_timeout_ms,omitempty"`

	// Every server-side binding for this client, including STICKY anchors. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server []*MsgLbContextServerEntry `json:"server,omitempty"`

	// True if per-request bindings are freed as soon as the response arrives; false if they persist as route-cache entries until idle timeout. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionUnbindOnResponse *bool `json:"session_unbind_on_response,omitempty"`

	// Configured idle timeout for the STICKY anchor binding; 0 means no timer (anchor lives until the client connection closes). Not applicable in TRANSACTIONAL mode. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StickyAnchorTimeoutMs *uint64 `json:"sticky_anchor_timeout_ms,omitempty"`

	// True if this client is in STICKY session-binding mode, false if TRANSACTIONAL. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StickySession *bool `json:"sticky_session,omitempty"`

	// Cumulative response bytes received over this connection's lifetime. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytesRx *uint64 `json:"total_bytes_rx,omitempty"`

	// Cumulative request bytes forwarded over this connection's lifetime. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalBytesTx *uint64 `json:"total_bytes_tx,omitempty"`

	// Cumulative responses received over this connection's lifetime. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMsgsRx *uint64 `json:"total_msgs_rx,omitempty"`

	// Cumulative requests forwarded over this connection's lifetime. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMsgsTx *uint64 `json:"total_msgs_tx,omitempty"`

	// Length of the transaction/session key captured for the in-progress message; 0 if none supplied yet. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionKeyBufLen *uint64 `json:"transaction_key_buf_len,omitempty"`
}
