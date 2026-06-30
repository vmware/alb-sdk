// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// KeylessLicense keyless license
// swagger:model KeylessLicense
type KeylessLicense struct {

	// Keyless license subscription details. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseToken *string `json:"license_token,omitempty"`
}
