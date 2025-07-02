// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSubnetClash network subnet clash
// swagger:model NetworkSubnetClash
type NetworkSubnetClash struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPNw *string `json:"ip_nw"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networks []string `json:"networks,omitempty"`
}
