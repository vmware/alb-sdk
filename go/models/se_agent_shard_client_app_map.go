// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentShardClientAppMap se agent shard client app map
// swagger:model SeAgentShardClientAppMap
type SeAgentShardClientAppMap struct {

	// Message to retrieve domain to vs information. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainVsEntries []*DomainVsMapEntry `json:"domain_vs_entries,omitempty"`
}
