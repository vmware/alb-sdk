// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelStatus label status
// swagger:model LabelStatus
type LabelStatus struct {

	// Explains the INACTIVE state  what applying or enforcing this label is missing or disabled. Omitted for ACTIVE/UNUSED/DANGLING, which are self-explanatory. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Computed enforcement state for this label. Enum options - LABEL_ACTIVE, LABEL_INACTIVE, LABEL_UNUSED, LABEL_DANGLING. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
