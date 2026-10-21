// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MsgLbContextRuntime msg lb context runtime
// swagger:model MsgLbContextRuntime
type MsgLbContextRuntime struct {

	// Matching client context(s) for the requested VS; always empty unless the client_ip filter is supplied. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Context []*MsgLbContextEntry `json:"context,omitempty"`

	// True if the client_ip filter matched more client connections (distinct ports) than the per-call display cap, so the context list above is incomplete. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Truncated *bool `json:"truncated,omitempty"`
}
