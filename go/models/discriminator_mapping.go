// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiscriminatorMapping discriminator mapping
// swagger:model DiscriminatorMapping
type DiscriminatorMapping struct {

	// Key of the discriminator. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscriminatorKey *string `json:"discriminator_key,omitempty"`

	// Reference to the schema to which the discriminator value maps. It is a reference to an object of type ApiSchema. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SchemaRef *string `json:"schema_ref,omitempty"`
}
