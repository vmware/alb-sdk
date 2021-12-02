// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptReplEventInfo adapt repl event info
// swagger:model AdaptReplEventInfo
type AdaptReplEventInfo struct {

	// Object config version info. Field introduced in 21.1.3.
	ObjInfo *ConfigVersionStatus `json:"obj_info,omitempty"`

	// Reason for the replication issues. Field introduced in 21.1.3.
	Reason *string `json:"reason,omitempty"`

	// Recommended way to resolve replication issue. Field introduced in 21.1.3.
	Recommendation *string `json:"recommendation,omitempty"`
}
