// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudLicenseSubscribeResult cloud license subscribe result
// swagger:model CloudLicenseSubscribeResult
type CloudLicenseSubscribeResult struct {

	// Human-readable message from the license manager's SubscribeCloudLicense/UnsubscribeCloudLicense RPC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`

	// Literal 'success' on success, error responses instead return {'error'  ...} at a non-2xx HTTP status. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Status *string `json:"status"`
}
