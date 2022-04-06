// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterNodeShutdownEvent cluster node shutdown event
// swagger:model ClusterNodeShutdownEvent
type ClusterNodeShutdownEvent struct {

	// IP address of the controller VM. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// Name of controller node. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NodeName *string `json:"node_name,omitempty"`

	// Reason for controller node shutdown. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`
}
