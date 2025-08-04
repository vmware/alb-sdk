// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportState tech support state
// swagger:model TechSupportState
type TechSupportState struct {

	// The last time the state changed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Descriptive reason for the techsupport state-change. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// The upgrade operations current fsm-state. Enum options - TECHSUPPORT_FSM_STARTED, TECHSUPPORT_FSM_IN_PROGRESS, TECHSUPPORT_FSM_COMPLETED, TECHSUPPORT_FSM_COMPLETED_WITH_WARNINGS, TECHSUPPORT_FSM_WARNING, TECHSUPPORT_FSM_ERROR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
