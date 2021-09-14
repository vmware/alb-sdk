// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterImageDetails vcenter image details
// swagger:model VcenterImageDetails
type VcenterImageDetails struct {

	// Cloud Id. Field introduced in 21.1.3.
	CcID *string `json:"cc_id,omitempty"`

	// Error message. Field introduced in 21.1.3.
	ErrorString *string `json:"error_string,omitempty"`

	// Image version. Field introduced in 21.1.3.
	ImageVersion *string `json:"image_version,omitempty"`

	// vCenter url. Field introduced in 21.1.3.
	VcURL *string `json:"vc_url,omitempty"`
}
