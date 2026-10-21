// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnectionServerEntry msg lb connection server entry
// swagger:model MsgLbConnectionServerEntry
type MsgLbConnectionServerEntry struct {

	// In-flight bindings from this client to this backend. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InFlightCount *uint64 `json:"in_flight_count,omitempty"`

	// Age in milliseconds of the oldest outstanding request to this backend for this client; 0 if none are outstanding. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldestPendingAgeMs *uint64 `json:"oldest_pending_age_ms,omitempty"`

	// Backend server address, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerIPPort *string `json:"server_ip_port,omitempty"`
}
