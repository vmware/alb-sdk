// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Cluster cluster
// swagger:model Cluster
type Cluster struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Minimum of 1 items required. Maximum of 7 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nodes []*ClusterNode `json:"nodes,omitempty"`

	// Re-join cluster nodes automatically in the event one of the node is reset to factory. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RejoinNodesAutomatically *bool `json:"rejoin_nodes_automatically,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// A V4 virtual IP address for the Cluster that always points to the V4 IP of the leader node in Cluster. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualIP *IPAddr `json:"virtual_ip,omitempty"`

	// A V6 virtual IP address for the Cluster that always points to the V6 IP of the leader node in Cluster. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualIp6 *IPAddr `json:"virtual_ip6,omitempty"`
}
