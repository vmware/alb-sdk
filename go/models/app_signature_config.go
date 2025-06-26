// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AppSignatureConfig app signature config
// swagger:model AppSignatureConfig
type AppSignatureConfig struct {

	// Application Signature db sync interval in minutes. Allowed values are 1440-10080. Field introduced in 20.1.4. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition. Special default for Essentials edition is 1440, Basic edition is 1440, Enterprise edition is 1440.
	AppSignatureSyncInterval *uint32 `json:"app_signature_sync_interval,omitempty"`
}
