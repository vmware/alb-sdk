// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolVersion pool version
// swagger:model PoolVersion
type PoolVersion struct {

	// pool uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Pooluuid *string `json:"pooluuid"`

	// pool osync version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Version *uint64 `json:"version"`
}
