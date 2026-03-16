// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLbTokens se lb tokens
// swagger:model SeLbTokens
type SeLbTokens struct {

	// Read-only copy of tokens used in load-aware distribution of flows to the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRoTokens *uint32 `json:"se_ro_tokens,omitempty"`

	// Working copy of tokens used in load-aware distribution of flows to the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeTokens *uint32 `json:"se_tokens,omitempty"`

	// UUID of the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
