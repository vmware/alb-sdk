// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReportSection report section
// swagger:model ReportSection
type ReportSection struct {

	// The id of the section. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	ID *string `json:"id"`

	// The sub sections of the section. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SubSections []*ReportSubSection `json:"sub_sections,omitempty"`
}
