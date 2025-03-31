// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpgradeOpsParam upgrade ops param
// swagger:model UpgradeOpsParam
type UpgradeOpsParam struct {

	// This field holds the configurable Controller params required in upgrade flows for current request. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Controller *ControllerParams `json:"controller,omitempty"`

	// Image uuid for identifying base image. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageRef *string `json:"image_ref,omitempty"`

	// Image uuid for identifying patch. It is a reference to an object of type Image. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PatchRef *string `json:"patch_ref,omitempty"`

	// This field identifies SE group options that need to be applied during the upgrade operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupOptions *SeGroupOptions `json:"se_group_options,omitempty"`

	// Apply options while resuming SE group upgrade operations. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupResumeOptions *SeGroupResumeOptions `json:"se_group_resume_options,omitempty"`

	// This field holds the configurable ServiceEngineGroup params required in upgrade flows for current request. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ServiceEngine *ServiceEngineParams `json:"service_engine,omitempty"`
}
