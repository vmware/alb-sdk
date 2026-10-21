// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnPoolServerEntry msg lb conn pool server entry
// swagger:model MsgLbConnPoolServerEntry
type MsgLbConnPoolServerEntry struct {

	// Connections to this server currently carrying a request. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BusyCount *uint64 `json:"busy_count,omitempty"`

	// Idle pooled connections to this server available for reuse. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FreeCount *uint64 `json:"free_count,omitempty"`

	// Configured idle timeout before a pooled connection to this server is closed; 0 means idle connections are closed immediately (pooling effectively disabled). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IdleTimeoutMs *uint64 `json:"idle_timeout_ms,omitempty"`

	// Configured per-server connection cap; 0 means unlimited. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConns *uint64 `json:"max_conns,omitempty"`

	// Connections to this server whose TCP handshake has not yet completed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PendingCount *uint64 `json:"pending_count,omitempty"`

	// Backend server address, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIPPort *string `json:"server_ip_port,omitempty"`
}
