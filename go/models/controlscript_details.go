// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControlscriptDetails controlscript details
// swagger:model ControlscriptDetails
type ControlscriptDetails struct {

	// Exitcode from Control Script execution. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Exitcode *int32 `json:"exitcode,omitempty"`

	// Stderr from Control Script execution. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Stderr *string `json:"stderr,omitempty"`

	// Stdout from Control Script execution. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Stdout *string `json:"stdout,omitempty"`
}
