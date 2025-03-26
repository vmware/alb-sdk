// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSConfiguration DNS configuration
// swagger:model DNSConfiguration
type DNSConfiguration struct {

	// Search domain to use in DNS lookup, multiple domains must be delimited by space only. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SearchDomain *string `json:"search_domain,omitempty"`

	// List of DNS Server IP(v4/v6) addresses or FQDNs. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerList []*IPAddr `json:"server_list,omitempty"`
}
