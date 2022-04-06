// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbDNSUpdate gslb Dns update
// swagger:model GslbDnsUpdate
type GslbDNSUpdate struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClearOnMaxRetries *int32 `json:"clear_on_max_retries,omitempty"`

	// List of Geo DB Profiles associated with this DNS VS. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbGeoDbProfileUuids []string `json:"gslb_geo_db_profile_uuids,omitempty"`

	// List of Gslb Services associated with the DNS VS. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbServiceUuids []string `json:"gslb_service_uuids,omitempty"`

	// Gslb object associated with the DNS VS. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbUuids []string `json:"gslb_uuids,omitempty"`

	// Gslb, GslbService objects that is pushed on a per Dns basis. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ObjInfo []*GslbObjectInfo `json:"obj_info,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SendInterval *int32 `json:"send_interval,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
