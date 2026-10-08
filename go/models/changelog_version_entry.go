// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ChangelogVersionEntry changelog version entry
// swagger:model ChangelogVersionEntry
type ChangelogVersionEntry struct {

	// Changelog description lines for this release. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description []string `json:"description,omitempty"`
}
