// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsumerServerReach consumer server reach
// swagger:model ConsumerServerReach
type ConsumerServerReach struct {

	// Indicates whether this Server IP is unreachable from all Service Engine in the Service Engine Group. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllSeUnreachable *bool `json:"all_se_unreachable,omitempty"`

	// V4 IP of the Server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// V6 IP of the Server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6 *IPAddr `json:"ip6,omitempty"`

	// Name of the Pool to which this Server belongs. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// UUID of the Service Engine that is not reachable for this Server IP. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// True indicates that the Service Engine is not reachable for this Server IP due to Virtual Network ID related reasons. False indicates that it is unrechable due to IP related reasons. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeVniUnreachable *bool `json:"se_vni_unreachable,omitempty"`
}
