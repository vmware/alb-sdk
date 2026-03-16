// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DsSnatIPEntry ds snat Ip entry
// swagger:model DsSnatIpEntry
type DsSnatIPEntry struct {

	// True if the snat ip address belongs to a connected subnet, and if_ip_alias is added. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Activated *bool `json:"activated,omitempty"`

	// SNAT IP Address associated with a linked data-script. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsSnatIPAddr *string `json:"ds_snat_ip_addr,omitempty"`
}
