// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPDNSStats Tcp Dns stats
// swagger:model TcpDnsStats
type TCPDNSStats struct {

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSPolicyDrops *uint64 `json:"dns_policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainDrops *uint64 `json:"domain_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GsDown *uint64 `json:"gs_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidEdnsOption *uint64 `json:"invalid_edns_option,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidQd *uint64 `json:"invalid_qd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalResponses *uint64 `json:"local_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoRecord *uint64 `json:"no_record,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoValidGsMember *uint64 `json:"no_valid_gs_member,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Notimp *uint64 `json:"notimp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PassThrough *uint64 `json:"pass_through,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PassThroughErrors *uint64 `json:"pass_through_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryA *uint64 `json:"query_a,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryAaaa *uint64 `json:"query_aaaa,omitempty"`

	// Number of DNS query of type ANY received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryAny *uint64 `json:"query_any,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryCname *uint64 `json:"query_cname,omitempty"`

	// Number of DNS query of type DNSKEY received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryDnskey *uint64 `json:"query_dnskey,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryMx *uint64 `json:"query_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryNs *uint64 `json:"query_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryOthers *uint64 `json:"query_others,omitempty"`

	// Number of DNS query of type RRSIG received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryRrsig *uint64 `json:"query_rrsig,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QuerySrv *uint64 `json:"query_srv,omitempty"`

	// Number of DNS query of type TXT received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryTxt *uint64 `json:"query_txt,omitempty"`

	// Number of DNS query with EDNS pseudo resource record received over TCP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryWithEdns *uint64 `json:"query_with_edns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseA *uint64 `json:"response_a,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseAaaa *uint64 `json:"response_aaaa,omitempty"`

	// Number of DNS query of type ANY received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseAny *uint64 `json:"response_any,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseCname *uint64 `json:"response_cname,omitempty"`

	// Number of DNS query of type DNSKEY received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseDnskey *uint64 `json:"response_dnskey,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseMx *uint64 `json:"response_mx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseNs *uint64 `json:"response_ns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseNxdomain *uint64 `json:"response_nxdomain,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseOthers *uint64 `json:"response_others,omitempty"`

	// Number of DNS query of type RRSIG received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseRrsig *uint64 `json:"response_rrsig,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseSrv *uint64 `json:"response_srv,omitempty"`

	// Number of DNS query of type TXT received over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseTxt *uint64 `json:"response_txt,omitempty"`

	// Number of DNS response received without a corresponding query over TCP. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseUnsolicited *uint64 `json:"response_unsolicited,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses *uint64 `json:"responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxResponses *uint64 `json:"rx_responses,omitempty"`

	// The count of DNS TCP connections that were closed because the entire request was not transmitted by the client within the configured timeout. Field introduced in 22.1.5, 30.1.2, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsDNSConnectionClosedSlowClient *uint64 `json:"tcps_dns_connection_closed_slow_client,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnsupportedQueries *uint64 `json:"unsupported_queries,omitempty"`
}
