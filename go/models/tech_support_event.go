// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportEvent tech support event
// swagger:model TechSupportEvent
type TechSupportEvent struct {

	// Techsupport status object. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TechSupportStatus *TechSupportStatus `json:"tech_support_status,omitempty"`

	// tenant under techsupport invoked. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Tenant *string `json:"tenant,omitempty"`
}
