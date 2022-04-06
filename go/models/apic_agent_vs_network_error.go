// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApicAgentVsNetworkError apic agent vs network error
// swagger:model ApicAgentVsNetworkError
type ApicAgentVsNetworkError struct {

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PoolNetwork *string `json:"pool_network,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VsName *string `json:"vs_name,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VsNetwork *string `json:"vs_network,omitempty"`
}
