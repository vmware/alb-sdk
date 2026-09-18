// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServiceAccessGrantReq management service access grant req
// swagger:model ManagementServiceAccessGrantReq
type ManagementServiceAccessGrantReq struct {

	// VCenter Cloud UUID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	// Management Service Access Grant. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementServiceAccessGrantID *string `json:"management_service_access_grant_id"`

	// Namespace the Management Service Access grant was created under. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Namespace *string `json:"namespace"`

	// VCenter host to be used to get management service access grant. Only applicable to NSX-T Cloud. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcenterHost *string `json:"vcenter_host"`
}
