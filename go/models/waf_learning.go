// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafLearning waf learning
// swagger:model WafLearning
type WafLearning struct {

	// Suffix Summarization threshold used to compress args. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ArgSummarizationThreshold *int32 `json:"arg_summarization_threshold,omitempty"`

	// Confidence level used to derive rules from the WAF learning. Allowed values are 60-100. Field deprecated in 18.2.3. Field introduced in 18.1.2. Unit is PERCENT. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Confidence *int32 `json:"confidence,omitempty"`

	// Enable Learning for WAF policy. Field deprecated in 18.2.3. Field introduced in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// Suffix Summarization threshold used to compress paths. Allowed values are 3-255. Field deprecated in 18.2.3. Field introduced in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PathSummarizationThreshold *int32 `json:"path_summarization_threshold,omitempty"`

	// Sampling percent of the requests subjected to WAF learning. Allowed values are 1-100. Field deprecated in 18.2.3. Field introduced in 18.1.2. Unit is PERCENT. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SamplingPercent *int32 `json:"sampling_percent,omitempty"`
}
