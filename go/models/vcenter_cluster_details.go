// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterClusterDetails vcenter cluster details
// swagger:model VcenterClusterDetails
type VcenterClusterDetails struct {

	// Cloud Id. Field introduced in 20.1.7, 21.1.3.
	CcID *string `json:"cc_id,omitempty"`

	// Cluster name in vCenter. Field introduced in 20.1.7, 21.1.3.
	Cluster *string `json:"cluster,omitempty"`

	// Error message. Field introduced in 20.1.7, 21.1.3.
	ErrorString *string `json:"error_string,omitempty"`

	// Hosts in vCenter Cluster. Field introduced in 20.1.7, 21.1.3.
	Hosts []string `json:"hosts,omitempty"`

	// VC url. Field introduced in 20.1.7, 21.1.3.
	VcURL *string `json:"vc_url,omitempty"`
}
