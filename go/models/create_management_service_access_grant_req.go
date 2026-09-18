// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CreateManagementServiceAccessGrantReq create management service access grant req
// swagger:model CreateManagementServiceAccessGrantReq
type CreateManagementServiceAccessGrantReq struct {

	// Vcenter Cloud UUID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	// Management Service Access Grant payload. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementServiceAccessGrant *ManagementServiceAccessGrant `json:"management_service_access_grant"`

	// Namespace to create Management Service Access grant under. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Namespace *string `json:"namespace"`

	// VCenter host to be used for creating management service access grant. Only applicable to NSX-T Cloud. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcenterHost *string `json:"vcenter_host"`
}
