// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPPropertiesResponse Ip properties response
// swagger:model IpPropertiesResponse
type IPPropertiesResponse struct {

	// Keyed by each queried ASN (as a string) from ?asn=<csv>; value is the resolved AS name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Asdata *string `json:"asdata,omitempty"`

	// Keyed by each queried IP from ?ip=<csv>. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ipdata map[string]IPPropertiesIPEntry `json:"ipdata,omitempty"`
}
