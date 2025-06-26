// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JournalSummary journal summary
// swagger:model JournalSummary
type JournalSummary struct {

	// Description of the process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Duration of the process in seconds. Field introduced in 30.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// End time of the process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Number of errors in the process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorCount *uint32 `json:"error_count,omitempty"`

	// Summary reason for process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Start time of the process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// State of the Journal Summary. Enum options - TASK_STATE_SUCCESS, TASK_STATE_WARNING, TASK_STATE_ERROR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Status of the process. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Process Type. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	// Number of warnings in the process. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	WarningCount *uint32 `json:"warning_count,omitempty"`
}
