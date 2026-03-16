// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsStat ns stat
// swagger:model NsStat
type NsStat struct {

	// RR attributes of servers in NS LB state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entry []*WrrEntry `json:"entry,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServers *uint32 `json:"num_servers,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServersNoLoc *uint32 `json:"num_servers_no_loc,omitempty"`

	// Latitude of pool in NS LB state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolLatitude *uint32 `json:"pool_latitude,omitempty"`

	// Longitude of pool in NS LB state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolLongitude *uint32 `json:"pool_longitude,omitempty"`

	// Attirbutes of server in NS LB state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerEntry []*ServerEntry `json:"server_entry,omitempty"`
}
