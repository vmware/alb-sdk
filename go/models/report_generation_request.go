// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReportGenerationRequest report generation request
// swagger:model ReportGenerationRequest
type ReportGenerationRequest struct {

	// The duration of the report. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Duration *ReportDuration `json:"duration,omitempty"`

	// Custom name for the report. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// The parameters of the report. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Parameters []*ReportParameter `json:"parameters,omitempty"`

	// The report to be generated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Report *string `json:"report"`

	// IDs of specified sections are collected as part of the report. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Sections []*ReportSection `json:"sections,omitempty"`
}
