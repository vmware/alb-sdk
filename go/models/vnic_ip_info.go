// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VnicIPInfo vnic Ip info
// swagger:model VnicIpInfo
type VnicIPInfo struct {

	//  It is a reference to an object of type Network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkRef []string `json:"network_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet []*IPAddrPrefix `json:"subnet,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimedOut *bool `json:"timed_out,omitempty"`
}
