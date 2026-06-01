// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIObjectProperties Api object properties
// swagger:model ApiObjectProperties
type APIObjectProperties struct {

	// Access mode for this property. Determines whether the property is read-write, read-only, or write-only. Enum options - API_PROPERTY_ACCESS_READ_WRITE, API_PROPERTY_ACCESS_READ_ONLY, API_PROPERTY_ACCESS_WRITE_ONLY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessMode *string `json:"access_mode,omitempty"`

	// Whether this property is deprecated. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deprecated *bool `json:"deprecated,omitempty"`

	// Property name. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Whether this property is nullable. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nullable *bool `json:"nullable,omitempty"`

	// Whether this property is required. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Required *bool `json:"required,omitempty"`

	// Schema description for this property, including type and validation rules. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Schema *APISimpleSchemaDescription `json:"schema"`
}
