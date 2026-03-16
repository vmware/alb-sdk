// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SwitchoverInfo switchover info
// swagger:model SwitchoverInfo
type SwitchoverInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewPrimaryName *string `json:"new_primary_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewPrimaryUUID *string `json:"new_primary_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldPrimaryName *string `json:"old_primary_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldPrimaryUUID *string `json:"old_primary_uuid,omitempty"`
}
