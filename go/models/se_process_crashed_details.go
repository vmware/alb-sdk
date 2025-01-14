// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeProcessCrashedDetails se process crashed details
// swagger:model SeProcessCrashedDetails
type SeProcessCrashedDetails struct {

	// Number of times the process has crashed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CrashCounter *uint32 `json:"crash_counter,omitempty"`

	// Name of the process that crashed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ProcessName *string `json:"process_name,omitempty"`

	// Name of the SE reporting this event. It is a reference to an object of type ServiceEngine. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`
}
