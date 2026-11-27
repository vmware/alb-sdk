// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbConnPoolConfig msg lb conn pool config
// swagger:model MsgLbConnPoolConfig
type MsgLbConnPoolConfig struct {

	// Idle timeout for pooled server sockets used by L4 message-level LB. Allowed values are 1000-86400000. Special values are 0 - Disable. Field introduced in 32.1.5. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IdleTimeoutMs *uint32 `json:"idle_timeout_ms,omitempty"`

	// Cap on concurrent server TCP connections per core for L4 message-level LB. 0 = unlimited; valid limit range is 1-65535. Allowed values are 0-65535. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxTCPConnPerServer *uint32 `json:"max_tcp_conn_per_server,omitempty"`
}
