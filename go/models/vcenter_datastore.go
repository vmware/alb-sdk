// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterDatastore vcenter datastore
// swagger:model VcenterDatastore
type VcenterDatastore struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	DatastoreName *string `json:"datastore_name"`
}
