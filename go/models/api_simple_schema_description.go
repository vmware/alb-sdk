// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISimpleSchemaDescription Api simple schema description
// swagger:model ApiSimpleSchemaDescription
type APISimpleSchemaDescription struct {

	// Maximum allowed value for integer and number types (inclusive by default). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxValue *float64 `json:"max_value,omitempty"`

	// Minimum allowed value for integer and number types (inclusive by default). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinValue *float64 `json:"min_value,omitempty"`

	// UUID of the referenced ApiSchema object. Used when type is SCHEMA_TYPE_REFERENCE, equivalent to $ref in OpenAPI. It is a reference to an object of type ApiSchema. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SchemaRef *string `json:"schema_ref,omitempty"`

	// If set, this is a list of all possible values for this string. Field introduced in 32.2.1. Maximum of 1024 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringEnumValues []string `json:"string_enum_values,omitempty"`

	// Predefined *string formats (e.g., email, URI, UUID). Enum options - API_STRING_FORMAT_NONE, API_STRING_FORMAT_ENUM, API_STRING_FORMAT_PATTERN, API_STRING_FORMAT_UUID, API_STRING_FORMAT_IPV4, API_STRING_FORMAT_IPV6, API_STRING_FORMAT_URI, API_STRING_FORMAT_URL, API_STRING_FORMAT_DATE, API_STRING_FORMAT_DATE_TIME, API_STRING_FORMAT_EMAIL, API_STRING_FORMAT_HOSTNAME, API_STRING_FORMAT_PASSWORD, API_STRING_FORMAT_BINARY, API_STRING_FORMAT_BYTE, API_STRING_FORMAT_TIME, API_STRING_FORMAT_DURATION, API_STRING_FORMAT_URI_REFERENCE, API_STRING_FORMAT_URI_TEMPLATE, API_STRING_FORMAT_JSON_POINTER.... Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringFormat *string `json:"string_format,omitempty"`

	// Maximum allowed length for *string values. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringMaxLength *uint32 `json:"string_max_length,omitempty"`

	// Minimum allowed length for *string values. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringMinLength *uint32 `json:"string_min_length,omitempty"`

	// If set, this is a regular expression which must match the string. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringPattern *string `json:"string_pattern,omitempty"`

	// The data type for this schema element. Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL, SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`
}
