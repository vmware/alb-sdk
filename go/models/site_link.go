// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SiteLink site link
// swagger:model SiteLink
type SiteLink struct {

	// Destination site information (cluster_uuid, name). Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Destination *SiteInfo `json:"destination,omitempty"`

	// Source site information (cluster_uuid, name). Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Source *SiteInfo `json:"source,omitempty"`
}
