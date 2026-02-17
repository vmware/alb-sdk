// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ComplexityConstraint complexity constraint
// swagger:model ComplexityConstraint
type ComplexityConstraint struct {

	// Minimum password length. Defaults to 15 characters. Allowed values are 8-64. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinLength *uint32 `json:"min_length,omitempty"`

	// Minimum number of lowercase characters required. Allowed values are 0-10. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinLowercase *uint32 `json:"min_lowercase,omitempty"`

	// Minimum number of numeric characters required. Allowed values are 0-10. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinNumeric *uint32 `json:"min_numeric,omitempty"`

	// Minimum number of special characters required. Allowed values are 0-10. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinSpecial *uint32 `json:"min_special,omitempty"`

	// Minimum number of uppercase characters required. Allowed values are 0-10. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinUppercase *uint32 `json:"min_uppercase,omitempty"`

	// Number of previous passwords to remember. Defaults to 5. Allowed values are 1-10. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PasswordHistory *uint32 `json:"password_history,omitempty"`
}
