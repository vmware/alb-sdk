// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SEFaultInjectExhaustParam s e fault inject exhaust param
// swagger:model SEFaultInjectExhaustParam
type SEFaultInjectExhaustParam struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Leak *bool `json:"leak,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Num *int64 `json:"num"`
}
