// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Image image
// swagger:model Image
type Image struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// This field describes the cloud info specific to the base image. Field introduced in 20.1.1.
	CloudInfoValues []*ImageCloudData `json:"cloud_info_values,omitempty"`

	// Controller package details. Field introduced in 18.2.6.
	ControllerInfo *PackageDetails `json:"controller_info,omitempty"`

	// Mandatory Controller patch name that is applied along with this base image. Field introduced in 18.2.10, 20.1.1.
	ControllerPatchName *string `json:"controller_patch_name,omitempty"`

	// It references the controller-patch associated with the Uber image. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.
	ControllerPatchRef *string `json:"controller_patch_ref,omitempty"`

	// Time taken to upload the image in seconds. Field introduced in 21.1.3. Unit is SEC.
	Duration *int32 `json:"duration,omitempty"`

	// Image upload end time. Field introduced in 21.1.3.
	EndTime *string `json:"end_time,omitempty"`

	// Image events for image upload operation. Field introduced in 21.1.3.
	Events []*ImageEventMap `json:"events,omitempty"`

	// Status of the image. Field introduced in 21.1.3.
	ImgState *ImageUploadOpsStatus `json:"img_state,omitempty"`

	// This field describes the api migration related information. Field introduced in 18.2.6.
	Migrations *SupportedMigrations `json:"migrations,omitempty"`

	// Name of the image. Field introduced in 18.2.6.
	// Required: true
	Name *string `json:"name"`

	// Image upload progress which holds value between 0-100. Allowed values are 0-100. Field introduced in 21.1.3. Unit is PERCENT.
	Progress *int32 `json:"progress,omitempty"`

	// SE package details. Field introduced in 18.2.6.
	SeInfo *PackageDetails `json:"se_info,omitempty"`

	// Mandatory ServiceEngine patch name that is applied along with this base image. Field introduced in 18.2.10, 20.1.1.
	SePatchName *string `json:"se_patch_name,omitempty"`

	// It references the Service Engine patch associated with the Uber Image. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.
	SePatchRef *string `json:"se_patch_ref,omitempty"`

	// Image upload start time. Field introduced in 21.1.3.
	StartTime *string `json:"start_time,omitempty"`

	// Status to check if the image is present. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST.... Field deprecated in 21.1.3. Field introduced in 18.2.6.
	Status *string `json:"status,omitempty"`

	// Completed set of tasks for Image upload. Field introduced in 21.1.3.
	TasksCompleted *int32 `json:"tasks_completed,omitempty"`

	// Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.6.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Total number of tasks for Image upload. Field introduced in 21.1.3.
	TotalTasks *int32 `json:"total_tasks,omitempty"`

	// Type of the image patch/system. Enum options - IMAGE_TYPE_PATCH, IMAGE_TYPE_SYSTEM, IMAGE_TYPE_MUST_CHECK. Field introduced in 18.2.6.
	Type *string `json:"type,omitempty"`

	// Status to check if the image is an uber bundle. Field introduced in 18.2.8, 20.1.1.
	UberBundle *bool `json:"uber_bundle,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the image. Field introduced in 18.2.6.
	UUID *string `json:"uuid,omitempty"`
}
