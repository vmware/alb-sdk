// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentRoute se agent route
// swagger:model SeAgentRoute
type SeAgentRoute struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultGw *bool `json:"default_gw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeleteRoute *bool `json:"delete_route,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DstIP *IPAddr `json:"dst_ip"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Gateway *IPAddr `json:"gateway"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GwmonDisable *bool `json:"gwmon_disable,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfName *string `json:"if_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mask *int32 `json:"mask"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Metric *uint32 `json:"metric,omitempty"`

	//  Enum options - RT_NETLINK, RT_CONTROLLER, RT_LEARNED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Origin *string `json:"origin,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`

	//  It is a reference to an object of type VrfContext. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfRef *string `json:"vrf_ref,omitempty"`
}
