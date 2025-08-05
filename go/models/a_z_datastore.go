// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AZDatastore a z datastore
// swagger:model AZDatastore
type AZDatastore struct {

	// List of Managed object id of datastores. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DsIds []string `json:"ds_ids,omitempty"`

	// Include or exclude the datastores from the list. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Include *bool `json:"include,omitempty"`

	// Vcenter Id of the datastores. It is a reference to an object of type VCenterServer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VcenterRef *string `json:"vcenter_ref,omitempty"`
}
