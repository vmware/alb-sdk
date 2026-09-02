// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationInsightsDetail application insights detail
// swagger:model ApplicationInsightsDetail
type ApplicationInsightsDetail struct {

	// The Application Insights configuration associated with this Virtual Service. It is a reference to an object of type ApplicationInsightsPolicy. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationInsightsRef *string `json:"application_insights_ref,omitempty"`

	// VS-level faults detected during endpoint learning for this Virtual Service — for example, endpoints rejected because the per-VS endpoint limit was exceeded. Empty if none were detected. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Faults []*WaapFault `json:"faults,omitempty"`

	// Whether traffic learning includes requests identified as bots. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LearnFromBotsEnabled *bool `json:"learn_from_bots_enabled,omitempty"`

	// Whether Application Insights is turned on for this Virtual Service. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LearningEnabled *bool `json:"learning_enabled,omitempty"`

	// Maximum percentage of traffic sampled for learning. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSamplingPercent *uint32 `json:"max_sampling_percent,omitempty"`

	// Whether traffic learning happens per URI path. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PerURILearningEnabled *bool `json:"per_uri_learning_enabled,omitempty"`
}
