// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NtpWeakAuthAlgorithmEventDetails ntp weak auth algorithm event details
// swagger:model NtpWeakAuthAlgorithmEventDetails
type NtpWeakAuthAlgorithmEventDetails struct {

	// Comma-separated list of key numbers using weak NTP auth algorithms (MD5 or SHA1). Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`
}
