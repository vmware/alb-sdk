// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbDNSGeoUpdate gslb Dns geo update
// swagger:model GslbDnsGeoUpdate
type GslbDNSGeoUpdate struct {

	// GslbGeoDbProfile object that is pushed on on a per Dns basis. Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ObjInfo []*GslbObjectInfo `json:"obj_info,omitempty"`

	//  Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL. Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Ops *string `json:"ops,omitempty"`

	//  Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeList []string `json:"se_list,omitempty"`
}
