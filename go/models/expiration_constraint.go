// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ExpirationConstraint expiration constraint
// swagger:model ExpirationConstraint
type ExpirationConstraint struct {

	// Password expiry period in days. Defaults to 365 days. Allowed values are 30-730. Special values are 0- No password expiry.. Field introduced in 32.1.1. Unit is DAYS. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PasswordExpirationDays *uint32 `json:"password_expiration_days,omitempty"`
}
