// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLKeyMldsaParams s s l key mldsa params
// swagger:model SSLKeyMldsaParams
type SSLKeyMldsaParams struct {

	// MLDSA signature algorithm. Enum options - SSL_KEY_MLDSA44, SSL_KEY_MLDSA65, SSL_KEY_MLDSA87. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Algorithm *string `json:"algorithm,omitempty"`
}
