// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileObjectEventMap file object event map
// swagger:model FileObjectEventMap
type FileObjectEventMap struct {

	// Actual event informations. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskEvent []*FileObjectEvent `json:"task_event,omitempty"`

	// Name of the event task. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskName *string `json:"task_name,omitempty"`
}
