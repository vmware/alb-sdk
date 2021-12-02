// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JWTValidationParams j w t validation params
// swagger:model JWTValidationParams
type JWTValidationParams struct {

	// Audience parameter used for validation using JWT token. Field introduced in 21.1.3.
	// Required: true
	Audience *string `json:"audience"`
}
