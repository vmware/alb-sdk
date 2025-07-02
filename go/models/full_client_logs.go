// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FullClientLogs full client logs
// swagger:model FullClientLogs
type FullClientLogs struct {

	// How long should the system capture all logs, measured in minutes. Set to 0 for infinite. Special values are 0 - infinite. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Capture all client logs including connections and requests.  When deactivated, only errors will be logged. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition. Special default for Essentials edition is false, Basic edition is false, Enterprise edition is False.
	// Required: true
	Enabled *bool `json:"enabled"`

	// This setting limits the number of non-significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to deactivate throttling. Note that the SE group's throttle value takes precedence over this setting. Field introduced in 17.1.3. Unit is PER_SECOND. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Throttle *uint32 `json:"throttle,omitempty"`
}
