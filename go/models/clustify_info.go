// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClustifyInfo clustify info
// swagger:model ClustifyInfo
type ClustifyInfo struct {

	// node cpu count. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPUCount *int32 `json:"cpu_count,omitempty"`

	// node disk size. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Disk *float32 `json:"disk,omitempty"`

	// node fips mode. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsMode *string `json:"fips_mode,omitempty"`

	// node ip mode. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPMode *string `json:"ip_mode,omitempty"`

	// node major version. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MajorVersion *string `json:"major_version,omitempty"`

	// node memory size. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Memory *float32 `json:"memory,omitempty"`

	// node patch version. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PatchVersion *string `json:"patch_version,omitempty"`
}
