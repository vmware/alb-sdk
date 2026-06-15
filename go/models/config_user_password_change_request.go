// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigUserPasswordChangeRequest config user password change request
// swagger:model ConfigUserPasswordChangeRequest
type ConfigUserPasswordChangeRequest struct {

	// Client IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIP *string `json:"client_ip,omitempty"`

	// Type of client used to initiate the operation, e.g. UI, CLI, API. Field introduced in 32.2.1,32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientType *string `json:"client_type,omitempty"`

	// Error message if the operation failed. Field introduced in 32.2.1,32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorMessage *string `json:"error_message,omitempty"`

	// API request path that triggered the operation. Field introduced in 32.2.1,32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RequestPath *string `json:"request_path,omitempty"`

	// Operation status. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Username. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	User *string `json:"user,omitempty"`

	// Email address of user for password reset request flow. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserEmail *string `json:"user_email,omitempty"`
}
