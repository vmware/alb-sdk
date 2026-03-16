// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VnicInfo vnic info
// swagger:model VnicInfo
type VnicInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Active *bool `json:"active,omitempty"`

	// Display NIC Hardware and Extended Statistics. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HwEthStats *HwEthStats `json:"hw_eth_stats,omitempty"`

	// Features and capabilities enabled. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfCapabilitiesEnabled *uint64 `json:"if_capabilities_enabled,omitempty"`

	// Features and capabilities supported. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfCapabilitiesSupported *uint64 `json:"if_capabilities_supported,omitempty"`

	// Interface flags. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfFlags *uint64 `json:"if_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InterfaceDisabled *bool `json:"interface_disabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	InterfaceStats *InterfaceStats `json:"interface_stats"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IntferfaceUp *bool `json:"intferface_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6tableFilter *string `json:"ip6table_filter,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPInfo []*IPInterface `json:"ip_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IptableFilter *string `json:"iptable_filter,omitempty"`

	// owner core for KNI interface. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniOwner *int32 `json:"kni_owner,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxIntfName *string `json:"linux_intf_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MacAddress *string `json:"mac_address"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbrIntfs []*MbrIntf `json:"mbr_intfs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsDeleteDrops *uint64 `json:"num_vs_delete_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PcapFilter *string `json:"pcap_filter,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VlanID *int32 `json:"vlan_id"`

	// If True, Generic Receive Offload (GRO) is enabled on vnic. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicGroOn *bool `json:"vnic_gro_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicID *int32 `json:"vnic_id"`

	// If True, Large Receive Offload (LRO) is enabled on vnic. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicLroOn *bool `json:"vnic_lro_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicMtu *int32 `json:"vnic_mtu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicName *string `json:"vnic_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicOwner *int32 `json:"vnic_owner,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicParent *int32 `json:"vnic_parent"`

	// If True, TCP Segmentation Offload (TSO) is enabled on vnic. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicTsoOn *bool `json:"vnic_tso_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicWeight *int32 `json:"vnic_weight"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`

	//  It is a reference to an object of type VrfContext. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfRef *string `json:"vrf_ref,omitempty"`
}
