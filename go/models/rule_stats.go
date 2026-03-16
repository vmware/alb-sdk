// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RuleStats rule stats
// swagger:model RuleStats
type RuleStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionHits *uint64 `json:"action_hits,omitempty"`

	// Number of times the rate limit threshold was exceeded and rate limit action was taken. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionRateLimited *uint64 `json:"action_rate_limited,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Evaluated *uint64 `json:"evaluated"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Hits *uint64 `json:"hits"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Index *int32 `json:"index"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`
}
