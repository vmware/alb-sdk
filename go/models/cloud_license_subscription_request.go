// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudLicenseSubscriptionRequest cloud license subscription request
// swagger:model CloudLicenseSubscriptionRequest
type CloudLicenseSubscriptionRequest struct {

	// Pool ID for cloud licensing subscription. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolID *string `json:"pool_id,omitempty"`
}
