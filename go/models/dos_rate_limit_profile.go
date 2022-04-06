// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DosRateLimitProfile dos rate limit profile
// swagger:model DosRateLimitProfile
type DosRateLimitProfile struct {

	// Profile for DoS attack detection. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DosProfile *DosThresholdProfile `json:"dos_profile,omitempty"`

	// Profile for Connections/Requests rate limiting. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RlProfile *RateLimiterProfile `json:"rl_profile,omitempty"`
}
