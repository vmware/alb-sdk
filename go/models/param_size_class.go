// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ParamSizeClass param size class
// swagger:model ParamSizeClass
type ParamSizeClass struct {

	// Indicates the number of hits for this parameter size. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	// Indicates the size of the parameter. Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Len *string `json:"len,omitempty"`
}
