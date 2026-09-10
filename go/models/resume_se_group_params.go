// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ResumeSeGroupParams resume se group params
// swagger:model ResumeSeGroupParams
type ResumeSeGroupParams struct {

	// This flag is set to run the pre-checks without the subsequent upgrade operations. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrechecksOnly *bool `json:"prechecks_only,omitempty"`

	// SE Group options for resume operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupOptions *SeGroupResumeOptions `json:"se_group_options,omitempty"`

	// SE Group uuids for resuming upgrade. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.6. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupRefs []string `json:"se_group_refs,omitempty"`

	// This is flag when set as true skips few optional must checks. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`
}
