// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationSamplingConfig application sampling config
// swagger:model ApplicationSamplingConfig
type ApplicationSamplingConfig struct {

	// Maximum percent of the application data subjected to Application learning. Allowed values are 1-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxSamplingPercent *uint32 `json:"max_sampling_percent,omitempty"`

	// Minimum periodicity at which ServiceEngine sends the application data to the controller. Allowed values are 1-60. Field introduced in 31.2.1. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinUpdateInterval *uint32 `json:"min_update_interval,omitempty"`
}
