// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageRawInventoryRuntime image raw inventory runtime
// swagger:model ImageRawInventoryRuntime
type ImageRawInventoryRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUse *bool `json:"in_use,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUseInfo []*InUseInfo `json:"in_use_info,omitempty"`
}
