// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeMigrateProgress se migrate progress
// swagger:model SeMigrateProgress
type SeMigrateProgress struct {

	// Number of Virtual Services that have successfully completed migration off this SE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsCompleted *uint32 `json:"num_vs_completed,omitempty"`

	// Number of Virtual Services that failed to migrate off this SE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsFailed *uint32 `json:"num_vs_failed,omitempty"`

	// Total number of Virtual Services that need to be migrated off this SE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsTotal *uint32 `json:"num_vs_total,omitempty"`
}
