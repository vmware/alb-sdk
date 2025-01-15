// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DosRateLimitProfile dos rate limit profile
// swagger:model DosRateLimitProfile
type DosRateLimitProfile struct {

	// Profile for DoS attack detection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosProfile *DosThresholdProfile `json:"dos_profile,omitempty"`

	// Profile for Connections/Requests rate limiting. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlProfile *RateLimiterProfile `json:"rl_profile,omitempty"`
}
