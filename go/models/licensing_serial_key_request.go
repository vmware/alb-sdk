// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicensingSerialKeyRequest licensing serial key request
// swagger:model LicensingSerialKeyRequest
type LicensingSerialKeyRequest struct {

	// Legacy signed license text (deprecated in favor of serial key / on-prem or cloud licensing services). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseText *string `json:"license_text,omitempty"`

	// Serial key text to activate, takes precedence over license_text if both are set. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SerialKey *string `json:"serial_key,omitempty"`
}
