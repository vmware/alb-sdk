// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationSamplingRuntime application sampling runtime
// swagger:model ApplicationSamplingRuntime
type ApplicationSamplingRuntime struct {

	// Current sampling percent of the application data subjected to application learning. Allowed values are 1-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CurrentSamplingPercent *uint32 `json:"current_sampling_percent,omitempty"`

	// Current periodicity at which ServiceEngine sends the application data to the controller. Allowed values are 1-60. Field introduced in 31.2.1. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CurrentUpdateInterval *uint32 `json:"current_update_interval,omitempty"`
}
