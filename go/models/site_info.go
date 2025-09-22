// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SiteInfo site info
// swagger:model SiteInfo
type SiteInfo struct {

	// Cluster_uuid of a member configured in gslb federation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterID *string `json:"cluster_id,omitempty"`

	// Site name of a member configured in gslb federation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	SiteName *string `json:"site_name,omitempty"`
}
