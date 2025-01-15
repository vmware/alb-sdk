// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DryrunInfo dryrun info
// swagger:model DryrunInfo
type DryrunInfo struct {

	// Duration of dry-run operation in seconds. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *int32 `json:"duration,omitempty"`

	// End time of dry-run operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *string `json:"end_time,omitempty"`

	// Dryrun operations requested. Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH, EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE, UPGRADE_DRYRUN. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Operation *string `json:"operation,omitempty"`

	// Parameters for performing the dry-run operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Params *UpgradeParams `json:"params,omitempty"`

	// Dry-run operations progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 31.1.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Progress *uint32 `json:"progress,omitempty"`

	// Start time of dry-run operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// Current status of the dry-run operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *UpgradeOpsState `json:"state,omitempty"`

	// Completed set of tasks in the Upgrade operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TasksCompleted *int32 `json:"tasks_completed,omitempty"`

	// Total number of tasks in the Upgrade operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TotalTasks *int32 `json:"total_tasks,omitempty"`

	// Controller events for dry-run operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UpgradeEvents []*EventMap `json:"upgrade_events,omitempty"`

	// Node on which the dry-run is performed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Worker *string `json:"worker,omitempty"`
}
