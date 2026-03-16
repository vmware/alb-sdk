// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeImageFipsInfo se image fips info
// swagger:model SeImageFipsInfo
type SeImageFipsInfo struct {

	// FIPS Compliance Standard in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsComplianceStandard *string `json:"fips_compliance_standard,omitempty"`

	// FIPS Mode in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsModeEnabled *bool `json:"fips_mode_enabled,omitempty"`

	// OpenSSL FIPS Provider Version in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsProviderVersion *string `json:"fips_provider_version,omitempty"`

	// OpenSSL Base Version in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpensslBaseVersion *string `json:"openssl_base_version,omitempty"`
}
