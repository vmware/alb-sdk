// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLSessionCache s s l session cache
// swagger:model SSLSessionCache
type SSLSessionCache struct {

	// List of SSL session IDs. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheEntries []*SSLSessionCacheEntry `json:"cache_entries,omitempty"`

	// The uuid of the SE where this session cache is stored. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
