// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeConsumerWriteOpsInfo se consumer write ops info
// swagger:model SeConsumerWriteOpsInfo
type SeConsumerWriteOpsInfo struct {

	// Host UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostUUID *string `json:"host_uuid,omitempty"`

	// MAC addresses. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Macs []string `json:"macs,omitempty"`

	// Start time. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStartTime *string `json:"oper_start_time,omitempty"`

	// SE name. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	// SE UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Network UUIDs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualNetworkIds []string `json:"virtual_network_ids,omitempty"`

	// VRF UUIDs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfUuids []string `json:"vrf_uuids,omitempty"`
}
