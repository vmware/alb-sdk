// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapFault waap fault
// swagger:model WaapFault
type WaapFault struct {

	// Human-readable fault description, including the rejected count. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Type of fault detected, as a WaapFaultType enum value. Enum options - MAX_PARAMS_LIMIT_EXCEEDED, MAX_ENDPOINTS_LIMIT_EXCEEDED. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FaultType *string `json:"fault_type,omitempty"`
}
