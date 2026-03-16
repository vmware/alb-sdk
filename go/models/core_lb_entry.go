// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CoreLbEntry core lb entry
// swagger:model CoreLbEntry
type CoreLbEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CoreTokens *uint32 `json:"core_tokens,omitempty"`
}
