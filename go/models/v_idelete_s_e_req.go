// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIdeleteSEReq v idelete s e req
// swagger:model VIDeleteSEReq
type VIdeleteSEReq struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SegroupUUID *string `json:"segroup_uuid,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	SevmUUID *string `json:"sevm_uuid"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterAdmin *VIAdminCredentials `json:"vcenter_admin,omitempty"`
}
