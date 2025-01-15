// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnectionClearFilter connection clear filter
// swagger:model ConnectionClearFilter
type ConnectionClearFilter struct {

	// IP address in dotted decimal notation. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddr *string `json:"ip_addr,omitempty"`

	// Port number. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *uint32 `json:"port,omitempty"`
}
