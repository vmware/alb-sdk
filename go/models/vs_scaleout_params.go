// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsScaleoutParams vs scaleout params
// swagger:model VsScaleoutParams
type VsScaleoutParams struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminUp *bool `json:"admin_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewVcpus *uint32 `json:"new_vcpus,omitempty"`

	// actuator which initiated this scaleout. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Source *string `json:"source,omitempty"`

	//  It is a reference to an object of type VIMgrHostRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToHostRef *string `json:"to_host_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToNewSe *bool `json:"to_new_se,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToSeRef *string `json:"to_se_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VipID *string `json:"vip_id"`
}
