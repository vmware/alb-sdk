// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsDbSyncFailureEventDetails metrics db sync failure event details
// swagger:model MetricsDbSyncFailureEventDetails
type MetricsDbSyncFailureEventDetails struct {

	// Name of the node responsible for this event.
	NodeName *string `json:"node_name,omitempty"`

	// Name of the process responsible for this event.
	ProcessName *string `json:"process_name,omitempty"`

	// Timestamp at which this event occurred.
	Timestamp *string `json:"timestamp,omitempty"`
}
