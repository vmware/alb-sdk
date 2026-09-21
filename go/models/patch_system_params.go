// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PatchSystemParams patch system params
// swagger:model PatchSystemParams
type PatchSystemParams struct {

	// Image uuid for identifying controller patch image. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ControllerPatchRef *string `json:"controller_patch_ref"`

	// This flag is set to perform the upgrade dry-run operations. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dryrun *bool `json:"dryrun,omitempty"`

	// This flag is set to run the pre-checks without the subsequent upgrade operations. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrechecksOnly *bool `json:"prechecks_only,omitempty"`

	// SE Group options for the patch operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupOptions *SeGroupOptions `json:"se_group_options,omitempty"`

	// Image uuid for identifying SE patch image. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SePatchRef *string `json:"se_patch_ref"`

	// This is flag when set as true skips few optional must checks. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`
}
