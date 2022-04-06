// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSecurityPolicyActionRLParam network security policy action r l param
// swagger:model NetworkSecurityPolicyActionRLParam
type NetworkSecurityPolicyActionRLParam struct {

	// Maximum number of connections or requests or packets to be rate limited instantaneously. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	BurstSize *int32 `json:"burst_size"`

	// Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MaxRate *int32 `json:"max_rate"`
}
