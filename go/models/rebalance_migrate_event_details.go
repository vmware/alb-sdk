// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RebalanceMigrateEventDetails rebalance migrate event details
// swagger:model RebalanceMigrateEventDetails
type RebalanceMigrateEventDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MigrateParams *VsMigrateParams `json:"migrate_params,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	VsUUID *string `json:"vs_uuid"`
}
