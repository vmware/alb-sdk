// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceResource virtual service resource
// swagger:model VirtualServiceResource
type VirtualServiceResource struct {

	// This field is not being used. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsExclusive *bool `json:"is_exclusive,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Memory *int32 `json:"memory,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumSe *int32 `json:"num_se,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumStandbySe *int32 `json:"num_standby_se,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumVcpus *int32 `json:"num_vcpus,omitempty"`

	// Indicates if the primary SE is being scaled in. This state is now derived from the Virtual Service runtime. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ScaleinPrimary *bool `json:"scalein_primary,omitempty"`

	// Indicates which SE is being scaled in. This information is now derived from the Virtual Service runtime. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ScaleinSeUUID *string `json:"scalein_se_uuid,omitempty"`
}
