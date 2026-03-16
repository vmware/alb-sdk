// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InterfaceLacpRuntime interface lacp runtime
// swagger:model InterfaceLacpRuntime
type InterfaceLacpRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InterfaceLacpEntry []*InterfaceLacpEntry `json:"interface_lacp_entry,omitempty"`
}
