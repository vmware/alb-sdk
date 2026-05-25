// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceVHRoutesRuntime virtual service v h routes runtime
// swagger:model VirtualServiceVHRoutesRuntime
type VirtualServiceVHRoutesRuntime struct {

	// List of VH routes per process for this EVH parent VS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VhRoutes []*VHRouteRuntime `json:"vh_routes,omitempty"`
}
