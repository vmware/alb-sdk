// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SHMSummary s h m summary
// swagger:model SHMSummary
type SHMSummary struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthMonitor []*ServerHealthMonitor `json:"health_monitor,omitempty"`
}
