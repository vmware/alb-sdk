// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TaskEventHistory task event history
// swagger:model TaskEventHistory
type TaskEventHistory struct {

	// API specification information captured at the time of processing. Populated for Open API Specification file objects only. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SpecInfo *string `json:"spec_info,omitempty"`

	// State of the file object for the version specified. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *FileObjectState `json:"state,omitempty"`

	// File Object processing events for the version specified. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TaskEvents []*TaskEventMap `json:"task_events,omitempty"`

	// Version of the file object. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
