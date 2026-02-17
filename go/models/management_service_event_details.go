// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServiceEventDetails management service event details
// swagger:model ManagementServiceEventDetails
type ManagementServiceEventDetails struct {

	// Cloud UUID associated with the NSX-T cloud configuration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	// Error message describing the failure reason (empty on success). Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// Name of the management service exposing the Avi Controller endpoint. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ManagementServiceName *string `json:"management_service_name,omitempty"`

	// Supervisor cluster identifier where the management service is configured. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SupervisorID *string `json:"supervisor_id,omitempty"`

	// vCenter URL used for the API operation. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VcenterURL *string `json:"vcenter_url,omitempty"`
}
