// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReadinessCheckObj readiness check obj
// swagger:model ReadinessCheckObj
type ReadinessCheckObj struct {

	// List of tech-support check exceptions. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Checks []*PreChecksInfo `json:"checks,omitempty"`

	// No. of checks completed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ChecksCompleted *int32 `json:"checks_completed,omitempty"`

	// Time taken to complete techsupport readiness checks in seconds. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Time at which execution of techsupport readiness checks was completed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Checks progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Time at which execution of techsupport readiness checks was started. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// The Techsupport readiness check operations current fsm-state. Enum options - PRECHECK_FSM_STARTED, PRECHECK_FSM_IN_PROGRESS, PRECHECK_FSM_SUCCESS, PRECHECK_FSM_WARNING, PRECHECK_FSM_ERROR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Total no. of checks. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TotalChecks *int32 `json:"total_checks,omitempty"`
}
