// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerSizingAPILimits controller sizing Api limits
// swagger:model ControllerSizingApiLimits
type ControllerSizingAPILimits struct {

	// API configuration limits for this controller sizing. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigLimits *APIConfigLimits `json:"config_limits,omitempty"`

	// API learning limits for this controller sizing. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LearningLimits *APILearningLimits `json:"learning_limits,omitempty"`

	// API metrics limits for this controller sizing. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsLimits *APIMetricsLimits `json:"metrics_limits,omitempty"`
}
