// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// QuotaConfig quota config
// swagger:model QuotaConfig
type QuotaConfig struct {

	// Maximum license service units allowed for consumption. -1 as Default is maximum value. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Limit *int64 `json:"limit,omitempty"`

	// Minimum license service units reserved for consumption. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reservation *uint64 `json:"reservation,omitempty"`
}
