// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesAssetDetails a l b services asset details
// swagger:model ALBServicesAssetDetails
type ALBServicesAssetDetails struct {

	// Asset ID corresponding to this Controller Cluster, returned on a successful registration. Field introduced in 22.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AssetID *string `json:"asset_id,omitempty"`

	// Email ID of the portal user. Field introduced in 22.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Email *string `json:"email,omitempty"`

	// Keyless license subscription details for the controller. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylessLicense *KeylessLicense `json:"keyless_license,omitempty"`

	// Site information for the controller registration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Site *ALBServicesSiteInfo `json:"site,omitempty"`

	// Name of the portal user. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserName *string `json:"user_name,omitempty"`
}
