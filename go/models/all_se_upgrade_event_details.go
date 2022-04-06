// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AllSeUpgradeEventDetails all se upgrade event details
// swagger:model AllSeUpgradeEventDetails
type AllSeUpgradeEventDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Notes []string `json:"notes,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NumSe *int32 `json:"num_se"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumVs *int32 `json:"num_vs,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Request *SeUpgradeParams `json:"request,omitempty"`
}
