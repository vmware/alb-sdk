// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsHbStatRuntime se vs hb stat runtime
// swagger:model SeVsHbStatRuntime
type SeVsHbStatRuntime struct {

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	//  Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbRqsUnsent *uint32 `json:"se_num_hb_rqs_unsent,omitempty"`

	//  Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeNumHbVstesSanitized *uint32 `json:"se_num_hb_vstes_sanitized,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeShortPlUuidsLen *uint32 `json:"se_short_pl_uuids_len,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeShortVsUuidsLen *uint32 `json:"se_short_vs_uuids_len,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeVsHbStatEntry []*SeVsHbStatEntry `json:"se_vs_hb_stat_entry,omitempty"`
}
