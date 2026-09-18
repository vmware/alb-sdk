// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServiceAccessGrant management service access grant
// swagger:model ManagementServiceAccessGrant
type ManagementServiceAccessGrant struct {

	// Management Service Access Grant name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AccessGrant *string `json:"access_grant"`

	// State of the created Access Grant. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Parent Management Service name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementService *string `json:"management_service"`

	// The target for which Access Grant is to be provided. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WorkloadSelector *WorkloadSelector `json:"workload_selector"`
}
