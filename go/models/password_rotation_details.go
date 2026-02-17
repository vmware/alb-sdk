// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PasswordRotationDetails password rotation details
// swagger:model PasswordRotationDetails
type PasswordRotationDetails struct {

	// Type of credential (NSX-T or vCenter). Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CredentialType *string `json:"credential_type,omitempty"`

	// Error message if rotation failed. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// Name of the CloudConnectorUser. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// UUID of the CloudConnectorUser. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
