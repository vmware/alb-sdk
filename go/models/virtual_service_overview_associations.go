// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewAssociations virtual service overview associations
// swagger:model VirtualServiceOverviewAssociations
type VirtualServiceOverviewAssociations struct {

	// The API policy associated with this Virtual Service, if any. It is a reference to an object of type ApiPolicy. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicyRef *string `json:"api_policy_ref,omitempty"`

	// The Application Insights configuration associated with this Virtual Service, if any. It is a reference to an object of type ApplicationInsightsPolicy. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationInsightsRef *string `json:"application_insights_ref,omitempty"`

	// The label profile associated with this Virtual Service, if any. It is a reference to an object of type LabelProfile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelProfileRef *string `json:"label_profile_ref,omitempty"`
}
