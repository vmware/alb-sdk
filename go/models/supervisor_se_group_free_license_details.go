// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SupervisorSeGroupFreeLicenseDetails supervisor se group free license details
// swagger:model SupervisorSeGroupFreeLicenseDetails
type SupervisorSeGroupFreeLicenseDetails struct {

	// Free service unit allowance for the supervisor SE group. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FreeSuLimit *float64 `json:"free_su_limit,omitempty"`

	// Name of the supervisor SE group. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupName *string `json:"se_group_name,omitempty"`

	// UUID of the supervisor SE group. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupUUID *string `json:"se_group_uuid,omitempty"`

	// Service units currently consumed and reserved by the supervisor SE group. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceUnitsUsed *float64 `json:"service_units_used,omitempty"`
}
