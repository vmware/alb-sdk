// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LcEntryV1 lc entry v1
// swagger:model LcEntryV1
type LcEntryV1 struct {

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpenConns *uint32 `json:"open_conns,omitempty"`

	//  Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreferenceOrder *uint64 `json:"preference_order,omitempty"`

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerName *string `json:"server_name,omitempty"`

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Weight *uint32 `json:"weight,omitempty"`
}
