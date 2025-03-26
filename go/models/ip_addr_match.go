// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrMatch Ip addr match
// swagger:model IpAddrMatch
type IPAddrMatch struct {

	// IP address(es). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Addrs []*IPAddr `json:"addrs,omitempty"`

	// UUID of IP address group(s). It is a reference to an object of type IpAddrGroup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroupRefs []string `json:"group_refs,omitempty"`

	// Criterion to use for IP address matching the HTTP request. Enum options - IS_IN, IS_NOT_IN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MatchCriteria *string `json:"match_criteria"`

	// IP address prefix(es). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Prefixes []*IPAddrPrefix `json:"prefixes,omitempty"`

	// IP address range(s). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ranges []*IPAddrRange `json:"ranges,omitempty"`
}
