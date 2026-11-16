// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerMsgStats server msg stats
// swagger:model ServerMsgStats
type ServerMsgStats struct {

	// Average request-to-response latency in microseconds (total_latency_us / msg_count_rx; 0 if no responses). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgLatencyUs *uint64 `json:"avg_latency_us,omitempty"`

	// Total response bytes received from this server. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesRx *uint64 `json:"bytes_rx,omitempty"`

	// Total request bytes forwarded to this server. Field introduced in 32.1.5. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesTx *uint64 `json:"bytes_tx,omitempty"`

	// Number of responses received from this server. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgCountRx *uint64 `json:"msg_count_rx,omitempty"`

	// Number of requests forwarded to this server. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgCountTx *uint64 `json:"msg_count_tx,omitempty"`

	// Number of in-flight requests outstanding when the client connection was force-closed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanCount *uint64 `json:"orphan_count,omitempty"`

	// Backend server address in 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIPPort *string `json:"server_ip_port,omitempty"`

	// Number of requests to this server that expired waiting for a response. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimeoutCount *uint64 `json:"timeout_count,omitempty"`
}
