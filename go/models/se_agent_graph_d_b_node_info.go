// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentGraphDBNodeInfo se agent graph d b node info
// swagger:model SeAgentGraphDBNodeInfo
type SeAgentGraphDBNodeInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumObj *int32 `json:"num_obj,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumObjActive *int32 `json:"num_obj_active,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumObjAwaitingDp *int32 `json:"num_obj_awaiting_dp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumObjError *int32 `json:"num_obj_error,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumObjEwSubnetError *int32 `json:"num_obj_ew_subnet_error,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Obj []*SeAgentGraphDBNodeObject `json:"obj,omitempty"`
}
