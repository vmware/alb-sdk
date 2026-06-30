// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesSiteInfo a l b services site info
// swagger:model ALBServicesSiteInfo
type ALBServicesSiteInfo struct {

	// Site Id the controller is registered with. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteID *string `json:"site_id,omitempty"`

	// Site Name the controller is registered with. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`
}
