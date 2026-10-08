// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseStateInfo license state info
// swagger:model LicenseStateInfo
type LicenseStateInfo struct {

	// License expiration date and time. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpirationTime *string `json:"expiration_time,omitempty"`

	// Grace period end time after expiration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GracePeriodEndTime *string `json:"grace_period_end_time,omitempty"`

	// Unique identifier for the license. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseID *string `json:"license_id,omitempty"`

	// Current lifecycle state of the license. Enum options - STATE_UNSPECIFIED, STATE_ACTIVE, STATE_WARNING_AGGRESIVE, STATE_WARNING_NORMAL, STATE_GRACE_PERIOD, STATE_EXPIRED, STATE_ALL. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LifecycleState *string `json:"lifecycle_state,omitempty"`

	// Pre-warning period start time before expiration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreWarnTime *string `json:"pre_warn_time,omitempty"`
}
