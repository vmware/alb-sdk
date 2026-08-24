// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecGenerate Api spec generate
// swagger:model ApiSpecGenerate
type APISpecGenerate struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Number of tasks completed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompletedEvents *uint32 `json:"completed_events,omitempty"`

	// Spec generation duration in seconds. Field introduced in 32.1.4. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Time the spec generation completed or failed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Name of the spec generation object. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Parameters for the spec generation. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Params *APISpecGenerateParams `json:"params,omitempty"`

	// Path to the generated spec file. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	// Overall spec generation progress percentage. Allowed values are 0-100. Field introduced in 32.1.4. Unit is PERCENT. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Time the spec generation started. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// Current lifecycle state of the spec generation. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *APISpecGenerateState `json:"state,omitempty"`

	// Per-task status and event details. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TaskEvents []*TaskEventMap `json:"task_events,omitempty"`

	//  It is a reference to an object of type Tenant. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Total number of tasks. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalEvents *uint32 `json:"total_events,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the spec generation object. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
