// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetentionSummary retention summary
// swagger:model RetentionSummary
type RetentionSummary struct {

	// Action duration. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint64 `json:"duration,omitempty"`

	// Action end time. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Action messages. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Messages []string `json:"messages,omitempty"`

	// Action start time. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// Action status. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED.... Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`
}
