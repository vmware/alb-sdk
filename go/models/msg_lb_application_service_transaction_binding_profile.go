// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbApplicationServiceTransactionBindingProfile msg lb application service transaction binding profile
// swagger:model MsgLbApplicationServiceTransactionBindingProfile
type MsgLbApplicationServiceTransactionBindingProfile struct {

	// When true, a TRANSACTIONAL session binding is freed as soon as its matching response is received. When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionUnbindOnResponse *bool `json:"session_unbind_on_response,omitempty"`

	// Time in milliseconds a TRANSACTIONAL session binding waits in idle state before it is torn down. Default 120000 ms. Allowed values are 1-3600000. Field introduced in 32.1.5. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionUnbindTimeout *uint32 `json:"session_unbind_timeout,omitempty"`
}
