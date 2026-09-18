// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesAssetResponse a l b services asset response
// swagger:model ALBServicesAssetResponse
type ALBServicesAssetResponse struct {

	// Asset contact information returned by cloud. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContactInfo *ALBServicesUser `json:"contact_info,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Error *Error `json:"error,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ID *string `json:"id,omitempty"`

	// Account details to which asset is registered in the cloud. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ManagedAccount *ALBServicesAccount `json:"managed_account,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatusCode *uint32 `json:"status_code,omitempty"`
}
