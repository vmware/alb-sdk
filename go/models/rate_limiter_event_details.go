// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RateLimiterEventDetails rate limiter event details
// swagger:model RateLimiterEventDetails
type RateLimiterEventDetails struct {

	// Rate limiter error message. Field introduced in 20.1.1.
	ErrorMessage *string `json:"error_message,omitempty"`

	// Name of the rate limiter. Field introduced in 20.1.1.
	RlResourceName *string `json:"rl_resource_name,omitempty"`

	// Rate limiter type. Field introduced in 20.1.1.
	RlResourceType *string `json:"rl_resource_type,omitempty"`

	// Status. Field introduced in 20.1.1.
	Status *string `json:"status,omitempty"`
}
