// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SwitchToTenantResponse switch to tenant response
// swagger:model SwitchToTenantResponse
type SwitchToTenantResponse struct {

	// Caller's effective privileges (resource + access type) in the requested tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privileges []*Permission `json:"privileges,omitempty"`
}
