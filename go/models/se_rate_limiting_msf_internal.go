// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRateLimitingMsfInternal se rate limiting msf internal
// swagger:model SeRateLimitingMsfInternal
type SeRateLimitingMsfInternal struct {

	// Show the RateLimiting objects state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeSharedmsfEntries []*SeSharedMsfEntry `json:"se_sharedmsf_entries,omitempty"`

	// SE UUID. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
