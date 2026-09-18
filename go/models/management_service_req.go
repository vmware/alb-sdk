// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServiceReq management service req
// swagger:model ManagementServiceReq
type ManagementServiceReq struct {

	// Management Service Cloud UUID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	// Management Service ID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementServiceID *string `json:"management_service_id"`

	// Management Service Supervisor ID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SupervisorID *string `json:"supervisor_id"`

	// VCenter host to be used to get management service. Only applicable to NSX-T Cloud. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcenterHost *string `json:"vcenter_host"`
}
