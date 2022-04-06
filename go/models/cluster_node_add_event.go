// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterNodeAddEvent cluster node add event
// swagger:model ClusterNodeAddEvent
type ClusterNodeAddEvent struct {

	// IP address of the controller VM. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// Name of controller node. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NodeName *string `json:"node_name,omitempty"`

	// Role of the controller within the cluster. Enum options - CLUSTER_LEADER, CLUSTER_FOLLOWER. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Role *string `json:"role,omitempty"`
}
