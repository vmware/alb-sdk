// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Cif cif
// swagger:model Cif
type Cif struct {

	//  Field deprecated in 21.1.1.
	Adapter *string `json:"adapter,omitempty"`

	//  Field deprecated in 21.1.1.
	Cif *string `json:"cif,omitempty"`

	//  Field deprecated in 21.1.1.
	MacAddress *string `json:"mac_address,omitempty"`

	//  Field deprecated in 21.1.1.
	Resources []string `json:"resources,omitempty"`

	//  Field deprecated in 21.1.1.
	SeUUID *string `json:"se_uuid,omitempty"`
}
