// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GeoDbEntry geo db entry
// swagger:model GeoDbEntry
type GeoDbEntry struct {

	// Geodb Filename in the Avi supported formats. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Filename *string `json:"filename,omitempty"`

	// Number of entries read from this Geo db file. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEntries *uint32 `json:"num_entries,omitempty"`

	// Number of parse errors for this Geo db file. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumErrors *uint32 `json:"num_errors,omitempty"`

	// Number of prefixes read from this Geo db file. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPrefixes *uint32 `json:"num_prefixes,omitempty"`

	// Priority of this Geo db file. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Priority *uint32 `json:"priority,omitempty"`
}
