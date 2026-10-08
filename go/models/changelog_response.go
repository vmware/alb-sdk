// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ChangelogResponse changelog response
// swagger:model ChangelogResponse
type ChangelogResponse struct {

	// Keyed by package name (currently only 'openssl' is ever populated); documents the shape of the unwrapped top-level response object. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Packages map[string]ChangelogPackageLog `json:"packages,omitempty"`
}
