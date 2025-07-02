// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtDFWGroupDetails nsxt d f w group details
// swagger:model NsxtDFWGroupDetails
type NsxtDFWGroupDetails struct {

	// Error message. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// NSX-T DFW Group name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Group *string `json:"group,omitempty"`
}
