// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpgradeParams upgrade params
// swagger:model UpgradeParams
type UpgradeParams struct {

	// Image uuid for identifying Controller patch. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerPatchRef *string `json:"controller_patch_ref,omitempty"`

	// This flag is set to perform the upgrade dry-run operations. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Dryrun *bool `json:"dryrun,omitempty"`

	// Image uuid for identifying base image. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageRef *string `json:"image_ref,omitempty"`

	// This flag is set to run the pre-checks without the subsequent upgrade operations. Field introduced in 22.1.6, 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PrechecksOnly *bool `json:"prechecks_only,omitempty"`

	// This field identifies SE group options that need to be applied during the upgrade operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupOptions *SeGroupOptions `json:"se_group_options,omitempty"`

	// This field identifies the list of SE groups for which the upgrade operations are applicable.  This field is ignored if the 'system' is enabled. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupRefs []string `json:"se_group_refs,omitempty"`

	// Image uuid for identifying Service Engine patch. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePatchRef *string `json:"se_patch_ref,omitempty"`

	// This is flag when set as true skips few optional must check. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`

	// Apply upgrade operations such as Upgrade/Patch to Controller and ALL SE groups. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	System *bool `json:"system,omitempty"`
}
