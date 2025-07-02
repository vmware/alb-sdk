// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiskThreshold disk threshold
// swagger:model DiskThreshold
type DiskThreshold struct {

	// Action to trigger when policy conditions are met. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Action *RetentionAction `json:"action"`

	// Path against which disk usage is measured, user cannot modify the path. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Filepath *string `json:"filepath,omitempty"`

	// Trigger the action when disk usage percent exceeds on the specified path. Allowed values are 1-25. Field introduced in 31.1.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxDiskPercent *uint64 `json:"max_disk_percent,omitempty"`

	// Trigger the action when total available diskspace falls below this level. Allowed values are 5-50. Field introduced in 31.1.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinFreeDiskPercent *uint64 `json:"min_free_disk_percent,omitempty"`

	// When number of files at this path does not exceed this limit, skip renteion action regardless of other disk criteria. Trigger the action when no other disk criteria is specified and number of files exceed the retain limit. Subdirectories do not count. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Retain *uint64 `json:"retain,omitempty"`
}
