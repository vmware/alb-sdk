// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfServerStats clf server stats
// swagger:model ClfServerStats
type ClfServerStats struct {

	// Bytes successfully written to the collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesSent *uint64 `json:"bytes_sent,omitempty"`

	// Current connection state  0=disconnected, 1=connecting, 2=active, 3=waiting to retry. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnState *uint32 `json:"conn_state,omitempty"`

	// Connection attempts to this collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectAttempts *uint64 `json:"connect_attempts,omitempty"`

	// Connection attempts that failed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectFailed *uint64 `json:"connect_failed,omitempty"`

	// Connections successfully established. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectSuccess *uint64 `json:"connect_success,omitempty"`

	// Connections closed because the collector went idle. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IdleCloses *uint64 `json:"idle_closes,omitempty"`

	// IP address of the log collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddr *IPAddr `json:"ip_addr,omitempty"`

	// Collector endpoint as 'ip port'. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPPort *string `json:"ip_port,omitempty"`

	// Wall-clock date/time of the last snapshot reported for this collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSnapshotTime *TimeStamp `json:"last_snapshot_time,omitempty"`

	// Log records evicted because the pending queue hit its record or byte limit. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogsDroppedQueueFull *uint64 `json:"logs_dropped_queue_full,omitempty"`

	// Log records that could not be delivered. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogsFailed *uint64 `json:"logs_failed,omitempty"`

	// Log records parked while the connection was being established. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogsQueued *uint64 `json:"logs_queued,omitempty"`

	// Log records handed to this collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogsReceived *uint64 `json:"logs_received,omitempty"`

	// Log records successfully written to the collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogsSent *uint64 `json:"logs_sent,omitempty"`

	// Failures entering the collector's VRF network namespace. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetnsErrors *uint64 `json:"netns_errors,omitempty"`

	// Log records currently parked on the pending queue. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PendingCount *uint32 `json:"pending_count,omitempty"`

	// Port of the log collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	// Dataplane process/core that reported this row. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// Reconnect attempts after an established connection dropped. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reconnects *uint64 `json:"reconnects,omitempty"`

	// UUID of the Service Engine reporting these stats. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Socket write/send errors. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendErrors *uint64 `json:"send_errors,omitempty"`

	// TLS failures attributable to certificate validation. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslCertErrors *uint64 `json:"ssl_cert_errors,omitempty"`

	// Failed TLS handshakes with this collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeFailed *uint64 `json:"ssl_handshake_failed,omitempty"`

	// Successful TLS handshakes with this collector. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeSuccess *uint64 `json:"ssl_handshake_success,omitempty"`

	// Transport used to deliver logs to this collector. Enum options - CLF_TRANSPORT_TCP, CLF_TRANSPORT_UDP, CLF_TRANSPORT_TCP_TLS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Transport *string `json:"transport,omitempty"`

	// VRF/namespace id the collector is reached through. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *uint32 `json:"vrf,omitempty"`
}
