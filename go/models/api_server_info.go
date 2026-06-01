// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIServerInfo Api server info
// swagger:model ApiServerInfo
type APIServerInfo struct {

	// Common URL path prefix derived from server URLs. Automatically populated by pbresolve from the path sections of servers[].url. All server URLs must share the same path section. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	PathPrefix *string `json:"path_prefix,omitempty"`

	// List of servers that define the scope of this API policy. A request that does not match any server URL is considered outside this policy's scope and is treated as non-API traffic. In EVH deployments, each server URL is used to generate a VHMatch entry that selects the correct child VS by matching the request hostname and path prefix. Field introduced in 32.2.1. Maximum of 100 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*APISpecServer `json:"servers,omitempty"`
}
