// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsApicExtension vs apic extension
// swagger:model VsApicExtension
type VsApicExtension struct {

	//  Field deprecated in 21.1.1.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field deprecated in 21.1.1.
	// Required: true
	TxnUUID *string `json:"txn_uuid"`

	//  Field deprecated in 21.1.1.
	UUID *string `json:"uuid,omitempty"`

	//  Field deprecated in 21.1.1.
	Vnic []*VsSeVnic `json:"vnic,omitempty"`
}
