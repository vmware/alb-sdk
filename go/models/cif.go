// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Cif cif
// swagger:model Cif
type Cif struct {

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Adapter *string `json:"adapter,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Cif *string `json:"cif,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MacAddress *string `json:"mac_address,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Resources []string `json:"resources,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
