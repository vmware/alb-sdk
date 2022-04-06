// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CRSDeploymentSuccess c r s deployment success
// swagger:model CRSDeploymentSuccess
type CRSDeploymentSuccess struct {

	// List of all installed CRS updates. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CrsInfo []*CRSDetails `json:"crs_info,omitempty"`
}
