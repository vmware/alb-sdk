// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtDFWTagVM nsxt d f w tag VM
// swagger:model NsxtDFWTagVM
type NsxtDFWTagVM struct {

	// Error message. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// NSX-T DFW VM name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
