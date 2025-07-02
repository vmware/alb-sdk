// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtDFWServiceDetails nsxt d f w service details
// swagger:model NsxtDFWServiceDetails
type NsxtDFWServiceDetails struct {

	// Error message. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// NSX-T DFW service name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Service *string `json:"service,omitempty"`
}
