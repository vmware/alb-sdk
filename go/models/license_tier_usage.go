// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseTierUsage license tier usage
// swagger:model LicenseTierUsage
type LicenseTierUsage struct {

	// Specifies the license tier. Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Tier *string `json:"tier,omitempty"`

	// Usage stats of license tier. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Usage *LicenseUsage `json:"usage,omitempty"`
}
