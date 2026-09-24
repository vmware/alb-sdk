// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserTokenCheckoutResponse user token checkout response
// swagger:model UserTokenCheckoutResponse
type UserTokenCheckoutResponse struct {

	// The generated token key (secret). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Token *string `json:"token,omitempty"`

	// Username the token was issued for. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	User *string `json:"user,omitempty"`
}
