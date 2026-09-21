// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicensePolicy license policy
// swagger:model LicensePolicy
type LicensePolicy struct {

	// License expiration date. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpirationDate *string `json:"expiration_date,omitempty"`

	// Expiration pre warning period. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpirationPreWarn *string `json:"expiration_pre_warn,omitempty"`

	// License expiration reason. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpirationReason *string `json:"expiration_reason,omitempty"`

	// License grace period. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GracePeriod *string `json:"grace_period,omitempty"`

	// License warnings. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseWarnings []*LicenseWarning `json:"license_warnings,omitempty"`
}
