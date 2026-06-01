// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VHRouteRuntime v h route runtime
// swagger:model VHRouteRuntime
type VHRouteRuntime struct {

	// Process ID for this VH route instance. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// List of VH route match entries for this process. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VhRouteEntries []*VHRouteMatchEntry `json:"vh_route_entries,omitempty"`
}
