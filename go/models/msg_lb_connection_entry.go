// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnectionEntry msg lb connection entry
// swagger:model MsgLbConnectionEntry
type MsgLbConnectionEntry struct {

	// Client address, 'a.b.c.d port' format. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIPPort *string `json:"client_ip_port,omitempty"`

	// Per-backend in-flight breakdown for this client. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server []*MsgLbConnectionServerEntry `json:"server,omitempty"`

	// Total requests forwarded by this client over the connection lifetime (cumulative). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMsgs *uint64 `json:"total_msgs,omitempty"`
}
