// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicensingActionResult licensing action result
// swagger:model LicensingActionResult
type LicensingActionResult struct {

	// Human-readable status/failure message. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Result *string `json:"result,omitempty"`
}
