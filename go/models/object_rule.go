// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ObjectRule object rule
// swagger:model ObjectRule
type ObjectRule struct {

	// Action to trigger when policy conditions are met. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	// Read Only: true
	Action *RetentionAction `json:"action"`

	// Maximum number of objects allowed in the system. When the limit exceeds, action is invoked for the oldest objects. Allowed values are 1-100. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Limit *uint64 `json:"limit,omitempty"`

	// Name of the object model. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	ModelName *string `json:"model_name,omitempty"`
}
