// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// StatediffEvent statediff event
// swagger:model StatediffEvent
type StatediffEvent struct {

	// Time taken to complete Statediff event in seconds. Field introduced in 21.1.3. Unit is SEC.
	Duration *int32 `json:"duration,omitempty"`

	// Task end time. Field introduced in 21.1.3.
	EndTime *string `json:"end_time,omitempty"`

	// Statediff event message if any. Field introduced in 21.1.3.
	Message *string `json:"message,omitempty"`

	// Task start time. Field introduced in 21.1.3.
	StartTime *string `json:"start_time,omitempty"`

	// Statediff event status. Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS. Field introduced in 21.1.3.
	Status *string `json:"status,omitempty"`

	// Name of Statediff task. Field introduced in 21.1.3.
	TaskName *string `json:"task_name,omitempty"`
}
