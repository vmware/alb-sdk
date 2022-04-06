// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PlacementNetwork placement network
// swagger:model PlacementNetwork
type PlacementNetwork struct {

	//  It is a reference to an object of type Network. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NetworkRef *string `json:"network_ref"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Subnet *IPAddrPrefix `json:"subnet"`
}
