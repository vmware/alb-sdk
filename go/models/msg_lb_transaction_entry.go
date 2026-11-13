// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbTransactionEntry msg lb transaction entry
// swagger:model MsgLbTransactionEntry
type MsgLbTransactionEntry struct {

	// Milliseconds since the request that created this binding was forwarded to the server; 0 if the request has not been committed yet. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AgeMs *uint64 `json:"age_ms,omitempty"`

	// Client address that owns this transaction binding, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIPPort *string `json:"client_ip_port,omitempty"`

	// Number of in-flight requests sharing this transaction binding. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InFlightCount *uint64 `json:"in_flight_count,omitempty"`

	// Backend server this key is currently bound to, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIPPort *string `json:"server_ip_port,omitempty"`

	// Transaction/session key extracted by the datascript, hex-encoded. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionKeyHex *string `json:"transaction_key_hex,omitempty"`
}
