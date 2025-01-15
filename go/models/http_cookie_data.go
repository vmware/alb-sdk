// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPCookieData HTTP cookie data
// swagger:model HTTPCookieData
type HTTPCookieData struct {

	// Cookie name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Cookie value. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *string `json:"value,omitempty"`
}
