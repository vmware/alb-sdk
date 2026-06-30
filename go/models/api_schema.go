// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISchema Api schema
// swagger:model ApiSchema
type APISchema struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Action to take on unspecified keys in an object. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdditionalObjectKeyAction *string `json:"additional_object_key_action,omitempty"`

	// Schema for the additional properties. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdditionalPropertiesSchema *APISimpleSchemaDescription `json:"additional_properties_schema,omitempty"`

	// Whether this schema allows additional properties. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllowAdditionalProperties *bool `json:"allow_additional_properties,omitempty"`

	// If the type is array, this is the type of the array items. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArrayItemType *APISimpleSchemaDescription `json:"array_item_type,omitempty"`

	// List of types that are part of the oneof, any_of or all_of. Field introduced in 32.2.1. Maximum of 64 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompositeTypes []*APISimpleSchemaDescription `json:"composite_types,omitempty"`

	// Description of this API schema. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Discriminator for the composite types. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Discriminator *DiscriminatorDescription `json:"discriminator,omitempty"`

	// Maximum number of items allowed in an array. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxItems *uint32 `json:"max_items,omitempty"`

	// Minimum number of items allowed in an array. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinItems *uint32 `json:"min_items,omitempty"`

	// Name of this object, unique per Tenant. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// List of properties for this object schema. Field introduced in 32.2.1. Maximum of 512 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjectProperties []*APIObjectProperties `json:"object_properties,omitempty"`

	// Source of the API schema. Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Source *string `json:"source,omitempty"`

	//  It is a reference to an object of type Tenant. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// The data type of this schema. Can be object, array, or a composite type (oneOf, anyOf, allOf). Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL, SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	// If true, all items in the array must be unique. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UniqueItems *bool `json:"unique_items,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The object UUID. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
