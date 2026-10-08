// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPPropertiesGeolocData Ip properties geoloc data
// swagger:model IpPropertiesGeolocData
type IPPropertiesGeolocData struct {

	// Resolved country code, or 'Country-Unknown' if not found. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Countrycode *string `json:"countrycode,omitempty"`
}
