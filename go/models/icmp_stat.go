// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IcmpStat icmp stat
// swagger:model IcmpStat
type IcmpStat struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsBadaddr *uint64 `json:"icps_badaddr"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsBadcode *uint64 `json:"icps_badcode"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsBadlen *uint64 `json:"icps_badlen"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsBmcastecho *uint64 `json:"icps_bmcastecho"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsBmcasttstamp *uint64 `json:"icps_bmcasttstamp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsChecksum *uint64 `json:"icps_checksum"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsError *uint64 `json:"icps_error"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsNoroute *uint64 `json:"icps_noroute"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsOldicmp *uint64 `json:"icps_oldicmp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsOldshort *uint64 `json:"icps_oldshort"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsReflect *uint64 `json:"icps_reflect"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcpsTooshort *uint64 `json:"icps_tooshort"`
}
