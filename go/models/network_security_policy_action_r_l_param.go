// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSecurityPolicyActionRLParam network security policy action r l param
// swagger:model NetworkSecurityPolicyActionRLParam
type NetworkSecurityPolicyActionRLParam struct {

	// Maximum number of connections or requests or packets to be rate limited instantaneously. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BurstSize *uint32 `json:"burst_size"`

	// Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MaxRate *uint32 `json:"max_rate"`
}
