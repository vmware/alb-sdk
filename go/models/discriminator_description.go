// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiscriminatorDescription discriminator description
// swagger:model DiscriminatorDescription
type DiscriminatorDescription struct {

	// Mapping of discriminator values to their corresponding schema descriptions. Field introduced in 32.2.1. Maximum of 32 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mapping []*DiscriminatorMapping `json:"mapping,omitempty"`

	// Name of the JSON property whose value determines which sub-schema applies. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PropertyName *string `json:"property_name,omitempty"`
}
