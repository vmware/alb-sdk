// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerParams controller params
// swagger:model ControllerParams
type ControllerParams struct {

	// Base timeout value for all controller-specific upgrade operation tasks. The timeout value for each task is a multiple of task_base_timeout. For example, SwitchAndReboot task timeout = [multiplier] * task_base_timeout. (The multiplier varies by task.). Allowed values are 300-3600. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskBaseTimeout *uint32 `json:"task_base_timeout,omitempty"`
}
