// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPPropertiesIPEntry Ip properties Ip entry
// swagger:model IpPropertiesIpEntry
type IPPropertiesIPEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Asdata *IPPropertiesAsData `json:"asdata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Geolocdata *IPPropertiesGeolocData `json:"geolocdata,omitempty"`
}
