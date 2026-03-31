// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeSharedMsfEntry se shared msf entry
// swagger:model SeSharedMsfEntry
type SeSharedMsfEntry struct {

	// Rl burst size. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BurstSize *uint32 `json:"burst_size,omitempty"`

	// Total requests to collisions ratio in msf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CollisionRate *float64 `json:"collision_rate,omitempty"`

	// Rl count. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *uint32 `json:"count,omitempty"`

	// RateLimiter key. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Key *string `json:"key"`

	// msf table. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsfTokens []*SeSharedMsfTokens `json:"msf_tokens,omitempty"`

	// Number of buckets in msf. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumBuckets *uint32 `json:"num_buckets,omitempty"`

	// Total number of collisions in msf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCollisions *uint64 `json:"num_collisions,omitempty"`

	// Total number of requests in msf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRequests *uint64 `json:"num_requests,omitempty"`

	// Time period. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Period *uint32 `json:"period,omitempty"`
}
