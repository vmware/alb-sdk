// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAssertStatEntry se assert stat entry
// swagger:model SeAssertStatEntry
type SeAssertStatEntry struct {

	// Assert Type Count. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AssertTypeCnt *int32 `json:"assert_type_cnt,omitempty"`

	// Assert Type Name. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AssertTypeName *string `json:"assert_type_name"`
}
