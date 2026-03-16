// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GeoDbLocationInfo geo db location info
// swagger:model GeoDbLocationInfo
type GeoDbLocationInfo struct {

	// The Geo entries in the database. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entries []*GeoDbLocationEntry `json:"entries,omitempty"`

	// The UUID of the SE containing this set of entries. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
