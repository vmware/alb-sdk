// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIVMVnicInfo v i Vm vnic info
// swagger:model VIVmVnicInfo
type VIVMVnicInfo struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MacAddr *string `json:"mac_addr"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterPortgroup *string `json:"vcenter_portgroup,omitempty"`

	//  Enum options - VNIC_VSWITCH, VNIC_DVS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterVnicNw *string `json:"vcenter_vnic_nw,omitempty"`
}
