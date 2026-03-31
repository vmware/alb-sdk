// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSResponseMxEntry Dns response mx entry
// swagger:model DnsResponseMxEntry
type DNSResponseMxEntry struct {

	// Host name in MX record. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Host *string `json:"host,omitempty"`

	// Priority of host. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Priority *uint32 `json:"priority,omitempty"`
}
