// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsRecommendation vs recommendation
// swagger:model VsRecommendation
type VsRecommendation struct {

	// A ready-to-display description of the recommendation, e.g. 'Application Insights is not configured — endpoint learning will not run for this VS.' Names the specific label and/or policy the recommendation is about, if applicable. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`

	// How urgently this recommendation needs attention. Enum options - RECOMMENDATION_SEVERITY_CRITICAL, RECOMMENDATION_SEVERITY_ALARM, RECOMMENDATION_SEVERITY_WARNING, RECOMMENDATION_SEVERITY_NOTICE, RECOMMENDATION_SEVERITY_INFO. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Severity *string `json:"severity,omitempty"`
}
