// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FullClientLogs full client logs
// swagger:model FullClientLogs
type FullClientLogs struct {

	// [DEPRECATED] Log all headers. Please use the all_headers flag in AnalyticsPolicy. Field deprecated in 18.1.4, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AllHeaders *bool `json:"all_headers,omitempty"`

	// How long should the system capture all logs, measured in minutes. Set to 0 for infinite. Special values are 0 - infinite. Unit is MIN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Duration *int32 `json:"duration,omitempty"`

	// Capture all client logs including connections and requests.  When deactivated, only errors will be logged. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition. Special default for Essentials edition is false, Basic edition is false, Enterprise is False.
	// Required: true
	Enabled *bool `json:"enabled"`

	// This setting limits the number of non-significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to deactivate throttling. Field introduced in 17.1.3. Unit is PER_SECOND. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Throttle *int32 `json:"throttle,omitempty"`
}
