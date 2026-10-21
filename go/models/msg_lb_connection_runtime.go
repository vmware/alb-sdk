// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnectionRuntime msg lb connection runtime
// swagger:model MsgLbConnectionRuntime
type MsgLbConnectionRuntime struct {

	// Active MsgLB client connections for the requested VS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Connection []*MsgLbConnectionEntry `json:"connection,omitempty"`

	// Connections rejected at accept because this VS has no L4_REQ datascript configured for MsgLB message framing. Nonzero indicates a VS/datascript configuration problem, not a traffic problem. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsRejectCount *uint64 `json:"ds_reject_count,omitempty"`

	// True if this VS has more MsgLB client connections than the per-call display cap, so the connection list above is incomplete. Narrow down with the client_ip filter to inspect a specific client. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Truncated *bool `json:"truncated,omitempty"`
}
