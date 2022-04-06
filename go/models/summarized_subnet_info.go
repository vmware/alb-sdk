// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SummarizedSubnetInfo summarized subnet info
// swagger:model SummarizedSubnetInfo
type SummarizedSubnetInfo struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	CidrPrefix *string `json:"cidr_prefix"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Network *string `json:"network"`
}
