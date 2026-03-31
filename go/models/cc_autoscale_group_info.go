// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CcAutoscaleGroupInfo cc autoscale group info
// swagger:model cc_autoscale_group_info
type CcAutoscaleGroupInfo struct {

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultSize *uint32 `json:"default_size,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroupName *string `json:"group_name,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroupUUID *string `json:"group_uuid,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSize *uint32 `json:"max_size,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinSize *uint32 `json:"min_size,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*Server `json:"servers,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Zones []string `json:"zones,omitempty"`
}
