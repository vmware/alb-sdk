// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLicenseStats se license stats
// swagger:model SeLicenseStats
type SeLicenseStats struct {

	// Total service cores consumed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumedServiceCores *float64 `json:"consumed_service_cores,omitempty"`

	// Total service cores reserved. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReservedServiceCores *float64 `json:"reserved_service_cores,omitempty"`
}
