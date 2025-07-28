// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportEventParams tech support event params
// swagger:model TechSupportEventParams
type TechSupportEventParams struct {

	// Collect all events agnostic of duration, days and files. This flag will have higher precedence over duration, files and days. If flag is false then precedence given to duration passed while invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CollectAllEvents *bool `json:"collect_all_events,omitempty"`

	// Collect events for the specified number of past days. e.g. User specified 3, collect events for past 3 days. If have 20 files with 3 days old then collect on basis of specified number of files. Allowed values are 1-5. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Days *uint32 `json:"days,omitempty"`

	// Collect events for the specified number of files. e.g. User specified 5, collect atmost 5 events files. If have 10 files with 2 days old then collect only specified number of files. Allowed values are 1-10. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Files *uint32 `json:"files,omitempty"`
}
