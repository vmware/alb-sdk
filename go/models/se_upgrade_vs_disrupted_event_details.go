// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeUpgradeVsDisruptedEventDetails se upgrade vs disrupted event details
// swagger:model SeUpgradeVsDisruptedEventDetails
type SeUpgradeVsDisruptedEventDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *string `json:"ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Notes []string `json:"notes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipID *string `json:"vip_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VsUUID *string `json:"vs_uuid"`
}
