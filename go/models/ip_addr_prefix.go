// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrPrefix Ip addr prefix
// swagger:model IpAddrPrefix
type IPAddrPrefix struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *IPAddr `json:"ip_addr"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mask *int32 `json:"mask"`
}
