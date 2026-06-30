// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ParameterDescription parameter description
// swagger:model ParameterDescription
type ParameterDescription struct {

	// When false, a parameter present with an empty value (e.g. ?foo=) is treated as a schema violation. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllowEmptyValue *bool `json:"allow_empty_value,omitempty"`

	// Marks this parameter as deprecated. When a deprecated parameter is received in a request, it is treated as a schema violation and will be learned but not logged. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deprecated *bool `json:"deprecated,omitempty"`

	// Name of the parameter. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Marks this parameter as mandatory. A missing parameter is treated as a violation; enforcement depends on the missing-mandatory action configured for its location (query or header). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Required *bool `json:"required,omitempty"`

	// Schema description for this parameter. If the schema is not known, use SCHEMA_TYPE_UNDEFINED. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Schema *APISimpleSchemaDescription `json:"schema"`
}
