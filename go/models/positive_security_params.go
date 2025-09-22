// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PositiveSecurityParams positive security params
// swagger:model PositiveSecurityParams
type PositiveSecurityParams struct {

	// Configure thresholds for the confidence labels defined by AppLearningConfidenceLabel. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ConfidenceOverride *AppLearningConfidenceOverride `json:"confidence_override,omitempty"`

	// Maximum number of parameters per URI programmed for an application. Allowed values are 10-1000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxParams *uint32 `json:"max_params,omitempty"`

	// Maximum number of URIs programmed for an application. Allowed values are 10-10000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxUris *uint32 `json:"max_uris,omitempty"`

	// Minimum confidence label required for positive security rule updates. Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinConfidence *string `json:"min_confidence,omitempty"`

	// Minimum number of occurances required for a Param to qualify for programming into a PSM rule. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinHitsToProgram *uint64 `json:"min_hits_to_program,omitempty"`
}
