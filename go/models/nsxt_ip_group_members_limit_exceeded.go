// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtIPGroupMembersLimitExceeded nsxt IP group members limit exceeded
// swagger:model NsxtIPGroupMembersLimitExceeded
type NsxtIPGroupMembersLimitExceeded struct {

	// Error message. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// Number of IP address members from the NSX group. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddressMembers *int64 `json:"ip_address_members,omitempty"`

	// IpAddrGroup UUID that would have been updated. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPGroupUUID *string `json:"ip_group_uuid,omitempty"`

	// Maximum allowed IP address members count. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Limit *int64 `json:"limit,omitempty"`

	// NSX Group policy path. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsxGroupPath *string `json:"nsx_group_path,omitempty"`
}
