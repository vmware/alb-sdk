// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtGroupFetch nsxt group fetch
// swagger:model NsxtGroupFetch
type NsxtGroupFetch struct {

	// Error message. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// NSX Group . Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`
}
