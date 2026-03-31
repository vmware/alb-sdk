// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConVip con vip
// swagger:model ConVip
type ConVip struct {

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networks []*DiscoveredNetwork `json:"networks,omitempty"`

	// Mask applied for the Vip, non-default mask supported only for wildcard Vip. Allowed values are 0-32. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrefixLength *uint32 `json:"prefix_length,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vip *IPAddr `json:"vip,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vip6 *IPAddr `json:"vip6,omitempty"`
}
