// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RepeatedSrvIdxWeights repeated srv idx weights
// swagger:model RepeatedSrvIdxWeights
type RepeatedSrvIdxWeights struct {

	//  Field introduced in 17.1.7,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vals []*RepeatedSrvIdxWeight `json:"vals,omitempty"`
}
