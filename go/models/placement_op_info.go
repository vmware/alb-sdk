// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PlacementOpInfo placement op info
// swagger:model PlacementOpInfo
type PlacementOpInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreateInfo *CreateInfo `json:"create_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ModVnicInfo *ModVnicInfo `json:"mod_vnic_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SwitchoverInfo *SwitchoverInfo `json:"switchover_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipVnicInfo *UpdVipVnicInfo `json:"vip_vnic_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicIPInfo *VnicIPInfo `json:"vnic_ip_info,omitempty"`
}
