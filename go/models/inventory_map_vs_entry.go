// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapVsEntry inventory map vs entry
// swagger:model InventoryMapVsEntry
type InventoryMapVsEntry struct {

	// Flattened subset of VS config fields used by the map view. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *InventoryMapVsConfig `json:"config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolgroupRefs []*InventoryMapPoolGroupRef `json:"poolgroup_refs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pools []*InventoryMapPool `json:"pools,omitempty"`

	// VS oper_status plus vip_summary, present when the 'runtime' resource is requested. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Runtime *VsRuntimeSummary `json:"runtime,omitempty"`

	// UUIDs of ServiceEngines serving this VS (empty for east-west VSs). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Serviceengines []string `json:"serviceengines,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
