// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsUserMetrics metrics user metrics
// swagger:model MetricsUserMetrics
type MetricsUserMetrics struct {

	// User defined (via datascript) metrics reported as monotonically increasing counter. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Counter *uint64 `json:"counter,omitempty"`

	// User defined (via datascript) metrics for qualitative data like CPU percentage, open connections etc. It represents the aggregated metric value summed across all the service engines that a given virtualservice is scaled out to. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gauge *uint64 `json:"gauge,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`
}
