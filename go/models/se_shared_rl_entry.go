// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeSharedRlEntry se shared rl entry
// swagger:model SeSharedRlEntry
type SeSharedRlEntry struct {

	// Rl burst size. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BurstSize *uint32 `json:"burst_size,omitempty"`

	// Rl count. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *uint32 `json:"count,omitempty"`

	// RateLimiter key. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Key *string `json:"key"`

	// Tokens available. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTokens *uint64 `json:"num_tokens,omitempty"`

	// Time period. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Period *uint32 `json:"period,omitempty"`

	// Last token Replenish time. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplenishTime *uint64 `json:"replenish_time,omitempty"`
}
