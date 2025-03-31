// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ArpTableFilter arp table filter
// swagger:model ArpTableFilter
type ArpTableFilter struct {

	// IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddress *IPAddr `json:"ip_address,omitempty"`
}
