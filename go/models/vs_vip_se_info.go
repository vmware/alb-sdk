// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsVipSeInfo vs vip se info
// swagger:model VsVipSeInfo
type VsVipSeInfo struct {

	// vip_id of Vip in VS. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipID *string `json:"vip_id,omitempty"`

	// List of SEs this Vip is placed on. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipSeInfoList []*VipSeInfo `json:"vip_se_info_list,omitempty"`
}
