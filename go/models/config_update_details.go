// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigUpdateDetails config update details
// swagger:model ConfigUpdateDetails
type ConfigUpdateDetails struct {

	// Error message if request failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorMessage *string `json:"error_message,omitempty"`

	// New updated data of the resource. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewResourceData *string `json:"new_resource_data,omitempty"`

	// Old & overwritten data of the resource. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldResourceData *string `json:"old_resource_data,omitempty"`

	// API path. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	// Request data if request failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestData *string `json:"request_data,omitempty"`

	// Name of the created resource. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceName *string `json:"resource_name,omitempty"`

	// Config type of the updated resource. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceType *string `json:"resource_type,omitempty"`

	// Status. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Request user. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	User *string `json:"user,omitempty"`
}
