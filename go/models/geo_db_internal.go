// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GeoDbInternal geo db internal
// swagger:model GeoDbInternal
type GeoDbInternal struct {

	// Geo Db entries. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DbEntries []*GeoDbEntry `json:"db_entries,omitempty"`

	// Flag to indicate if Db update is in progress. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DbUpdateInProgress *bool `json:"db_update_in_progress,omitempty"`

	// File error type. Enum options - NO_ERROR, FILE_ERROR, FILE_FORMAT_ERROR, FILE_NO_RESOURCES. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// File having an error. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorFile *string `json:"error_file,omitempty"`

	// Geo Db Profile Name. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Geo Db Profile UUID. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
