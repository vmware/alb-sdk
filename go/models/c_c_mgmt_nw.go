// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCMgmtNw c c mgmt nw
// swagger:model CC_MgmtNw
type CCMgmtNw struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Az *string `json:"az,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNwID *string `json:"mgmt_nw_id,omitempty"`
}
