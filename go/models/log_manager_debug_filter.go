// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogManagerDebugFilter log manager debug filter
// swagger:model LogManagerDebugFilter
type LogManagerDebugFilter struct {

	// UUID of the entity. It is a reference to an object of type Virtualservice. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EntityRef *string `json:"entity_ref,omitempty"`

	// Set the log level for telemetry trace logs. Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TelemetryTraceLogLevel *string `json:"telemetry_trace_log_level,omitempty"`
}
