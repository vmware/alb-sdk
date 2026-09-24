// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseUsageInfoPertierEntry license usage info pertier entry
// swagger:model LicenseUsageInfo.PertierEntry
type LicenseUsageInfoPertierEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *LicenseTierUsageInfo `json:"value,omitempty"`
}
