// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerPortalSiteInfo controller portal site info
// swagger:model ControllerPortalSiteInfo
type ControllerPortalSiteInfo struct {

	// Site ID to which the controller is registered. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteID *string `json:"site_id,omitempty"`

	// Site name to which the controller is registered. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`
}
