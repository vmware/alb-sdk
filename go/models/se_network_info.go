// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeNetworkInfo se network info
// swagger:model SeNetworkInfo
type SeNetworkInfo struct {

	// Active OFED Version in the system. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveOfedVersion *string `json:"active_ofed_version,omitempty"`

	// Driver Types of NICs in the System. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DatapathNicDrivers *string `json:"datapath_nic_drivers,omitempty"`

	// Mode of Packet Polling i.e DPDK/PCAP. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpdkMode *bool `json:"dpdk_mode,omitempty"`

	// DPDK Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpdkVersion *string `json:"dpdk_version,omitempty"`

	// Inband/Outband of SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InbandMgmt *bool `json:"inband_mgmt,omitempty"`

	// Management Interface is a Port Channel or not. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsMgmtPortChannel *bool `json:"is_mgmt_port_channel,omitempty"`

	// Check the loaded mlnx ofed required modules. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LoadedMlxModules *string `json:"loaded_mlx_modules,omitempty"`

	// Management Interface Name in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIntfName *string `json:"mgmt_intf_name,omitempty"`

	// Management NIC Driver Family. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNicDriverFamily *string `json:"mgmt_nic_driver_family,omitempty"`

	// Num of active vnics to poll. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumActiveNics *int32 `json:"num_active_nics,omitempty"`

	// Num of Datapath Interfaces. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDatapathInterfaces *int32 `json:"num_datapath_interfaces,omitempty"`

	// Num of passive vnics. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPassiveNics *int32 `json:"num_passive_nics,omitempty"`

	// Num of port channels. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPortChannels *int32 `json:"num_port_channels,omitempty"`

	// Num of vlan interfaces. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVlanInterfaces *int32 `json:"num_vlan_interfaces,omitempty"`
}
