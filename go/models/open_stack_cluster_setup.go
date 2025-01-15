// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OpenStackClusterSetup open stack cluster setup
// swagger:model OpenStackClusterSetup
type OpenStackClusterSetup struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminTenant *string `json:"admin_tenant,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthURL *string `json:"auth_url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	KeystoneHost *string `json:"keystone_host"`

	//  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`
}
