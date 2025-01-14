// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VinfraVcenterNetworkLimit vinfra vcenter network limit
// swagger:model VinfraVcenterNetworkLimit
type VinfraVcenterNetworkLimit struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AdditionalReason *string `json:"additional_reason"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Current *int64 `json:"current"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Limit *int64 `json:"limit"`
}
