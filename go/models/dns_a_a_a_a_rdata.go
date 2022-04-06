// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSAAAARdata Dns a a a a rdata
// swagger:model DnsAAAARdata
type DNSAAAARdata struct {

	// IPv6 address for FQDN. Field introduced in 18.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Ip6Address *IPAddr `json:"ip6_address"`
}
