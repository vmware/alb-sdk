// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsSeIfStats metrics se if stats
// swagger:model MetricsSeIfStats
type MetricsSeIfStats struct {

	// ARP packets dropped by rate limiter. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpRxRlDrops *uint64 `json:"arp_rx_rl_drops,omitempty"`

	// Number of times flowtable entries limit is reached. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionDroppedTableLimit *uint64 `json:"connection_dropped_table_limit,omitempty"`

	// connection table usage. If it is full/high then it is experiencing DoS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionTableUsage *uint64 `json:"connection_table_usage,omitempty"`

	// Number of conn throttled due to rate limiter. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowConnThrottled *uint64 `json:"flow_conn_throttled,omitempty"`

	// Rate limiter throttling. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowConnThrottledMem *uint64 `json:"flow_conn_throttled_mem,omitempty"`

	// Number of packets where dst mac address does not correspond to interface. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowMacErrors *uint64 `json:"flow_mac_errors,omitempty"`

	// Number of received packets that are not ICMP req/resp, UDP, TCP and inter-SE messages. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowParseUnknown *uint64 `json:"flow_parse_unknown,omitempty"`

	// Number of packets throttled by rate limiter. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowPktsThrottled *uint64 `json:"flow_pkts_throttled,omitempty"`

	// Number of entries in the flow table. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableNumEntries *uint64 `json:"flow_table_num_entries,omitempty"`

	// Number of FT entries of flows punted to a secondary SE. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableRemoteEntries *uint64 `json:"flow_table_remote_entries,omitempty"`

	// Flowprobe packets dropped by rate limiter. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowprobeTxRlDrops *uint64 `json:"flowprobe_tx_rl_drops,omitempty"`

	// Number of input packets received and coalesced in one burst from the rx queue. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroMbufsCoalesced *uint64 `json:"gro_mbufs_coalesced,omitempty"`

	// Number of icmp packets dropped exceeding rate limit. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcmpRxRlDrops *uint64 `json:"icmp_rx_rl_drops,omitempty"`

	// Total number of erroneous received packets. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ierrors *uint64 `json:"ierrors,omitempty"`

	// Total number of packets dropped at every vnic owing to a bad ip header checksum. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPChecksumDrops *uint64 `json:"ip_checksum_drops,omitempty"`

	// Number of times KNI mbuf pool was empty. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniMbufAllocFailures *uint64 `json:"kni_mbuf_alloc_failures,omitempty"`

	// Number of packets dropped by KNI in the ingress path because allocation of an skb failed due to lack of available memory. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniRxDrops *uint64 `json:"kni_rx_drops,omitempty"`

	// Number of packets dropped by the KNI interface in the egress path. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniTxDrops *uint64 `json:"kni_tx_drops,omitempty"`

	// Number of packets dropped by the KNI interface due to transmit timeout on egress. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KniTxErrors *uint64 `json:"kni_tx_errors,omitempty"`

	// Total number of packets dropped at every vnic owing to a bad tcp/udp checksum. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4ChecksumDrops *uint64 `json:"l4_checksum_drops,omitempty"`

	// Number of flow probe messages received by dispatcher cores. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqReceived *uint64 `json:"local_flow_probes_req_received,omitempty"`

	// Number of flow probe requests sent for open connection by the primary core. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesReqSent *uint64 `json:"local_flow_probes_req_sent,omitempty"`

	// Number of ND packets dropped exceeding rate limit. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NdRxRlDrops *uint64 `json:"nd_rx_rl_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Total number of successfully transmitted packets. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Oerrors *uint64 `json:"oerrors,omitempty"`

	// Maximum bandwidth seen on service engine interface. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeakBandwidth *uint64 `json:"peak_bandwidth,omitempty"`

	// Number of TCP connection resets sent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RstSent *uint64 `json:"rst_sent,omitempty"`

	// Received bytes from service engine interface. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytes *uint64 `json:"rx_bytes,omitempty"`

	// Received bytes(absolute) from service engine interface. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesAbsolute *uint64 `json:"rx_bytes_absolute,omitempty"`

	// Received bytes dropped. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesDroppedNonVs *uint64 `json:"rx_bytes_dropped_non_vs,omitempty"`

	// Average received packets per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPkts *uint64 `json:"rx_pkts,omitempty"`

	// Received packets dropped. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPktsDroppedNonVs *uint64 `json:"rx_pkts_dropped_non_vs,omitempty"`

	// Number of SYN packets dropped. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynDroppedDeletePending *uint64 `json:"syn_dropped_delete_pending,omitempty"`

	// Percentage of syn seen entries currently used. If it is high then it is experiencing DoS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynSeenEntriesUsage *uint64 `json:"syn_seen_entries_usage,omitempty"`

	// TCP packets dropped by rate limiter. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPRstTxRlDrops *uint64 `json:"tcp_rst_tx_rl_drops,omitempty"`

	// Transmitted bytes to service engine interface. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytes *uint64 `json:"tx_bytes,omitempty"`

	// Transmitted bytes(absolute) to service engine interface. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxBytesAbsolute *uint64 `json:"tx_bytes_absolute,omitempty"`

	// Number of fragments packet is fragmented into by the dispatcher when punting from primary to secondary. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxFragsP2s *uint64 `json:"tx_frags_p2s,omitempty"`

	// Mbufs were depleted in kni mbuf pool or Enqueue mbufs to kni rx queue failed during ingress. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxKniErrs *uint64 `json:"tx_kni_errs,omitempty"`

	// Average transmit packets per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxPkts *uint64 `json:"tx_pkts,omitempty"`
}
