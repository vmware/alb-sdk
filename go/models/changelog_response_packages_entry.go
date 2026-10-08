// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ChangelogResponsePackagesEntry changelog response packages entry
// swagger:model ChangelogResponse.PackagesEntry
type ChangelogResponsePackagesEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *ChangelogPackageLog `json:"value,omitempty"`
}
