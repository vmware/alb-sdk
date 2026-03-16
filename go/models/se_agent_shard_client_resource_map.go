// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentShardClientResourceMap se agent shard client resource map
// swagger:model SeAgentShardClientResourceMap
type SeAgentShardClientResourceMap struct {

	// Construct to pass information from ShardClient. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainEntries []*ShardClientDomainEntry `json:"domain_entries,omitempty"`

	// States if the Shard Client is in headless mode. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeadlessMode *bool `json:"headless_mode,omitempty"`
}
