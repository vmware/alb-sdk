// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIdeleteNetworkFilter v idelete network filter
// swagger:model VIDeleteNetworkFilter
type VIdeleteNetworkFilter struct {

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Datacenter *string `json:"datacenter,omitempty"`

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NetworkUUID *string `json:"network_uuid,omitempty"`

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterURL *string `json:"vcenter_url,omitempty"`
}
