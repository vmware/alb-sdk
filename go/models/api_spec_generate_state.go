// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecGenerateState Api spec generate state
// swagger:model ApiSpecGenerateState
type APISpecGenerateState struct {

	// Timestamp of the last state transition. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Human-readable reason for the current state. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Current FSM state of the spec generation. Enum options - API_SPEC_GENERATE_FSM_IN_PROGRESS, API_SPEC_GENERATE_FSM_COMPLETED, API_SPEC_GENERATE_FSM_WARNING, API_SPEC_GENERATE_FSM_ERROR. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
