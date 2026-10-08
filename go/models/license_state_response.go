// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseStateResponse license state response
// swagger:model LicenseStateResponse
type LicenseStateResponse struct {

	// Licenses grouped by their lifecycle states. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseGroups []*LicenseStateGroup `json:"license_groups,omitempty"`
}
