// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPCookiePersistenceKey Http cookie persistence key
// swagger:model HttpCookiePersistenceKey
type HTTPCookiePersistenceKey struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AesKey *string `json:"aes_key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HmacKey *string `json:"hmac_key,omitempty"`

	// name to use for cookie encryption. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
