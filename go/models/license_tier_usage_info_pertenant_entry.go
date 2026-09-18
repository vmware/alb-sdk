// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseTierUsageInfoPertenantEntry license tier usage info pertenant entry
// swagger:model LicenseTierUsageInfo.PertenantEntry
type LicenseTierUsageInfoPertenantEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *LicenseTenantUsageInfo `json:"value,omitempty"`
}
