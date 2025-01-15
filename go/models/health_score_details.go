// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HealthScoreDetails health score details
// swagger:model HealthScoreDetails
type HealthScoreDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AnomalyPenalty *uint32 `json:"anomaly_penalty,omitempty"`

	// Reason for Anomaly Penalty. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AnomalyReason *string `json:"anomaly_reason,omitempty"`

	// Reason for Performance Score. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PerformanceReason *string `json:"performance_reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PerformanceScore *uint32 `json:"performance_score,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PreviousValue *float64 `json:"previous_value"`

	// Reason for the Health Score Change. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourcesPenalty *uint32 `json:"resources_penalty,omitempty"`

	// Reason for Resources Penalty. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourcesReason *string `json:"resources_reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecurityPenalty *uint32 `json:"security_penalty,omitempty"`

	// Reason for Security Threat Level. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecurityReason *string `json:"security_reason,omitempty"`

	// The step interval in seconds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Step *uint32 `json:"step,omitempty"`

	// Resource prefix containing entity information. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SubResourcePrefix *string `json:"sub_resource_prefix,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Timestamp *string `json:"timestamp"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Value *float64 `json:"value"`
}
