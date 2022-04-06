// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSRuleMatchTarget Dns rule match target
// swagger:model DnsRuleMatchTarget
type DNSRuleMatchTarget struct {

	// IP addresses to match against client IP. From 17.1.6 release onwards, IP addresses needs to be configured in the client_ip_address field of this message. Field deprecated in 17.1.6,17.2.2. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClientIP *IPAddrMatch `json:"client_ip,omitempty"`

	// IP addresses to match against client IP or the EDNS client subnet IP. Field introduced in 17.1.6,17.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClientIPAddress *DNSClientIPMatch `json:"client_ip_address,omitempty"`

	// Port number to match against client port number. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ClientPortNumbers *DNSClientPortMatch `json:"client_port_numbers,omitempty"`

	// Geographical location attribute to match against that of the client IP. Field introduced in 17.1.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GeoLocation *DNSGeoLocationMatch `json:"geo_location,omitempty"`

	// DNS transport protocol match. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Protocol *DNSTransportProtocolMatch `json:"protocol,omitempty"`

	// Domain names to match against query name. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	QueryName *DNSQueryNameMatch `json:"query_name,omitempty"`

	// DNS query types to match against request query type. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	QueryType *DNSQueryTypeMatch `json:"query_type,omitempty"`
}
