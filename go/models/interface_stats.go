// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InterfaceStats interface stats
// swagger:model InterfaceStats
type InterfaceStats struct {

	// Number of flow migrates for which clearing autogw failed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowMigrateClearAutogwFailed *uint64 `json:"flow_migrate_clear_autogw_failed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	GroMbufsCoalesced *uint64 `json:"gro_mbufs_coalesced"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ibytes *uint64 `json:"ibytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ierrors *uint64 `json:"ierrors"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfqStats []*IfQStats `json:"ifq_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPChecksumDrops *uint64 `json:"ip_checksum_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ipackets *uint64 `json:"ipackets"`

	// Number of enqueue failures to KNI core transmit queue. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniEnqueueErrors *uint64 `json:"kni_enqueue_errors,omitempty"`

	// Number of times KNI mbuf pool was empty. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniMbufAllocFailures *uint64 `json:"kni_mbuf_alloc_failures,omitempty"`

	// Number of packets dropped by the KNI interface in the ingress path because allocation of an skb failed due to lack of available memory. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniRxDrops *uint64 `json:"kni_rx_drops,omitempty"`

	// Number of packets dropped by the KNI interface in the egress path if  a. skb len is greater than rte mbuf len b. Enqueue to tx queue failed c. Dequeue from alloc queue fails d. kni tx queue is full e. kni alloc queue is not replenished. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniTxDrops *uint64 `json:"kni_tx_drops,omitempty"`

	// Number of packets dropped by the KNI interface due to transmit timeout on egress. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniTxErrors *uint64 `json:"kni_tx_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	L4ChecksumDrops *uint64 `json:"l4_checksum_drops"`

	// Number of times flow-migrate request was ignored because the flow was in time-wait state. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowMigrateIgnoredInTw *uint32 `json:"local_flow_migrate_ignored_in_tw,omitempty"`

	// Number of times duplicate flow-migrate request was received. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowMigrateIgnoredSameVnic *uint32 `json:"local_flow_migrate_ignored_same_vnic,omitempty"`

	// Number of times flow-migrate request was ignored because flow context was not found. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowMigrateReqIgnored *uint32 `json:"local_flow_migrate_req_ignored,omitempty"`

	// Number of times a flow-terminating core received flow-migrate request. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowMigrateReqReceived *uint32 `json:"local_flow_migrate_req_received,omitempty"`

	// Number of times flow-migrate request was sent to move flow-entry to another flow table. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowMigrateReqSent *uint32 `json:"local_flow_migrate_req_sent,omitempty"`

	// Number of times a core did not find flow-entry for flow being probed. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqIgnored *uint32 `json:"local_flow_probes_req_ignored,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqReceived *uint32 `json:"local_flow_probes_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqSent *uint32 `json:"local_flow_probes_req_sent,omitempty"`

	// Number of times a non-dispatcher core was skipped in sending local flow probe. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqSkipped *uint32 `json:"local_flow_probes_req_skipped,omitempty"`

	// Number of RX packets dropped by NIC hardware due to lack of available mbufs. Field introduced in 18.2.10, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicImissed *uint64 `json:"nic_imissed,omitempty"`

	// Oerrors reported from the NIC hardwareonly in DPDK mode. Field introduced in 18.2.8, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NicOerrors *uint64 `json:"nic_oerrors,omitempty"`

	// Number of RX descriptors configured on the VNIC. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRxDescriptors *uint32 `json:"num_rx_descriptors,omitempty"`

	// Number of TX descriptors configured on the VNIC. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTxDescriptors *uint32 `json:"num_tx_descriptors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Obytes *uint64 `json:"obytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Oerrors *uint64 `json:"oerrors"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Opackets *uint64 `json:"opackets"`

	// Number of bytes received which were forwarded. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxForwardBytes *uint64 `json:"rx_forward_bytes,omitempty"`

	// Number of packets received which were forwarded. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxForwardPkts *uint64 `json:"rx_forward_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxKni *uint64 `json:"rx_kni"`

	// Number of LRO'ed packets received by the VNIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxLroPackets *uint32 `json:"rx_lro_packets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxMaxSingleBurst *uint64 `json:"rx_max_single_burst"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxMimEtypeP2s *uint64 `json:"rx_mim_etype_p2s"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxMimEtypeS2p *uint64 `json:"rx_mim_etype_s2p"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxNombuf *uint64 `json:"rx_nombuf"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxPktIterations *uint64 `json:"rx_pkt_iterations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxQueueFull *uint64 `json:"rx_queue_full"`

	// Number of packets the pcap interface can hold per vnic queue. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePcapPktCount *uint32 `json:"se_pcap_pkt_count,omitempty"`

	// Number of bytes forwarded. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxForwardBytes *uint64 `json:"tx_forward_bytes,omitempty"`

	// Number of packets forwarded. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxForwardPkts *uint64 `json:"tx_forward_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxFragsP2s *uint64 `json:"tx_frags_p2s,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxKni *uint64 `json:"tx_kni"`

	// a. Mbufs were depleted in kni mbuf pool during ingress.b. Enqueue mbufs to kni rx queue failed during ingress. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxKniErrs *uint64 `json:"tx_kni_errs"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxMimEtypeP2s *uint64 `json:"tx_mim_etype_p2s"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxMimEtypeS2p *uint64 `json:"tx_mim_etype_s2p"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxMimFragsEtypeP2s *uint64 `json:"tx_mim_frags_etype_p2s"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxMimFragsEtypeS2p *uint64 `json:"tx_mim_frags_etype_s2p"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TxQueueFullRetries *uint64 `json:"tx_queue_full_retries"`

	// Number of packets dropped as interface is admin disabled. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicDisabledRxDrops *uint64 `json:"vnic_disabled_rx_drops,omitempty"`

	// Number of packets dropped as VLAN is invalid. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicInvalidVlanDrops *uint64 `json:"vnic_invalid_vlan_drops,omitempty"`
}
