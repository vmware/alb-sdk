// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Report report
// swagger:model Report
type Report struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Time taken to complete report generation in seconds. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// End time of the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Name of the report artifact on reports repository. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Filename *string `json:"filename,omitempty"`

	// Name of the report. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Cluster member node on which the report is processed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Node *string `json:"node,omitempty"`

	// Pre-check details for the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PreCheck *ReadinessCheckObj `json:"pre_check,omitempty"`

	// Percentage of tasks completed. Allowed values are 0-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Request for the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Request *ReportGenerationRequest `json:"request,omitempty"`

	// Start time of the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// State of the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *ReportGenState `json:"state,omitempty"`

	// List of tasks associated with the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Tasks []*TaskEventMap `json:"tasks,omitempty"`

	// No. of tasks completed. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TasksCompleted *uint32 `json:"tasks_completed,omitempty"`

	// Tenant UUID of the report generation. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Total no. of tasks. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TotalTasks *uint32 `json:"total_tasks,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID Identifier for the report generation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
