// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReportGenState report gen state
// swagger:model ReportGenState
type ReportGenState struct {

	// The last time the state changed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Reason for the state. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// State of the report generation. Enum options - REPORT_FSM_STARTED, REPORT_FSM_IN_PROGRESS, REPORT_FSM_COMPLETED, REPORT_FSM_FAILED. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
