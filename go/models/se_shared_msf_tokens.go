// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeSharedMsfTokens se shared msf tokens
// swagger:model SeSharedMsfTokens
type SeSharedMsfTokens struct {

	// Index in the msf table. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Index *uint64 `json:"index,omitempty"`

	// Tokens available. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTokens *uint64 `json:"num_tokens,omitempty"`

	// Last token Replenish time. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplenishTime *uint64 `json:"replenish_time,omitempty"`
}
