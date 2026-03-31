// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverDNSStats vserver DNS stats
// swagger:model VserverDNSStats
type VserverDNSStats struct {

	// Number of requests received with EDNS resource record. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSQueryWithEdns *uint64 `json:"dns_query_with_edns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainLookupFailures *uint64 `json:"domain_lookup_failures,omitempty"`

	// Total number of errored queries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErroredQueries *uint64 `json:"errored_queries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbpoolMemberNotAvailable *uint64 `json:"gslbpool_member_not_available,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidQueries *uint64 `json:"invalid_queries,omitempty"`

	// Number of NXdomain responses made by the Avi Load balancer for entries not found in it's dns table. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalNxdomains *uint64 `json:"local_nxdomains,omitempty"`

	// Number of responses made by the Avi Load balancer from it's DNS table. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalResponses *uint64 `json:"local_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ReqTypeA *uint64 `json:"req_type_a"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ReqTypeAaaa *uint64 `json:"req_type_aaaa"`

	// Number of DNS query of type ANY received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeAny *uint64 `json:"req_type_any,omitempty"`

	// Number of DNS query of type DNSKEY received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeDnskey *uint64 `json:"req_type_dnskey,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeMx *uint64 `json:"req_type_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeNs *uint64 `json:"req_type_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeOther *uint64 `json:"req_type_other,omitempty"`

	// Number of DNS query of type RRSIG received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeRrsig *uint64 `json:"req_type_rrsig,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeSrv *uint64 `json:"req_type_srv,omitempty"`

	// Number of DNS query of type TXT received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqTypeTxt *uint64 `json:"req_type_txt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeA *uint64 `json:"resp_type_a,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeAaaa *uint64 `json:"resp_type_aaaa,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeCname *uint64 `json:"resp_type_cname,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeMx *uint64 `json:"resp_type_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeNs *uint64 `json:"resp_type_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeOther *uint64 `json:"resp_type_other,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespTypeSrv *uint64 `json:"resp_type_srv,omitempty"`

	// Number of DNS response, without a corresponding query, received. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespUnsolicited *uint64 `json:"resp_unsolicited,omitempty"`

	// TCP passthrough errored queries - Avi sent errors or dropped requests when server timed out, had a port unreachable or responded with an error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPPassthroughErrors *uint64 `json:"tcp_passthrough_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPPassthroughQueries *uint64 `json:"tcp_passthrough_queries,omitempty"`

	// Number of TCP queries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPQueries *uint64 `json:"tcp_queries,omitempty"`

	// Number of responses sent to well known ports for requests of type ANY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseAnyToWellKnownPorts *uint64 `json:"udp_dns_response_any_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type DNSKEY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseDnskeyToWellKnownPorts *uint64 `json:"udp_dns_response_dnskey_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type RRSIG, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseRrsigToWellKnownPorts *uint64 `json:"udp_dns_response_rrsig_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type ANY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseSizeAnyToWellKnownPorts *uint64 `json:"udp_dns_response_size_any_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type DNSKEY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseSizeDnskeyToWellKnownPorts *uint64 `json:"udp_dns_response_size_dnskey_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type RRSIG, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseSizeRrsigToWellKnownPorts *uint64 `json:"udp_dns_response_size_rrsig_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type TXT, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseSizeTxtToWellKnownPorts *uint64 `json:"udp_dns_response_size_txt_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type TXT, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPDNSResponseTxtToWellKnownPorts *uint64 `json:"udp_dns_response_txt_to_well_known_ports,omitempty"`

	// UDP passthrough errored queries - Avi sent errors or dropped requests when server timed out, had a port unreachable or responded with an error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPPassthroughErrors *uint64 `json:"udp_passthrough_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPPassthroughQueries *uint64 `json:"udp_passthrough_queries,omitempty"`

	// Total time taken for DNS responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPPassthroughRespTime *uint64 `json:"udp_passthrough_resp_time,omitempty"`

	// Number of UDP queries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDPQueries *uint64 `json:"udp_queries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnsupportedQueries *uint64 `json:"unsupported_queries,omitempty"`
}
