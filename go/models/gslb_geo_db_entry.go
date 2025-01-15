// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbGeoDbEntry gslb geo db entry
// swagger:model GslbGeoDbEntry
type GslbGeoDbEntry struct {

	// This is referred to FileObject that is associtated with the giveb geodb profile. It is a reference to an object of type FileObject. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FileObjRef *string `json:"file_obj_ref,omitempty"`

	// Priority of this geodb entry. This value should be unique in a repeated list of geodb entries.  Higher the value, then greater is the priority.  . Allowed values are 1-100. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Priority *uint32 `json:"priority,omitempty"`
}
