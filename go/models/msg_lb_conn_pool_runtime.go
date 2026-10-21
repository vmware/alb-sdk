// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnPoolRuntime msg lb conn pool runtime
// swagger:model MsgLbConnPoolRuntime
type MsgLbConnPoolRuntime struct {

	// Per-server connection-pool state for this pool, on this core. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entry []*MsgLbConnPoolServerEntry `json:"entry,omitempty"`

	// Name of the MsgLB pool. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// True if this pool has more servers than the per-call display cap, so the entry list above is incomplete. Narrow down with the server filter to inspect a specific backend. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Truncated *bool `json:"truncated,omitempty"`
}
