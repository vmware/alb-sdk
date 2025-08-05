// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ArchivePolicy archive policy
// swagger:model ArchivePolicy
type ArchivePolicy struct {

	// Specify a file path to add archive rule. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FilePath *string `json:"file_path,omitempty"`

	// Specify a threshold for file path in MB. Field introduced in 31.2.1. Unit is MB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Threshold *uint32 `json:"threshold,omitempty"`
}
