// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugVirtualServiceSeParams debug virtual service se params
// swagger:model DebugVirtualServiceSeParams
type DebugVirtualServiceSeParams struct {

	//  It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRefs []string `json:"se_refs,omitempty"`
}
