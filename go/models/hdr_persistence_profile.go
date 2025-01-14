// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HdrPersistenceProfile hdr persistence profile
// swagger:model HdrPersistenceProfile
type HdrPersistenceProfile struct {

	// Header name for custom header persistence. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrstHdrName *string `json:"prst_hdr_name,omitempty"`
}
