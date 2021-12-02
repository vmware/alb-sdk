// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrLimits IP addr limits
// swagger:model IPAddrLimits
type IPAddrLimits struct {

	// Number of IP address groups for match criteria. Field introduced in 21.1.3.
	IPAddressGroupPerMatchCriteria *int32 `json:"ip_address_group_per_match_criteria,omitempty"`

	// Number of IP address prefixes for match criteria. Field introduced in 21.1.3.
	IPAddressPrefixPerMatchCriteria *int32 `json:"ip_address_prefix_per_match_criteria,omitempty"`

	// Number of IP address ranges for match criteria. Field introduced in 21.1.3.
	IPAddressRangePerMatchCriteria *int32 `json:"ip_address_range_per_match_criteria,omitempty"`

	// Number of IP addresses for match criteria. Field introduced in 21.1.3.
	IPAddressesPerMatchCriteria *int32 `json:"ip_addresses_per_match_criteria,omitempty"`
}
