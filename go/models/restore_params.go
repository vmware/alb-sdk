// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RestoreParams restore params
// swagger:model RestoreParams
type RestoreParams struct {

	// This flag is set to allow migration across version during controller restore operations. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableMigration *bool `json:"enable_migration,omitempty"`

	// Requested config file path. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	File *string `json:"file"`

	// The passphrase with which the configuration was exported. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Passphrase *string `json:"passphrase,omitempty"`

	// This flag is set to run the pre-checks without the subsequent restore operations. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrechecksOnly *bool `json:"prechecks_only,omitempty"`

	// This flag allows you to bypass the warning prechecks. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`

	// Type of the file. Enum options - JSON, BUNDLE. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`
}
