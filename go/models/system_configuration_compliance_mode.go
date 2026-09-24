// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SystemConfigurationComplianceMode system configuration compliance mode
// swagger:model SystemConfigurationComplianceMode
type SystemConfigurationComplianceMode struct {

	// Common criteria mode's desired state. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CommonCriteriaMode *bool `json:"common_criteria_mode,omitempty"`

	// Command status and additional details. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Details []string `json:"details,omitempty"`

	// Fips mode's desired state. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsMode *bool `json:"fips_mode,omitempty"`

	// Force Compliance mode recovery in errored state. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Force *bool `json:"force,omitempty"`

	// Tenant in which the command is invoked. It is a reference to an object of type Tenant. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`
}
