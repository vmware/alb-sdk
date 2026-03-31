// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserDefinedDataScriptCounters user defined data script counters
// swagger:model UserDefinedDataScriptCounters
type UserDefinedDataScriptCounters struct {

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Udc []*UserDefinedCounter `json:"udc,omitempty"`
}
