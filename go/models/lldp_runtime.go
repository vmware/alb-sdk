// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LldpRuntime lldp runtime
// swagger:model LldpRuntime
type LldpRuntime struct {

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InterfaceLldpEntry *InterfaceLldpEntry `json:"interface_lldp_entry,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NamespaceLldpSummary []*NamespaceLldpEntry `json:"namespace_lldp_summary,omitempty"`
}
