// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterVersionInfo cluster version info
// swagger:model ClusterVersionInfo
type ClusterVersionInfo struct {

	// Controller build number. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Build *uint32 `json:"build"`

	// Build timestamp of the controller image. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Date *string `json:"date"`

	// Minimum controller version this build can upgrade from. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MinVersion *string `json:"min_version"`

	// Product identifier for this controller build. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Product *string `json:"product"`

	// Human-readable product name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProductName *string `json:"product_name"`

	// Full build tag combining version, build number and timestamp. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Tag *string `json:"tag"`

	// Controller release version. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Version *string `json:"version"`
}
