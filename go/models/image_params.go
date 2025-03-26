// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageParams image params
// swagger:model ImageParams
type ImageParams struct {

	// Maximum wait time to replicate image files from Leader to followers. Allowed values are 600-3600. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ImageReplicationTimeout *uint32 `json:"image_replication_timeout,omitempty"`

	// Maximum permitted size for image uploads. Allowed values are 10-15. Field introduced in 31.1.1. Unit is GB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxImageSize *uint32 `json:"max_image_size,omitempty"`
}
