// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ShardClientDomainEntry shard client domain entry
// swagger:model ShardClientDomainEntry
type ShardClientDomainEntry struct {

	//  Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Domain *string `json:"domain,omitempty"`

	//  Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeEntries []string `json:"se_entries,omitempty"`
}
