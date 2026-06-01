// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LearningDbCleanupEventDetails learning db cleanup event details
// swagger:model LearningDbCleanupEventDetails
type LearningDbCleanupEventDetails struct {

	// Error message if the cleanup failed for this database. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorMessage *string `json:"error_message,omitempty"`

	// Number of endpoint rows deleted for all VSes. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalNumEndpointRowsDeleted *uint32 `json:"total_num_endpoint_rows_deleted,omitempty"`

	// Size freed from the learning database. Field introduced in 32.2.1. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalSizeFreed *uint64 `json:"total_size_freed,omitempty"`

	// Details for each VS for which learning database cleanup was performed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsCleanupDetails []*LearningDbCleanupPerVsDetails `json:"vs_cleanup_details,omitempty"`
}
