// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSNsRdata Dns ns rdata
// swagger:model DnsNsRdata
type DNSNsRdata struct {

	// IPv6 address for Name Server. Field introduced in 18.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Ip6Address *IPAddr `json:"ip6_address,omitempty"`

	// IP address for Name Server. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IPAddress *IPAddr `json:"ip_address,omitempty"`

	// Name Server name. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Nsname *string `json:"nsname"`
}
