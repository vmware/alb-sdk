// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileObjectEvent file object event
// swagger:model FileObjectEvent
type FileObjectEvent struct {

	// Time taken to complete the event in seconds. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// End time of the event. . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Event message if any. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`

	// Start time of the event. . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// Event status. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`
}
