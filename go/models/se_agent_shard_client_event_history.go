// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentShardClientEventHistory se agent shard client event history
// swagger:model SeAgentShardClientEventHistory
type SeAgentShardClientEventHistory struct {

	// Shard Client event. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Events []string `json:"events,omitempty"`
}
