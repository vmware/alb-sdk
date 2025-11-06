// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AppQuotaConfig app quota config
// swagger:model AppQuotaConfig
type AppQuotaConfig struct {

	// Maximum number of Virtual Services allowed for this tenant. -1 as Default is maximum value, set to 0 to disallow any VS creation. Allowed values are -1-+65535. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsLimit *int32 `json:"vs_limit,omitempty"`
}
