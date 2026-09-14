// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbApplicationServiceProfile msg lb application service profile
// swagger:model MsgLbApplicationServiceProfile
type MsgLbApplicationServiceProfile struct {

	// Cap on distinct server TCP connections a single client connection may open per backend member for L4 message-level LB. 0 = unlimited; valid limit range is 1-65535. Allowed values are 0-65535. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxTCPConnPerClientPerServer *uint32 `json:"max_tcp_conn_per_client_per_server,omitempty"`

	// Controls how client connections are bound to backend server TCP connections. STICKY (default). Enum options - MSG_LB_SESSION_BINDING_MODE_STICKY, MSG_LB_SESSION_BINDING_MODE_TRANSACTIONAL. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionBindingMode *string `json:"session_binding_mode,omitempty"`

	// Parameters for STICKY-mode anchor and per-request bindings. Ignored when session_binding_mode is TRANSACTIONAL. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StickyBindingProfile *MsgLbApplicationServiceStickyBindingProfile `json:"sticky_binding_profile,omitempty"`

	// Parameters for TRANSACTIONAL-mode session bindings. Ignored when session_binding_mode is STICKY. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransactionBindingProfile *MsgLbApplicationServiceTransactionBindingProfile `json:"transaction_binding_profile,omitempty"`
}
