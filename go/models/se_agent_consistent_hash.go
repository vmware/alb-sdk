// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentConsistentHash se agent consistent hash
// swagger:model SeAgentConsistentHash
type SeAgentConsistentHash struct {

	// Message to pass information from Consistent Hash. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entries []*ConsistentHashEntry `json:"entries,omitempty"`
}
