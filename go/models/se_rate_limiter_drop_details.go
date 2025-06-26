// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRateLimiterDropDetails se rate limiter drop details
// swagger:model SeRateLimiterDropDetails
type SeRateLimiterDropDetails struct {

	// Number of packets dropped by rate limiter. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NumPktsDropped *uint64 `json:"num_pkts_dropped,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
