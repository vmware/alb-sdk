// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLSessionCacheInternal s s l session cache internal
// swagger:model SSLSessionCacheInternal
type SSLSessionCacheInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CoreNum *uint32 `json:"core_num,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCreatesSkipped *uint32 `json:"num_creates_skipped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHitsCreates *uint32 `json:"num_hits_creates,omitempty"`
}
