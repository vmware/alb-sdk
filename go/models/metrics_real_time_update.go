// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsRealTimeUpdate metrics real time update
// swagger:model MetricsRealTimeUpdate
type MetricsRealTimeUpdate struct {

	// Real time metrics collection duration in minutes. 0 for infinite. Special values are 0 - infinite. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Enables real time metrics collection.  When deactivated, 6 hour view is the most granular the system will track. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Enabled *bool `json:"enabled"`
}
