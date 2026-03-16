// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// KeyvalSummaryInternal keyval summary internal
// swagger:model KeyvalSummaryInternal
type KeyvalSummaryInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeyvalHandleInternal *KeyvalHandleInternal `json:"keyval_handle_internal,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KvType *string `json:"kv_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumKeyvalObjs *int64 `json:"num_keyval_objs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
