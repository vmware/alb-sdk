// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelProfileDetail label profile detail
// swagger:model LabelProfileDetail
type LabelProfileDetail struct {

	// Number of labels defined in the label profile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelCount *uint32 `json:"label_count,omitempty"`

	// The label profile associated with this Virtual Service. It is a reference to an object of type LabelProfile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelProfileRef *string `json:"label_profile_ref,omitempty"`

	// Usage status for each label defined in the label profile. Field introduced in 32.1.4. Maximum of 256 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelStatuses []*VirtualServiceOverviewLabelStatus `json:"label_statuses,omitempty"`

	// Number of labels that are defined but not applied to any traffic. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnusedLabelCount *uint32 `json:"unused_label_count,omitempty"`
}
