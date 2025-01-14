// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportStatus tech support status
// swagger:model TechSupportStatus
type TechSupportStatus struct {

	// 'Customer case number for which this tech-support is generated. ''Useful for connected portal and other use-cases.'. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaseNumber *string `json:"case_number,omitempty"`

	// Total time taken for tech-support collection. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *string `json:"duration,omitempty"`

	// Error logged during tech-support collection. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Errors []string `json:"errors,omitempty"`

	// Tech-support collection keys. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	// Tech-support collection level. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Level *string `json:"level,omitempty"`

	// 'obj name if one exists.'. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Cluster member node on which the techsupport tarball bundle is saved. Field introduced in 20.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Node *string `json:"node,omitempty"`

	// Tech-support collection output. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Output *string `json:"output,omitempty"`

	// Size of techsupport tarball. Field introduced in 20.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Size *string `json:"size,omitempty"`

	// Start timestamp of tech-support collection. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartTime *string `json:"start_time,omitempty"`

	// Status of tech-support invocation. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Status code for the tech-support invocation. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED.... Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatusCode *string `json:"status_code,omitempty"`

	// Warning logged during tech-support collection. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Warnings []string `json:"warnings,omitempty"`
}
