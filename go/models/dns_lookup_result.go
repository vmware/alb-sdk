// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSLookupResult Dns lookup result
// swagger:model DnsLookupResult
type DNSLookupResult struct {

	// Resolved IPv6 addresses. Absent if resolution failed, or if pool=true and the associated Cloud has resolve_fqdn_to_ipv6 disabled. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6s []string `json:"ip6s,omitempty"`

	// Resolved IPv4 addresses. Absent if resolution failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ips []string `json:"ips,omitempty"`

	// The FQDN or IP that was looked up, echoed back. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Server *string `json:"server"`
}
