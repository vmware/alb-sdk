// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TencentCredentials tencent credentials
// swagger:model TencentCredentials
type TencentCredentials struct {

	// Tencent secret ID. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	SecretID *string `json:"secret_id"`

	// Tencent secret key. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	SecretKey *string `json:"secret_key"`
}
