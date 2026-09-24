// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CheckPasswordResponse check password response
// swagger:model CheckPasswordResponse
type CheckPasswordResponse struct {

	// True if the supplied username/password (or username/token) pair authenticated successfully. On failure, a generic 'Invalid controller credentials' error is returned instead of this body, deliberately indistinguishable for wrong-password, unknown-user, and locked-out-account cases. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Authenticate *bool `json:"authenticate,omitempty"`
}
