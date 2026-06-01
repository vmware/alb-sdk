// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileObjectState file object state
// swagger:model FileObjectState
type FileObjectState struct {

	// The last time the state changed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Reason for the state. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// State of the file object. Enum options - FILE_OBJECT_FSM_STARTED, FILE_OBJECT_FSM_IN_PROGRESS, FILE_OBJECT_FSM_COMPLETED, FILE_OBJECT_FSM_WARNING, FILE_OBJECT_FSM_FAILED. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
