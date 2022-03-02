// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OrgServiceUnits org service units
// swagger:model OrgServiceUnits
type OrgServiceUnits struct {

	// Available service units on pulse portal. Field introduced in 21.1.4.
	AvailableServiceUnits *float64 `json:"available_service_units,omitempty"`

	// Organization id. Field introduced in 21.1.4.
	OrgID *string `json:"org_id,omitempty"`

	// Used service units on pulse portal. Field introduced in 21.1.4.
	UsedServiceUnits *float64 `json:"used_service_units,omitempty"`
}
