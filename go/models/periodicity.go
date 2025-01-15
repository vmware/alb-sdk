// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Periodicity periodicity
// swagger:model Periodicity
type Periodicity struct {

	// Action to trigger when policy conditions are met. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Action *RetentionAction `json:"action"`

	// Time interval in minutes between the action triggers. Allowed values are 1-43200. Field introduced in 31.1.1. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Interval *uint32 `json:"interval,omitempty"`
}
