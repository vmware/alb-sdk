// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DispatcherOneTableRuntime dispatcher one table runtime
// swagger:model DispatcherOneTableRuntime
type DispatcherOneTableRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowEntries []*DispatcherEntryRuntime `json:"flow_entries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Mac *string `json:"mac"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Vnic *uint32 `json:"vnic"`
}
