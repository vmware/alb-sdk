// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbApplicationServiceProfile msg lb application service profile
// swagger:model MsgLbApplicationServiceProfile
type MsgLbApplicationServiceProfile struct {

	// Generate a per-transaction log for each completed MsgLB request/response pair. Only requests that carry a transaction key are logged. Disabled by default because it produces one log per message. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableTransactionLogs *bool `json:"enable_transaction_logs,omitempty"`

	// Cap on distinct server TCP connections a single client connection may open per backend member for L4 message-level LB. 0 = unlimited; valid limit range is 1-65535. Allowed values are 0-65535. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxTCPConnPerClientPerServer *uint32 `json:"max_tcp_conn_per_client_per_server,omitempty"`

	// Interval in seconds at which a cumulative per-connection MsgLB log is pushed for each open client connection, so long-lived connections are visible before they close. 0 disables the periodic log; the log pushed when the connection closes is always generated. Changes apply to existing connections as well. Allowed values are 0-3600. Field introduced in 32.1.5. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgLbConnectionLogInterval *uint32 `json:"msg_lb_connection_log_interval,omitempty"`

	// Controls how client connections are bound to backend server TCP connections. STICKY (default). Enum options - MSG_LB_SESSION_BINDING_MODE_STICKY, MSG_LB_SESSION_BINDING_MODE_TRANSACTIONAL. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionBindingMode *string `json:"session_binding_mode,omitempty"`

	// Parameters for STICKY-mode anchor and per-request bindings. Ignored when session_binding_mode is TRANSACTIONAL. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StickyBindingProfile *MsgLbApplicationServiceStickyBindingProfile `json:"sticky_binding_profile,omitempty"`

	// Parameters for TRANSACTIONAL-mode session bindings. Ignored when session_binding_mode is STICKY. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionBindingProfile *MsgLbApplicationServiceTransactionBindingProfile `json:"transaction_binding_profile,omitempty"`
}
