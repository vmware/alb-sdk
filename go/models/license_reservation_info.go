// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseReservationInfo license reservation info
// swagger:model LicenseReservationInfo
type LicenseReservationInfo struct {

	// License Cores reserved by tenant/se group. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reserved *int64 `json:"reserved,omitempty"`

	// Uuid for tenant/se group. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
