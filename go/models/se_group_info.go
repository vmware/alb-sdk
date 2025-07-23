// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeGroupInfo se group info
// swagger:model SeGroupInfo
type SeGroupInfo struct {

	// License cores consumed by se group. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Consumed *float64 `json:"consumed,omitempty"`

	// License cores reserved by se group. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Escrow *float64 `json:"escrow,omitempty"`

	// Se group uuid for reference. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
