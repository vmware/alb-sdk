// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageInventoryInfo image inventory info
// swagger:model ImageInventoryInfo
type ImageInventoryInfo struct {

	// Contains image protobuf. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Image *Image `json:"image,omitempty"`

	// Sets true if the image is in use. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUse *bool `json:"in_use,omitempty"`

	// Gives the uuids of the ses and controller which are using this image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUseInfo []*InUseInfo `json:"in_use_info,omitempty"`
}
