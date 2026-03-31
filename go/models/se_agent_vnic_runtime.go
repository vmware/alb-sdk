// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentVnicRuntime se agent vnic runtime
// swagger:model SeAgentVnicRuntime
type SeAgentVnicRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AviInternalNetwork *bool `json:"avi_internal_network,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CanSeDpTakeover *bool `json:"can_se_dp_takeover,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Connected *bool `json:"connected"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumedByDataplane *bool `json:"consumed_by_dataplane,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DhcpEnabled *bool `json:"dhcp_enabled"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Enabled *bool `json:"enabled"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnabledFlag *bool `json:"enabled_flag,omitempty"`

	// VNIC fault information. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fault *ObjectFault `json:"fault,omitempty"`

	// NIC link speed in Mb/s. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfLinkSpeed *uint32 `json:"if_link_speed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IfName *string `json:"if_name"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6AutocfgEnabled *bool `json:"ip6_autocfg_enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsComplete *bool `json:"is_complete,omitempty"`

	//  Field introduced in 20.1.5,21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsHsm *bool `json:"is_hsm,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsMgmt *bool `json:"is_mgmt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LinuxName *string `json:"linux_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MacAddress *string `json:"mac_address"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mtu *int32 `json:"mtu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkUUID *string `json:"network_uuid,omitempty"`

	// User defined value for RX descriptor ring size, expressed as power of 2. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRxDescriptors *uint32 `json:"num_rx_descriptors,omitempty"`

	// User defined value for TX descriptor ring size, expressed as power of 2. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTxDescriptors *uint32 `json:"num_tx_descriptors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nw []*SeAgentVnicNwRuntime `json:"nw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PciID *string `json:"pci_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PushedToController *bool `json:"pushed_to_controller,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PushedToDataplane *bool `json:"pushed_to_dataplane,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RunningFlag *bool `json:"running_flag,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`

	//  It is a reference to an object of type VrfContext. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfRef *string `json:"vrf_ref,omitempty"`
}
