// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MbrIntf mbr intf
// swagger:model MbrIntf
type MbrIntf struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Active *bool `json:"active"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IfName *string `json:"if_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LinuxName *string `json:"linux_name"`
}
