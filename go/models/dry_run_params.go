// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DryRunParams dry run params
// swagger:model DryRunParams
type DryRunParams struct {

	// Allow dry-run operation on single node controller. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AllowSingleNode *bool `json:"allow_single_node,omitempty"`

	// Amount of memory allocated for dry-run. Field introduced in 31.1.1. Unit is GB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Memory *float32 `json:"memory,omitempty"`

	// Number of CPU(s) allocated for dry-run. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NumCPU *uint32 `json:"num_cpu,omitempty"`

	// VM hostname of the preferred worker node. Example  node2.controller.local. When configured, dry-run is performed on specified node. When not configured, one of the follower node is elected for dry-run. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PreferredWorker *string `json:"preferred_worker,omitempty"`
}
