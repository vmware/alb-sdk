// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolAnalyticsPolicy pool analytics policy
// swagger:model PoolAnalyticsPolicy
type PoolAnalyticsPolicy struct {

	// Enable realtime metrics and its duration. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsRealtimeUpdate *MetricsRealTimeUpdate `json:"metrics_realtime_update,omitempty"`
}
