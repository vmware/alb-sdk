// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PreCheckOpsState pre check ops state
// swagger:model PreCheckOpsState
type PreCheckOpsState struct {

	// The last time the state changed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Reason for the pre-check state. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// State of the report generation pre-checks. Enum options - PRECHECK_FSM_STARTED, PRECHECK_FSM_IN_PROGRESS, PRECHECK_FSM_SUCCESS, PRECHECK_FSM_WARNING, PRECHECK_FSM_ERROR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
