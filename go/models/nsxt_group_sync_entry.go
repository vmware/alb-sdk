// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtGroupSyncEntry nsxt group sync entry
// swagger:model NsxtGroupSyncEntry
type NsxtGroupSyncEntry struct {

	// IP addresses for this NSX group. Empty list means fetch from NSX. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddresses []string `json:"ip_addresses,omitempty"`
}
