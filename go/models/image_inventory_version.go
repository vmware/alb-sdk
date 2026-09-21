// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageInventoryVersion image inventory version
// swagger:model ImageInventoryVersion
type ImageInventoryVersion struct {

	// Information of image with the particular base version. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageInfo []*ImageInventoryInfo `json:"image_info,omitempty"`

	// Major version of the image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
