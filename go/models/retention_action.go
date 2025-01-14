// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetentionAction retention action
// swagger:model RetentionAction
type RetentionAction struct {

	// Arguments for the action. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Args []*ActionArgs `json:"args,omitempty"`

	// Path to invoke for the action. For example, for API action, this would be an API endpoint. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Path *string `json:"path"`

	// Type of action to perform such as API, RPC, Script, etc. Enum options - ACTION_API, ACTION_GRPC, ACTION_SCRIPT, ACTION_RPC. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Type *string `json:"type"`
}
