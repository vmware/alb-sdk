// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TokenRefillRate token refill rate
// swagger:model TokenRefillRate
type TokenRefillRate struct {

	// The time interval over which refill rate is defined. Enum options - PER_MINUTE_INTERVAL. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Interval *string `json:"interval,omitempty"`

	// The rate per refill interval at which tokens are added to the bucket. Allowed values are 1-100000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	RefillRate *uint32 `json:"refill_rate"`
}
