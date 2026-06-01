// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LearningDbCleanupPerVsDetails learning db cleanup per vs details
// swagger:model LearningDbCleanupPerVsDetails
type LearningDbCleanupPerVsDetails struct {

	// Number of endpoint rows deleted for this VS. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEndpointRowsDeleted *uint32 `json:"num_endpoint_rows_deleted,omitempty"`

	// VirtualService UUID for which learning database cleanup was performed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
