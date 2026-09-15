// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbTransactionRuntime msg lb transaction runtime
// swagger:model MsgLbTransactionRuntime
type MsgLbTransactionRuntime struct {

	// Number of distinct clients with an active entry in this pool's transaction table. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CltCount *uint64 `json:"clt_count,omitempty"`

	// Active transaction-hash entries for this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entry []*MsgLbTransactionEntry `json:"entry,omitempty"`

	// Name of the MsgLB pool this transaction table belongs to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`
}
