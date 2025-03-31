// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ActionArgs action args
// swagger:model ActionArgs
type ActionArgs struct {

	// Name of the argument. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Value for the argument. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Value *string `json:"value,omitempty"`
}
