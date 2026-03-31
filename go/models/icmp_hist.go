// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IcmpHist icmp hist
// swagger:model IcmpHist
type IcmpHist struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPALTHOSTADDR *uint64 `json:"ICMP_ALTHOSTADDR"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPECHOREPLY *uint64 `json:"ICMP_ECHOREPLY"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPECHOREQ *uint64 `json:"ICMP_ECHOREQ"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPIREQ *uint64 `json:"ICMP_IREQ"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPIREQREPLY *uint64 `json:"ICMP_IREQREPLY"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPMASKREPLY *uint64 `json:"ICMP_MASKREPLY"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPMASKREQ *uint64 `json:"ICMP_MASKREQ"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPPARAMPROB *uint64 `json:"ICMP_PARAMPROB"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPREDIRECT *uint64 `json:"ICMP_REDIRECT"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPROUTERADVERT *uint64 `json:"ICMP_ROUTERADVERT"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPROUTERSOLICIT *uint64 `json:"ICMP_ROUTERSOLICIT"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPSOURCEQUENCH *uint64 `json:"ICMP_SOURCEQUENCH"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPTIMXCEED *uint64 `json:"ICMP_TIMXCEED"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPTSTAMP *uint64 `json:"ICMP_TSTAMP"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPTSTAMPREPLY *uint64 `json:"ICMP_TSTAMPREPLY"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ICMPUNREACH *uint64 `json:"ICMP_UNREACH"`
}
