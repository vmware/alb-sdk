// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CaseConfig case config
// swagger:model CaseConfig
type CaseConfig struct {

	// Service category. Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY. Field introduced in 21.1.3.
	Category *string `json:"category,omitempty"`

	// Enable pro-active support case creation when a controller failure occurs. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EnableAutoCaseCreationOnControllerFailure *bool `json:"enable_auto_case_creation_on_controller_failure,omitempty"`

	// Enable pro-active support case creation when a service engine failure occurs. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EnableAutoCaseCreationOnSeFailure *bool `json:"enable_auto_case_creation_on_se_failure,omitempty"`

	// Enable cleanup of successfully attached files to support case. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition. Special default for Basic edition is false, Essentials edition is false, Enterprise is True.
	EnableCleanupOfAttachedFiles *bool `json:"enable_cleanup_of_attached_files,omitempty"`
}
