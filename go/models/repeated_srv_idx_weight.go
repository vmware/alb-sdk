// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RepeatedSrvIdxWeight repeated srv idx weight
// swagger:model RepeatedSrvIdxWeight
type RepeatedSrvIdxWeight struct {

	//  Field introduced in 17.1.7,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Idx *uint32 `json:"idx,omitempty"`

	//  Field introduced in 17.1.7,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Weight *uint32 `json:"weight,omitempty"`
}
