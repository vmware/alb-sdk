// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSARdata Dns a rdata
// swagger:model DnsARdata
type DNSARdata struct {

	// IP address for FQDN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	IPAddress *IPAddr `json:"ip_address"`
}
