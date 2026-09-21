// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PatchSeGroupParams patch se group params
// swagger:model PatchSeGroupParams
type PatchSeGroupParams struct {

	// This flag is set to run the pre-checks without the subsequent upgrade operations. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrechecksOnly *bool `json:"prechecks_only,omitempty"`

	// SE Group options for the patch operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupOptions *SeGroupOptions `json:"se_group_options,omitempty"`

	// SE Groups subjected to patch operations. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.6. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeGroupRefs []string `json:"se_group_refs,omitempty"`

	// Image uuid for identifying SE patch image. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePatchRef *string `json:"se_patch_ref,omitempty"`

	// This is flag when set as true skips few optional must checks. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`
}
