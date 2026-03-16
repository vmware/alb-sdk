// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbPoolDetail gslb pool detail
// swagger:model GslbPoolDetail
type GslbPoolDetail struct {

	// The load balancing algorithm will pick a local member within the GSLB service list of available Members. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY, GSLB_ALGORITHM_PREFERENCE_ORDER. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Algorithm *string `json:"algorithm,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hmon *HealthMonitorStatRuntime `json:"hmon,omitempty"`

	// Select list of Virtual Services belonging to this GSLB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Members []*GslbPoolMemberDetail `json:"members,omitempty"`

	// Name of the GSLB pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServers *uint32 `json:"num_servers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServersEnabled *uint32 `json:"num_servers_enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServersUp *uint32 `json:"num_servers_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Priority of this pool of members. If the priority of this is the highest in the group, DNS service picks up only this member for DNS responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Priority *uint32 `json:"priority,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stats *GslbServiceGroupStats `json:"stats,omitempty"`
}
