// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VinfraVcenterNetworkLimit vinfra vcenter network limit
// swagger:model VinfraVcenterNetworkLimit
type VinfraVcenterNetworkLimit struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	AdditionalReason *string `json:"additional_reason"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Current *int64 `json:"current"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Limit *int64 `json:"limit"`
}
