// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InterfaceRuntime interface runtime
// swagger:model InterfaceRuntime
type InterfaceRuntime struct {

	// If True, Generic Receive Offload (GRO) is enabled on SE. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroOn *bool `json:"gro_on,omitempty"`

	// If True, Large Receive Offload (LRO) is enabled on SE. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LroOn *bool `json:"lro_on,omitempty"`

	// SE pcap running Mode. Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING. Field introduced in 18.2.10, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PcapTxMode *string `json:"pcap_tx_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	// SE is running in DPDK Mode. Field introduced in 18.2.8, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDpdkMode *bool `json:"se_dpdk_mode,omitempty"`

	// Max size of each packet in the pcap interface. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePcapPktSz *uint32 `json:"se_pcap_pkt_sz,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`

	// If True, TCP Segmentation Offload (TSO) is enabled on SE. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TsoOn *bool `json:"tso_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vnics []*VnicInfo `json:"vnics,omitempty"`
}
