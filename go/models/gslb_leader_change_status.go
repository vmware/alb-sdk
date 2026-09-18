// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbLeaderChangeStatus gslb leader change status
// swagger:model GslbLeaderChangeStatus
type GslbLeaderChangeStatus struct {

	// Timestamp of the status update. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Reason for the leader change. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Leader change process state. Enum options - GSLB_LC_STATE_INIT, GSLB_LC_STATE_MONITORING, GSLB_LC_STATE_IN_PROGRESS, GSLB_LC_STATE_COMPLETED, GSLB_LC_STATE_UNAVAILABLE, GSLB_LC_STATE_DISABLED. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
