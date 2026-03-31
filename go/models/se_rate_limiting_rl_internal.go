// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRateLimitingRlInternal se rate limiting rl internal
// swagger:model SeRateLimitingRlInternal
type SeRateLimitingRlInternal struct {

	// Show the RateLimiting objects state. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeSharedrlEntries []*SeSharedRlEntry `json:"se_sharedrl_entries,omitempty"`

	// SE UUID. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
