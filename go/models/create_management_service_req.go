// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CreateManagementServiceReq create management service req
// swagger:model CreateManagementServiceReq
type CreateManagementServiceReq struct {

	// VCenter Cloud UUID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	// Management Service payload. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementService *ManagementService `json:"management_service"`

	// Supervisor ID under which the Management Service will be created. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SupervisorID *string `json:"supervisor_id"`

	// VCenter host to be used to create management service access grant. Only applicable to NSX-T Cloud. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcenterHost *string `json:"vcenter_host"`
}
