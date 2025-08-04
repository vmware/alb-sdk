// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportEvent tech support event
// swagger:model TechSupportEvent
type TechSupportEvent struct {

	// Techsupport object. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TechSupport *TechSupport `json:"tech_support,omitempty"`
}
