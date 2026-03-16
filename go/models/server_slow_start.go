// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerSlowStart server slow start
// swagger:model ServerSlowStart
type ServerSlowStart struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CountLimit *uint32 `json:"count_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DeltaMaxConn *uint32 `json:"delta_max_conn"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DeltaTime *uint32 `json:"delta_time"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RefCount *uint32 `json:"ref_count"`
}
