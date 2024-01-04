// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryConfig inventory config
// swagger:model InventoryConfig
type InventoryConfig struct {

	// Allow inventory stats to be regularly sent to pulse portal. Field introduced in 22.1.3. Allowed in Enterprise edition with any value, Essentials edition with any value, Basic edition with any value, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// Names, IP's of VS, Pool(PoolGroup) servers would be searchable on Cloud console. Field introduced in 22.1.6. Allowed in Enterprise edition with any value, Essentials edition with any value, Basic edition with any value, Enterprise with Cloud Services edition.
	EnableSearchInfo *bool `json:"enable_search_info,omitempty"`
}
