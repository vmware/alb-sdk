// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClockSkewToleranceConfig Clock-skew tolerance applied when validating JWT exp/iat claims, to account for clock drift between the token-issuing and verifying sides.
// swagger:model ClockSkewToleranceConfig
type ClockSkewToleranceConfig struct {

	// Enable clock-skew tolerance when validating JWT exp/iat claims. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Maximum clock drift tolerated between the token-issuing and verifying sides when validating JWT exp/iat claims. Allowed values are 1-300. Field introduced in 32.1.4. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkewTolerance *uint32 `json:"skew_tolerance,omitempty"`
}
