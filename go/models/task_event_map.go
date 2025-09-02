// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TaskEventMap task event map
// swagger:model TaskEventMap
type TaskEventMap struct {

	// List of all events node wise. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NodesEvents []*TaskEvent `json:"nodes_events,omitempty"`

	// List of all events node wise. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SubEvents []*TaskEvent `json:"sub_events,omitempty"`

	// Name representing the task. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskName *string `json:"task_name,omitempty"`
}
