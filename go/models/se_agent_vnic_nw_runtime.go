// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentVnicNwRuntime se agent vnic nw runtime
// swagger:model SeAgentVnicNwRuntime
type SeAgentVnicNwRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddrPrefix `json:"ip"`

	//  Enum options - DHCP, STATIC, VIP, DOCKER_HOST, MODE_MANUAL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mode *string `json:"mode"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RefCnt *int32 `json:"ref_cnt,omitempty"`
}
