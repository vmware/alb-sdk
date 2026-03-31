// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserDefinedCounter user defined counter
// swagger:model UserDefinedCounter
type UserDefinedCounter struct {

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Enum options - METRICTYPE_COUNTER, METRICTYPE_GAUGE, METRICTYPE_OTHER. Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *uint64 `json:"value,omitempty"`
}
