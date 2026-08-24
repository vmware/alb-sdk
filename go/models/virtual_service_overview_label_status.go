// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewLabelStatus virtual service overview label status
// swagger:model VirtualServiceOverviewLabelStatus
type VirtualServiceOverviewLabelStatus struct {

	// True if at least one active rule acts on this label. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionDefined *bool `json:"action_defined,omitempty"`

	// Every rule that refers to this label, including disabled ones, so they're easy to find and review. Field introduced in 32.1.4. Maximum of 256 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionLocations []*VirtualServiceOverviewActionLocation `json:"action_locations,omitempty"`

	// True if a rule refers to this label, but the label isn't applied to any traffic. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionWithoutApplication *bool `json:"action_without_application,omitempty"`

	// True if this label is currently applied to at least one API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppliedToEndpoints *bool `json:"applied_to_endpoints,omitempty"`

	// True if this label is applied to traffic, but no rule acts on it. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppliedWithoutAction *bool `json:"applied_without_action,omitempty"`

	// Number of API endpoints this label is directly applied to. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndpointCount *uint32 `json:"endpoint_count,omitempty"`

	// Name of the label. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelName *string `json:"label_name,omitempty"`

	// Computed enforcement state for this label, shared with the Label Visibility APIs (label_visibility.proto). A UI reads state for a status badge and, when state is LABEL_INACTIVE, reason for what's missing. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *LabelStatus `json:"status,omitempty"`

	// True if this label is defined but not applied anywhere. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Unused *bool `json:"unused,omitempty"`
}
