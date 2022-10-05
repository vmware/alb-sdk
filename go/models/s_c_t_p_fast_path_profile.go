// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SCTPFastPathProfile s c t p fast path profile
// swagger:model SCTPFastPathProfile
type SCTPFastPathProfile struct {

	// When enabled, Avi will complete the 3-way handshake with the client before forwarding any packets to the server.  This will protect the server from SYN flood and half open SYN connections. Field introduced in 22.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	EnableSynProtection *bool `json:"enable_syn_protection,omitempty"`

	// The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted. Allowed values are 5-14400. Special values are 0 - infinite. Field introduced in 22.1.3. Unit is SEC. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	SessionIDLETimeout *int32 `json:"session_idle_timeout,omitempty"`
}
