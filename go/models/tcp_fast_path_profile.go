// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPFastPathProfile TCP fast path profile
// swagger:model TCPFastPathProfile
type TCPFastPathProfile struct {

	// DSR profile information. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DsrProfile *DsrProfile `json:"dsr_profile,omitempty"`

	// When enabled, Avi will complete the 3-way handshake with the client before forwarding any packets to the server.  This will protect the server from SYN flood and half open SYN connections. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableSynProtection *bool `json:"enable_syn_protection,omitempty"`

	// The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted. Allowed values are 5-14400. Special values are 0 - infinite. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionIDLETimeout *int32 `json:"session_idle_timeout,omitempty"`

	// TCP_Fast_PATH Network profile options. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TCPFastpathOptions *TCPOptions `json:"tcp_fastpath_options,omitempty"`
}
