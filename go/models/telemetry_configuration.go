// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TelemetryConfiguration telemetry configuration
// swagger:model TelemetryConfiguration
type TelemetryConfiguration struct {

	// Enables VMware Customer Experience Improvement Program ( CEIP ). Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// The FQDN or IP address of the Telemetry Server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URL *string `json:"url,omitempty"`
}
