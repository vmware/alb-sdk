// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CorfuTimestamp corfu timestamp
// swagger:model CorfuTimestamp
type CorfuTimestamp struct {

	// unix time since epoch. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Epoch *uint64 `json:"epoch,omitempty"`

	// CorfuDB log sequence number. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Sequence *uint64 `json:"sequence,omitempty"`
}
