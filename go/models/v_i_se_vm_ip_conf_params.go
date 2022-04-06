// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VISeVMIPConfParams v i se Vm Ip conf params
// swagger:model VISeVmIpConfParams
type VISeVMIPConfParams struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DefaultGw *string `json:"default_gw,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MgmtIPAddr *string `json:"mgmt_ip_addr,omitempty"`

	//  Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MgmtIPType *string `json:"mgmt_ip_type"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MgmtNetMask *string `json:"mgmt_net_mask,omitempty"`
}
