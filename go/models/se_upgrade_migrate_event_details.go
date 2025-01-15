// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeUpgradeMigrateEventDetails se upgrade migrate event details
// swagger:model SeUpgradeMigrateEventDetails
type SeUpgradeMigrateEventDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MigrateParams *VsMigrateParams `json:"migrate_params,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VsUUID *string `json:"vs_uuid"`
}
