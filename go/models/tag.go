// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Tag tag
// swagger:model Tag
type Tag struct {

	//  Enum options - AVI_DEFINED, USER_DEFINED, VCENTER_DEFINED. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Value *string `json:"value"`
}
