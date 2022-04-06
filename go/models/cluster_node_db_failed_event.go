// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterNodeDbFailedEvent cluster node db failed event
// swagger:model ClusterNodeDbFailedEvent
type ClusterNodeDbFailedEvent struct {

	// Number of failures. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FailureCount *int32 `json:"failure_count,omitempty"`

	// IP address of the controller VM. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// Name of controller node. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NodeName *string `json:"node_name,omitempty"`
}
