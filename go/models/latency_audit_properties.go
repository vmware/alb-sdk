// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LatencyAuditProperties latency audit properties
// swagger:model LatencyAuditProperties
type LatencyAuditProperties struct {

	// Audit TCP connection establishment time. Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ConnEstAuditMode *string `json:"conn_est_audit_mode,omitempty"`

	// Maximum threshold for connection establishment time. Field introduced in 21.1.1. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ConnEstThreshold *int32 `json:"conn_est_threshold,omitempty"`

	// Audit dispatcher to proxy latency. Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	LatencyAuditMode *string `json:"latency_audit_mode,omitempty"`

	// Maximum latency threshold between dispatcher and proxy. Field introduced in 21.1.1. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	LatencyThreshold *int32 `json:"latency_threshold,omitempty"`
}
