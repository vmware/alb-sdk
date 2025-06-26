// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPOptions TCP options
// swagger:model TCPOptions
type TCPOptions struct {

	// Remove the SACK TCP option from header. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StripSack *bool `json:"strip_sack,omitempty"`
}
