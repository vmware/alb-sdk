// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageRawInventoryEntry image raw inventory entry
// swagger:model ImageRawInventoryEntry
type ImageRawInventoryEntry struct {

	// Serialized Image config. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *Image `json:"config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Runtime *ImageRawInventoryRuntime `json:"runtime,omitempty"`
}
