// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterCloudStatusReq vcenter cloud status req
// swagger:model VcenterCloudStatusReq
type VcenterCloudStatusReq struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`
}
