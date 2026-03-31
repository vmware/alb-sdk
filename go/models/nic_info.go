// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NicInfo nic info
// swagger:model NicInfo
type NicInfo struct {

	// Is the NIC active. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Active *bool `json:"active,omitempty"`

	// MTU configured. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigMtu *uint32 `json:"config_mtu,omitempty"`

	// NIC driver information. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DriverString *string `json:"driver_string,omitempty"`

	// Link state of the NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinkState *string `json:"link_state,omitempty"`

	// MAC Address. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MacAddress *string `json:"mac_address,omitempty"`

	// Is GRO enabled on the NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicGroOn *bool `json:"nic_gro_on,omitempty"`

	// Is LRO enabled on the NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicLroOn *bool `json:"nic_lro_on,omitempty"`

	// NIC Name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicName *string `json:"nic_name,omitempty"`

	// Is LRO enabled on the NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicTsoOn *bool `json:"nic_tso_on,omitempty"`

	// Number of Queues per NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueuesPerNic *uint32 `json:"queues_per_nic,omitempty"`

	// Running MTU on the NIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RunningMtu *uint32 `json:"running_mtu,omitempty"`

	// Receive queue size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxQueueSize *uint32 `json:"rx_queue_size,omitempty"`

	// Transmit queue size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxQueueSize *uint32 `json:"tx_queue_size,omitempty"`

	// VRF Information. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`
}
