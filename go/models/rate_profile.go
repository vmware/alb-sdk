// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RateProfile rate profile
// swagger:model RateProfile
type RateProfile struct {

	// Action to perform upon rate limiting. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Action *RateLimiterAction `json:"action"`

	// Explicitly tracks an attacker across rate periods. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- false) edition.
	ExplicitTracking *bool `json:"explicit_tracking,omitempty"`

	// Enable fine granularity. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- false) edition.
	FineGrain *bool `json:"fine_grain,omitempty"`

	// HTTP cookie name. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition.
	HTTPCookie *string `json:"http_cookie,omitempty"`

	// HTTP header name. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition.
	HTTPHeader *string `json:"http_header,omitempty"`

	// The rate limiter configuration for this rate profile. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RateLimiter *RateLimiter `json:"rate_limiter,omitempty"`
}
