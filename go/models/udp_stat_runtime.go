// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UDPStatRuntime Udp stat runtime
// swagger:model UdpStatRuntime
type UDPStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UDPPSPcbcachemiss *uint64 `json:"udpps_pcbcachemiss"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UDPPSPcbhashmiss *uint64 `json:"udpps_pcbhashmiss"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsBadlen *uint64 `json:"udps_badlen"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsBadpkts *uint64 `json:"udps_badpkts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsBadsum *uint64 `json:"udps_badsum"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSDomainDrops *uint64 `json:"udps_dns_domain_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSGsDown *uint64 `json:"udps_dns_gs_down,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSInvalidEdnsOption *uint64 `json:"udps_dns_invalid_edns_option,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSInvalidQd *uint64 `json:"udps_dns_invalid_qd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSLocalResponses *uint64 `json:"udps_dns_local_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSNoRecord *uint64 `json:"udps_dns_no_record,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSNoValidGsMember *uint64 `json:"udps_dns_no_valid_gs_member,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSPassThrough *uint64 `json:"udps_dns_pass_through,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSPassThroughErrors *uint64 `json:"udps_dns_pass_through_errors,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSPolicyDrops *uint64 `json:"udps_dns_policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryA *uint64 `json:"udps_dns_query_a,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryAaaa *uint64 `json:"udps_dns_query_aaaa,omitempty"`

	// Number of DNS query of type ANY received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryAny *uint64 `json:"udps_dns_query_any,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryCname *uint64 `json:"udps_dns_query_cname,omitempty"`

	// Number of DNS query of type DNSKEY received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryDnskey *uint64 `json:"udps_dns_query_dnskey,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryMx *uint64 `json:"udps_dns_query_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryNs *uint64 `json:"udps_dns_query_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryOthers *uint64 `json:"udps_dns_query_others,omitempty"`

	// Number of DNS query of type RRSIG received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryRrsig *uint64 `json:"udps_dns_query_rrsig,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQuerySrv *uint64 `json:"udps_dns_query_srv,omitempty"`

	// Number of DNS query of type TXT received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryTxt *uint64 `json:"udps_dns_query_txt,omitempty"`

	// Number of DNS query with EDNS pseudo resource record received over UDP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSQueryWithEdns *uint64 `json:"udps_dns_query_with_edns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseA *uint64 `json:"udps_dns_response_a,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseAaaa *uint64 `json:"udps_dns_response_aaaa,omitempty"`

	// Number of DNS response of type ANY received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseAny *uint64 `json:"udps_dns_response_any,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseCname *uint64 `json:"udps_dns_response_cname,omitempty"`

	// Number of DNS response of type DNSKEY received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseDnskey *uint64 `json:"udps_dns_response_dnskey,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseMx *uint64 `json:"udps_dns_response_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseNs *uint64 `json:"udps_dns_response_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseNxdomain *uint64 `json:"udps_dns_response_nxdomain,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseOthers *uint64 `json:"udps_dns_response_others,omitempty"`

	// Number of DNS response of type RRSIG received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseRrsig *uint64 `json:"udps_dns_response_rrsig,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseSrv *uint64 `json:"udps_dns_response_srv,omitempty"`

	// Number of DNS response of type TXT received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseTxt *uint64 `json:"udps_dns_response_txt,omitempty"`

	// Number of DNS response, without a corresponding query, received over UDP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseUnsolicited *uint64 `json:"udps_dns_response_unsolicited,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSRxResponses *uint64 `json:"udps_dns_rx_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSUnsupportedQueries *uint64 `json:"udps_dns_unsupported_queries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsErroredConns *uint64 `json:"udps_errored_conns"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsFastout *uint64 `json:"udps_fastout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsFiltermcast *uint64 `json:"udps_filtermcast"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsFinishedConns *uint64 `json:"udps_finished_conns"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsFullsock *uint64 `json:"udps_fullsock"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsHdrops *uint64 `json:"udps_hdrops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsIpackets *uint64 `json:"udps_ipackets"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsNoport *uint64 `json:"udps_noport"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsNoportbcast *uint64 `json:"udps_noportbcast"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsNoportmcast *uint64 `json:"udps_noportmcast"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsNosum *uint64 `json:"udps_nosum"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsOpackets *uint64 `json:"udps_opackets"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsPktsfrag *uint64 `json:"udps_pktsfrag"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsPortUnreachPkts *uint64 `json:"udps_port_unreach_pkts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsRxbytes *uint64 `json:"udps_rxbytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsRxpkts *uint64 `json:"udps_rxpkts"`

	// Number of active call ids for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipActiveCallids *uint64 `json:"udps_sip_active_callids,omitempty"`

	// Number of call ids hit for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipCallidHits *uint64 `json:"udps_sip_callid_hits,omitempty"`

	// Number of call ids shifted to a different flow for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipCallidMigrates *uint64 `json:"udps_sip_callid_migrates,omitempty"`

	// Number of call ids missed for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipCallidMiss *uint64 `json:"udps_sip_callid_miss,omitempty"`

	// Number of drops for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipDrops *uint64 `json:"udps_sip_drops,omitempty"`

	// Number of times the configured SIP log depth is reached. Field introduced in 17.2.13, 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipLogDepthHits *uint64 `json:"udps_sip_log_depth_hits,omitempty"`

	// Number of memory allocation failures for SIP-over-UDP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipMallocFailures *uint64 `json:"udps_sip_malloc_failures,omitempty"`

	// Number of messages with size more than maximum supported size for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipMsgSizeExceeds *uint64 `json:"udps_sip_msg_size_exceeds,omitempty"`

	// Number of parse attempts for SIP-over-UDP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipParseAttempts *uint64 `json:"udps_sip_parse_attempts,omitempty"`

	// Number of parse errors for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipParseErrors *uint64 `json:"udps_sip_parse_errors,omitempty"`

	// Number of parse successes for SIP-over-UDP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipParseSuccesses *uint64 `json:"udps_sip_parse_successes,omitempty"`

	// Number of acknowledgment requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestAcks *uint64 `json:"udps_sip_request_acks,omitempty"`

	// Number of bye requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestByes *uint64 `json:"udps_sip_request_byes,omitempty"`

	// Number of cancel requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestCancels *uint64 `json:"udps_sip_request_cancels,omitempty"`

	// Number of invite requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestInvites *uint64 `json:"udps_sip_request_invites,omitempty"`

	// Number of options requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestOptions *uint64 `json:"udps_sip_request_options,omitempty"`

	// Number of request messages which are not specifically accounted SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestOthers *uint64 `json:"udps_sip_request_others,omitempty"`

	// Number of publish requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestPublishes *uint64 `json:"udps_sip_request_publishes,omitempty"`

	// Number of register requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestRegisters *uint64 `json:"udps_sip_request_registers,omitempty"`

	// Number of subscribe requests for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipRequestSubscribes *uint64 `json:"udps_sip_request_subscribes,omitempty"`

	// Number of 1xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse1xxs *uint64 `json:"udps_sip_response_1xxs,omitempty"`

	// Number of 2xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse2xxs *uint64 `json:"udps_sip_response_2xxs,omitempty"`

	// Number of 3xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse3xxs *uint64 `json:"udps_sip_response_3xxs,omitempty"`

	// Number of 4xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse4xxs *uint64 `json:"udps_sip_response_4xxs,omitempty"`

	// Number of 5xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse5xxs *uint64 `json:"udps_sip_response_5xxs,omitempty"`

	// Number of 6xx responses for SIP-over-UDP. Field introduced in 17.2.8, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipResponse6xxs *uint64 `json:"udps_sip_response_6xxs,omitempty"`

	// Number of total messages dropped for SIP-over-UDP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsSipTotalDrops *uint64 `json:"udps_sip_total_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsStartedConns *uint64 `json:"udps_started_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsTimedoutConns *uint64 `json:"udps_timedout_conns"`

	// Stats for Response to queries originating from UDP well known ports. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsToWellKnownPorts *UDPDNSResponseToWellknownPorts `json:"udps_to_well_known_ports,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsTxbytes *uint64 `json:"udps_txbytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UdpsTxpkts *uint64 `json:"udps_txpkts"`

	// Number of packets dropped because of unsupported encapsulation type in case of DSR. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsUnsupportedEncapType *uint64 `json:"udps_unsupported_encap_type,omitempty"`
}
