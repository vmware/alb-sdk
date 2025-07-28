// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ArchiveRules archive rules
// swagger:model ArchiveRules
type ArchiveRules struct {

	// Archive policy for file path to have specific threshold. Techsupport will skip collection of file if file size is greater than threshold. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Rules []*ArchivePolicy `json:"rules,omitempty"`
}
