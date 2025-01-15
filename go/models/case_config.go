// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CaseConfig case config
// swagger:model CaseConfig
type CaseConfig struct {

	// Additional emails to get notified when the case gets created. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AdditionalEmails []string `json:"additional_emails,omitempty"`

	// Enable pro-active support case creation when a controller failure occurs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableAutoCaseCreationOnControllerFailure *bool `json:"enable_auto_case_creation_on_controller_failure,omitempty"`

	// Enable pro-active support case creation when a service engine failure occurs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableAutoCaseCreationOnSeFailure *bool `json:"enable_auto_case_creation_on_se_failure,omitempty"`

	// Enable cleanup of successfully attached files to support case. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition. Special default for Essentials edition is false, Basic edition is false, Enterprise edition is True.
	EnableCleanupOfAttachedFiles *bool `json:"enable_cleanup_of_attached_files,omitempty"`
}
