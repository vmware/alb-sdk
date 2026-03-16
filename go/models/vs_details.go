// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsDetails vs details
// swagger:model VsDetails
type VsDetails struct {

	//  Field introduced in 17.1.6,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsName *string `json:"vs_name,omitempty"`

	//  Field introduced in 17.1.6,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
