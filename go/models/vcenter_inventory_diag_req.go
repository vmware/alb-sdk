// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterInventoryDiagReq vcenter inventory diag req
// swagger:model VcenterInventoryDiagReq
type VcenterInventoryDiagReq struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`
}
