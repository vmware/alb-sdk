// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOverviewResponse virtual service overview response
// swagger:model VirtualServiceOverviewResponse
type VirtualServiceOverviewResponse struct {

	// Full details about how WAAP is configured on this Virtual Service. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Detail *VirtualServiceOverviewDetail `json:"detail,omitempty"`

	// Whether this Virtual Service and its Service Engines are currently up. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Health *VsHealth `json:"health,omitempty"`

	// A list of recommendations, ordered by urgency. Field introduced in 32.1.4. Maximum of 512 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Recommendations []*VsRecommendation `json:"recommendations,omitempty"`

	// A quick overview — overall status and headline counts. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Summary *VirtualServiceOverviewSummary `json:"summary,omitempty"`

	// The Virtual Service this summary is for. It is a reference to an object of type VirtualService. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualserviceRef *string `json:"virtualservice_ref,omitempty"`
}
