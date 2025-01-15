// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrPort Ip addr port
// swagger:model IpAddrPort
type IPAddrPort struct {

	// Hostname of server. One of IP address or hostname should be set. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hostname *string `json:"hostname,omitempty"`

	// IP Address of host. One of IP address or hostname should be set. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Port number of server. Allowed values are 1-65535. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`
}
