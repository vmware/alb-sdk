// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PulseServicesTenantConfig pulse services tenant config
// swagger:model PulseServicesTenantConfig
type PulseServicesTenantConfig struct {

	// Heartbeat Interval duration. Field introduced in 30.2.1. Unit is MIN. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	HeartbeatInterval *int32 `json:"heartbeat_interval,omitempty"`

	// License Escrow Interval duration. Field introduced in 30.2.1. Unit is MIN. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	LicenseEscrowInterval *int32 `json:"license_escrow_interval,omitempty"`

	// Token Refresh Interval duration. Allowed values are 1-240. Field introduced in 30.2.1. Unit is MIN. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	TokenRefreshInterval *int32 `json:"token_refresh_interval,omitempty"`
}
