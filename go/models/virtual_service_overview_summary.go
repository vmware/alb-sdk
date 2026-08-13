// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewSummary virtual service overview summary
// swagger:model VirtualServiceOverviewSummary
type VirtualServiceOverviewSummary struct {

	// Number of labels that a rule refers to, but that aren't applied to any traffic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionWithoutApplicationCount *uint32 `json:"action_without_application_count,omitempty"`

	// Number of labels that are applied to traffic but aren't used by any rule. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppliedWithoutActionCount *uint32 `json:"applied_without_action_count,omitempty"`

	// The label profile, API policy, and Application Insights configuration associated with this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Associations *VirtualServiceOverviewAssociations `json:"associations,omitempty"`

	// Number of recommendations listed in recommendations. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RecommendationCount *uint32 `json:"recommendation_count,omitempty"`

	// Overall health for this Virtual Service, at a glance. Enum options - VS_NOT_CONFIGURED, VS_HEALTHY, VS_NEEDS_ATTENTION, VS_ALARM, VS_CRITICAL. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Number of label names referenced by a rule that don't exist in the label profile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownActionLabelCount *uint32 `json:"unknown_action_label_count,omitempty"`
}
