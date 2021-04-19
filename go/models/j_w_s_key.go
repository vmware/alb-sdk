// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JWSKey j w s key
// swagger:model JWSKey
type JWSKey struct {

	// Algorithm that need to be used while signing/validation. Field introduced in 20.1.5.
	Alg *string `json:"alg,omitempty"`

	// Secret JWK for signing. Field introduced in 20.1.5.
	// Required: true
	Key *string `json:"key"`

	// Unique key id for the key. Field introduced in 20.1.5.
	// Required: true
	Kid *string `json:"kid"`

	// Secret key type/format. Field introduced in 20.1.5.
	Kty *string `json:"kty,omitempty"`
}
