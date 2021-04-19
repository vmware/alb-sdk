// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudASGNotifDetails cloud a s g notif details
// swagger:model CloudASGNotifDetails
type CloudASGNotifDetails struct {

	// Autoscale Group name. Field introduced in 20.1.1.
	AsgName *string `json:"asg_name,omitempty"`

	// Cloud UUID. Field introduced in 20.1.1.
	CcID *string `json:"cc_id,omitempty"`

	// Failure reason if Autoscale Group creation or deletion fails. Field introduced in 20.1.1.
	ErrorString *string `json:"error_string,omitempty"`

	// Pool UUID. It is a reference to an object of type Pool. Field introduced in 20.1.1.
	PoolRef *string `json:"pool_ref,omitempty"`
}
