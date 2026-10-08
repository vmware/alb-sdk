// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseStateGroup license state group
// swagger:model LicenseStateGroup
type LicenseStateGroup struct {

	// Total count of licenses in this state. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *int32 `json:"count,omitempty"`

	// List of licenses in this state. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Licenses []*LicenseStateInfo `json:"licenses,omitempty"`

	// Lifecycle state for this group. Enum options - STATE_UNSPECIFIED, STATE_ACTIVE, STATE_WARNING_AGGRESIVE, STATE_WARNING_NORMAL, STATE_GRACE_PERIOD, STATE_EXPIRED, STATE_ALL. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
