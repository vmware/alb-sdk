// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VersionInfo version info
// swagger:model VersionInfo
type VersionInfo struct {

	// Identifies the datastore table . Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsName *string `json:"ds_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ops *string `json:"ops,omitempty"`

	// Describes the reason for the object in this state. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Represents the state of the object. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Status *uint32 `json:"status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
