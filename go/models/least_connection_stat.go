// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LeastConnectionStat least connection stat
// swagger:model LeastConnectionStat
type LeastConnectionStat struct {

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Lccore []*LcCore `json:"lccore,omitempty"`
}
