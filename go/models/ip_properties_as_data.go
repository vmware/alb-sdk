// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPPropertiesAsData Ip properties as data
// swagger:model IpPropertiesAsData
type IPPropertiesAsData struct {

	// Resolved AS name, or 'AS-Unknown' if not found. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Asname *string `json:"asname,omitempty"`

	// Resolved AS number, or 'AS-Unknown' if not found. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Asnum *string `json:"asnum,omitempty"`
}
