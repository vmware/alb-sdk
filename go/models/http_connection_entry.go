// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPConnectionEntry Http connection entry
// swagger:model HttpConnectionEntry
type HTTPConnectionEntry struct {

	// HTTP Connection Details. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Conn *ConnectionEntry `json:"conn"`

	// HTTP Requests details. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Requests []*HTTPRequestEntry `json:"requests,omitempty"`

	// HTTP SSL enabled or not. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssl *bool `json:"ssl,omitempty"`

	// HTTP Version. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Version *string `json:"version"`
}
