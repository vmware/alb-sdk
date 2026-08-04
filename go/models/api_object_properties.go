// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIObjectProperties Definition of an object schema property, including property name, schema constraints, requirement status, access mode, nullability, and deprecation status.
// swagger:model ApiObjectProperties
type APIObjectProperties struct {

	// Access mode for this property. Determines whether the property is read-write, read-only, or write-only. Enum options - API_PROPERTY_ACCESS_READ_WRITE, API_PROPERTY_ACCESS_READ_ONLY, API_PROPERTY_ACCESS_WRITE_ONLY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessMode *string `json:"access_mode,omitempty"`

	// Marks this property as deprecated. Requests containing this property are treated as a schema violation. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deprecated *bool `json:"deprecated,omitempty"`

	// Property name. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// When true, this property accepts a null value in addition to its declared type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nullable *bool `json:"nullable,omitempty"`

	// Marks this property as required within its parent object schema. A request body object missing this property is treated as a violation. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Required *bool `json:"required,omitempty"`

	// Schema description for this property, including type and validation rules. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Schema *APISimpleSchemaDescription `json:"schema"`
}
