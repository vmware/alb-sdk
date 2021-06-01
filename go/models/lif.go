// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Lif lif
// swagger:model Lif
type Lif struct {

	//  Field deprecated in 21.1.1.
	Cifs []*Cif `json:"cifs,omitempty"`

	//  Field deprecated in 21.1.1.
	Lif *string `json:"lif,omitempty"`

	//  Field deprecated in 21.1.1.
	LifLabel *string `json:"lif_label,omitempty"`

	//  Field deprecated in 21.1.1.
	Subnet *string `json:"subnet,omitempty"`
}
