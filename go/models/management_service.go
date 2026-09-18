// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementService management service
// swagger:model ManagementService
type ManagementService struct {

	// Management Service Address or Controller Addresses. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ManagementAddresses []string `json:"management_addresses,omitempty"`

	// Management Service name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ManagementService *string `json:"management_service"`

	// Management Service Ports. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ports []*ManagementServicePort `json:"ports,omitempty"`
}
