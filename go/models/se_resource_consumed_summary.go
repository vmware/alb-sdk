// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeResourceConsumedSummary se resource consumed summary
// swagger:model SeResourceConsumedSummary
type SeResourceConsumedSummary struct {

	// Admin down. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminDown *bool `json:"admin_down,omitempty"`

	// Attach IP success. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AttachIPSuccess *bool `json:"attach_ip_success,omitempty"`

	// Primary. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	// Standby. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsStandby *bool `json:"is_standby,omitempty"`

	// Scaling in. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MarkedForScalein *bool `json:"marked_for_scalein,omitempty"`

	// SE name. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResName *string `json:"res_name,omitempty"`

	// SE UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResUUID *string `json:"res_uuid,omitempty"`

	// VIP interface list. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipIntfList []*SeVipInterfaceList `json:"vip_intf_list,omitempty"`
}
