// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CLSStatus c l s status
// swagger:model CLSStatus
type CLSStatus struct {

	// CLS Id. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClsID *string `json:"cls_id,omitempty"`

	// UUID of the SSP instance for CLS licensing. It is a reference to an object of type SspInstance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClsRef *string `json:"cls_ref,omitempty"`

	// CLS connectivity status. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Connected *bool `json:"connected,omitempty"`

	// Whether CLS is enabled. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Timestamp of last attempted license refresh from CLS. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RefreshedAt *string `json:"refreshed_at,omitempty"`

	// Timestamp of last successful license usage upload to CLS. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsageUploadedAt *string `json:"usage_uploaded_at,omitempty"`
}
