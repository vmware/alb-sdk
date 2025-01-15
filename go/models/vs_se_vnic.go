// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsSeVnic vs se vnic
// swagger:model VsSeVnic
type VsSeVnic struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Lif *string `json:"lif,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mac *string `json:"mac"`

	//  Enum options - VNIC_TYPE_FE, VNIC_TYPE_BE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`
}
