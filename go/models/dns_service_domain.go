// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSServiceDomain Dns service domain
// swagger:model DnsServiceDomain
type DNSServiceDomain struct {

	// Service domain *string used for FQDN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	DomainName *string `json:"domain_name"`

	// [DEPRECATED] Useless fieldPlease refer to DnsServiceApplicationProfile's num_dns_ip for default valuePlease refer to VsVip's dns_info num_records_in_response for user config valueSpecifies the number of A recordsreturned by Avi DNS Service. Field deprecated in 20.1.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumDNSIP *int32 `json:"num_dns_ip,omitempty"`

	// Third-party Authoritative domain requests are delegated toDNS VirtualService's pool of nameservers. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PassThrough *bool `json:"pass_through,omitempty"`

	// TTL value for DNS records. Allowed values are 1-604800. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RecordTTL *int32 `json:"record_ttl,omitempty"`
}
