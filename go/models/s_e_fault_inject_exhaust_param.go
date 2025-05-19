// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SEFaultInjectExhaustParam s e fault inject exhaust param
// swagger:model SEFaultInjectExhaustParam
type SEFaultInjectExhaustParam struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Leak *bool `json:"leak,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Num *uint64 `json:"num"`
}
