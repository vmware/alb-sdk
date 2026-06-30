// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PulseServicesTenantStatus pulse services tenant status
// swagger:model PulseServicesTenantStatus
type PulseServicesTenantStatus struct {

	// iprep sync timestamp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IprepSyncedAt *string `json:"iprep_synced_at,omitempty"`

	// Timestamp for last connection established. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastConnectedAt *string `json:"last_connected_at,omitempty"`

	// Timestamp for last connection broken at. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastDisconnectedAt *string `json:"last_disconnected_at,omitempty"`

	// Timestamp for registration. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRegisteredAt *string `json:"last_registered_at,omitempty"`

	// Timestamp for token refresh. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastTokenRefreshedAt *string `json:"last_token_refreshed_at,omitempty"`

	// Timestamp for license refresh. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseRefreshedAt *string `json:"license_refreshed_at,omitempty"`
}
