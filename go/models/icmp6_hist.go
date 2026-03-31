// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Icmp6Hist icmp6 hist
// swagger:model Icmp6Hist
type Icmp6Hist struct {

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6DSTUNREACH *uint64 `json:"ICMP6_DST_UNREACH"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6ECHOREPLY *uint64 `json:"ICMP6_ECHO_REPLY"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6ECHOREQUEST *uint64 `json:"ICMP6_ECHO_REQUEST"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6MEMBERSHIPQUERY *uint64 `json:"ICMP6_MEMBERSHIP_QUERY"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6MEMBERSHIPREDUCTION *uint64 `json:"ICMP6_MEMBERSHIP_REDUCTION"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6MEMBERSHIPREPORT *uint64 `json:"ICMP6_MEMBERSHIP_REPORT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6PACKETTOOBIG *uint64 `json:"ICMP6_PACKET_TOO_BIG"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6PARAMPROB *uint64 `json:"ICMP6_PARAM_PROB"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6ROUTERRENUMBERING *uint64 `json:"ICMP6_ROUTER_RENUMBERING"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMP6TIMEEXCEEDED *uint64 `json:"ICMP6_TIME_EXCEEDED"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MLDV2LISTENERREPORT *uint64 `json:"MLDV2_LISTENER_REPORT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NDNEIGHBORADVERT *uint64 `json:"ND_NEIGHBOR_ADVERT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NDNEIGHBORSOLICIT *uint64 `json:"ND_NEIGHBOR_SOLICIT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NDREDIRECT *uint64 `json:"ND_REDIRECT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NDROUTERADVERT *uint64 `json:"ND_ROUTER_ADVERT"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NDROUTERSOLICIT *uint64 `json:"ND_ROUTER_SOLICIT"`
}
