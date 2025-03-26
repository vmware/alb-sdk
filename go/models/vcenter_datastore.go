// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterDatastore vcenter datastore
// swagger:model VcenterDatastore
type VcenterDatastore struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DatastoreName *string `json:"datastore_name,omitempty"`

	// Will be used by default, if not set fallback to datastore_name. Field introduced in 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ManagedObjectID *string `json:"managed_object_id,omitempty"`
}
