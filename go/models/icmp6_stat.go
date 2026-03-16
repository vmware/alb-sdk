// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Icmp6Stat icmp6 stat
// swagger:model Icmp6Stat
type Icmp6Stat struct {

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadcode *uint64 `json:"icp6s_badcode"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadlen *uint64 `json:"icp6s_badlen"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadna *uint64 `json:"icp6s_badna"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadns *uint64 `json:"icp6s_badns"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadra *uint64 `json:"icp6s_badra"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadredirect *uint64 `json:"icp6s_badredirect"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sBadrs *uint64 `json:"icp6s_badrs"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sCanterror *uint64 `json:"icp6s_canterror"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sChecksum *uint64 `json:"icp6s_checksum"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sError *uint64 `json:"icp6s_error"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sNdBadopt *uint64 `json:"icp6s_nd_badopt"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sNdToomanyopt *uint64 `json:"icp6s_nd_toomanyopt"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sPmtuchg *uint64 `json:"icp6s_pmtuchg"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sReflect *uint64 `json:"icp6s_reflect"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sToofreq *uint64 `json:"icp6s_toofreq"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Icp6sTooshort *uint64 `json:"icp6s_tooshort"`
}
