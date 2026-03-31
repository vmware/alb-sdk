// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVnicStats se vnic stats
// swagger:model SeVnicStats
type SeVnicStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicOp *int32 `json:"num_vnic_op,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicOpFail *int32 `json:"num_vnic_op_fail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicOpSuccess *int32 `json:"num_vnic_op_success,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicOpTimeout *int32 `json:"num_vnic_op_timeout,omitempty"`
}
