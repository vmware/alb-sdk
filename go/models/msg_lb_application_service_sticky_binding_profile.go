// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbApplicationServiceStickyBindingProfile msg lb application service sticky binding profile
// swagger:model MsgLbApplicationServiceStickyBindingProfile
type MsgLbApplicationServiceStickyBindingProfile struct {

	// When true (default), a STICKY-mode per-request/session binding is freed as soon as its matching response is received. When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity. Anchor bindings are unaffected regardless of this flag. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionUnbindOnResponse *bool `json:"session_unbind_on_response,omitempty"`

	// Idle timeout in milliseconds for per-request/session bindings in STICKY mode. When session_unbind_on_response is true (default), this acts as a hard deadline  the session binding is force-torn-down if no matching response arrives within this window. When session_unbind_on_response is false, this is the sliding idle timeout  the session binding persists after response and is freed after this many milliseconds of inactivity. Default 30000 ms. Allowed values are 1-3600000. Field introduced in 32.1.5. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionUnbindTimeout *uint32 `json:"session_unbind_timeout,omitempty"`

	// Idle timeout in milliseconds for the STICKY-mode anchor binding. 0 (default)  anchor lives until the client connection closes. Non-zero  anchor is torn down after this many milliseconds with no message forwarded in either direction; the idle timer resets on every request or response. Allowed values are 0-3600000. Field introduced in 32.1.5. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StickyUnbindTimeout *uint32 `json:"sticky_unbind_timeout,omitempty"`
}
