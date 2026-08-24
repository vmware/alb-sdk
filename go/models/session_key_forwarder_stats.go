// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SessionKeyForwarderStats session key forwarder stats
// swagger:model SessionKeyForwarderStats
type SessionKeyForwarderStats struct {

	// Total number of connection attempts to Session Key Forwarder endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionAttempts *uint64 `json:"connection_attempts,omitempty"`

	// Total number of successful connections established. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsEstablished *uint64 `json:"connections_established,omitempty"`

	// Total number of failed connection attempts. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsFailed *uint64 `json:"connections_failed,omitempty"`

	// Endpoint (ip port) this stats entry applies to; used for SE-level display and filter. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPPort *string `json:"ip_port,omitempty"`

	// Total number of session keylog messages failed to get enqueued from dataplane to helper. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogEnqueFailedHlpr *uint64 `json:"keylog_enque_failed_hlpr,omitempty"`

	// Total number of session keylog messages that failed to send. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogFailed *uint64 `json:"keylog_failed,omitempty"`

	// Total number of session keylog messages successfully sent. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogSent *uint64 `json:"keylog_sent,omitempty"`

	// Total number of TLS 1.2 keylog messages successfully sent. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogSentTls12 *uint64 `json:"keylog_sent_tls12,omitempty"`

	// Total number of TLS 1.3 keylog messages successfully sent. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogSentTls13 *uint64 `json:"keylog_sent_tls13,omitempty"`

	// Total number of session key forwarder profiles that are using this IP Port. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumProfiles *uint64 `json:"num_profiles,omitempty"`

	// Total number of SSL/TLS handshake failures. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeFailures *uint64 `json:"ssl_handshake_failures,omitempty"`
}
