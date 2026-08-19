// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewDetail virtual service overview detail
// swagger:model VirtualServiceOverviewDetail
type VirtualServiceOverviewDetail struct {

	// Details about the API policy configured for this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicy *APIPolicyDetail `json:"api_policy,omitempty"`

	// Details about the Application Insights configuration for this Virtual Service. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationInsights *ApplicationInsightsDetail `json:"application_insights,omitempty"`

	// Details about every policy that can act on WAAP labels. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L7Policies *L7PoliciesDetail `json:"l7_policies,omitempty"`

	// Details about the label profile and how its labels are being used. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelProfile *LabelProfileDetail `json:"label_profile,omitempty"`
}
