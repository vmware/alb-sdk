// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPPropertiesResponseIpdataEntry Ip properties response ipdata entry
// swagger:model IpPropertiesResponse.IpdataEntry
type IPPropertiesResponseIpdataEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *IPPropertiesIPEntry `json:"value,omitempty"`
}
