// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeIp6DadFailedEventDetails se ip6 dad failed event details
// swagger:model SeIP6DadFailedEventDetails
type SeIp6DadFailedEventDetails struct {

	// IPv6 address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DadIP *IPAddr `json:"dad_ip,omitempty"`

	// Vnic name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfName *string `json:"if_name,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
