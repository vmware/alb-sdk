// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsumerVipReach consumer vip reach
// swagger:model ConsumerVipReach
type ConsumerVipReach struct {

	// Indicates whether this Vip IP is unreachable from all Service Engine in the Service Engine Group. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllSeUnreachable *bool `json:"all_se_unreachable,omitempty"`

	// V4 IP of the Vip. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// V6 IP of the Vip. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6 *IPAddr `json:"ip6,omitempty"`

	// UUID of the Service Engine that is not reachable for this Vip. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
