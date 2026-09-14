// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnPoolRuntime msg lb conn pool runtime
// swagger:model MsgLbConnPoolRuntime
type MsgLbConnPoolRuntime struct {

	// Per-server connection-pool state for this pool, on this core. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entry []*MsgLbConnPoolServerEntry `json:"entry,omitempty"`

	// Name of the MsgLB pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`
}
