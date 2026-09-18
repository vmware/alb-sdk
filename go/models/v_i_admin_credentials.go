// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIAdminCredentials v i admin credentials
// swagger:model VIAdminCredentials
type VIAdminCredentials struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	//  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcenterURL *string `json:"vcenter_url"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViMgrToken *string `json:"vi_mgr_token,omitempty"`
}
