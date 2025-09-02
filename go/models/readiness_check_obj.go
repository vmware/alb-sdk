// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReadinessCheckObj readiness check obj
// swagger:model ReadinessCheckObj
type ReadinessCheckObj struct {

	// List of readiness checks information. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Checks []*PreChecksInfo `json:"checks,omitempty"`

	// No. of checks completed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ChecksCompleted *int32 `json:"checks_completed,omitempty"`

	// Time taken to complete readiness checks in seconds. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// End time of the readiness check operations. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Checks progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Start time of the readiness check operations. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// The readiness check operations current fsm-state. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *PreCheckOpsState `json:"state,omitempty"`

	// Total no. of checks. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TotalChecks *int32 `json:"total_checks,omitempty"`
}
