// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsResProfile vs res profile
// swagger:model VsResProfile
type VsResProfile struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxCPUPerSe *uint32 `json:"max_cpu_per_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxMemPerSe *uint32 `json:"max_mem_per_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinCPUPerSe *uint32 `json:"min_cpu_per_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinMemPerSe *uint32 `json:"min_mem_per_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Res *VirtualServiceResource `json:"res"`
}
