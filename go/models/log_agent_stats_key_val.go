// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogAgentStatsKeyVal log agent stats key val
// swagger:model LogAgentStatsKeyVal
type LogAgentStatsKeyVal struct {

	// Statistics Name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatName *string `json:"stat_name,omitempty"`

	// Statistics Value. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatValue *uint64 `json:"stat_value,omitempty"`
}
