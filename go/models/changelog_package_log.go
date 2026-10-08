// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ChangelogPackageLog changelog package log
// swagger:model ChangelogPackageLog
type ChangelogPackageLog struct {

	// Keyed by release date (YYYY-MM-DD). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Versions map[string]ChangelogVersionEntry `json:"versions,omitempty"`
}
