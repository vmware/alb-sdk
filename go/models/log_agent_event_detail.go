// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogAgentEventDetail log agent event detail
// swagger:model LogAgentEventDetail
type LogAgentEventDetail struct {

	// Protocol used for communication to the external entity. Enum options - TCP_CONN. Field introduced in 20.1.3.
	// Required: true
	Protocol *string `json:"protocol"`

	// Event details for TCP connection event. Field introduced in 20.1.3.
	TCPDetail *LogAgentTCPClientEventDetail `json:"tcp_detail,omitempty"`

	// Type of log agent event. Enum options - LOG_AGENT_CONNECTION_ERROR. Field introduced in 20.1.3.
	// Required: true
	Type *string `json:"type"`
}
