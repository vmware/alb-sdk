// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAMDNSRecordInfo Ipam Dns record info
// swagger:model IpamDnsRecordInfo
type IPAMDNSRecordInfo struct {

	// Number of DNS records. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRecords *uint32 `json:"num_records,omitempty"`

	// List of DNS records. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Records []*DNSRecord `json:"records,omitempty"`
}
