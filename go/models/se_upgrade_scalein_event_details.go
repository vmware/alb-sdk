// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeUpgradeScaleinEventDetails se upgrade scalein event details
// swagger:model SeUpgradeScaleinEventDetails
type SeUpgradeScaleinEventDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleinParams *VsScaleinParams `json:"scalein_params,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VsUUID *string `json:"vs_uuid"`
}
