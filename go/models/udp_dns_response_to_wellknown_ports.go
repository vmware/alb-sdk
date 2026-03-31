// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UDPDNSResponseToWellknownPorts Udp Dns response to wellknown ports
// swagger:model UdpDnsResponseToWellknownPorts
type UDPDNSResponseToWellknownPorts struct {

	// Number of responses sent to well known ports for requests of type ANY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseAnyToWellKnownPorts *uint64 `json:"udps_dns_response_any_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type DNSKEY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseDnskeyToWellKnownPorts *uint64 `json:"udps_dns_response_dnskey_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type RRSIG, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseRrsigToWellKnownPorts *uint64 `json:"udps_dns_response_rrsig_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type ANY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseSizeAnyToWellKnownPorts *uint64 `json:"udps_dns_response_size_any_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type DNSKEY, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseSizeDnskeyToWellKnownPorts *uint64 `json:"udps_dns_response_size_dnskey_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type RRSIG, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseSizeRrsigToWellKnownPorts *uint64 `json:"udps_dns_response_size_rrsig_to_well_known_ports,omitempty"`

	// Cumulative size in bytes of responses sent to well known ports for requests of type TXT, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseSizeTxtToWellKnownPorts *uint64 `json:"udps_dns_response_size_txt_to_well_known_ports,omitempty"`

	// Number of responses sent to well known ports for requests of type TXT, where the response size goes beyond a threshold. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UdpsDNSResponseTxtToWellKnownPorts *uint64 `json:"udps_dns_response_txt_to_well_known_ports,omitempty"`
}
