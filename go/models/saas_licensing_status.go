// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SaasLicensingStatus saas licensing status
// swagger:model SaasLicensingStatus
type SaasLicensingStatus struct {

	// Portal connectivity status. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Connected *bool `json:"connected,omitempty"`

	// Status of saas licensing subscription. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Saas license expiry status. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Expired *bool `json:"expired,omitempty"`

	// TimeStamp of last successful refresh. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastRefreshedAt *string `json:"last_refreshed_at,omitempty"`

	// Message. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`

	// Name. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Public key. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PublicKey *string `json:"public_key,omitempty"`

	// License refresh status. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RefreshStatus *bool `json:"refresh_status,omitempty"`

	// Timestamp of last attempted refresh. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RefreshedAt *string `json:"refreshed_at,omitempty"`

	// Service units reserved on controller. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReserveServiceUnits *float64 `json:"reserve_service_units,omitempty"`

	// Saas license request status. Enum options - SUBSCRIPTION_NONE, SUBSCRIPTION_SUCCESS, SUBSCRIPTION_FAILED, SUBSCRIPTION_IN_PROGRESS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
