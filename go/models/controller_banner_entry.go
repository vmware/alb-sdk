// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerBannerEntry controller banner entry
// swagger:model ControllerBannerEntry
type ControllerBannerEntry struct {

	// Human-readable fault description. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Description *string `json:"description"`

	// Fault identifier or name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Originating fault category, e.g. LICENSE, CLUSTER, MIGRATION, BACKUP_SCHEDULER, SSLPROFILE, DEPRECATED_API_VERSION, SYSTEM_LIMITS, PORTAL_CONNECTOR. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Service *string `json:"service"`

	// Fault severity  ERROR, WARN, or INFO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Severity *string `json:"severity"`
}
