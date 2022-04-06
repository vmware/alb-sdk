// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPFastPathProfile TCP fast path profile
// swagger:model TCPFastPathProfile
type TCPFastPathProfile struct {

	// DSR profile information. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	DsrProfile *DsrProfile `json:"dsr_profile,omitempty"`

	// When enabled, Avi will complete the 3-way handshake with the client before forwarding any packets to the server.  This will protect the server from SYN flood and half open SYN connections. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition.
	EnableSynProtection *bool `json:"enable_syn_protection,omitempty"`

	// The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted. Allowed values are 5-14400. Special values are 0 - infinite. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SessionIDLETimeout *int32 `json:"session_idle_timeout,omitempty"`
}
