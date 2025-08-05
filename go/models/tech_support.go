// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupport tech support
// swagger:model TechSupport
type TechSupport struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// 'Customer case number for which this techsupport is generated. ''Useful for connected portal and other use-cases.'. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CaseNumber *string `json:"case_number,omitempty"`

	// User provided description to capture additional details and context regarding the techsupport invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Total time taken for techsupport collection. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// End timestamp of techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Error logged during techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Errors []string `json:"errors,omitempty"`

	// Name of the techsupport level. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Level *string `json:"level,omitempty"`

	// Name of techsupport invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Cluster member node on which the techsupport tarball bundle is saved. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Node *string `json:"node,omitempty"`

	// Object name if one exists. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjName *string `json:"obj_name,omitempty"`

	// Techsupport collection object uuid specified for different objects such as SE/VS/Pool etc. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// Techsupport collection output file path. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Output *string `json:"output,omitempty"`

	// Techsupport params associated with latest techsupport collection. User passed params will have more preference. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Params *TechSupportParams `json:"params,omitempty"`

	// Techsupport collection progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Size of collected techsupport tarball. Field introduced in 31.2.1. Unit is MB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Size *float64 `json:"size,omitempty"`

	// Start timestamp of techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// State of current/last techsupport invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *TechSupportState `json:"state,omitempty"`

	// Events performed for techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Tasks []*TechSupportEventMap `json:"tasks,omitempty"`

	// Completed set of tasks in the techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TasksCompleted *int32 `json:"tasks_completed,omitempty"`

	// Techsupport readiness checks execution details. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TechsupportReadiness *ReadinessCheckObj `json:"techsupport_readiness,omitempty"`

	// Tenant UUID associated with the techsupport. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Total number of tasks in the techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TotalTasks *int32 `json:"total_tasks,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID Identifier for the techsupport invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Warning logged during techsupport collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Warnings []string `json:"warnings,omitempty"`
}
