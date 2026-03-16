// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LcCore lc core
// swagger:model LcCore
type LcCore struct {

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entry []*LcEntryV1 `json:"entry,omitempty"`
}
