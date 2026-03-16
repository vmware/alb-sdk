// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeStats se stats
// swagger:model SeStats
type SeStats struct {

	// Number of data packets dropped waiting for a ARP reply. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpPktsDropped *uint64 `json:"arp_pkts_dropped,omitempty"`

	// Number of ARP packets received by this host. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpPktsReceived *uint64 `json:"arp_pkts_received,omitempty"`

	// Number of ARP replies received by this host. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpRxReplies *uint64 `json:"arp_rx_replies,omitempty"`

	// Number of ARP requests received by this host. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpRxRequests *uint64 `json:"arp_rx_requests,omitempty"`

	// Number of times pending ARP entries were removed due to timeout. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpTimeouts *uint64 `json:"arp_timeouts,omitempty"`

	// Number of ARP replies sent by this host. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpTxReplies *uint64 `json:"arp_tx_replies,omitempty"`

	// Number of ARP requests sent by this host. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpTxRequests *uint64 `json:"arp_tx_requests,omitempty"`

	// Number of times cacheable objects were dropped due to memory allocation failure. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheObjectAllocationFailure *uint64 `json:"cache_object_allocation_failure,omitempty"`

	// Connection is dropped because memory allocation failed is reached. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionDroppedMemoryLimit *uint64 `json:"connection_dropped_memory_limit,omitempty"`

	// Connection is dropped because our packet buffer are under stress. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionDroppedPacketBufferStressed *uint64 `json:"connection_dropped_packet_buffer_stressed,omitempty"`

	// Number of times persistence table limit is reached. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionDroppedPersistenceTableLimit *uint64 `json:"connection_dropped_persistence_table_limit,omitempty"`

	// Max connection memory in MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionMemTotal *uint64 `json:"connection_mem_total,omitempty"`

	// Percentage of connection memory used. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionMemUsage *uint64 `json:"connection_mem_usage,omitempty"`

	// Total number of rx_pkts dropped at SE due to  policies configured in VS eg. security policy, rate limits connection limit, bandwidth limit etc. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionPolicyDrops *uint64 `json:"connection_policy_drops,omitempty"`

	// Connection/flow table entries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionTableSize *uint64 `json:"connection_table_size,omitempty"`

	// Total number of connections including the  dropped connections and ones due to policy drops. This would be same as number of SYNS seen by SE on any VS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Connections *uint64 `json:"connections,omitempty"`

	// Total number of connections dropped excluding the  dropped connections and ones due to policy drops. This would be same as number of SYNS seen by SE on any VS. It include both connections that failed to establish. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsDropped *uint64 `json:"connections_dropped,omitempty"`

	// cpu usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPUUsage *uint64 `json:"cpu_usage,omitempty"`

	// Disk usage percent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Disk1Usage *uint64 `json:"disk1_usage,omitempty"`

	// DoS attack  Icmp Ping Flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosIcmpFlood *uint64 `json:"dos_icmp_flood,omitempty"`

	// DoS attack  Ip Fragmentation Full. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosIPFragFull *uint64 `json:"dos_ip_frag_full,omitempty"`

	// DoS attack  Ip Fragmentation Incomplete. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosIPFragIncomplete *uint64 `json:"dos_ip_frag_incomplete,omitempty"`

	// DoS attack  Ip Fragmentation Overrun. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosIPFragOverrun *uint64 `json:"dos_ip_frag_overrun,omitempty"`

	// DoS attack  Ip Fragmentation Too Small. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosIPFragToosmall *uint64 `json:"dos_ip_frag_toosmall,omitempty"`

	// DoS attack  Land. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosLand *uint64 `json:"dos_land,omitempty"`

	// DoS attack  Port Scan. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosPortScan *uint64 `json:"dos_port_scan,omitempty"`

	// Received dos attack bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosRxBytes *uint64 `json:"dos_rx_bytes,omitempty"`

	// DoS attack  Smurf. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosSmurf *uint64 `json:"dos_smurf,omitempty"`

	// DoS attack  Non Syn Flood. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosTCPNonSynFlood *uint64 `json:"dos_tcp_non_syn_flood,omitempty"`

	// DoS attack  Teardrop. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosTeardrop *uint64 `json:"dos_teardrop,omitempty"`

	// Transmitted dos attack bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosTxBytes *uint64 `json:"dos_tx_bytes,omitempty"`

	// DoS attack  Unknown Protocol. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosUnknownProtocol *uint64 `json:"dos_unknown_protocol,omitempty"`

	// Average value of egress queueing latency. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EgressLatency *uint64 `json:"egress_latency,omitempty"`

	// Average value of ingress queueing latency. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IngressLatency *uint64 `json:"ingress_latency,omitempty"`

	// Number of mbuf allocation failures. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsMbufAllocationFailures *uint64 `json:"mbstats_mbuf_allocation_failures,omitempty"`

	// Available memory buffers. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsMbufAvailable *uint64 `json:"mbstats_mbuf_available,omitempty"`

	// Total memory buffers. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsMbufTotal *uint64 `json:"mbstats_mbuf_total,omitempty"`

	// Number of failures in mem copy. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsMcopyFail *uint64 `json:"mbstats_mcopy_fail,omitempty"`

	// Number of failures in allocating packet buffers. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsPktbufAllocationFailures *uint64 `json:"mbstats_pktbuf_allocation_failures,omitempty"`

	// Available packet buffer. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsPktbufAvailable *uint64 `json:"mbstats_pktbuf_available,omitempty"`

	// Total packet buffer. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsPktbufTotal *uint64 `json:"mbstats_pktbuf_total,omitempty"`

	// Number of small cluster buffers allocation failures. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsSmallPktbufAllocationFailures *uint64 `json:"mbstats_small_pktbuf_allocation_failures,omitempty"`

	// Number of small cluster buffers available. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsSmallPktbufAvailable *uint64 `json:"mbstats_small_pktbuf_available,omitempty"`

	// Number of total small cluster buffers. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MbstatsSmallPktbufTotal *uint64 `json:"mbstats_small_pktbuf_total,omitempty"`

	// Application Cache memory usage. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	McacheMemoryUsage *uint64 `json:"mcache_memory_usage,omitempty"`

	// physical memory usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MemUsage *uint64 `json:"mem_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Total number of packets for which latency threshold was breached during egress. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEgressLatencyExceededPkts *uint64 `json:"num_egress_latency_exceeded_pkts,omitempty"`

	// Total number of packets for which latency threshold was breached during ingress. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIngressLatencyExceededPkts *uint64 `json:"num_ingress_latency_exceeded_pkts,omitempty"`

	// The number of requests admitted for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumOptionalProcessingAdmitted *uint64 `json:"num_optional_processing_admitted,omitempty"`

	// The number of requests refused for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumOptionalProcessingRefused *uint64 `json:"num_optional_processing_refused,omitempty"`

	// number of vs-s. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVs *uint64 `json:"num_vs,omitempty"`

	// CPU in microseconds used for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OptionalCPUUsage *uint64 `json:"optional_cpu_usage,omitempty"`

	// Packet buffer allocation failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferAllocationFailure *uint64 `json:"packet_buffer_allocation_failure,omitempty"`

	// packet buffer header usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferHeaderUsage *uint64 `json:"packet_buffer_header_usage,omitempty"`

	// large packet buffer usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferLargeUsage *uint64 `json:"packet_buffer_large_usage,omitempty"`

	// total packet buffer memory in MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferSize *uint64 `json:"packet_buffer_size,omitempty"`

	// small packet buffer usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferSmallUsage *uint64 `json:"packet_buffer_small_usage,omitempty"`

	// total packet buffer usage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketBufferUsage *uint64 `json:"packet_buffer_usage,omitempty"`

	// Packet is dropped because our packet buffers are under stress. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketDroppedPacketBufferStressed *uint64 `json:"packet_dropped_packet_buffer_stressed,omitempty"`

	// session persistent table entries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistentTableSize *uint64 `json:"persistent_table_size,omitempty"`

	// session persistent table entries percent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistentTableUsage *uint64 `json:"persistent_table_usage,omitempty"`

	// Total number of bytes of received packets dropped It includes packets across all VS and non VS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxBytesDropped *uint64 `json:"rx_bytes_dropped,omitempty"`

	// Total number of rx_pkts dropped at SE. It includes packets across all VS and non VS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxPktsDropped *uint64 `json:"rx_pkts_dropped,omitempty"`

	// Shared memory usage. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SharedMemoryUsage *uint64 `json:"shared_memory_usage,omitempty"`

	// ssl session cache. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslSessionCache *uint64 `json:"ssl_session_cache,omitempty"`

	// ssl session cache usage percent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslSessionCacheUsage *uint64 `json:"ssl_session_cache_usage,omitempty"`

	// SYN cache usage. Higher usage indicates too many connection attempts and open at service engine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynCacheUsage *uint64 `json:"syn_cache_usage,omitempty"`

	// actual physical memory in MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMemory *uint64 `json:"total_memory,omitempty"`

	// Highest value of egress queueing latency. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WorstEgressLatency *uint64 `json:"worst_egress_latency,omitempty"`

	// Highest value of ingress queueing latency. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WorstIngressLatency *uint64 `json:"worst_ingress_latency,omitempty"`
}
