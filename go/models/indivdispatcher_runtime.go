// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IndivdispatcherRuntime indivdispatcher runtime
// swagger:model IndivdispatcherRuntime
type IndivdispatcherRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ArpCurrentRate *uint32 `json:"arp_current_rate"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ArpRxRlCfgPps *uint32 `json:"arp_rx_rl_cfg_pps"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ArpRxRlConfirming *uint32 `json:"arp_rx_rl_confirming"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ArpRxRlDrops *uint32 `json:"arp_rx_rl_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelayFairness *bool `json:"delay_fairness,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DoserDrop *uint64 `json:"doser_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DoserOom *uint64 `json:"doser_oom,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FaultInjectionTCPDrops *uint32 `json:"fault_injection_tcp_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowActDrop *uint32 `json:"flow_act_drop"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowActRlDrop *uint64 `json:"flow_act_rl_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowAgedDelete *uint32 `json:"flow_aged_delete"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowClosedAged *uint32 `json:"flow_closed_aged,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowConnThrottled *uint32 `json:"flow_conn_throttled"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowConnThrottledMem *uint32 `json:"flow_conn_throttled_mem"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowConnThrottledNumFlows *uint32 `json:"flow_conn_throttled_num_flows,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowConnThrottledNumSyn *uint32 `json:"flow_conn_throttled_num_syn"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowCreatedByProbeRsp *uint32 `json:"flow_created_by_probe_rsp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelInternalWrongContext *uint32 `json:"flow_del_internal_wrong_context,omitempty"`

	// Number of times a flow delete probe received from other SE was punted to another core on the local SE. Field introduced in 17.2.12, 18.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelProbesReqPunted *uint32 `json:"flow_del_probes_req_punted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelReqReceived *uint64 `json:"flow_del_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelReqReceivedForLocal *uint32 `json:"flow_del_req_received_for_local,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelReqReceivedNotFound *uint32 `json:"flow_del_req_received_not_found,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDelReqSent *uint64 `json:"flow_del_req_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDeleteBeforeUpdate *uint32 `json:"flow_delete_before_update,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDroppedVsDown *uint32 `json:"flow_dropped_vs_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowEstAged *uint32 `json:"flow_est_aged,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowHalfClosedAged *uint32 `json:"flow_half_closed_aged,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowInbandAdd *uint32 `json:"flow_inband_add"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowInbandDelete *uint32 `json:"flow_inband_delete"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowInbandUpdate *uint32 `json:"flow_inband_update"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowInbandUpdateIgnored *uint32 `json:"flow_inband_update_ignored"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowLoopDetected *uint32 `json:"flow_loop_detected,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowMacErrors *uint32 `json:"flow_mac_errors"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowMultipleUpdates *uint32 `json:"flow_multiple_updates,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowNumSyns *uint32 `json:"flow_num_syns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowNumSynsMim *uint32 `json:"flow_num_syns_mim,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseArpReply *uint32 `json:"flow_parse_arp_reply"`

	// Number of ARP replies discarded that were not requested by Avi or for ARP disabled on the interface. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowParseArpReplyDiscardedNotApplicable *uint64 `json:"flow_parse_arp_reply_discarded_not_applicable,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseArpReq *uint32 `json:"flow_parse_arp_req"`

	// Number of ARP requests discarded that were not for Avi or for ARP disabled on the interface. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowParseArpReqDiscardedNotApplicable *uint64 `json:"flow_parse_arp_req_discarded_not_applicable,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseErrors *uint32 `json:"flow_parse_errors"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseIcmp6Reply *uint32 `json:"flow_parse_icmp6_reply"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseIcmp6Req *uint32 `json:"flow_parse_icmp6_req"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseIcmpReply *uint32 `json:"flow_parse_icmp_reply"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseIcmpReq *uint32 `json:"flow_parse_icmp_req"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseLacpKni *uint32 `json:"flow_parse_lacp_kni"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowParseLldpKni *uint32 `json:"flow_parse_lldp_kni,omitempty"`

	// Number of sctp packets. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseSctp *uint32 `json:"flow_parse_sctp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseTCP *uint32 `json:"flow_parse_tcp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseTCPFrag *uint32 `json:"flow_parse_tcp_frag"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseTCPKni *uint32 `json:"flow_parse_tcp_kni"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseUDP *uint32 `json:"flow_parse_udp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowParseUDPKni *uint32 `json:"flow_parse_udp_kni,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowParseUnknown *uint32 `json:"flow_parse_unknown"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowPktsThrottled *uint32 `json:"flow_pkts_throttled"`

	// Duplicate flow probes avoided. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesDuplicateAvoided *uint32 `json:"flow_probes_duplicate_avoided,omitempty"`

	// Flow probe delete not finding cache entry. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesEntryDeleteMiss *uint32 `json:"flow_probes_entry_delete_miss,omitempty"`

	// Packets queued up due to flow probe. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesEntryNumPacketsQueued *uint32 `json:"flow_probes_entry_num_packets_queued,omitempty"`

	// Packets dropped due to flow probe failure. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesFailDropPkts *uint32 `json:"flow_probes_fail_drop_pkts,omitempty"`

	// Flow probes failed. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesFailure *uint32 `json:"flow_probes_failure,omitempty"`

	// Outstanding data packets queued for flow probe requests. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesOutstandingQueuedPkts *uint32 `json:"flow_probes_outstanding_queued_pkts,omitempty"`

	// Outstanding flow probe requests. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesOutstandingReqs *uint32 `json:"flow_probes_outstanding_reqs,omitempty"`

	// Number of packets freed due to threshold for queueing during flow probe. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesPktsFreedDueToThreshold *uint32 `json:"flow_probes_pkts_freed_due_to_threshold,omitempty"`

	// Number of packets queued for flow probe and punted locally. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesQueuedPktsPuntedToLocalVnic *uint32 `json:"flow_probes_queued_pkts_punted_to_local_vnic,omitempty"`

	// Number of packets queued for flow probe and punted remotely. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesQueuedPktsPuntedToRemoteSe *uint32 `json:"flow_probes_queued_pkts_punted_to_remote_se,omitempty"`

	// Number of flow probes that were relayed to other dispatcher cores. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesRelayed *uint64 `json:"flow_probes_relayed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesReqDiscardedMiss *uint32 `json:"flow_probes_req_discarded_miss"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesReqDiscardedNonlocal *uint32 `json:"flow_probes_req_discarded_nonlocal"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesReqPunted *uint32 `json:"flow_probes_req_punted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesReqReceived *uint32 `json:"flow_probes_req_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesReqSent *uint32 `json:"flow_probes_req_sent"`

	// Flow probes retransmitted. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesRetransmissionCount *uint32 `json:"flow_probes_retransmission_count,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowProbesRspPunted *uint32 `json:"flow_probes_rsp_punted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesRspReceived *uint32 `json:"flow_probes_rsp_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowProbesRspSent *uint32 `json:"flow_probes_rsp_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowRemoteEntryOnSecondary *uint32 `json:"flow_remote_entry_on_secondary,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowRxCreate *uint32 `json:"flow_rx_create"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowRxLookupHit *uint32 `json:"flow_rx_lookup_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowRxLookupMiss *uint32 `json:"flow_rx_lookup_miss"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowRxLookupMissDrop *uint32 `json:"flow_rx_lookup_miss_drop"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowRxLookupRstMissDrop *uint32 `json:"flow_rx_lookup_rst_miss_drop"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSeBwExceededDrop *uint32 `json:"flow_se_bw_exceeded_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenAged *uint32 `json:"flow_syn_seen_aged,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenFromClosed *uint32 `json:"flow_syn_seen_from_closed,omitempty"`

	// Number of times a remote flow went from ESTABLISHED state to SYN_SEEN state. This is an indication of a reuse of the source port by the client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenFromEstablished *uint32 `json:"flow_syn_seen_from_established,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenFromHalfClosed *uint32 `json:"flow_syn_seen_from_half_closed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenFromSynSeen *uint32 `json:"flow_syn_seen_from_syn_seen,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowSynSeenFromUnknown *uint32 `json:"flow_syn_seen_from_unknown,omitempty"`

	// Number of invalid packets dropped. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableBadMbufPktDrops *uint64 `json:"flow_table_bad_mbuf_pkt_drops,omitempty"`

	// Number of packets with GRE header. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableDsrRxGreEncap *uint64 `json:"flow_table_dsr_rx_gre_encap,omitempty"`

	// Number of packets with Ip6inIp6 header. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableDsrRxIp6inip6Encap *uint64 `json:"flow_table_dsr_rx_ip6inip6_encap,omitempty"`

	// Number of packets with IpinIp header. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableDsrRxIpinipEncap *uint64 `json:"flow_table_dsr_rx_ipinip_encap,omitempty"`

	// Number of packets dropped because flow table entry creation failed. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableEntryCreateFailDrops *uint64 `json:"flow_table_entry_create_fail_drops,omitempty"`

	// Number of packets dropped because invalid core received. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIcmpInvalidCoreDrops *uint64 `json:"flow_table_icmp_invalid_core_drops,omitempty"`

	// Number of packets with invalid encap that are dropped. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableInvalidEncapDrops *uint32 `json:"flow_table_invalid_encap_drops,omitempty"`

	// Number of IP encap IPC packets received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcRxIPEncap *uint32 `json:"flow_table_ipc_rx_ip_encap,omitempty"`

	// Number of L3 encap IPC packets received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcRxL3Encap *uint32 `json:"flow_table_ipc_rx_l3_encap,omitempty"`

	// Number of IP encap IPC packets received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcRxNoEncap *uint32 `json:"flow_table_ipc_rx_no_encap,omitempty"`

	// Number of UDP encap IPC packets received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcRxUDPEncap *uint32 `json:"flow_table_ipc_rx_udp_encap,omitempty"`

	// Number of IP encap IPC packets sent. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcTxIPEncap *uint32 `json:"flow_table_ipc_tx_ip_encap,omitempty"`

	// Number of L3 encap IPC packets sent. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcTxL3Encap *uint32 `json:"flow_table_ipc_tx_l3_encap,omitempty"`

	// Number of IP encap IPC packets sent. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcTxNoEncap *uint32 `json:"flow_table_ipc_tx_no_encap,omitempty"`

	// Number of UDP encap IPC packets sent. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcTxUDPEncap *uint32 `json:"flow_table_ipc_tx_udp_encap,omitempty"`

	// Number of VSSE update IPCs received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcVsseUpdReceived *uint32 `json:"flow_table_ipc_vsse_upd_received,omitempty"`

	// Number of VSSE update IPCs sent. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableIpcVsseUpdSent *uint32 `json:"flow_table_ipc_vsse_upd_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowTableNumEntries *uint32 `json:"flow_table_num_entries"`

	// Number of sctp flow table entries. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableNumSctpEntries *uint32 `json:"flow_table_num_sctp_entries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowTableNumTCPEntries *uint32 `json:"flow_table_num_tcp_entries"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowTableNumUDPEntries *uint32 `json:"flow_table_num_udp_entries"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowTableRemoteEntries *uint32 `json:"flow_table_remote_entries"`

	// Number of packets dropped because message queue was full. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowTableRteDataqFullDrops *uint64 `json:"flow_table_rte_dataq_full_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowUnknownAged *uint32 `json:"flow_unknown_aged,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowprobeTxRlCfgPps *uint32 `json:"flowprobe_tx_rl_cfg_pps"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowprobeTxRlConfirming *uint32 `json:"flowprobe_tx_rl_confirming"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FlowprobeTxRlDrops *uint32 `json:"flowprobe_tx_rl_drops"`

	// Expected Sequence Number at the receiver. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtIpcExpectedSeqNum *uint32 `json:"ft_ipc_expected_seq_num,omitempty"`

	// Number of failed IPCs. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtIpcMirrorFail *uint32 `json:"ft_ipc_mirror_fail,omitempty"`

	// Number of IPCs received. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtIpcReceived *uint32 `json:"ft_ipc_received,omitempty"`

	// Number of IPCs sent. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtIpcSent *uint32 `json:"ft_ipc_sent,omitempty"`

	// Number of Mirrored flows from Active. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtMirroredEntries *uint32 `json:"ft_mirrored_entries,omitempty"`

	//  Field introduced in 17.2.8, 18.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtNumNonSynPktsPunted *uint32 `json:"ft_num_non_syn_pkts_punted,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FtNumSynsPunted *uint32 `json:"ft_num_syns_punted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcmpCurrentRate *uint32 `json:"icmp_current_rate"`

	// Number of ICMP Packet Too Big messages dropped. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcmpPmtudPktDropped *uint64 `json:"icmp_pmtud_pkt_dropped,omitempty"`

	// Number of ICMP Packet Too Big messages forwarded. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcmpPmtudPktForwarded *uint64 `json:"icmp_pmtud_pkt_forwarded,omitempty"`

	// Number of ICMP Packet Too Big messages received. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcmpPmtudPktReceived *uint64 `json:"icmp_pmtud_pkt_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcmpRspCurrentRate *uint32 `json:"icmp_rsp_current_rate,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcmpRxRlCfgPps *uint32 `json:"icmp_rx_rl_cfg_pps"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcmpRxRlConfirming *uint32 `json:"icmp_rx_rl_confirming"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcmpRxRlDrops *uint32 `json:"icmp_rx_rl_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IntfName *string `json:"intf_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2DpHbReqReceived *uint32 `json:"l2_dp_hb_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2DpHbReqSent *uint32 `json:"l2_dp_hb_req_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2DpHbRspReceived *uint32 `json:"l2_dp_hb_rsp_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2DpHbRspSent *uint32 `json:"l2_dp_hb_rsp_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2FlowProbesReqReceived *uint32 `json:"l2_flow_probes_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2FlowProbesReqSent *uint32 `json:"l2_flow_probes_req_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2FlowProbesRspReceived *uint32 `json:"l2_flow_probes_rsp_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L2FlowProbesRspSent *uint32 `json:"l2_flow_probes_rsp_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3DpHbReqReceived *uint32 `json:"l3_dp_hb_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3DpHbReqSent *uint32 `json:"l3_dp_hb_req_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3DpHbRspReceived *uint32 `json:"l3_dp_hb_rsp_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3DpHbRspSent *uint32 `json:"l3_dp_hb_rsp_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3FlowProbesReqReceived *uint32 `json:"l3_flow_probes_req_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3FlowProbesReqSent *uint32 `json:"l3_flow_probes_req_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3FlowProbesRspReceived *uint32 `json:"l3_flow_probes_rsp_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L3FlowProbesRspSent *uint32 `json:"l3_flow_probes_rsp_sent,omitempty"`

	// Local flow probe responses received. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalFlowProbesSucceeded *uint32 `json:"local_flow_probes_succeeded,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mac *string `json:"mac"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxCpsPerClientDrop *uint64 `json:"max_cps_per_client_drop,omitempty"`

	// Maximum outstanding data packets queued for flow probe requests. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxFlowProbesOutstandingQueuedPkts *uint32 `json:"max_flow_probes_outstanding_queued_pkts,omitempty"`

	// Maximum outstanding flow probe requests. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxFlowProbesOutstandingReqs *uint32 `json:"max_flow_probes_outstanding_reqs,omitempty"`

	// Number of IPv6 ND packets received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NdCurrentRate *uint32 `json:"nd_current_rate"`

	// Allowed Rate of IPv6 ND packets . Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NdRxRlCfgPps *uint32 `json:"nd_rx_rl_cfg_pps"`

	// Number of IPv6 ND packets accepted. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NdRxRlConfirming *uint32 `json:"nd_rx_rl_confirming"`

	// Number of IPv6 ND packets dropped. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NdRxRlDrops *uint32 `json:"nd_rx_rl_drops"`

	// Number of ACKs punted to remote SEs with hash when SYN flood was seen. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAckPacketsPuntedRemoteWithHash *uint64 `json:"num_ack_packets_punted_remote_with_hash,omitempty"`

	// Number of ACKs punted with hash when SYN flood was seen. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAckPacketsPuntedWithHash *uint64 `json:"num_ack_packets_punted_with_hash,omitempty"`

	// Number of ACKs reinjected to the dispatcher expecting a remote flowtable create action, applicable whenmax_queues_per_vnic and num_dispatcher_cores configured. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAckPacketsReinjected *uint64 `json:"num_ack_packets_reinjected,omitempty"`

	// Number of flows handled by the flowtable on which the client SYN was not seen, applicable when max_queues_per_vnic and num_dispatcher_cores configured. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAdoptedFlows *uint64 `json:"num_adopted_flows,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbReqPunted *uint32 `json:"num_hb_req_punted,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHbRspPunted *uint32 `json:"num_hb_rsp_punted,omitempty"`

	// Number of large packets that failed to be punted to remote SEs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLroPktPuntRemoteFailed *uint64 `json:"num_lro_pkt_punt_remote_failed,omitempty"`

	// Number of large packets punted to remote SEs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLroPktPuntedRemote *uint64 `json:"num_lro_pkt_punted_remote,omitempty"`

	// Number of packets to KNI blocked due to port filtering. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPktsDroppedByKniPortFilters *uint64 `json:"num_pkts_dropped_by_kni_port_filters,omitempty"`

	// Number of SYNs punted to remote SEs with hash when SYN flood was seen. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSynPacketsPuntedRemoteWithHash *uint64 `json:"num_syn_packets_punted_remote_with_hash,omitempty"`

	// Number of SYNs punted with hash when SYN flood was seen. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSynPacketsPuntedWithHash *uint64 `json:"num_syn_packets_punted_with_hash,omitempty"`

	// Number of VS packets dropped on standby SE. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPktDropsOnStandbySe *uint64 `json:"num_vs_pkt_drops_on_standby_se,omitempty"`

	// Number of times the relayed flow probe was ignored because  a. Flow migrate is triggered due to another relayed flow probe b. Interface is up, no need to respond to a relayed flow probe. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RelayedFlowProbesReqIgnored *uint64 `json:"relayed_flow_probes_req_ignored,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteFlowLocalUpdates *uint32 `json:"remote_flow_local_updates,omitempty"`

	// Remote flow probe responses received. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteFlowProbesSucceeded *uint32 `json:"remote_flow_probes_succeeded,omitempty"`

	// Retransmit Buffer count. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RetransmitBufferCount *uint32 `json:"retransmit_buffer_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RstSent *uint32 `json:"rst_sent"`

	// Number of Se Owned Vip Flow Probe Requests flooded locally. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesReqLocalBroadcasted *uint32 `json:"se_owned_vip_flow_probes_req_local_broadcasted,omitempty"`

	// Number of Se Owned Vip Flow Probe Requests flooded locally received. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesReqLocalReceived *uint32 `json:"se_owned_vip_flow_probes_req_local_received,omitempty"`

	// Number of Se Owned Vip Flow Probe Requests received. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesReqReceived *uint32 `json:"se_owned_vip_flow_probes_req_received,omitempty"`

	// Number of Se Owned Vip Flow Probe Requests sent. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesReqSent *uint32 `json:"se_owned_vip_flow_probes_req_sent,omitempty"`

	// Number of Se Owned Vip Flow Probe Response received. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesRspReceived *uint32 `json:"se_owned_vip_flow_probes_rsp_received,omitempty"`

	// Number of Se Owned Vip Flow Probe Response sent. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeOwnedVipFlowProbesRspSent *uint32 `json:"se_owned_vip_flow_probes_rsp_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendPktWithIntfArpFail *uint32 `json:"send_pkt_with_intf_arp_fail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendPktWithIntfNoRoute *uint32 `json:"send_pkt_with_intf_no_route,omitempty"`

	// Duplicate flow probes avoided for SNAT flows. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnatFlowProbesDuplicateAvoided *uint64 `json:"snat_flow_probes_duplicate_avoided,omitempty"`

	// Number of packets freed due to threshold for queueing during flow probe for SNAT flows. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnatFlowProbesPktsFreedDueToThreshold *uint64 `json:"snat_flow_probes_pkts_freed_due_to_threshold,omitempty"`

	// Number of packets queued for flow probe and punted locally for SNAT flows. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnatFlowProbesQueuedPktsPuntedToLocalVnic *uint64 `json:"snat_flow_probes_queued_pkts_punted_to_local_vnic,omitempty"`

	// Number of local flow probes send for SNAT flows. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnatFlowProbesReqSent *uint64 `json:"snat_flow_probes_req_sent,omitempty"`

	// Local flow probe responses received for SNAT flows. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnatFlowProbesSucceeded *uint64 `json:"snat_flow_probes_succeeded,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SynDroppedDeletePending *uint32 `json:"syn_dropped_delete_pending"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynseenEntriesThresh *uint32 `json:"synseen_entries_thresh,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TCPRstTxRlCfgPps *uint32 `json:"tcp_rst_tx_rl_cfg_pps"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TCPRstTxRlConfirming *uint32 `json:"tcp_rst_tx_rl_confirming"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TCPRstTxRlDrops *uint32 `json:"tcp_rst_tx_rl_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicID *uint32 `json:"vnic_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongEntryInCloseTmrList *uint32 `json:"wrong_entry_in_close_tmr_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongEntryInEstTmrList *uint32 `json:"wrong_entry_in_est_tmr_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongEntryInHalfcloseTmrList *uint32 `json:"wrong_entry_in_halfclose_tmr_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongEntryInSynTmrList *uint32 `json:"wrong_entry_in_syn_tmr_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongEntryInUnknownTmrList *uint32 `json:"wrong_entry_in_unknown_tmr_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrongRemoteInternalVnic *uint32 `json:"wrong_remote_internal_vnic,omitempty"`
}
