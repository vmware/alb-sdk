// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtDFWTagSegmentPort nsxt d f w tag segment port
// swagger:model NsxtDFWTagSegmentPort
type NsxtDFWTagSegmentPort struct {

	// Error message. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	// NSX-T DFW segment port path. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	// Virtual Services. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Vsuuids []string `json:"vsuuids,omitempty"`
}
