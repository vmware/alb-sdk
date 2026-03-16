// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPRequestPolicyPoolRefCnt HTTP request policy pool ref cnt
// swagger:model HTTPRequestPolicyPoolRefCnt
type HTTPRequestPolicyPoolRefCnt struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolUUID *string `json:"pool_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Refcnt *int32 `json:"refcnt,omitempty"`
}
